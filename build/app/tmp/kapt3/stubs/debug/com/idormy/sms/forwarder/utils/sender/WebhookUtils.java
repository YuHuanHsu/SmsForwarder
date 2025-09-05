package com.idormy.sms.forwarder.utils.sender;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/idormy/sms/forwarder/utils/sender/WebhookUtils;", "", "()V", "Companion", "app_debug"})
public final class WebhookUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.sender.WebhookUtils.Companion Companion = null;
    private static final java.lang.String TAG = null;
    
    public WebhookUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007J@\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/idormy/sms/forwarder/utils/sender/WebhookUtils$Companion;", "", "()V", "TAG", "", "escapeJson", "str", "formatDateTime", "currentTime", "Ljava/util/Date;", "format", "sendMsg", "", "setting", "Lcom/idormy/sms/forwarder/entity/setting/WebhookSetting;", "msgInfo", "Lcom/idormy/sms/forwarder/entity/MsgInfo;", "rule", "Lcom/idormy/sms/forwarder/database/entity/Rule;", "senderIndex", "", "logId", "", "msgId", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void sendMsg(@org.jetbrains.annotations.NotNull
        com.idormy.sms.forwarder.entity.setting.WebhookSetting setting, @org.jetbrains.annotations.NotNull
        com.idormy.sms.forwarder.entity.MsgInfo msgInfo, @org.jetbrains.annotations.Nullable
        com.idormy.sms.forwarder.database.entity.Rule rule, int senderIndex, long logId, long msgId) {
        }
        
        private final java.lang.String escapeJson(java.lang.String str) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
        public final java.lang.String formatDateTime(@org.jetbrains.annotations.NotNull
        java.util.Date currentTime, @org.jetbrains.annotations.Nullable
        java.lang.String format) {
            return null;
        }
    }
}