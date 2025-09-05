package com.idormy.sms.forwarder.core.webview;

import java.lang.System;

/**
 * 【网络请求、加载】
 * WebClient（WebViewClient 这个类主要帮助WebView处理各种通知、url加载，请求时间的）中间件
 *
 *
 *
 *
 * 方法的执行顺序，例如下面用了7个中间件一个 WebViewClient
 *
 *
 * .useMiddlewareWebClient(getMiddlewareWebClient())  // 1
 * .useMiddlewareWebClient(getMiddlewareWebClient())  // 2
 * .useMiddlewareWebClient(getMiddlewareWebClient())  // 3
 * .useMiddlewareWebClient(getMiddlewareWebClient())  // 4
 * .useMiddlewareWebClient(getMiddlewareWebClient())  // 5
 * .useMiddlewareWebClient(getMiddlewareWebClient())  // 6
 * .useMiddlewareWebClient(getMiddlewareWebClient())  // 7
 * DefaultWebClient                                  // 8
 * .setWebViewClient(mWebViewClient)                 // 9
 *
 *
 *
 *
 * 典型的洋葱模型
 * 对象内部的方法执行顺序: 1->2->3->4->5->6->7->8->9->8->7->6->5->4->3->2->1
 *
 *
 *
 *
 * 中断中间件的执行， 删除super.methodName(...) 这行即可
 *
 *
 * 这里主要是做去广告的工作
 */
@kotlin.Suppress(names = {"UNUSED_PARAMETER", "DEPRECATION", "OVERRIDE_DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002\u00a8\u0006\u0010"}, d2 = {"Lcom/idormy/sms/forwarder/core/webview/MiddlewareWebViewClient;", "Lcom/just/agentweb/core/client/MiddlewareWebClientBase;", "()V", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", "view", "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", "url", "", "shouldOverrideUrlLoading", "", "shouldOverrideUrlLoadingByApp", "webView", "Companion", "app_debug"})
public class MiddlewareWebViewClient extends com.just.agentweb.core.client.MiddlewareWebClientBase {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.core.webview.MiddlewareWebViewClient.Companion Companion = null;
    private static int count = 1;
    
    public MiddlewareWebViewClient() {
        super(null);
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.LOLLIPOP)
    @java.lang.Override
    public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull
    android.webkit.WebView view, @org.jetbrains.annotations.NotNull
    android.webkit.WebResourceRequest request) {
        return false;
    }
    
    @java.lang.Override
    public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull
    android.webkit.WebView view, @org.jetbrains.annotations.NotNull
    java.lang.String url) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.webkit.WebResourceResponse shouldInterceptRequest(@org.jetbrains.annotations.NotNull
    android.webkit.WebView view, @org.jetbrains.annotations.NotNull
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.LOLLIPOP)
    @java.lang.Override
    public android.webkit.WebResourceResponse shouldInterceptRequest(@org.jetbrains.annotations.NotNull
    android.webkit.WebView view, @org.jetbrains.annotations.NotNull
    android.webkit.WebResourceRequest request) {
        return null;
    }
    
    /**
     * 根据url的scheme处理跳转第三方app的业务,true代表拦截，false代表不拦截
     */
    private final boolean shouldOverrideUrlLoadingByApp(android.webkit.WebView webView, java.lang.String url) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/idormy/sms/forwarder/core/webview/MiddlewareWebViewClient$Companion;", "", "()V", "count", "", "hasAdUrl", "", "url", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * 判断是否存在广告的链接
         *
         * @param url
         * @return
         */
        private final boolean hasAdUrl(java.lang.String url) {
            return false;
        }
    }
}