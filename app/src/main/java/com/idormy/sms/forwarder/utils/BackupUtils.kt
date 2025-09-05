package com.idormy.sms.forwarder.utils

import android.content.Context
import android.os.Environment
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonParseException
import com.idormy.sms.forwarder.App
import com.idormy.sms.forwarder.core.Core
import com.idormy.sms.forwarder.entity.BackupInfo
import com.idormy.sms.forwarder.entity.CloneInfo
import com.idormy.sms.forwarder.entity.SingleBackupInfo
import com.idormy.sms.forwarder.database.entity.Rule
import com.idormy.sms.forwarder.database.entity.Sender
import com.idormy.sms.forwarder.database.entity.Task
import com.xuexiang.xutil.file.FileIOUtils
import com.xuexiang.xutil.file.FileUtils
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

/**
 * 設定備份工具類
 */
class BackupUtils private constructor() {

    companion object {
        private const val TAG = "BackupUtils"
        private const val BACKUP_FILE_EXTENSION = ".smsf"
        private const val BACKUP_DIR_NAME = "SmsForwarder"
        
        /**
         * 匯出設定到檔案
         * @param context Context
         * @return 備份檔案路径，null表示失敗
         */
        fun exportSettings(context: Context): String? {
            return try {
                // 建立備份資料
                val backupData = createBackupData()
                
                // 轉換為JSON
                val gson = GsonBuilder().setPrettyPrinting().create()
                val jsonString = gson.toJson(backupData)
                
                // 生成檔案名稱
                val timestamp = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(Date())
                val fileName = "SmsForwarder_Backup_$timestamp$BACKUP_FILE_EXTENSION"
                
                // 建立備份目錄
                val backupDir = getBackupDirectory()
                if (!backupDir.exists()) {
                    backupDir.mkdirs()
                }
                
                // 寫入檔案
                val backupFile = File(backupDir, fileName)
                val success = FileIOUtils.writeFileFromString(backupFile, jsonString)
                
                if (success) {
                    Log.i(TAG, "Settings exported successfully to: ${backupFile.absolutePath}")
                    backupFile.absolutePath
                } else {
                    Log.e(TAG, "Failed to write backup file")
                    null
                }
            } catch (e: Exception) {
                Log.e(TAG, "Export settings failed: ${e.message}")
                e.printStackTrace()
                null
            }
        }
        
        /**
         * 從檔案匯入設定
         * @param filePath 備份檔案路径
         * @return true表示成功，false表示失敗
         */
        fun importSettings(filePath: String): Boolean {
            return try {
                val file = File(filePath)
                if (!file.exists()) {
                    Log.e(TAG, "Backup file does not exist: $filePath")
                    return false
                }
                
                // 讀取檔案內容
                val jsonString = FileIOUtils.readFile2String(file)
                if (jsonString.isNullOrEmpty()) {
                    Log.e(TAG, "Backup file is empty")
                    return false
                }
                
                // 解析JSON
                val gson = Gson()
                val backupData = gson.fromJson(jsonString, CloneInfo::class.java)
                
                // 驗證資料
                if (!validateBackupData(backupData)) {
                    Log.e(TAG, "Invalid backup data")
                    return false
                }
                
                // 還原設定
                val success = HttpServerUtils.restoreSettings(backupData)
                if (success) {
                    Log.i(TAG, "Settings imported successfully from: $filePath")
                } else {
                    Log.e(TAG, "Failed to restore settings")
                }
                
                success
            } catch (e: JsonParseException) {
                Log.e(TAG, "Failed to parse backup file: ${e.message}")
                false
            } catch (e: Exception) {
                Log.e(TAG, "Import settings failed: ${e.message}")
                e.printStackTrace()
                false
            }
        }
        
        /**
         * 建立備份資料
         */
        private fun createBackupData(): CloneInfo {
            val cloneInfo = CloneInfo()
            cloneInfo.versionCode = AppUtils.getAppVersionCode()
            cloneInfo.versionName = AppUtils.getAppVersionName()
            cloneInfo.settings = SharedPreference.exportPreference()
            cloneInfo.senderList = Core.sender.getAllNonCache()
            cloneInfo.ruleList = Core.rule.getAllNonCache()
            cloneInfo.taskList = Core.task.getAllNonCache()
            return cloneInfo
        }
        
        /**
         * 驗證備份資料
         */
        private fun validateBackupData(backupData: CloneInfo?): Boolean {
            if (backupData == null) return false
            if (backupData.versionName.isNullOrEmpty()) return false
            if (backupData.settings.isEmpty()) return false
            return true
        }
        
        /**
         * 取得備份目錄
         */
        private fun getBackupDirectory(): File {
            return if (Environment.getExternalStorageState() == Environment.MEDIA_MOUNTED) {
                File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), BACKUP_DIR_NAME)
            } else {
                File(App.context.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS), BACKUP_DIR_NAME)
            }
        }
        
        /**
         * 取得備份目錄路径
         */
        fun getBackupDirectoryPath(): String {
            return getBackupDirectory().absolutePath
        }
        
        /**
         * 列出所有備份檔案
         */
        fun listBackupFiles(): List<File> {
            val backupDir = getBackupDirectory()
            if (!backupDir.exists()) {
                return emptyList()
            }
            
            return backupDir.listFiles { _, name ->
                name.endsWith(BACKUP_FILE_EXTENSION)
            }?.sortedByDescending { it.lastModified() } ?: emptyList()
        }
        
        /**
         * 刪除備份檔案
         */
        fun deleteBackupFile(file: File): Boolean {
            return try {
                FileUtils.deleteFile(file)
            } catch (e: Exception) {
                Log.e(TAG, "Delete backup file failed: ${e.message}")
                false
            }
        }
        
        // ====== 分類備份功能 ======
        
        /**
         * 匯出分類設定到檔案
         * @param context Context
         * @param backupType 備份類型: "settings", "senders", "rules", "tasks"
         * @param description 備份描述
         * @return 備份檔案路径，null表示失敗
         */
        fun exportCategorySettings(context: Context, backupType: String, description: String = ""): String? {
            return try {
                val backupData = createCategoryBackupData(backupType, description)
                
                val gson = GsonBuilder().setPrettyPrinting().create()
                val jsonString = gson.toJson(backupData)
                
                val timestamp = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(Date())
                val fileName = "SmsForwarder_${backupType}_$timestamp.smsf"
                
                val backupDir = getBackupDirectory()
                if (!backupDir.exists()) {
                    backupDir.mkdirs()
                }
                
                val backupFile = File(backupDir, fileName)
                val success = FileIOUtils.writeFileFromString(backupFile, jsonString)
                
                if (success) {
                    Log.i(TAG, "Category settings exported successfully to: ${backupFile.absolutePath}")
                    backupFile.absolutePath
                } else {
                    Log.e(TAG, "Failed to write category backup file")
                    null
                }
            } catch (e: Exception) {
                Log.e(TAG, "Export category settings failed: ${e.message}")
                e.printStackTrace()
                null
            }
        }
        
        /**
         * 從檔案匯入分類設定
         * @param filePath 備份檔案路径
         * @return true表示成功，false表示失敗
         */
        fun importCategorySettings(filePath: String): Boolean {
            return try {
                val file = File(filePath)
                if (!file.exists()) {
                    Log.e(TAG, "Category backup file does not exist: $filePath")
                    return false
                }
                
                val jsonString = FileIOUtils.readFile2String(file)
                if (jsonString.isNullOrEmpty()) {
                    Log.e(TAG, "Category backup file is empty")
                    return false
                }
                
                val gson = Gson()
                val backupData = gson.fromJson(jsonString, BackupInfo::class.java)
                
                if (!validateCategoryBackupData(backupData)) {
                    Log.e(TAG, "Invalid category backup data")
                    return false
                }
                
                val success = restoreCategorySettings(backupData)
                if (success) {
                    Log.i(TAG, "Category settings imported successfully from: $filePath")
                } else {
                    Log.e(TAG, "Failed to restore category settings")
                }
                
                success
            } catch (e: JsonParseException) {
                Log.e(TAG, "Failed to parse category backup file: ${e.message}")
                false
            } catch (e: Exception) {
                Log.e(TAG, "Import category settings failed: ${e.message}")
                e.printStackTrace()
                false
            }
        }
        
        /**
         * 建立分類備份資料
         */
        private fun createCategoryBackupData(backupType: String, description: String): BackupInfo {
            val timestamp = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Date())
            val backupInfo = BackupInfo()
            backupInfo.versionCode = AppUtils.getAppVersionCode()
            backupInfo.versionName = AppUtils.getAppVersionName()
            backupInfo.backupTime = timestamp
            backupInfo.backupType = backupType
            backupInfo.backupDescription = description
            
            when (backupType) {
                "settings" -> {
                    backupInfo.settings = SharedPreference.exportPreference()
                }
                "senders" -> {
                    backupInfo.senderList = Core.sender.getAllNonCache()
                }
                "rules" -> {
                    backupInfo.ruleList = Core.rule.getAllNonCache()
                }
                "tasks" -> {
                    backupInfo.taskList = Core.task.getAllNonCache()
                }
                "all" -> {
                    backupInfo.settings = SharedPreference.exportPreference()
                    backupInfo.senderList = Core.sender.getAllNonCache()
                    backupInfo.ruleList = Core.rule.getAllNonCache()
                    backupInfo.taskList = Core.task.getAllNonCache()
                }
            }
            
            return backupInfo
        }
        
        /**
         * 驗證分類備份資料
         */
        private fun validateCategoryBackupData(backupData: BackupInfo?): Boolean {
            if (backupData == null) return false
            if (backupData.versionName.isNullOrEmpty()) return false
            if (backupData.backupType.isEmpty()) return false
            
            return when (backupData.backupType) {
                "settings" -> !backupData.settings.isNullOrEmpty()
                "senders" -> backupData.senderList != null
                "rules" -> backupData.ruleList != null
                "tasks" -> backupData.taskList != null
                "all" -> !backupData.settings.isNullOrEmpty() || 
                         backupData.senderList != null || 
                         backupData.ruleList != null || 
                         backupData.taskList != null
                else -> false
            }
        }
        
        /**
         * 還原分類設定
         */
        private fun restoreCategorySettings(backupData: BackupInfo): Boolean {
            return try {
                when (backupData.backupType) {
                    "settings" -> {
                        if (!backupData.settings.isNullOrEmpty()) {
                            // 保留設備相關配置
                            val extraDeviceMark = SettingUtils.extraDeviceMark
                            val subidSim1 = SettingUtils.subidSim1
                            val extraSim1 = SettingUtils.extraSim1
                            val subidSim2 = SettingUtils.subidSim2
                            val extraSim2 = SettingUtils.extraSim2
                            
                            SharedPreference.clearPreference()
                            SharedPreference.importPreference(backupData.settings!!)
                            
                            // 恢復設備相關配置
                            SettingUtils.extraDeviceMark = extraDeviceMark
                            SettingUtils.subidSim1 = subidSim1
                            SettingUtils.extraSim1 = extraSim1
                            SettingUtils.subidSim2 = subidSim2
                            SettingUtils.extraSim2 = extraSim2
                        }
                    }
                    "senders" -> {
                        Core.sender.deleteAll()
                        if (!backupData.senderList.isNullOrEmpty()) {
                            for (sender in backupData.senderList!!) {
                                Core.sender.insert(sender)
                            }
                        }
                    }
                    "rules" -> {
                        Core.rule.deleteAll()
                        if (!backupData.ruleList.isNullOrEmpty()) {
                            for (rule in backupData.ruleList!!) {
                                Core.rule.insert(rule)
                            }
                        }
                    }
                    "tasks" -> {
                        Core.task.deleteAll()
                        if (!backupData.taskList.isNullOrEmpty()) {
                            for (task in backupData.taskList!!) {
                                Core.task.insert(task)
                            }
                        }
                    }
                    "all" -> {
                        // 使用原有的完整還原邏輯
                        val cloneInfo = CloneInfo()
                        cloneInfo.versionCode = backupData.versionCode
                        cloneInfo.versionName = backupData.versionName
                        cloneInfo.settings = backupData.settings ?: ""
                        cloneInfo.senderList = backupData.senderList
                        cloneInfo.ruleList = backupData.ruleList
                        cloneInfo.taskList = backupData.taskList
                        return HttpServerUtils.restoreSettings(cloneInfo)
                    }
                }
                true
            } catch (e: Exception) {
                Log.e(TAG, "Restore category settings failed: ${e.message}")
                e.printStackTrace()
                false
            }
        }
        
        // ====== 單一設定匯出功能 ======
        
        /**
         * 匯出單一發送通道
         */
        fun exportSingleSender(context: Context, sender: Sender): String? {
            val singleBackupInfo = SingleBackupInfo().apply {
                versionCode = AppUtils.getAppVersionCode()
                versionName = AppUtils.getAppVersionName()
                backupTime = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Date())
                backupType = "sender"
                itemName = sender.name
                itemDescription = "發送通道: ${sender.name}"
                this.sender = sender
            }
            
            return exportSingleItem(singleBackupInfo, "sender_${sender.name}")
        }
        
        /**
         * 匯出單一轉發規則
         */
        fun exportSingleRule(context: Context, rule: Rule): String? {
            val singleBackupInfo = SingleBackupInfo().apply {
                versionCode = AppUtils.getAppVersionCode()
                versionName = AppUtils.getAppVersionName()
                backupTime = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Date())
                backupType = "rule"
                itemName = rule.getName()
                itemDescription = "轉發規則: ${rule.getName()}"
                this.rule = rule
            }
            
            return exportSingleItem(singleBackupInfo, "rule_${rule.getName()}")
        }
        
        /**
         * 匯出單一自動任務
         */
        fun exportSingleTask(context: Context, task: Task): String? {
            val singleBackupInfo = SingleBackupInfo().apply {
                versionCode = AppUtils.getAppVersionCode()
                versionName = AppUtils.getAppVersionName()
                backupTime = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Date())
                backupType = "task"
                itemName = task.name
                itemDescription = "自動任務: ${task.name}"
                this.task = task
            }
            
            return exportSingleItem(singleBackupInfo, "task_${task.name}")
        }
        
        /**
         * 匯出單一項目的通用方法
         */
        private fun exportSingleItem(singleBackupInfo: SingleBackupInfo, filePrefix: String): String? {
            return try {
                val gson = GsonBuilder().setPrettyPrinting().create()
                val jsonString = gson.toJson(singleBackupInfo)
                
                val timestamp = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(Date())
                val fileName = "SmsForwarder_${filePrefix}_$timestamp.json"
                
                val backupDir = getBackupDirectory()
                if (!backupDir.exists()) {
                    backupDir.mkdirs()
                }
                
                val backupFile = File(backupDir, fileName)
                val success = FileIOUtils.writeFileFromString(backupFile, jsonString)
                
                if (success) {
                    Log.i(TAG, "Single item exported successfully to: ${backupFile.absolutePath}")
                    backupFile.absolutePath
                } else {
                    Log.e(TAG, "Failed to write single item backup file")
                    null
                }
            } catch (e: Exception) {
                Log.e(TAG, "Export single item failed: ${e.message}")
                e.printStackTrace()
                null
            }
        }
        
        /**
         * 從檔案匯入單一設定
         */
        fun importSingleSetting(filePath: String): Boolean {
            return try {
                val file = File(filePath)
                if (!file.exists()) {
                    Log.e(TAG, "Single backup file does not exist: $filePath")
                    return false
                }
                
                val jsonString = FileIOUtils.readFile2String(file)
                if (jsonString.isNullOrEmpty()) {
                    Log.e(TAG, "Single backup file is empty")
                    return false
                }
                
                val gson = Gson()
                val singleBackupInfo = gson.fromJson(jsonString, SingleBackupInfo::class.java)
                
                if (!validateSingleBackupData(singleBackupInfo)) {
                    Log.e(TAG, "Invalid single backup data")
                    return false
                }
                
                val success = restoreSingleSetting(singleBackupInfo)
                if (success) {
                    Log.i(TAG, "Single setting imported successfully from: $filePath")
                } else {
                    Log.e(TAG, "Failed to restore single setting")
                }
                
                success
            } catch (e: Exception) {
                Log.e(TAG, "Import single setting failed: ${e.message}")
                e.printStackTrace()
                false
            }
        }
        
        /**
         * 驗證單一備份資料
         */
        private fun validateSingleBackupData(singleBackupInfo: SingleBackupInfo?): Boolean {
            if (singleBackupInfo == null) return false
            if (singleBackupInfo.versionName.isNullOrEmpty()) return false
            if (singleBackupInfo.backupType.isEmpty()) return false
            
            return when (singleBackupInfo.backupType) {
                "sender" -> singleBackupInfo.sender != null
                "rule" -> singleBackupInfo.rule != null  
                "task" -> singleBackupInfo.task != null
                else -> false
            }
        }
        
        /**
         * 還原單一設定
         */
        private fun restoreSingleSetting(singleBackupInfo: SingleBackupInfo): Boolean {
            return try {
                when (singleBackupInfo.backupType) {
                    "sender" -> {
                        singleBackupInfo.sender?.let { sender ->
                            // 重置ID，讓資料庫自動分配新ID避免衝突
                            sender.id = 0
                            Core.sender.insert(sender)
                        }
                    }
                    "rule" -> {
                        singleBackupInfo.rule?.let { rule ->
                            rule.id = 0
                            Core.rule.insert(rule)
                        }
                    }
                    "task" -> {
                        singleBackupInfo.task?.let { task ->
                            task.id = 0
                            Core.task.insert(task)
                        }
                    }
                    else -> return false
                }
                true
            } catch (e: Exception) {
                Log.e(TAG, "Restore single setting failed: ${e.message}")
                e.printStackTrace()
                false
            }
        }
        
        /**
         * 列出所有分類備份檔案（包含 .smsf 和 .json 檔案）
         */
        fun listAllBackupFiles(): List<File> {
            val backupDir = getBackupDirectory()
            if (!backupDir.exists()) {
                return emptyList()
            }
            
            return backupDir.listFiles { _, name ->
                name.endsWith(".smsf") || name.endsWith(".json")
            }?.sortedByDescending { it.lastModified() } ?: emptyList()
        }
    }
}