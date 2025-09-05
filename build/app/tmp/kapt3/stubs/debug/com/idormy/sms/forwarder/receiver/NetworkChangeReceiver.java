package com.idormy.sms.forwarder.receiver;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName", "DEPRECATION", "UNUSED_PARAMETER"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/idormy/sms/forwarder/receiver/NetworkChangeReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "TAG", "", "getDataSubId", "", "context", "Landroid/content/Context;", "getDefaultDataSlotId", "getSlotIndex", "handleConnectivityChange", "", "handleNetworkStateChanged", "intent", "Landroid/content/Intent;", "handleWifiStateChanged", "onReceive", "app_debug"})
public final class NetworkChangeReceiver extends android.content.BroadcastReceiver {
    private final java.lang.String TAG = null;
    
    public NetworkChangeReceiver() {
        super();
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
    }
    
    private final void handleConnectivityChange(android.content.Context context) {
    }
    
    private final void handleWifiStateChanged(android.content.Context context, android.content.Intent intent) {
    }
    
    private final void handleNetworkStateChanged(android.content.Context context, android.content.Intent intent) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.Q)
    private final int getSlotIndex(android.content.Context context) {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"DiscouragedPrivateApi"})
    private final int getDataSubId(android.content.Context context) {
        return 0;
    }
    
    private final int getDefaultDataSlotId(android.content.Context context) {
        return 0;
    }
}