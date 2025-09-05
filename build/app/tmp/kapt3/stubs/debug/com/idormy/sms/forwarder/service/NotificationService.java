package com.idormy.sms.forwarder.service;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName", "DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0017J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/idormy/sms/forwarder/service/NotificationService;", "Landroid/service/notification/NotificationListenerService;", "()V", "TAG", "", "onListenerConnected", "", "onListenerDisconnected", "onNotificationPosted", "sbn", "Landroid/service/notification/StatusBarNotification;", "onNotificationRemoved", "app_debug"})
public final class NotificationService extends android.service.notification.NotificationListenerService {
    private final java.lang.String TAG = null;
    
    public NotificationService() {
        super();
    }
    
    @java.lang.Override
    public void onListenerConnected() {
    }
    
    @java.lang.Override
    public void onListenerDisconnected() {
    }
    
    @android.annotation.SuppressLint(value = {"DiscouragedPrivateApi"})
    @java.lang.Override
    public void onNotificationPosted(@org.jetbrains.annotations.Nullable
    android.service.notification.StatusBarNotification sbn) {
    }
    
    @java.lang.Override
    public void onNotificationRemoved(@org.jetbrains.annotations.Nullable
    android.service.notification.StatusBarNotification sbn) {
    }
}