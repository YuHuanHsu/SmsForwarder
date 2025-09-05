package com.idormy.sms.forwarder.utils;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/idormy/sms/forwarder/utils/LocationUtils;", "", "()V", "LOCATION_MODE_OFF", "", "hasLocationCapability", "", "context", "Landroid/content/Context;", "hasLocationPermission", "isLocationEnabled", "app_debug"})
public final class LocationUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.LocationUtils INSTANCE = null;
    private static final int LOCATION_MODE_OFF = 0;
    
    private LocationUtils() {
        super();
    }
    
    private final boolean hasLocationPermission(android.content.Context context) {
        return false;
    }
    
    public final boolean isLocationEnabled(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    public final boolean hasLocationCapability(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
}