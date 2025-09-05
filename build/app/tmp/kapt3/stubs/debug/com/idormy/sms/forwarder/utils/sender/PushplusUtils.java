package com.idormy.sms.forwarder.utils.sender;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/idormy/sms/forwarder/utils/sender/PushplusUtils;", "", "()V", "Companion", "app_debug"})
public final class PushplusUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.sender.PushplusUtils.Companion Companion = null;
    private static final java.lang.String TAG = null;
    
    private PushplusUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J@\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/idormy/sms/forwarder/utils/sender/PushplusUtils$Companion;", "", "()V", "TAG", "", "sendMsg", "", "setting", "Lcom/idormy/sms/forwarder/entity/setting/PushplusSetting;", "msgInfo", "Lcom/idormy/sms/forwarder/entity/MsgInfo;", "rule", "Lcom/idormy/sms/forwarder/database/entity/Rule;", "senderIndex", "", "logId", "", "msgId", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void sendMsg(@org.jetbrains.annotations.NotNull
        com.idormy.sms.forwarder.entity.setting.PushplusSetting setting, @org.jetbrains.annotations.NotNull
        com.idormy.sms.forwarder.entity.MsgInfo msgInfo, @org.jetbrains.annotations.Nullable
        com.idormy.sms.forwarder.database.entity.Rule rule, int senderIndex, long logId, long msgId) {
        }
    }
}