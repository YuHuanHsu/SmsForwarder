package com.idormy.sms.forwarder.service;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0014\u001a\u00020\u00122\u000e\u0010\u0015\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017H\u0016J\"\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001f"}, d2 = {"Lcom/idormy/sms/forwarder/service/HttpServerService;", "Landroid/app/Service;", "Lcom/yanzhenjie/andserver/Server$ServerListener;", "()V", "TAG", "", "server", "Lcom/yanzhenjie/andserver/Server;", "kotlin.jvm.PlatformType", "getServer", "()Lcom/yanzhenjie/andserver/Server;", "server$delegate", "Lkotlin/Lazy;", "onBind", "Landroid/os/IBinder;", "p0", "Landroid/content/Intent;", "onCreate", "", "onDestroy", "onException", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onStartCommand", "", "intent", "flags", "startId", "onStarted", "onStopped", "app_debug"})
public final class HttpServerService extends android.app.Service implements com.yanzhenjie.andserver.Server.ServerListener {
    private final java.lang.String TAG = null;
    private final kotlin.Lazy server$delegate = null;
    
    public HttpServerService() {
        super();
    }
    
    private final com.yanzhenjie.andserver.Server getServer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable
    android.content.Intent p0) {
        return null;
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
    
    @java.lang.Override
    public void onException(@org.jetbrains.annotations.Nullable
    java.lang.Exception e) {
    }
    
    @java.lang.Override
    public void onStarted() {
    }
    
    @java.lang.Override
    public void onStopped() {
    }
}