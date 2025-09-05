package com.idormy.sms.forwarder.core.http.loader;

import java.lang.System;

/**
 * 默认进度加载
 *
 * @author xuexiang
 * @since 2019-11-18 23:07
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/idormy/sms/forwarder/core/http/loader/MiniLoadingDialogLoader;", "Lcom/xuexiang/xhttp2/subsciber/impl/IProgressLoader;", "context", "Landroid/content/Context;", "msg", "", "(Landroid/content/Context;Ljava/lang/String;)V", "mDialog", "Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog;", "mOnProgressCancelListener", "Lcom/xuexiang/xhttp2/subsciber/impl/OnProgressCancelListener;", "dismissLoading", "", "isLoading", "", "setCancelable", "flag", "setOnProgressCancelListener", "listener", "showLoading", "updateMessage", "app_debug"})
public final class MiniLoadingDialogLoader implements com.xuexiang.xhttp2.subsciber.impl.IProgressLoader {
    
    /**
     * 进度loading弹窗
     */
    private final com.xuexiang.xui.widget.dialog.MiniLoadingDialog mDialog = null;
    
    /**
     * 进度框取消监听
     */
    private com.xuexiang.xhttp2.subsciber.impl.OnProgressCancelListener mOnProgressCancelListener;
    
    @kotlin.jvm.JvmOverloads
    public MiniLoadingDialogLoader(@org.jetbrains.annotations.Nullable
    android.content.Context context) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public MiniLoadingDialogLoader(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String msg) {
        super();
    }
    
    @java.lang.Override
    public boolean isLoading() {
        return false;
    }
    
    @java.lang.Override
    public void updateMessage(@org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    @java.lang.Override
    public void showLoading() {
    }
    
    @java.lang.Override
    public void dismissLoading() {
    }
    
    @java.lang.Override
    public void setCancelable(boolean flag) {
    }
    
    @java.lang.Override
    public void setOnProgressCancelListener(@org.jetbrains.annotations.NotNull
    com.xuexiang.xhttp2.subsciber.impl.OnProgressCancelListener listener) {
    }
}