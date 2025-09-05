package com.idormy.sms.forwarder.core.webview;

import java.lang.System;

/**
 * 通用WebView页面
 *
 * @author xuexiang
 * @since 2019/1/4 下午11:13
 */
@kotlin.Suppress(names = {"unused", "ProtectedInFinal", "NAME_SHADOWING", "UNUSED_PARAMETER", "OVERRIDE_DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00ca\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0004J\u0010\u0010H\u001a\u00020E2\u0006\u0010I\u001a\u00020\u0012H\u0004J&\u0010J\u001a\u0004\u0018\u00010\u00122\u0006\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010N2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\b\u0010Q\u001a\u00020EH\u0016J\u001a\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010WH\u0016J\b\u0010X\u001a\u00020EH\u0016J\b\u0010Y\u001a\u00020EH\u0016J\u001a\u0010Z\u001a\u00020E2\u0006\u0010I\u001a\u00020\u00122\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\u0010\u0010[\u001a\u00020E2\u0006\u0010\\\u001a\u00020=H\u0002J\u0010\u0010]\u001a\u00020E2\u0006\u0010^\u001a\u00020UH\u0002J\u0010\u0010_\u001a\u00020E2\u0006\u0010<\u001a\u00020=H\u0002J\u0010\u0010`\u001a\u00020E2\u0006\u0010I\u001a\u00020\u0012H\u0002J\u001a\u0010a\u001a\u00020E2\b\u0010b\u001a\u0004\u0018\u00010c2\u0006\u0010d\u001a\u00020=H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020#X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R \u0010(\u001a\u00020)X\u0084\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b*\u0010\u0003\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b1\u00102R\u001a\u00103\u001a\u0002048DX\u0084\u0004\u00a2\u0006\f\u0012\u0004\b5\u0010\u0003\u001a\u0004\b6\u00107R\u0015\u00108\u001a\u0006\u0012\u0002\b\u0003098F\u00a2\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010<\u001a\u00020=8F\u00a2\u0006\u0006\u001a\u0004\b>\u0010?R\u001c\u0010@\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030A8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\bB\u0010C\u00a8\u0006f"}, d2 = {"Lcom/idormy/sms/forwarder/core/webview/AgentWebFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/idormy/sms/forwarder/core/webview/FragmentKeyDown;", "()V", "mAgentWeb", "Lcom/just/agentweb/core/AgentWeb;", "mBackImageView", "Landroid/widget/ImageView;", "mDownloadListenerAdapter", "Lcom/just/agentweb/download/DownloadListenerAdapter;", "getMDownloadListenerAdapter", "()Lcom/just/agentweb/download/DownloadListenerAdapter;", "setMDownloadListenerAdapter", "(Lcom/just/agentweb/download/DownloadListenerAdapter;)V", "mDownloadingService", "Lcom/just/agentweb/download/DownloadingService;", "mFinishImageView", "mLineView", "Landroid/view/View;", "mMoreImageView", "mOnClickListener", "Landroid/view/View$OnClickListener;", "mOnMenuItemClickListener", "Landroidx/appcompat/widget/PopupMenu$OnMenuItemClickListener;", "mPermissionInterceptor", "Lcom/just/agentweb/action/PermissionInterceptor;", "getMPermissionInterceptor", "()Lcom/just/agentweb/action/PermissionInterceptor;", "setMPermissionInterceptor", "(Lcom/just/agentweb/action/PermissionInterceptor;)V", "mPopupMenu", "Landroidx/appcompat/widget/PopupMenu;", "mTitleTextView", "Landroid/widget/TextView;", "mWebChromeClient", "Landroid/webkit/WebChromeClient;", "getMWebChromeClient", "()Landroid/webkit/WebChromeClient;", "setMWebChromeClient", "(Landroid/webkit/WebChromeClient;)V", "mWebViewClient", "Landroid/webkit/WebViewClient;", "getMWebViewClient$annotations", "getMWebViewClient", "()Landroid/webkit/WebViewClient;", "setMWebViewClient", "(Landroid/webkit/WebViewClient;)V", "middlewareWebChrome", "Lcom/just/agentweb/core/client/MiddlewareWebChromeBase;", "getMiddlewareWebChrome", "()Lcom/just/agentweb/core/client/MiddlewareWebChromeBase;", "middlewareWebClient", "Lcom/just/agentweb/core/client/MiddlewareWebClientBase;", "getMiddlewareWebClient$annotations", "getMiddlewareWebClient", "()Lcom/just/agentweb/core/client/MiddlewareWebClientBase;", "settings", "Lcom/just/agentweb/core/web/IAgentWebSettings;", "getSettings", "()Lcom/just/agentweb/core/web/IAgentWebSettings;", "url", "", "getUrl", "()Ljava/lang/String;", "webLayout", "Lcom/just/agentweb/widget/IWebLayout;", "getWebLayout", "()Lcom/just/agentweb/widget/IWebLayout;", "addBackgroundChild", "", "frameLayout", "Landroid/widget/FrameLayout;", "initView", "view", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onFragmentKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onPause", "onResume", "onViewCreated", "openBrowser", "targetUrl", "pageNavigator", "tag", "shareWebUrl", "showPoPup", "toCopy", "context", "Landroid/content/Context;", "text", "Companion", "app_debug"})
public final class AgentWebFragment extends androidx.fragment.app.Fragment implements com.idormy.sms.forwarder.core.webview.FragmentKeyDown {
    private android.widget.ImageView mBackImageView;
    private android.view.View mLineView;
    private android.widget.ImageView mFinishImageView;
    private android.widget.TextView mTitleTextView;
    private com.just.agentweb.core.AgentWeb mAgentWeb;
    private android.widget.ImageView mMoreImageView;
    private androidx.appcompat.widget.PopupMenu mPopupMenu;
    private com.just.agentweb.download.DownloadingService mDownloadingService;
    private final android.view.View.OnClickListener mOnClickListener = null;
    
    /**
     * 权限申请拦截器
     */
    @org.jetbrains.annotations.NotNull
    private com.just.agentweb.action.PermissionInterceptor mPermissionInterceptor;
    
    /**
     * 更新于 AgentWeb 4.0.0，下载监听
     */
    @org.jetbrains.annotations.NotNull
    private com.just.agentweb.download.DownloadListenerAdapter mDownloadListenerAdapter;
    @org.jetbrains.annotations.NotNull
    private android.webkit.WebChromeClient mWebChromeClient;
    @org.jetbrains.annotations.NotNull
    private android.webkit.WebViewClient mWebViewClient;
    
    /**
     * 菜单事件
     */
    private final androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener mOnMenuItemClickListener = null;
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.core.webview.AgentWebFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_URL = "com.xuexiang.xuidemo.base.webview.key_url";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = null;
    
    public AgentWebFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.just.agentweb.widget.IWebLayout<?, ?> getWebLayout() {
        return null;
    }
    
    protected final void initView(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    protected final void addBackgroundChild(@org.jetbrains.annotations.NotNull
    android.widget.FrameLayout frameLayout) {
    }
    
    private final void pageNavigator(int tag) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.just.agentweb.action.PermissionInterceptor getMPermissionInterceptor() {
        return null;
    }
    
    protected final void setMPermissionInterceptor(@org.jetbrains.annotations.NotNull
    com.just.agentweb.action.PermissionInterceptor p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.just.agentweb.download.DownloadListenerAdapter getMDownloadListenerAdapter() {
        return null;
    }
    
    protected final void setMDownloadListenerAdapter(@org.jetbrains.annotations.NotNull
    com.just.agentweb.download.DownloadListenerAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.just.agentweb.core.web.IAgentWebSettings<?> getSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final android.webkit.WebChromeClient getMWebChromeClient() {
        return null;
    }
    
    protected final void setMWebChromeClient(@org.jetbrains.annotations.NotNull
    android.webkit.WebChromeClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final android.webkit.WebViewClient getMWebViewClient() {
        return null;
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    @java.lang.Deprecated
    protected static void getMWebViewClient$annotations() {
    }
    
    protected final void setMWebViewClient(@org.jetbrains.annotations.NotNull
    android.webkit.WebViewClient p0) {
    }
    
    /**
     * 打开浏览器
     *
     * @param targetUrl 外部浏览器打开的地址
     */
    private final void openBrowser(java.lang.String targetUrl) {
    }
    
    /**
     * 显示更多菜单
     *
     * @param view 菜单依附在该View下面
     */
    private final void showPoPup(android.view.View view) {
    }
    
    /**
     * 分享网页链接
     *
     * @param url 网页链接
     */
    private final void shareWebUrl(java.lang.String url) {
    }
    
    /**
     * 复制字符串
     *
     * @param context
     * @param text
     */
    private final void toCopy(android.content.Context context, java.lang.String text) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onPause() {
    }
    
    @java.lang.Override
    public boolean onFragmentKeyDown(int keyCode, @org.jetbrains.annotations.Nullable
    android.view.KeyEvent event) {
        return false;
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    /**
     * MiddlewareWebClientBase 是 AgentWeb 3.0.0 提供一个强大的功能，
     * 如果用户需要使用 AgentWeb 提供的功能， 不想重写 WebClientView方
     * 法覆盖AgentWeb提供的功能，那么 MiddlewareWebClientBase 是一个
     * 不错的选择 。
     *
     * @return
     */
    @kotlin.Suppress(names = {"DEPRECATION"})
    @java.lang.Deprecated
    protected static void getMiddlewareWebClient$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.just.agentweb.core.client.MiddlewareWebClientBase getMiddlewareWebClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.just.agentweb.core.client.MiddlewareWebChromeBase getMiddlewareWebChrome() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\r"}, d2 = {"Lcom/idormy/sms/forwarder/core/webview/AgentWebFragment$Companion;", "", "()V", "KEY_URL", "", "TAG", "getTAG", "()Ljava/lang/String;", "getInstance", "Lcom/idormy/sms/forwarder/core/webview/AgentWebFragment;", "bundle", "Landroid/os/Bundle;", "url", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTAG() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.idormy.sms.forwarder.core.webview.AgentWebFragment getInstance(@org.jetbrains.annotations.Nullable
        java.lang.String url) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.idormy.sms.forwarder.core.webview.AgentWebFragment getInstance(@org.jetbrains.annotations.Nullable
        android.os.Bundle bundle) {
            return null;
        }
    }
}