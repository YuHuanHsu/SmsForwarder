package com.idormy.sms.forwarder.utils.sender;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/idormy/sms/forwarder/utils/sender/TelegramUtils;", "", "()V", "Companion", "app_debug"})
public final class TelegramUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.sender.TelegramUtils.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private static final java.lang.String CHAT_TYPE_CHAT = "chat";
    private static final java.lang.String CHAT_TYPE_GROUP = "group";
    private static final java.lang.String CHAT_TYPE_FORUM = "forum";
    private static final java.lang.String CHAT_TYPE_CHANNEL = "channel";
    
    private TelegramUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002J$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/idormy/sms/forwarder/utils/sender/TelegramUtils$Companion;", "", "()V", "CHAT_TYPE_CHANNEL", "", "CHAT_TYPE_CHAT", "CHAT_TYPE_FORUM", "CHAT_TYPE_GROUP", "TAG", "detectChatType", "chatId", "configuredType", "escapeMarkdownV2", "text", "getSendParams", "", "setting", "Lcom/idormy/sms/forwarder/entity/setting/TelegramSetting;", "content", "htmlEncode", "source", "sendMsg", "", "msgInfo", "Lcom/idormy/sms/forwarder/entity/MsgInfo;", "rule", "Lcom/idormy/sms/forwarder/database/entity/Rule;", "senderIndex", "", "logId", "", "msgId", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * 自動檢測 chatId 類型
         * @param chatId 聊天ID
         * @param configuredType 設定檔中的聊天類型
         * @return 實際的聊天類型
         */
        private final java.lang.String detectChatType(java.lang.String chatId, java.lang.String configuredType) {
            return null;
        }
        
        /**
         * 驗證並取得發送參數
         * @param setting Telegram設定
         * @return 發送參數Map
         */
        private final java.util.Map<java.lang.String, java.lang.Object> getSendParams(com.idormy.sms.forwarder.entity.setting.TelegramSetting setting, java.lang.String content) {
            return null;
        }
        
        public final void sendMsg(@org.jetbrains.annotations.NotNull
        com.idormy.sms.forwarder.entity.setting.TelegramSetting setting, @org.jetbrains.annotations.NotNull
        com.idormy.sms.forwarder.entity.MsgInfo msgInfo, @org.jetbrains.annotations.Nullable
        com.idormy.sms.forwarder.database.entity.Rule rule, int senderIndex, long logId, long msgId) {
        }
        
        private final java.lang.String htmlEncode(java.lang.String source) {
            return null;
        }
        
        private final java.lang.String escapeMarkdownV2(java.lang.String text) {
            return null;
        }
    }
}