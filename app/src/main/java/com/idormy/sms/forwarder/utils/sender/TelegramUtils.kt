package com.idormy.sms.forwarder.utils.sender

import android.text.TextUtils
import com.google.gson.Gson
import com.idormy.sms.forwarder.R
import com.idormy.sms.forwarder.database.entity.Rule
import com.idormy.sms.forwarder.entity.MsgInfo
import com.idormy.sms.forwarder.entity.result.TelegramResult
import com.idormy.sms.forwarder.entity.setting.TelegramSetting
import com.idormy.sms.forwarder.utils.Log
import com.idormy.sms.forwarder.utils.SendUtils
import com.idormy.sms.forwarder.utils.SettingUtils
import com.idormy.sms.forwarder.utils.interceptor.LoggingInterceptor
import com.xuexiang.xhttp2.XHttp
import com.xuexiang.xhttp2.callback.SimpleCallBack
import com.xuexiang.xhttp2.exception.ApiException
import com.xuexiang.xutil.net.NetworkUtils
import com.xuexiang.xutil.resource.ResUtils.getString
import okhttp3.Credentials
import okhttp3.Response
import okhttp3.Route
import java.net.Authenticator
import java.net.InetSocketAddress
import java.net.PasswordAuthentication
import java.net.Proxy
import java.net.URLEncoder

class TelegramUtils private constructor() {
    companion object {

        private val TAG: String = TelegramUtils::class.java.simpleName
        
        // 聊天類型常量
        private const val CHAT_TYPE_CHAT = "chat"
        private const val CHAT_TYPE_GROUP = "group"
        private const val CHAT_TYPE_FORUM = "forum"
        private const val CHAT_TYPE_CHANNEL = "channel"

        /**
         * 自動檢測 chatId 類型
         * @param chatId 聊天ID
         * @param configuredType 設定檔中的聊天類型
         * @return 實際的聊天類型
         */
        private fun detectChatType(chatId: String, configuredType: String): String {
            // 優先使用用戶明確設定的聊天類型
            if (configuredType.isNotEmpty() && configuredType != "chat") {
                return configuredType
            }
            
            // 只有在沒有明確設定或設定為預設值時，才進行自動檢測
            // 如果是頻道格式（@開頭），視為頻道
            if (chatId.startsWith("@")) {
                return CHAT_TYPE_CHANNEL
            }
            
            // 對於 -100 開頭的群組，需要根據用戶設定判斷是普通群組還是 forum 群組
            // 預設為 chat 類型
            return CHAT_TYPE_CHAT
        }
        
        /**
         * 驗證並取得發送參數
         * @param setting Telegram設定
         * @return 發送參數Map
         */
        private fun getSendParams(setting: TelegramSetting, content: String): MutableMap<String, Any> {
            val chatType = detectChatType(setting.chatId, setting.chatType)
            
            // 對於 Forum Group，確保有 messageThreadId
            if (chatType == CHAT_TYPE_FORUM && setting.messageThreadId.isNullOrEmpty()) {
                throw IllegalArgumentException("Forum Group 必須提供 messageThreadId")
            }
            
            val bodyMap: MutableMap<String, Any> = mutableMapOf()
            bodyMap["chat_id"] = setting.chatId
            
            // 如果是 Forum Group，加入 message_thread_id
            if (chatType == CHAT_TYPE_FORUM && !setting.messageThreadId.isNullOrEmpty()) {
                bodyMap["message_thread_id"] = setting.messageThreadId
            }
            
            // 設定解析模式和內容
            when (setting.parseMode) {
                "MarkdownV2" -> {
                    bodyMap["parse_mode"] = "MarkdownV2"
                    bodyMap["text"] = escapeMarkdownV2(content)
                }
                "HTML" -> {
                    bodyMap["parse_mode"] = "HTML"
                    bodyMap["text"] = content
                }
                else -> {
                    bodyMap["text"] = content
                }
            }
            bodyMap["disable_web_page_preview"] = "true"
            
            return bodyMap
        }

        fun sendMsg(
            setting: TelegramSetting,
            msgInfo: MsgInfo,
            rule: Rule? = null,
            senderIndex: Int = 0,
            logId: Long = 0L,
            msgId: Long = 0L
        ) {
            if (setting.method == "POST") {
                msgInfo.content = htmlEncode(msgInfo.content)
                msgInfo.simInfo = htmlEncode(msgInfo.simInfo)
            }

            val content: String = if (rule != null) {
                msgInfo.getContentForSend(rule.smsTemplate, rule.regexReplace)
            } else {
                msgInfo.getContentForSend(SettingUtils.smsTemplate)
            }

            var requestUrl = if (setting.apiToken.startsWith("http")) {
                setting.apiToken
            } else {
                "https://api.telegram.org/bot" + setting.apiToken + "/sendMessage"
            }
            Log.i(TAG, "requestUrl:$requestUrl")

            // 加入發送前日誌記錄
            val chatType = detectChatType(setting.chatId, setting.chatType)
            val logPrefix = if (chatType == CHAT_TYPE_FORUM && !setting.messageThreadId.isNullOrEmpty()) {
                "Sending message to ${setting.chatId} (thread ${setting.messageThreadId})"
            } else {
                "Sending message to ${setting.chatId}"
            }
            Log.i(TAG, logPrefix)

            val request = if (setting.method == "GET") {
                var getUrl = requestUrl + "?chat_id=" + setting.chatId + "&text=" + URLEncoder.encode(content, "UTF-8")
                if (setting.parseMode.isNotEmpty() && setting.parseMode != "TEXT") {
                    getUrl += "&parse_mode=" + setting.parseMode
                }
                // GET 方法也支援 message_thread_id
                if (chatType == CHAT_TYPE_FORUM && !setting.messageThreadId.isNullOrEmpty()) {
                    getUrl += "&message_thread_id=" + setting.messageThreadId
                }
                Log.i(TAG, "requestUrl:$getUrl")
                XHttp.get(getUrl)
            } else {
                val bodyMap = getSendParams(setting, content)
                val requestMsg: String = Gson().toJson(bodyMap)
                Log.i(TAG, "requestMsg:$requestMsg")
                XHttp.post(requestUrl).upJson(requestMsg)
            }

            //设置代理
            if ((setting.proxyType == Proxy.Type.HTTP || setting.proxyType == Proxy.Type.SOCKS)
                && !TextUtils.isEmpty(setting.proxyHost) && !TextUtils.isEmpty(setting.proxyPort)
            ) {
                //代理服务器的IP和端口号
                Log.d(TAG, "proxyHost = ${setting.proxyHost}, proxyPort = ${setting.proxyPort}")
                val proxyHost = if (NetworkUtils.isIP(setting.proxyHost)) setting.proxyHost else NetworkUtils.getDomainAddress(setting.proxyHost)
                if (!NetworkUtils.isIP(proxyHost)) {
                    throw Exception(String.format(getString(R.string.invalid_proxy_host), proxyHost))
                }
                val proxyPort: Int = setting.proxyPort.toInt()

                Log.d(TAG, "proxyHost = $proxyHost, proxyPort = $proxyPort")
                request.okproxy(Proxy(setting.proxyType, InetSocketAddress(proxyHost, proxyPort)))

                //代理的鉴权账号密码
                if (setting.proxyAuthenticator && (!TextUtils.isEmpty(setting.proxyUsername) || !TextUtils.isEmpty(setting.proxyPassword))
                ) {
                    Log.i(TAG, "proxyUsername = ${setting.proxyUsername}, proxyPassword = ${setting.proxyPassword}")

                    if (setting.proxyType == Proxy.Type.HTTP) {
                        request.okproxyAuthenticator { _: Route?, response: Response ->
                            //设置代理服务器账号密码
                            val credential = Credentials.basic(setting.proxyUsername, setting.proxyPassword)
                            response.request().newBuilder()
                                .header("Proxy-Authorization", credential)
                                .build()
                        }
                    } else {
                        Authenticator.setDefault(object : Authenticator() {
                            override fun getPasswordAuthentication(): PasswordAuthentication {
                                return PasswordAuthentication(setting.proxyUsername, setting.proxyPassword.toCharArray())
                            }
                        })
                    }
                }
            }

            request.keepJson(true)
                //.ignoreHttpsCert()
                .retryCount(SettingUtils.requestRetryTimes) //超时重试的次数
                .retryDelay(SettingUtils.requestDelayTime * 1000) //超时重试的延迟时间
                .retryIncreaseDelay(SettingUtils.requestDelayTime * 1000) //超时重试叠加延时
                .timeStamp(true) //url自动追加时间戳，避免缓存
                .addInterceptor(LoggingInterceptor(logId)) //增加一个log拦截器, 记录请求日志
                .execute(object : SimpleCallBack<String>() {

                    override fun onError(e: ApiException) {
                        val errorMsg = "Telegram API 錯誤: ${e.displayMessage}"
                        Log.e(TAG, "$errorMsg - 詳細: ${e.detailMessage}")
                        
                        // 記錄回應狀態
                        Log.e(TAG, "Response status: ${e.code}")
                        
                        val status = 0
                        SendUtils.updateLogs(logId, status, errorMsg)
                        SendUtils.senderLogic(status, msgInfo, rule, senderIndex, msgId)
                    }

                    override fun onSuccess(response: String) {
                        Log.i(TAG, "Telegram API 回應: $response")
                        
                        try {
                            val resp = Gson().fromJson(response, TelegramResult::class.java)
                            val status = if (resp?.ok == true) {
                                Log.i(TAG, "訊息發送成功")
                                2
                            } else {
                                val errorDesc = resp?.description ?: "未知錯誤"
                                Log.e(TAG, "Telegram API 回傳錯誤: $errorDesc")
                                0
                            }
                            SendUtils.updateLogs(logId, status, response)
                            SendUtils.senderLogic(status, msgInfo, rule, senderIndex, msgId)
                        } catch (e: Exception) {
                            Log.e(TAG, "解析 Telegram API 回應失敗: ${e.message}")
                            SendUtils.updateLogs(logId, 0, "回應解析失敗: ${e.message}")
                            SendUtils.senderLogic(0, msgInfo, rule, senderIndex, msgId)
                        }
                    }

                })

        }

        private fun htmlEncode(source: String?): String {
            if (source == null) {
                return ""
            }
            val buffer = StringBuffer()
            for (element in source) {
                when (element) {
                    '<' -> buffer.append("&lt;")
                    '>' -> buffer.append("&gt;")
                    '&' -> buffer.append("&amp;")
                    '"' -> buffer.append("&quot;")
                    //10, 13 -> buffer.append("\n")
                    else -> buffer.append(element)
                }
            }
            return buffer.toString()
        }

        // 用于转义 MarkdownV2 特殊字符的方法
        private fun escapeMarkdownV2(text: String): String {
            // TODO: MarkdownV2 要求转义以下字符，实测不能全部转义（丢失格式）
            //val specialChars = listOf('_', '*', '[', ']', '(', ')', '~', '`', '>', '#', '+', '-', '=', '|', '{', '}', '.', '!')
            val specialChars = listOf('-')
            var escapedText = text
            for (char in specialChars) {
                // 将每个字符替换为带反斜杠的形式
                escapedText = escapedText.replace(char.toString(), "\\$char")
            }
            return escapedText
        }
    }
}
