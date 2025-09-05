package com.idormy.sms.forwarder.core.http.loader;

import java.lang.System;

/**
 * 创建进度加载者
 *
 * @author xuexiang
 * @since 2019-07-02 12:51
 */
@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/idormy/sms/forwarder/core/http/loader/ProgressLoader;", "", "()V", "Companion", "app_debug"})
public final class ProgressLoader {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.core.http.loader.ProgressLoader.Companion Companion = null;
    private static com.idormy.sms.forwarder.core.http.loader.IProgressLoaderFactory sIProgressLoaderFactory;
    
    private ProgressLoader() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/idormy/sms/forwarder/core/http/loader/ProgressLoader$Companion;", "", "()V", "sIProgressLoaderFactory", "Lcom/idormy/sms/forwarder/core/http/loader/IProgressLoaderFactory;", "create", "Lcom/xuexiang/xhttp2/subsciber/impl/IProgressLoader;", "context", "Landroid/content/Context;", "message", "", "setIProgressLoaderFactory", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void setIProgressLoaderFactory(@org.jetbrains.annotations.NotNull
        com.idormy.sms.forwarder.core.http.loader.IProgressLoaderFactory sIProgressLoaderFactory) {
        }
        
        /**
         * 创建进度加载者
         *
         * @param context
         * @return
         */
        @org.jetbrains.annotations.Nullable
        public final com.xuexiang.xhttp2.subsciber.impl.IProgressLoader create(@org.jetbrains.annotations.Nullable
        android.content.Context context) {
            return null;
        }
        
        /**
         * 创建进度加载者
         *
         * @param context
         * @param message 默认提示信息
         * @return
         */
        @org.jetbrains.annotations.Nullable
        public final com.xuexiang.xhttp2.subsciber.impl.IProgressLoader create(@org.jetbrains.annotations.Nullable
        android.content.Context context, @org.jetbrains.annotations.Nullable
        java.lang.String message) {
            return null;
        }
    }
}