package com.idormy.sms.forwarder.utils.sender;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/idormy/sms/forwarder/utils/sender/FeishuUtils;", "", "()V", "Companion", "app_debug"})
public final class FeishuUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.sender.FeishuUtils.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private static final java.lang.String MSG_TEMPLATE = null;
    
    private FeishuUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0002J@\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/idormy/sms/forwarder/utils/sender/FeishuUtils$Companion;", "", "()V", "MSG_TEMPLATE", "", "TAG", "buildMsg", "title", "content", "from", "date", "Ljava/util/Date;", "jsonInnerStr", "string", "sendMsg", "", "setting", "Lcom/idormy/sms/forwarder/entity/setting/FeishuSetting;", "msgInfo", "Lcom/idormy/sms/forwarder/entity/MsgInfo;", "rule", "Lcom/idormy/sms/forwarder/database/entity/Rule;", "senderIndex", "", "logId", "", "msgId", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void sendMsg(@org.jetbrains.annotations.NotNull
        com.idormy.sms.forwarder.entity.setting.FeishuSetting setting, @org.jetbrains.annotations.NotNull
        com.idormy.sms.forwarder.entity.MsgInfo msgInfo, @org.jetbrains.annotations.Nullable
        com.idormy.sms.forwarder.database.entity.Rule rule, int senderIndex, long logId, long msgId) {
        }
        
        private final java.lang.String buildMsg(java.lang.String title, java.lang.String content, java.lang.String from, java.util.Date date) {
            return null;
        }
        
        private final java.lang.String jsonInnerStr(java.lang.String string) {
            return null;
        }
    }
}