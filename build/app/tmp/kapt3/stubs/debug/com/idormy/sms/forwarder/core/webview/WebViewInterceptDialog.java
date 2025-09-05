package com.idormy.sms.forwarder.core.webview;

import java.lang.System;

/**
 * WebView拦截提示
 *
 * @author xuexiang
 * @since 2019-10-21 9:51
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a8\u0006\u0016"}, d2 = {"Lcom/idormy/sms/forwarder/core/webview/WebViewInterceptDialog;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/content/DialogInterface$OnDismissListener;", "()V", "getOpenTitle", "", "url", "getScheme", "isAppLink", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "openApp", "openAppLink", "context", "Landroid/content/Context;", "Companion", "app_debug"})
public final class WebViewInterceptDialog extends androidx.appcompat.app.AppCompatActivity implements android.content.DialogInterface.OnDismissListener {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.core.webview.WebViewInterceptDialog.Companion Companion = null;
    private static final java.lang.String KEY_INTERCEPT_URL = "key_intercept_url";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String APP_LINK_HOST = "ppps.cn";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String APP_LINK_ACTION = "com.idormy.sms.forwarder";
    
    public WebViewInterceptDialog() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final java.lang.String getOpenTitle(java.lang.String url) {
        return null;
    }
    
    private final java.lang.String getScheme(java.lang.String url) {
        return null;
    }
    
    private final boolean isAppLink(java.lang.String url) {
        return false;
    }
    
    private final void openApp(java.lang.String url) {
    }
    
    private final void openAppLink(android.content.Context context, java.lang.String url) {
    }
    
    @java.lang.Override
    public void onDismiss(@org.jetbrains.annotations.NotNull
    android.content.DialogInterface dialog) {
    }
    
    /**
     * 显示WebView拦截提示
     *
     * @param url 需要拦截处理的url
     */
    @kotlin.jvm.JvmStatic
    public static final void show(@org.jetbrains.annotations.Nullable
    java.lang.String url) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/idormy/sms/forwarder/core/webview/WebViewInterceptDialog$Companion;", "", "()V", "APP_LINK_ACTION", "", "APP_LINK_HOST", "KEY_INTERCEPT_URL", "show", "", "url", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * 显示WebView拦截提示
         *
         * @param url 需要拦截处理的url
         */
        @kotlin.jvm.JvmStatic
        public final void show(@org.jetbrains.annotations.Nullable
        java.lang.String url) {
        }
    }
}