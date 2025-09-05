package com.idormy.sms.forwarder.core.webview;

import java.lang.System;

/**
 * 如果你需要修改某一个AgentWeb 内部的某一个弹窗 ，请看下面的例子
 * 注意写法一定要参照 DefaultUIController 的写法 ，因为UI自由定制，但是回调的方式是固定的，并且一定要回调。
 *
 * @author xuexiang
 * @since 2019-10-30 23:18
 */
@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J3\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016\u00a2\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/idormy/sms/forwarder/core/webview/UIController;", "Lcom/just/agentweb/core/web/AgentWebUIControllerImplBase;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "mActivity", "Ljava/lang/ref/WeakReference;", "onSelectItemsPrompt", "", "view", "Landroid/webkit/WebView;", "url", "", "items", "", "callback", "Landroid/os/Handler$Callback;", "(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Handler$Callback;)V", "onShowMessage", "message", "from", "app_debug"})
public final class UIController extends com.just.agentweb.core.web.AgentWebUIControllerImplBase {
    private final java.lang.ref.WeakReference<android.app.Activity> mActivity = null;
    
    public UIController(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
        super();
    }
    
    @java.lang.Override
    public void onShowMessage(@org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    java.lang.String from) {
    }
    
    @java.lang.Override
    public void onSelectItemsPrompt(@org.jetbrains.annotations.NotNull
    android.webkit.WebView view, @org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.lang.String[] items, @org.jetbrains.annotations.NotNull
    android.os.Handler.Callback callback) {
    }
}