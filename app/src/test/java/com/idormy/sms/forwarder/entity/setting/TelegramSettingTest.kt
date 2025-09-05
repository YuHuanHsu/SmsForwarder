package com.idormy.sms.forwarder.entity.setting

import com.google.gson.Gson
import org.junit.Test
import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import java.net.Proxy

@RunWith(JUnit4::class)
class TelegramSettingTest {

    @Test
    fun `測試預設值設定`() {
        val setting = TelegramSetting()
        assertEquals("POST", setting.method)
        assertEquals("", setting.apiToken)
        assertEquals("", setting.chatId)
        assertNull(setting.messageThreadId)
        assertEquals("chat", setting.chatType)
        assertEquals(Proxy.Type.DIRECT, setting.proxyType)
        assertEquals("HTML", setting.parseMode)
    }

    @Test
    fun `測試新屬性初始化`() {
        val setting = TelegramSetting(
            apiToken = "test_token",
            chatId = "test_chat",
            messageThreadId = "123",
            chatType = "forum"
        )
        
        assertEquals("test_token", setting.apiToken)
        assertEquals("test_chat", setting.chatId)
        assertEquals("123", setting.messageThreadId)
        assertEquals("forum", setting.chatType)
    }

    @Test
    fun `測試 JSON 序列化包含新欄位`() {
        val setting = TelegramSetting(
            apiToken = "test_token",
            chatId = "test_chat",
            messageThreadId = "123",
            chatType = "forum"
        )
        
        val json = Gson().toJson(setting)
        assertNotNull(json)
        assertTrue("JSON 應包含 messageThreadId", json.contains("messageThreadId"))
        assertTrue("JSON 應包含 chatType", json.contains("chatType"))
        assertTrue("JSON 應包含值 123", json.contains("123"))
        assertTrue("JSON 應包含值 forum", json.contains("forum"))
    }

    @Test
    fun `測試向後相容性 - 反序列化舊格式 JSON`() {
        val oldJson = """{"method":"POST","apiToken":"token","chatId":"chat","proxyType":"DIRECT","parseMode":"HTML"}"""
        val setting = Gson().fromJson(oldJson, TelegramSetting::class.java)
        
        assertEquals("token", setting.apiToken)
        assertEquals("chat", setting.chatId)
        assertEquals("chat", setting.chatType) // 預設值
        assertNull(setting.messageThreadId) // 預設值
        assertEquals("POST", setting.method)
        assertEquals("HTML", setting.parseMode)
    }

    @Test
    fun `測試反序列化新格式 JSON`() {
        val newJson = """{"method":"POST","apiToken":"token","chatId":"chat","messageThreadId":"456","chatType":"forum","proxyType":"DIRECT","parseMode":"HTML"}"""
        val setting = Gson().fromJson(newJson, TelegramSetting::class.java)
        
        assertEquals("token", setting.apiToken)
        assertEquals("chat", setting.chatId)
        assertEquals("456", setting.messageThreadId)
        assertEquals("forum", setting.chatType)
    }

    @Test
    fun `測試 getChatTypeCheckId 方法`() {
        val chatSetting = TelegramSetting(chatType = "chat")
        val groupSetting = TelegramSetting(chatType = "group")
        val forumSetting = TelegramSetting(chatType = "forum")
        val channelSetting = TelegramSetting(chatType = "channel")
        
        // Note: 這些 R.id 常數在測試中可能不存在，我們測試邏輯而非具體值
        assertNotEquals(0, chatSetting.getChatTypeCheckId())
        assertNotEquals(0, groupSetting.getChatTypeCheckId())
        assertNotEquals(0, forumSetting.getChatTypeCheckId())
        assertNotEquals(0, channelSetting.getChatTypeCheckId())
    }

    @Test
    fun `測試 isForumGroup 方法`() {
        val forumSetting = TelegramSetting(chatType = "forum")
        val chatSetting = TelegramSetting(chatType = "chat")
        val groupSetting = TelegramSetting(chatType = "group")
        
        assertTrue("forum 類型應返回 true", forumSetting.isForumGroup())
        assertFalse("chat 類型應返回 false", chatSetting.isForumGroup())
        assertFalse("group 類型應返回 false", groupSetting.isForumGroup())
    }

    @Test
    fun `測試 isChannel 方法`() {
        val channelSetting = TelegramSetting(chatType = "channel")
        val chatSetting = TelegramSetting(chatType = "chat")
        val forumSetting = TelegramSetting(chatType = "forum")
        
        assertTrue("channel 類型應返回 true", channelSetting.isChannel())
        assertFalse("chat 類型應返回 false", chatSetting.isChannel())
        assertFalse("forum 類型應返回 false", forumSetting.isChannel())
    }

    @Test
    fun `測試 validateSettings 方法 - 有效設定`() {
        val validSetting = TelegramSetting(
            apiToken = "valid_token",
            chatId = "valid_chat_id"
        )
        assertTrue("有效設定應通過驗證", validSetting.validateSettings())
    }

    @Test
    fun `測試 validateSettings 方法 - 無效設定`() {
        val emptyTokenSetting = TelegramSetting(apiToken = "", chatId = "valid_chat_id")
        val emptyChatIdSetting = TelegramSetting(apiToken = "valid_token", chatId = "")
        val bothEmptySetting = TelegramSetting(apiToken = "", chatId = "")
        
        assertFalse("空 API Token 應不通過驗證", emptyTokenSetting.validateSettings())
        assertFalse("空 Chat ID 應不通過驗證", emptyChatIdSetting.validateSettings())
        assertFalse("兩者都空應不通過驗證", bothEmptySetting.validateSettings())
    }

    @Test
    fun `測試 validateSettings 方法 - messageThreadId 驗證`() {
        val validThreadIdSetting = TelegramSetting(
            apiToken = "token", 
            chatId = "chat", 
            messageThreadId = "123"
        )
        val invalidThreadIdSetting = TelegramSetting(
            apiToken = "token", 
            chatId = "chat", 
            messageThreadId = "abc"
        )
        val nullThreadIdSetting = TelegramSetting(
            apiToken = "token", 
            chatId = "chat", 
            messageThreadId = null
        )
        
        assertTrue("數字 messageThreadId 應通過驗證", validThreadIdSetting.validateSettings())
        assertFalse("非數字 messageThreadId 應不通過驗證", invalidThreadIdSetting.validateSettings())
        assertTrue("null messageThreadId 應通過驗證", nullThreadIdSetting.validateSettings())
    }

    @Test
    fun `測試 messageThreadId 邊界情況`() {
        val setting1 = TelegramSetting(apiToken = "token", chatId = "chat", messageThreadId = "0")
        val setting2 = TelegramSetting(apiToken = "token", chatId = "chat", messageThreadId = "999999")
        val setting3 = TelegramSetting(apiToken = "token", chatId = "chat", messageThreadId = "12a3")
        val setting4 = TelegramSetting(apiToken = "token", chatId = "chat", messageThreadId = "")
        
        assertTrue("數字字串 0 應通過驗證", setting1.validateSettings())
        assertTrue("大數字應通過驗證", setting2.validateSettings())
        assertFalse("混合字母數字應不通過驗證", setting3.validateSettings())
        assertFalse("空字串應不通過驗證", setting4.validateSettings())
    }

    @Test
    fun `測試所有 chatType 值`() {
        val chatTypes = listOf("chat", "group", "forum", "channel", "unknown")
        
        for (type in chatTypes) {
            val setting = TelegramSetting(chatType = type)
            assertEquals("chatType 應正確設定", type, setting.chatType)
            
            // 測試 isForumGroup
            assertEquals("isForumGroup 應正確判斷", type == "forum", setting.isForumGroup())
            
            // 測試 isChannel
            assertEquals("isChannel 應正確判斷", type == "channel", setting.isChannel())
        }
    }
}