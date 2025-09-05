package com.idormy.sms.forwarder.receiver;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH$J*\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH$J\"\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH$J\"\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH$J*\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH$J\"\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH$J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0016\u00a8\u0006\u0018"}, d2 = {"Lcom/idormy/sms/forwarder/receiver/PhoneStateReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onCallStateChanged", "", "context", "Landroid/content/Context;", "state", "", "number", "", "onIncomingCallAnswered", "start", "Ljava/util/Date;", "onIncomingCallEnded", "end", "onIncomingCallReceived", "onMissedCall", "onOutgoingCallEnded", "onOutgoingCallStarted", "onReceive", "intent", "Landroid/content/Intent;", "Companion", "app_debug"})
public abstract class PhoneStateReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.receiver.PhoneStateReceiver.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private static int lastState = android.telephony.TelephonyManager.CALL_STATE_IDLE;
    private static java.util.Date callStartTime;
    private static boolean isIncoming = false;
    private static java.lang.String savedNumber;
    
    public PhoneStateReceiver() {
        super();
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
    }
    
    protected abstract void onIncomingCallReceived(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String number, @org.jetbrains.annotations.NotNull
    java.util.Date start);
    
    protected abstract void onIncomingCallAnswered(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String number, @org.jetbrains.annotations.NotNull
    java.util.Date start);
    
    protected abstract void onIncomingCallEnded(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String number, @org.jetbrains.annotations.NotNull
    java.util.Date start, @org.jetbrains.annotations.NotNull
    java.util.Date end);
    
    protected abstract void onOutgoingCallStarted(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String number, @org.jetbrains.annotations.NotNull
    java.util.Date start);
    
    protected abstract void onOutgoingCallEnded(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String number, @org.jetbrains.annotations.NotNull
    java.util.Date start, @org.jetbrains.annotations.NotNull
    java.util.Date end);
    
    protected abstract void onMissedCall(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String number, @org.jetbrains.annotations.NotNull
    java.util.Date start);
    
    private final void onCallStateChanged(android.content.Context context, int state, java.lang.String number) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/idormy/sms/forwarder/receiver/PhoneStateReceiver$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "callStartTime", "Ljava/util/Date;", "isIncoming", "", "lastState", "", "savedNumber", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}