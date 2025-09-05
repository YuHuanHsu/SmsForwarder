package com.idormy.sms.forwarder.entity.setting

import com.idormy.sms.forwarder.R
import java.io.Serializable
import java.net.Proxy

data class TelegramSetting(
    val method: String = "POST",
    var apiToken: String = "",
    val chatId: String = "",
    val messageThreadId: String? = null,
    val chatType: String = "chat",
    val proxyType: Proxy.Type = Proxy.Type.DIRECT,
    val proxyHost: String = "",
    val proxyPort: String = "",
    val proxyAuthenticator: Boolean = false,
    val proxyUsername: String = "",
    val proxyPassword: String = "",
    val parseMode: String = "HTML",
) : Serializable {

    fun getMethodCheckId(): Int {
        return if (method == "GET") R.id.rb_method_get else R.id.rb_method_post
    }

    fun getProxyTypeCheckId(): Int {
        return when (proxyType) {
            Proxy.Type.HTTP -> R.id.rb_proxyHttp
            Proxy.Type.SOCKS -> R.id.rb_proxySocks
            else -> R.id.rb_proxyNone
        }
    }

    fun getParseModeCheckId(): Int {
        return when (parseMode) {
            "TEXT" -> R.id.rb_parse_mode_text
            "MarkdownV2" -> R.id.rb_parse_mode_markdown
            else -> R.id.rb_parse_mode_html
        }
    }

    fun getChatTypeCheckId(): Int {
        return when (chatType) {
            "group" -> R.id.rb_chat_type_group
            "forum" -> R.id.rb_chat_type_forum
            "channel" -> R.id.rb_chat_type_channel
            else -> R.id.rb_chat_type_chat
        }
    }

    fun isForumGroup(): Boolean {
        return chatType == "forum"
    }

    fun isChannel(): Boolean {
        return chatType == "channel"
    }

    fun validateSettings(): Boolean {
        if (apiToken.isEmpty() || chatId.isEmpty()) {
            return false
        }
        
        // 驗證 messageThreadId 格式（如果提供）
        messageThreadId?.let { threadId ->
            if (!threadId.matches(Regex("\\d+"))) {
                return false
            }
        }
        
        // 對於 Forum Group，必須提供 messageThreadId
        if (chatType == "forum" && messageThreadId.isNullOrEmpty()) {
            return false
        }
        
        return true
    }
    
    /**
     * 取得發送所需的基本參數Map
     * @param content 訊息內容
     * @return 參數Map
     */
    fun getSendParams(content: String): Map<String, Any> {
        val params = mutableMapOf<String, Any>()
        params["chat_id"] = chatId
        params["text"] = content
        
        // 如果是 Forum Group，加入 message_thread_id
        if (chatType == "forum" && !messageThreadId.isNullOrEmpty()) {
            params["message_thread_id"] = messageThreadId
        }
        
        // 設定解析模式
        if (parseMode.isNotEmpty() && parseMode != "TEXT") {
            params["parse_mode"] = parseMode
        }
        
        params["disable_web_page_preview"] = "true"
        
        return params
    }
}
