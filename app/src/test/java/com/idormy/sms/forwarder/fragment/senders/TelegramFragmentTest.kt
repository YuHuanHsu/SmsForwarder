package com.idormy.sms.forwarder.fragment.senders

import android.view.View
import android.widget.RadioGroup
import com.google.gson.Gson
import com.idormy.sms.forwarder.R
import com.idormy.sms.forwarder.entity.setting.TelegramSetting
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before
import org.mockito.Mockito.*

/**
 * TelegramFragment UI 功能單元測試
 * 測試聊天類型選擇和主題 ID 顯示/隱藏邏輯
 */
class TelegramFragmentTest {

    @Test
    fun `測試聊天類型 RadioGroup ID 對應`() {
        // 測試 TelegramSetting.getChatTypeCheckId() 方法返回的 ID 是否正確
        val chatSetting = TelegramSetting(chatType = "chat")
        val groupSetting = TelegramSetting(chatType = "group")
        val forumSetting = TelegramSetting(chatType = "forum")
        val channelSetting = TelegramSetting(chatType = "channel")
        
        assertEquals(R.id.rb_chat_type_chat, chatSetting.getChatTypeCheckId())
        assertEquals(R.id.rb_chat_type_group, groupSetting.getChatTypeCheckId())
        assertEquals(R.id.rb_chat_type_forum, forumSetting.getChatTypeCheckId())
        assertEquals(R.id.rb_chat_type_channel, channelSetting.getChatTypeCheckId())
    }
    
    @Test
    fun `測試 Forum 設定的 JSON 序列化`() {
        // 測試包含 messageThreadId 和 chatType 的設定是否正確序列化
        val forumSetting = TelegramSetting(
            apiToken = "test_token",
            chatId = "test_chat_id",
            messageThreadId = "123",
            chatType = "forum",
            parseMode = "HTML"
        )
        
        val json = Gson().toJson(forumSetting)
        
        assertTrue("JSON 應包含 messageThreadId", json.contains("\"messageThreadId\":\"123\""))
        assertTrue("JSON 應包含 chatType", json.contains("\"chatType\":\"forum\""))
        assertTrue("JSON 應包含 apiToken", json.contains("\"apiToken\":\"test_token\""))
    }
    
    @Test
    fun `測試 JSON 反序列化到 TelegramSetting`() {
        // 測試新格式的 JSON 能正確反序列化
        val json = """
            {
                "method": "POST",
                "apiToken": "test_token",
                "chatId": "test_chat",
                "messageThreadId": "456",
                "chatType": "forum",
                "parseMode": "HTML"
            }
        """.trimIndent()
        
        val setting = Gson().fromJson(json, TelegramSetting::class.java)
        
        assertEquals("forum", setting.chatType)
        assertEquals("456", setting.messageThreadId)
        assertEquals("test_token", setting.apiToken)
        assertEquals("test_chat", setting.chatId)
    }
    
    @Test
    fun `測試舊版 JSON 向後相容性`() {
        // 測試舊版本的 JSON（沒有新欄位）是否能正確載入
        val oldJson = """
            {
                "method": "POST",
                "apiToken": "old_token",
                "chatId": "old_chat",
                "parseMode": "HTML"
            }
        """.trimIndent()
        
        val setting = Gson().fromJson(oldJson, TelegramSetting::class.java)
        
        // 新欄位應該使用預設值
        assertEquals("chat", setting.chatType)
        assertNull(setting.messageThreadId)
        assertEquals("old_token", setting.apiToken)
        assertEquals("old_chat", setting.chatId)
    }
    
    @Test
    fun `測試 validateSettings - Forum 設定驗證`() {
        // 測試有效的 Forum 設定
        val validForumSetting = TelegramSetting(
            apiToken = "valid_token",
            chatId = "valid_chat",
            messageThreadId = "123",
            chatType = "forum"
        )
        assertTrue("有效的 Forum 設定應通過驗證", validForumSetting.validateSettings())
        
        // 測試無效的 Forum 設定 - 缺少 messageThreadId
        val invalidForumSetting = TelegramSetting(
            apiToken = "valid_token", 
            chatId = "valid_chat",
            chatType = "forum" // 缺少 messageThreadId
        )
        assertFalse("Forum 設定缺少 messageThreadId 應驗證失敗", invalidForumSetting.validateSettings())
        
        // 測試無效的 messageThreadId 格式
        val invalidFormatSetting = TelegramSetting(
            apiToken = "valid_token",
            chatId = "valid_chat", 
            messageThreadId = "abc123", // 非純數字
            chatType = "forum"
        )
        assertFalse("非數字格式的 messageThreadId 應驗證失敗", invalidFormatSetting.validateSettings())
    }
    
    @Test
    fun `測試 getSendParams 方法包含新參數`() {
        val forumSetting = TelegramSetting(
            apiToken = "test_token",
            chatId = "test_chat",
            messageThreadId = "789",
            chatType = "forum",
            parseMode = "HTML"
        )
        
        val params = forumSetting.getSendParams("test message")
        
        assertEquals("test_chat", params["chat_id"])
        assertEquals("test message", params["text"])
        assertEquals("789", params["message_thread_id"])
        assertEquals("HTML", params["parse_mode"])
    }
    
    @Test 
    fun `測試非 Forum 類型不包含 message_thread_id`() {
        val chatSetting = TelegramSetting(
            apiToken = "test_token",
            chatId = "test_chat",
            chatType = "chat" // 非 forum 類型
        )
        
        val params = chatSetting.getSendParams("test message")
        
        assertEquals("test_chat", params["chat_id"])
        assertEquals("test message", params["text"])
        assertFalse("非 Forum 類型不應包含 message_thread_id", params.containsKey("message_thread_id"))
    }
    
    /**
     * 模擬測試聊天類型變更對 UI 的影響
     * 注意：由於這是單元測試，實際 UI 組件不可用，這裡主要測試邏輯
     */
    @Test
    fun `測試聊天類型和主題 ID 的邏輯關係`() {
        // 測試選擇不同聊天類型時的 messageThreadId 處理邏輯
        
        // Forum 類型應該允許設定 messageThreadId
        val forumSetting = TelegramSetting(chatType = "forum", messageThreadId = "123")
        assertTrue("Forum 類型允許設定 messageThreadId", forumSetting.isForumGroup())
        assertEquals("123", forumSetting.messageThreadId)
        
        // 非 Forum 類型的 messageThreadId 應該是可選的
        val chatSetting = TelegramSetting(chatType = "chat")
        assertFalse("Chat 類型不是 Forum 群組", chatSetting.isForumGroup())
        assertNull("Chat 類型的 messageThreadId 可以是 null", chatSetting.messageThreadId)
        
        // 頻道類型測試
        val channelSetting = TelegramSetting(chatType = "channel")
        assertTrue("Channel 類型應被識別為頻道", channelSetting.isChannel())
        assertFalse("Channel 類型不是 Forum 群組", channelSetting.isForumGroup())
    }
    
    @Test
    fun `測試各種聊天類型的 validateSettings 結果`() {
        // 測試各種聊天類型的基本驗證
        val basicFields = mapOf(
            "apiToken" to "test_token",
            "chatId" to "test_chat"
        )
        
        // Chat 類型 - 應該通過驗證
        val chatSetting = TelegramSetting(
            apiToken = basicFields["apiToken"]!!,
            chatId = basicFields["chatId"]!!,
            chatType = "chat"
        )
        assertTrue("Chat 類型設定應通過驗證", chatSetting.validateSettings())
        
        // Group 類型 - 應該通過驗證
        val groupSetting = TelegramSetting(
            apiToken = basicFields["apiToken"]!!,
            chatId = basicFields["chatId"]!!,
            chatType = "group"
        )
        assertTrue("Group 類型設定應通過驗證", groupSetting.validateSettings())
        
        // Channel 類型 - 應該通過驗證
        val channelSetting = TelegramSetting(
            apiToken = basicFields["apiToken"]!!,
            chatId = basicFields["chatId"]!!,
            chatType = "channel"
        )
        assertTrue("Channel 類型設定應通過驗證", channelSetting.validateSettings())
    }
}