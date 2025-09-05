package com.idormy.sms.forwarder.utils;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION", "MemberVisibilityCanBePrivate"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/idormy/sms/forwarder/utils/FrpcUtils;", "", "()V", "Companion", "app_debug"})
public final class FrpcUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.FrpcUtils.Companion Companion = null;
    
    private FrpcUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/idormy/sms/forwarder/utils/FrpcUtils$Companion;", "", "()V", "getStringFromRaw", "Lio/reactivex/Observable;", "", "context", "Landroid/content/Context;", "rawName", "", "isServiceRunning", "", "serviceName", "waitService", "Lio/reactivex/Completable;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final io.reactivex.Completable waitService(@org.jetbrains.annotations.NotNull
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
        
        public final boolean isServiceRunning(@org.jetbrains.annotations.NotNull
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final io.reactivex.Observable<java.lang.String> getStringFromRaw(@org.jetbrains.annotations.NotNull
        android.content.Context context, int rawName) {
            return null;
        }
    }
}