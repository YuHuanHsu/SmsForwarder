package com.idormy.sms.forwarder.receiver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0014J*\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0014J\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\"\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0014J*\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0014J\"\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\"\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002J\"\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002\u00a8\u0006\u0017"}, d2 = {"Lcom/idormy/sms/forwarder/receiver/CallReceiver;", "Lcom/idormy/sms/forwarder/receiver/PhoneStateReceiver;", "()V", "onIncomingCallAnswered", "", "context", "Landroid/content/Context;", "number", "", "start", "Ljava/util/Date;", "onIncomingCallEnded", "end", "onIncomingCallReceived", "onMissedCall", "onOutgoingCallEnded", "onOutgoingCallStarted", "sendCallMsg", "callType", "", "phoneNumber", "sendNotice", "Companion", "app_debug"})
public class CallReceiver extends com.idormy.sms.forwarder.receiver.PhoneStateReceiver {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.receiver.CallReceiver.Companion Companion = null;
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACTION_OUT = "android.intent.action.NEW_OUTGOING_CALL";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_PHONE_NUMBER = "android.intent.extra.PHONE_NUMBER";
    
    public CallReceiver() {
        super();
    }
    
    @java.lang.Override
    protected void onIncomingCallReceived(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String number, @org.jetbrains.annotations.NotNull
    java.util.Date start) {
    }
    
    @java.lang.Override
    protected void onIncomingCallAnswered(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String number, @org.jetbrains.annotations.NotNull
    java.util.Date start) {
    }
    
    @java.lang.Override
    protected void onIncomingCallEnded(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String number, @org.jetbrains.annotations.NotNull
    java.util.Date start, @org.jetbrains.annotations.NotNull
    java.util.Date end) {
    }
    
    @java.lang.Override
    protected void onOutgoingCallStarted(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String number, @org.jetbrains.annotations.NotNull
    java.util.Date start) {
    }
    
    @java.lang.Override
    protected void onOutgoingCallEnded(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String number, @org.jetbrains.annotations.NotNull
    java.util.Date start, @org.jetbrains.annotations.NotNull
    java.util.Date end) {
    }
    
    @java.lang.Override
    protected void onMissedCall(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String number, @org.jetbrains.annotations.NotNull
    java.util.Date start) {
    }
    
    private final void sendNotice(android.content.Context context, int callType, java.lang.String phoneNumber) {
    }
    
    private final void sendCallMsg(android.content.Context context, int callType, java.lang.String phoneNumber) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/idormy/sms/forwarder/receiver/CallReceiver$Companion;", "", "()V", "ACTION_OUT", "", "EXTRA_PHONE_NUMBER", "TAG", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}