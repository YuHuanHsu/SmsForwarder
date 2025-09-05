package com.idormy.sms.forwarder.utils;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION", "MemberVisibilityCanBePrivate"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0004\u00a8\u0006\t"}, d2 = {"Lcom/idormy/sms/forwarder/utils/BluetoothUtils;", "", "()V", "hasBluetoothCapability", "", "context", "Landroid/content/Context;", "hasBluetoothPermission", "isBluetoothEnabled", "app_debug"})
public final class BluetoothUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.BluetoothUtils INSTANCE = null;
    
    private BluetoothUtils() {
        super();
    }
    
    /**
     * 检查应用是否具有蓝牙权限
     */
    public final boolean hasBluetoothPermission(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    /**
     * 检查蓝牙是否已启用
     */
    public final boolean isBluetoothEnabled() {
        return false;
    }
    
    /**
     * 检查设备是否支持蓝牙功能
     */
    public final boolean hasBluetoothCapability(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
}