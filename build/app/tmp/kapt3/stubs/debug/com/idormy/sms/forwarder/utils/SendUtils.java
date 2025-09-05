package com.idormy.sms.forwarder.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ6\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000bH\u0007J4\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000bJ%\u0010\u0016\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/idormy/sms/forwarder/utils/SendUtils;", "", "()V", "TAG", "", "rematchSendMsg", "", "item", "Lcom/idormy/sms/forwarder/database/entity/MsgAndLogs;", "retrySendMsg", "logId", "", "sendMsgSender", "msgInfo", "Lcom/idormy/sms/forwarder/entity/MsgInfo;", "rule", "Lcom/idormy/sms/forwarder/database/entity/Rule;", "senderIndex", "", "msgId", "senderLogic", "status", "updateLogs", "response", "(Ljava/lang/Long;ILjava/lang/String;)V", "app_debug"})
public final class SendUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.SendUtils INSTANCE = null;
    private static final java.lang.String TAG = "SendUtils";
    
    private SendUtils() {
        super();
    }
    
    public final void rematchSendMsg(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.MsgAndLogs item) {
    }
    
    public final void retrySendMsg(long logId) {
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final void sendMsgSender(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.entity.MsgInfo msgInfo, @org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Rule rule, int senderIndex, long logId, long msgId) {
    }
    
    public final void senderLogic(int status, @org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.entity.MsgInfo msgInfo, @org.jetbrains.annotations.Nullable
    com.idormy.sms.forwarder.database.entity.Rule rule, int senderIndex, long msgId) {
    }
    
    public final void updateLogs(@org.jetbrains.annotations.Nullable
    java.lang.Long logId, int status, @org.jetbrains.annotations.NotNull
    java.lang.String response) {
    }
}