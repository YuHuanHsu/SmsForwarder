package com.idormy.sms.forwarder.core.http.loader;

import java.lang.System;

/**
 * IProgressLoader的创建工厂实现接口
 *
 * @author xuexiang
 * @since 2019-11-18 23:17
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/idormy/sms/forwarder/core/http/loader/IProgressLoaderFactory;", "", "create", "Lcom/xuexiang/xhttp2/subsciber/impl/IProgressLoader;", "context", "Landroid/content/Context;", "message", "", "app_debug"})
public abstract interface IProgressLoaderFactory {
    
    /**
     * 创建进度加载者
     *
     * @param context
     * @return
     */
    @org.jetbrains.annotations.Nullable
    public abstract com.xuexiang.xhttp2.subsciber.impl.IProgressLoader create(@org.jetbrains.annotations.Nullable
    android.content.Context context);
    
    /**
     * 创建进度加载者
     *
     * @param context
     * @param message 默认提示
     * @return
     */
    @org.jetbrains.annotations.Nullable
    public abstract com.xuexiang.xhttp2.subsciber.impl.IProgressLoader create(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String message);
}