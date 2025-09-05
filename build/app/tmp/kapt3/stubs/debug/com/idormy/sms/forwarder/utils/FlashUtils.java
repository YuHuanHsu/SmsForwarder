package com.idormy.sms.forwarder.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0002J\u0016\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0018\u00010\u0014R\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/idormy/sms/forwarder/utils/FlashUtils;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cameraId", "", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "duration", "", "handler", "Landroid/os/Handler;", "<set-?>", "", "isFlashing", "()Z", "legacyCamera", "Landroid/hardware/Camera;", "legacyParams", "Landroid/hardware/Camera$Parameters;", "release", "", "setFlashlight", "enable", "startFlashing", "pattern", "repeatTimes", "", "stopFlashing", "app_debug"})
public final class FlashUtils {
    private android.hardware.camera2.CameraManager cameraManager;
    private java.lang.String cameraId;
    private android.hardware.Camera legacyCamera;
    private android.hardware.Camera.Parameters legacyParams;
    private android.os.Handler handler;
    private final long duration = 100L;
    private boolean isFlashing = false;
    
    public FlashUtils(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    public final boolean isFlashing() {
        return false;
    }
    
    /**
     * 按照模式控制闪光灯
     * @param pattern 例如 "XXOOXXOO" （X-开，O-关）
     * @param repeatTimes 闪烁的重复次数，0 表示无限循环
     */
    public final void startFlashing(@org.jetbrains.annotations.NotNull
    java.lang.String pattern, int repeatTimes) {
    }
    
    /**
     * 关闭闪光灯并停止模式
     */
    public final void stopFlashing() {
    }
    
    /**
     * 设置闪光灯状态，兼容 Android 4.4+
     */
    private final void setFlashlight(boolean enable) {
    }
    
    /**
     * 释放旧 API 资源
     */
    public final void release() {
    }
}