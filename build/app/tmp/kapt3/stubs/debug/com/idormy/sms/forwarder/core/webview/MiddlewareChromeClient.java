package com.idormy.sms.forwarder.core.webview;

import java.lang.System;

/**
 * WebChrome（WebChromeClient主要辅助WebView处理JavaScript的对话框、网站图片、网站title、加载进度等）中间件
 * 【浏览器】
 * @author xuexiang
 * @since 2019/1/4 下午11:31
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/idormy/sms/forwarder/core/webview/MiddlewareChromeClient;", "Lcom/just/agentweb/core/client/MiddlewareWebChromeBase;", "()V", "onJsAlert", "", "view", "Landroid/webkit/WebView;", "url", "", "message", "result", "Landroid/webkit/JsResult;", "onProgressChanged", "", "newProgress", "", "app_debug"})
public class MiddlewareChromeClient extends com.just.agentweb.core.client.MiddlewareWebChromeBase {
    
    public MiddlewareChromeClient() {
        super(null);
    }
    
    @java.lang.Override
    public boolean onJsAlert(@org.jetbrains.annotations.NotNull
    android.webkit.WebView view, @org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    android.webkit.JsResult result) {
        return false;
    }
    
    @java.lang.Override
    public void onProgressChanged(@org.jetbrains.annotations.NotNull
    android.webkit.WebView view, int newProgress) {
    }
}