package com.idormy.sms.forwarder.fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.idormy.sms.forwarder.R
import com.idormy.sms.forwarder.core.BaseFragment
import com.idormy.sms.forwarder.databinding.FragmentBackupBinding
import com.idormy.sms.forwarder.utils.BackupUtils
import com.idormy.sms.forwarder.utils.XToastUtils
import com.xuexiang.xaop.annotation.SingleClick
import com.xuexiang.xpage.annotation.Page
import com.xuexiang.xpage.core.PageOption
import com.xuexiang.xui.widget.actionbar.TitleBar
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog
import com.xuexiang.xutil.app.AppUtils
import com.hjq.permissions.XXPermissions
import com.hjq.permissions.Permission
import com.hjq.permissions.OnPermissionCallback
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

@Page(name = "備份還原")
class BackupFragment : BaseFragment<FragmentBackupBinding>(), View.OnClickListener {

    override fun viewBindingInflate(inflater: LayoutInflater, container: ViewGroup): FragmentBackupBinding {
        return FragmentBackupBinding.inflate(inflater, container, false)
    }

    override fun initTitle(): TitleBar? {
        val titleBar = super.initTitle()
        // 自定義返回按鈕行為，確保返回到通用設置頁面
        titleBar?.setLeftClickListener {
            // 使用 popTo 返回到 SettingsFragment
            PageOption.to(SettingsFragment::class.java)
                .setNewActivity(false)
                .open(this)
        }
        return titleBar
    }

    override fun initViews() {
        binding!!.btnExportSettings.setOnClickListener(this)
        binding!!.btnImportSettings.setOnClickListener(this)
        updateBackupFilesInfo()
    }

    @SingleClick
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_export_settings -> {
                XXPermissions.with(this)
                    .permission(Permission.MANAGE_EXTERNAL_STORAGE)
                    .request(object : OnPermissionCallback {
                        override fun onGranted(permissions: List<String>, all: Boolean) {
                            showExportCategoryDialog()
                        }
                        
                        override fun onDenied(permissions: List<String>, never: Boolean) {
                            XToastUtils.error("需要存儲權限才能匯出設定")
                        }
                    })
            }
            
            R.id.btn_import_settings -> {
                XXPermissions.with(this)
                    .permission(Permission.MANAGE_EXTERNAL_STORAGE)
                    .request(object : OnPermissionCallback {
                        override fun onGranted(permissions: List<String>, all: Boolean) {
                            showImportFileDialog()
                        }
                        
                        override fun onDenied(permissions: List<String>, never: Boolean) {
                            XToastUtils.error("需要存儲權限才能匯入設定")
                        }
                    })
            }
        }
    }

    private fun showExportCategoryDialog() {
        val categories = arrayOf(
            getString(R.string.backup_all_settings),
            getString(R.string.backup_app_settings),
            getString(R.string.backup_senders),
            getString(R.string.backup_rules),
            getString(R.string.backup_tasks)
        )

        MaterialDialog.Builder(requireContext())
            .title(getString(R.string.select_backup_category))
            .items(*categories)
            .itemsCallback { _, _, which, _ ->
                when (which) {
                    0 -> exportCategorySettings("all", categories[which])
                    1 -> exportCategorySettings("app", categories[which])
                    2 -> exportCategorySettings("senders", categories[which])
                    3 -> exportCategorySettings("rules", categories[which])
                    4 -> exportCategorySettings("tasks", categories[which])
                }
            }
            .negativeText(android.R.string.cancel)
            .show()
    }

    private fun exportCategorySettings(categoryType: String, categoryName: String) {
        try {
            val backupPath = if (categoryType == "all") {
                BackupUtils.exportSettings(requireContext())
            } else {
                BackupUtils.exportCategorySettings(requireContext(), categoryType)
            }
            
            if (backupPath != null) {
                XToastUtils.success(getString(R.string.category_export_success, categoryName, backupPath))
                updateBackupFilesInfo()
            } else {
                XToastUtils.error(getString(R.string.category_export_failed, categoryName))
            }
        } catch (e: Exception) {
            XToastUtils.error(getString(R.string.category_export_failed, categoryName) + ": " + e.message)
            e.printStackTrace()
        }
    }

    private fun showImportFileDialog() {
        try {
            val backupFiles = BackupUtils.listAllBackupFiles()
            if (backupFiles.isEmpty()) {
                XToastUtils.warning(getString(R.string.backup_file_not_found))
                return
            }

            val fileInfos = backupFiles.map { file ->
                getFileDisplayInfo(file)
            }.toTypedArray()

            MaterialDialog.Builder(requireContext())
                .title(getString(R.string.select_backup_file))
                .items(*fileInfos)
                .itemsCallback { _, _, which, _ ->
                    val selectedFile = backupFiles[which]
                    val backupInfo = BackupUtils.getBackupInfoFromFile(selectedFile.absolutePath)
                    val currentVersion = AppUtils.getAppVersionName()

                    if (backupInfo != null && backupInfo.versionName != currentVersion) {
                        val content = "備份檔案版本 (${backupInfo.versionName}) 與當前應用版本 ($currentVersion) 不一致，直接匯入可能會導致錯誤，是否要繼續？"
                        MaterialDialog.Builder(requireContext())
                            .title("版本不一致警告")
                            .content(content)
                            .positiveText("繼續匯入")
                            .onPositive { _, _ ->
                                showImportConfirmDialog(selectedFile.absolutePath)
                            }
                            .negativeText(android.R.string.cancel)
                            .show()
                    } else {
                        showImportConfirmDialog(selectedFile.absolutePath)
                    }
                }
                .negativeText(android.R.string.cancel)
                .show()

        } catch (e: Exception) {
            XToastUtils.error(getString(R.string.backup_import_failed, e.message))
            e.printStackTrace()
        }
    }

    private fun getFileDisplayInfo(file: File): String {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault())
        val fileDate = dateFormat.format(Date(file.lastModified()))
        val fileSize = String.format("%.1f KB", file.length() / 1024.0)
        return "${file.name}\n$fileDate | $fileSize"
    }

    private fun showImportConfirmDialog(filePath: String) {
        MaterialDialog.Builder(requireContext())
            .title(getString(R.string.import_settings))
            .content(getString(R.string.backup_confirm_import))
            .positiveText(getString(R.string.import_action))
            .negativeText(android.R.string.cancel)
            .onPositive { _, _ ->
                importSettings(filePath)
            }
            .show()
    }

    private fun importSettings(filePath: String) {
        try {
            val success = BackupUtils.importSettings(filePath)
            
            if (success) {
                XToastUtils.success(getString(R.string.backup_import_success))
                // 重新整理界面
                requireActivity().recreate()
            } else {
                XToastUtils.error(getString(R.string.backup_import_failed, getString(R.string.backup_invalid_file)))
            }
        } catch (e: Exception) {
            XToastUtils.error(getString(R.string.backup_import_failed, e.message))
            e.printStackTrace()
        }
    }

    private fun updateBackupFilesInfo() {
        try {
            val backupFiles = BackupUtils.listAllBackupFiles()
            val fileCount = backupFiles.size
            val totalSize = backupFiles.sumOf { it.length() }
            val sizeText = String.format("%.1f KB", totalSize / 1024.0)
            
            binding!!.tvBackupInfo.text = getString(R.string.backup_files_info, fileCount, sizeText)
        } catch (e: Exception) {
            binding!!.tvBackupInfo.text = getString(R.string.backup_files_info, 0, "0 KB")
        }
    }
}