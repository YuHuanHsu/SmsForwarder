package com.idormy.sms.forwarder.utils;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/idormy/sms/forwarder/utils/CacheUtils;", "", "()V", "Companion", "app_debug"})
public final class CacheUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.CacheUtils.Companion Companion = null;
    
    private CacheUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/idormy/sms/forwarder/utils/CacheUtils$Companion;", "", "()V", "clearAllCache", "", "context", "Landroid/content/Context;", "deleteDir", "", "dir", "Ljava/io/File;", "getFolderSize", "", "file", "getFormatSize", "", "size", "", "getTotalCacheSize", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * 获取缓存大小
         *
         * @param context 上下文
         * @return 缓存大小
         */
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTotalCacheSize(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
        
        /**
         * *
         * 清理所有缓存
         * @param context 上下文
         */
        public final void clearAllCache(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
        
        private final boolean deleteDir(java.io.File dir) {
            return false;
        }
        
        private final long getFolderSize(java.io.File file) {
            return 0L;
        }
        
        /**
         * 格式化单位
         *
         * @param size 文件大小
         * @return 结果
         */
        private final java.lang.String getFormatSize(double size) {
            return null;
        }
    }
}