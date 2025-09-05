package com.idormy.sms.forwarder.utils.sender

import com.idormy.sms.forwarder.entity.setting.TelegramSetting
import org.junit.Test
import org.junit.Assert.*
import java.net.Proxy

/**
 * TelegramUtils 單元測試
 * 測試新增的群組主題和頻道發送功能
 */
class TelegramUtilsTest {

    @Test
    fun `測試detectChatType - 頻道格式檢測(@開頭)`() {
        // 使用反射呼叫私有方法進行測試
        val detectMethod = TelegramUtils::class.java.getDeclaredMethod(
            "detectChatType", 
            String::class.java, 
            String::class.java
        )
        detectMethod.isAccessible = true
        
        val result = detectMethod.invoke(null, "@testchannel", "chat") as String
        assertEquals("channel", result)
    }
    
    @Test
    fun `測試detectChatType - -100開頭群組使用設定類型`() {
        val detectMethod = TelegramUtils::class.java.getDeclaredMethod(
            "detectChatType", 
            String::class.java, 
            String::class.java
        )
        detectMethod.isAccessible = true
        
        // -100 開頭的 ID，如果沒有明確設定類型，預設為 chat
        val result1 = detectMethod.invoke(null, "-1001234567890", "chat") as String
        assertEquals("chat", result1)
        
        // -100 開頭的 ID，明確設定為 forum
        val result2 = detectMethod.invoke(null, "-1001234567890", "forum") as String
        assertEquals("forum", result2)
    }
    
    @Test
    fun `測試detectChatType - 使用設定檔指定類型`() {
        val detectMethod = TelegramUtils::class.java.getDeclaredMethod(
            "detectChatType", 
            String::class.java, 
            String::class.java
        )
        detectMethod.isAccessible = true
        
        val result = detectMethod.invoke(null, "123456789", "forum") as String
        assertEquals("forum", result)
    }
    
    @Test
    fun `測試detectChatType - 預設為chat類型`() {
        val detectMethod = TelegramUtils::class.java.getDeclaredMethod(
            "detectChatType", 
            String::class.java, 
            String::class.java
        )
        detectMethod.isAccessible = true
        
        val result = detectMethod.invoke(null, "123456789", "") as String
        assertEquals("chat", result)
    }
    
    @Test
    fun `測試detectChatType - 優先使用明確設定的類型`() {
        val detectMethod = TelegramUtils::class.java.getDeclaredMethod(
            "detectChatType", 
            String::class.java, 
            String::class.java
        )
        detectMethod.isAccessible = true
        
        // 即使 chatId 看起來像頻道，但明確設定為 forum 時應優先使用設定
        val result1 = detectMethod.invoke(null, "@testchannel", "forum") as String
        assertEquals("forum", result1)
        
        // 明確設定為 group 時應優先使用設定  
        val result2 = detectMethod.invoke(null, "123456789", "group") as String
        assertEquals("group", result2)
    }

    @Test
    fun `測試getSendParams - 一般聊天`() {
        val getSendParamsMethod = TelegramUtils::class.java.getDeclaredMethod(
            "getSendParams",
            TelegramSetting::class.java,
            String::class.java
        )
        getSendParamsMethod.isAccessible = true
        
        val setting = TelegramSetting(
            apiToken = "test_token",
            chatId = "123456789",
            chatType = "chat",
            parseMode = "HTML"
        )
        
        val result = getSendParamsMethod.invoke(null, setting, "test message") as Map<String, Any>
        
        assertEquals("123456789", result["chat_id"])
        assertEquals("test message", result["text"])
        assertEquals("HTML", result["parse_mode"])
        assertEquals("true", result["disable_web_page_preview"])
        assertFalse(result.containsKey("message_thread_id"))
    }
    
    @Test
    fun `測試getSendParams - Forum群組包含thread_id`() {
        val getSendParamsMethod = TelegramUtils::class.java.getDeclaredMethod(
            "getSendParams",
            TelegramSetting::class.java,
            String::class.java
        )
        getSendParamsMethod.isAccessible = true
        
        val setting = TelegramSetting(
            apiToken = "test_token",
            chatId = "123456789",
            messageThreadId = "456",
            chatType = "forum",
            parseMode = "HTML"
        )
        
        val result = getSendParamsMethod.invoke(null, setting, "test message") as Map<String, Any>
        
        assertEquals("123456789", result["chat_id"])
        assertEquals("test message", result["text"])
        assertEquals("456", result["message_thread_id"])
        assertEquals("HTML", result["parse_mode"])
    }
    
    @Test(expected = IllegalArgumentException::class)
    fun `測試getSendParams - Forum群組缺少thread_id應拋出異常`() {
        val getSendParamsMethod = TelegramUtils::class.java.getDeclaredMethod(
            "getSendParams",
            TelegramSetting::class.java,
            String::class.java
        )
        getSendParamsMethod.isAccessible = true
        
        val setting = TelegramSetting(
            apiToken = "test_token",
            chatId = "123456789",
            chatType = "forum", // forum 但沒有 messageThreadId
            parseMode = "HTML"
        )
        
        // 這應該拋出 IllegalArgumentException
        getSendParamsMethod.invoke(null, setting, "test message")
    }
    
    @Test
    fun `測試getSendParams - MarkdownV2解析模式`() {
        val getSendParamsMethod = TelegramUtils::class.java.getDeclaredMethod(
            "getSendParams",
            TelegramSetting::class.java,
            String::class.java
        )
        getSendParamsMethod.isAccessible = true
        
        val setting = TelegramSetting(
            apiToken = "test_token",
            chatId = "123456789",
            chatType = "chat",
            parseMode = "MarkdownV2"
        )
        
        val result = getSendParamsMethod.invoke(null, setting, "test-message") as Map<String, Any>
        
        assertEquals("123456789", result["chat_id"])
        assertEquals("MarkdownV2", result["parse_mode"])
        // 檢查內容是否經過 escapeMarkdownV2 處理
        val text = result["text"] as String
        assertTrue("應該包含轉義後的內容", text.contains("test\\-message"))
    }
    
    @Test
    fun `測試TelegramSetting新方法 - getSendParams`() {
        val setting = TelegramSetting(
            apiToken = "test_token",
            chatId = "123456789",
            messageThreadId = "456",
            chatType = "forum",
            parseMode = "HTML"
        )
        
        val params = setting.getSendParams("test content")
        
        assertEquals("123456789", params["chat_id"])
        assertEquals("test content", params["text"])
        assertEquals("456", params["message_thread_id"])
        assertEquals("HTML", params["parse_mode"])
        assertEquals("true", params["disable_web_page_preview"])
    }
    
    @Test
    fun `測試TelegramSetting新方法 - validateSettings Forum群組驗證`() {
        // 有效的 Forum 設定
        val validForumSetting = TelegramSetting(
            apiToken = "test_token",
            chatId = "123456789",
            messageThreadId = "456",
            chatType = "forum"
        )
        assertTrue("有效的Forum設定應該通過驗證", validForumSetting.validateSettings())
        
        // 無效的 Forum 設定（缺少 messageThreadId）
        val invalidForumSetting = TelegramSetting(
            apiToken = "test_token",
            chatId = "123456789",
            chatType = "forum" // 缺少 messageThreadId
        )
        assertFalse("Forum設定缺少threadId應該驗證失敗", invalidForumSetting.validateSettings())
    }
    
    @Test
    fun `測試TelegramSetting新方法 - validateSettings messageThreadId格式驗證`() {
        // 有效的 messageThreadId（數字）
        val validSetting = TelegramSetting(
            apiToken = "test_token",
            chatId = "123456789",
            messageThreadId = "456",
            chatType = "forum"
        )
        assertTrue("數字格式的threadId應該通過驗證", validSetting.validateSettings())
        
        // 無效的 messageThreadId（非數字）
        val invalidSetting = TelegramSetting(
            apiToken = "test_token",
            chatId = "123456789",
            messageThreadId = "abc123",
            chatType = "forum"
        )
        assertFalse("非數字格式的threadId應該驗證失敗", invalidSetting.validateSettings())
    }
    
    @Test
    fun `測試向後相容性 - 舊版設定仍可使用`() {
        // 模擬舊版設定（沒有新欄位）
        val oldStyleSetting = TelegramSetting(
            apiToken = "test_token",
            chatId = "123456789",
            parseMode = "HTML"
            // 沒有指定 chatType 和 messageThreadId，應使用預設值
        )
        
        assertTrue("舊版設定應該仍能正常驗證", oldStyleSetting.validateSettings())
        assertEquals("chat", oldStyleSetting.chatType)
        assertNull(oldStyleSetting.messageThreadId)
        
        val params = oldStyleSetting.getSendParams("test message")
        assertFalse("舊版設定不應包含message_thread_id", params.containsKey("message_thread_id"))
    }
}