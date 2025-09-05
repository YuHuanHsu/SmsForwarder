package com.idormy.sms.forwarder.receiver;

import java.lang.System;

@android.annotation.SuppressLint(value = {"MissingPermission"})
@kotlin.Suppress(names = {"PrivatePropertyName", "DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\bH\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u0015\u001a\u00020\bH\u0002J\b\u0010\u0016\u001a\u00020\bH\u0002J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J\u001c\u0010\u001b\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/idormy/sms/forwarder/receiver/BluetoothReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "TAG", "", "handler", "Landroid/os/Handler;", "handleAclConnected", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "handleAclDisconnected", "handleActionFound", "handleBluetoothStateChanged", "state", "", "handleBondStateChanged", "handleConnectionStateChanged", "handleDiscoveryFinished", "handleLocalNameChanged", "handleScanModeChanged", "handleStateChanged", "handleWorkRequest", "action", "msg", "onReceive", "restartBluetoothService", "app_debug"})
public final class BluetoothReceiver extends android.content.BroadcastReceiver {
    private final java.lang.String TAG = null;
    private final android.os.Handler handler = null;
    
    public BluetoothReceiver() {
        super();
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
    }
    
    private final void handleActionFound(android.content.Intent intent) {
    }
    
    private final void handleDiscoveryFinished(android.content.Context context) {
    }
    
    private final void handleStateChanged(android.content.Context context, android.content.Intent intent) {
    }
    
    private final void handleScanModeChanged() {
    }
    
    private final void handleLocalNameChanged() {
    }
    
    private final void handleConnectionStateChanged() {
    }
    
    private final void handleBondStateChanged() {
    }
    
    private final void handleAclConnected(android.content.Context context, android.content.Intent intent) {
    }
    
    private final void handleAclDisconnected(android.content.Context context, android.content.Intent intent) {
    }
    
    private final void handleBluetoothStateChanged(int state) {
    }
    
    private final void restartBluetoothService(java.lang.String action) {
    }
    
    private final void handleWorkRequest(android.content.Context context, java.lang.String action, java.lang.String msg) {
    }
}