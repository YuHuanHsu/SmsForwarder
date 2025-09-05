package com.idormy.sms.forwarder.utils;

import java.lang.System;

/**
 * xtoast 工具类
 *
 * @author xuexiang
 * @since 2019-06-30 19:04
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/idormy/sms/forwarder/utils/XToastUtils;", "", "()V", "Companion", "app_debug"})
public final class XToastUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.XToastUtils.Companion Companion = null;
    
    private XToastUtils() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\bH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\bH\u0007J\u001a\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\bH\u0007J\u001a\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\bH\u0007J\u001a\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\bH\u0007J\u001a\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/idormy/sms/forwarder/utils/XToastUtils$Companion;", "", "()V", "error", "", "message", "", "duration", "", "throwable", "", "info", "success", "toast", "warning", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @androidx.annotation.MainThread
        public final void toast(@org.jetbrains.annotations.NotNull
        java.lang.CharSequence message) {
        }
        
        @androidx.annotation.MainThread
        public final void toast(@androidx.annotation.StringRes
        int message) {
        }
        
        @androidx.annotation.MainThread
        public final void toast(@org.jetbrains.annotations.NotNull
        java.lang.CharSequence message, int duration) {
        }
        
        @androidx.annotation.MainThread
        public final void toast(@androidx.annotation.StringRes
        int message, int duration) {
        }
        
        @androidx.annotation.MainThread
        public final void error(@org.jetbrains.annotations.NotNull
        java.lang.Throwable throwable) {
        }
        
        @androidx.annotation.MainThread
        public final void error(@org.jetbrains.annotations.NotNull
        java.lang.CharSequence message) {
        }
        
        @androidx.annotation.MainThread
        public final void error(@androidx.annotation.StringRes
        int message) {
        }
        
        @androidx.annotation.MainThread
        public final void error(@org.jetbrains.annotations.NotNull
        java.lang.CharSequence message, int duration) {
        }
        
        @androidx.annotation.MainThread
        public final void error(@androidx.annotation.StringRes
        int message, int duration) {
        }
        
        @androidx.annotation.MainThread
        public final void success(@org.jetbrains.annotations.NotNull
        java.lang.CharSequence message) {
        }
        
        @androidx.annotation.MainThread
        public final void success(@androidx.annotation.StringRes
        int message) {
        }
        
        @androidx.annotation.MainThread
        public final void success(@org.jetbrains.annotations.NotNull
        java.lang.CharSequence message, int duration) {
        }
        
        @androidx.annotation.MainThread
        public final void success(@androidx.annotation.StringRes
        int message, int duration) {
        }
        
        @androidx.annotation.MainThread
        public final void info(@org.jetbrains.annotations.NotNull
        java.lang.CharSequence message) {
        }
        
        @androidx.annotation.MainThread
        public final void info(@androidx.annotation.StringRes
        int message) {
        }
        
        @androidx.annotation.MainThread
        public final void info(@org.jetbrains.annotations.NotNull
        java.lang.CharSequence message, int duration) {
        }
        
        @androidx.annotation.MainThread
        public final void info(@androidx.annotation.StringRes
        int message, int duration) {
        }
        
        @androidx.annotation.MainThread
        public final void warning(@org.jetbrains.annotations.NotNull
        java.lang.CharSequence message) {
        }
        
        @androidx.annotation.MainThread
        public final void warning(@androidx.annotation.StringRes
        int message) {
        }
        
        @androidx.annotation.MainThread
        public final void warning(@org.jetbrains.annotations.NotNull
        java.lang.CharSequence message, int duration) {
        }
        
        @androidx.annotation.MainThread
        public final void warning(@androidx.annotation.StringRes
        int message, int duration) {
        }
    }
}