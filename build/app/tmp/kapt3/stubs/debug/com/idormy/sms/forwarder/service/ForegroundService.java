package com.idormy.sms.forwarder.service;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName", "DeferredResultUnused", "OPT_IN_USAGE", "DEPRECATION"})
@android.annotation.SuppressLint(value = {"SimpleDateFormat"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u0005\u00a2\u0006\u0002\u0010\u0002J+\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001d\u001a\u00020\u0013H\u0002\u00a2\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020 H\u0002J\u001c\u0010!\u001a\u00020 2\n\u0010\"\u001a\u00060#j\u0002`$2\u0006\u0010%\u001a\u00020\u0004H\u0002J\u0012\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020 H\u0016J\b\u0010+\u001a\u00020 H\u0016J\"\u0010,\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\tH\u0016J\b\u0010/\u001a\u00020 H\u0002J\b\u00100\u001a\u00020 H\u0002J+\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001d\u001a\u00020\u0013H\u0002\u00a2\u0006\u0002\u00103R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00040\u00040\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/idormy/sms/forwarder/service/ForegroundService;", "Landroid/app/Service;", "()V", "TAG", "", "alarmObserver", "Landroidx/lifecycle/Observer;", "Lcom/idormy/sms/forwarder/entity/action/AlarmSetting;", "alarmPlayTimes", "", "alarmPlayer", "Landroid/media/MediaPlayer;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "flashUtils", "Lcom/idormy/sms/forwarder/utils/FlashUtils;", "frpcObserver", "kotlin.jvm.PlatformType", "isFlash", "", "isVibrating", "notificationManager", "Landroid/app/NotificationManager;", "vibrationUtils", "Lcom/idormy/sms/forwarder/utils/VibrationUtils;", "createNotification", "Landroid/app/Notification;", "content", "largeIconResId", "showStopButton", "(Ljava/lang/String;Ljava/lang/Integer;Z)Landroid/app/Notification;", "createNotificationChannel", "", "handleException", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "methodName", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "flags", "startId", "startForegroundService", "stopForegroundService", "updateNotification", "updatedContent", "(Ljava/lang/String;Ljava/lang/Integer;Z)V", "Companion", "app_debug"})
public final class ForegroundService extends android.app.Service {
    private final java.lang.String TAG = null;
    private android.app.NotificationManager notificationManager;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final androidx.lifecycle.Observer<java.lang.String> frpcObserver = null;
    private com.idormy.sms.forwarder.utils.VibrationUtils vibrationUtils;
    private boolean isVibrating = false;
    private com.idormy.sms.forwarder.utils.FlashUtils flashUtils;
    private boolean isFlash = false;
    private android.media.MediaPlayer alarmPlayer;
    private int alarmPlayTimes = 0;
    private final androidx.lifecycle.Observer<com.idormy.sms.forwarder.entity.action.AlarmSetting> alarmObserver = null;
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.service.ForegroundService.Companion Companion = null;
    private static boolean isRunning = false;
    
    public ForegroundService() {
        super();
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @java.lang.Override
    public int onStartCommand(@org.jetbrains.annotations.Nullable
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
        return null;
    }
    
    private final void startForegroundService() {
    }
    
    private final void stopForegroundService() {
    }
    
    private final void createNotificationChannel() {
    }
    
    private final android.app.Notification createNotification(java.lang.String content, java.lang.Integer largeIconResId, boolean showStopButton) {
        return null;
    }
    
    private final void updateNotification(java.lang.String updatedContent, java.lang.Integer largeIconResId, boolean showStopButton) {
    }
    
    private final void handleException(java.lang.Exception e, java.lang.String methodName) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/idormy/sms/forwarder/service/ForegroundService$Companion;", "", "()V", "isRunning", "", "()Z", "setRunning", "(Z)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isRunning() {
            return false;
        }
        
        public final void setRunning(boolean p0) {
        }
    }
}