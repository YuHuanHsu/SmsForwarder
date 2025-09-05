package com.idormy.sms.forwarder.core.webview;

import java.lang.System;

/**
 * 使用XPageFragment
 *
 * @author xuexiang
 * @since 2019-05-26 18:15
 */
@kotlin.Suppress(names = {"DEPRECATION", "unused", "UNUSED_PARAMETER", "NAME_SHADOWING", "OVERRIDE_DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 M2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0001MB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020+H\u0014J\n\u0010/\u001a\u0004\u0018\u000100H\u0014J\b\u00101\u001a\u00020+H\u0014J\u0010\u00102\u001a\u00020+2\u0006\u00103\u001a\u000204H\u0017J\b\u00105\u001a\u00020+H\u0016J\u0018\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020+H\u0016J\b\u0010=\u001a\u00020+H\u0016J\u0010\u0010>\u001a\u00020+2\u0006\u0010?\u001a\u00020#H\u0002J\u0010\u0010@\u001a\u00020+2\u0006\u0010A\u001a\u000209H\u0002J\u0010\u0010B\u001a\u00020+2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010C\u001a\u00020+2\u0006\u00103\u001a\u000204H\u0002J\u001a\u0010D\u001a\u00020+2\b\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010G\u001a\u00020#H\u0002J\u0018\u0010H\u001a\u00020\u00022\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LH\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#8F\u00a2\u0006\u0006\u001a\u0004\b$\u0010%R\u001c\u0010&\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\'8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010)\u00a8\u0006N"}, d2 = {"Lcom/idormy/sms/forwarder/core/webview/XPageWebViewFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Lcom/idormy/sms/forwarder/databinding/FragmentAgentwebBinding;", "Landroid/view/View$OnClickListener;", "()V", "mAgentWeb", "Lcom/just/agentweb/core/AgentWeb;", "mDownloadListenerAdapter", "Lcom/just/agentweb/download/DownloadListenerAdapter;", "mDownloadingService", "Lcom/just/agentweb/download/DownloadingService;", "mOnMenuItemClickListener", "Landroidx/appcompat/widget/PopupMenu$OnMenuItemClickListener;", "mPermissionInterceptor", "Lcom/just/agentweb/action/PermissionInterceptor;", "mPopupMenu", "Landroidx/appcompat/widget/PopupMenu;", "mWebChromeClient", "Landroid/webkit/WebChromeClient;", "mWebViewClient", "Landroid/webkit/WebViewClient;", "getMWebViewClient$annotations", "middlewareWebChrome", "Lcom/just/agentweb/core/client/MiddlewareWebChromeBase;", "getMiddlewareWebChrome", "()Lcom/just/agentweb/core/client/MiddlewareWebChromeBase;", "middlewareWebClient", "Lcom/just/agentweb/core/client/MiddlewareWebClientBase;", "getMiddlewareWebClient", "()Lcom/just/agentweb/core/client/MiddlewareWebClientBase;", "settings", "Lcom/just/agentweb/core/web/IAgentWebSettings;", "getSettings", "()Lcom/just/agentweb/core/web/IAgentWebSettings;", "url", "", "getUrl", "()Ljava/lang/String;", "webLayout", "Lcom/just/agentweb/widget/IWebLayout;", "getWebLayout", "()Lcom/just/agentweb/widget/IWebLayout;", "addBackgroundChild", "", "frameLayout", "Landroid/widget/FrameLayout;", "initListeners", "initTitle", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "initViews", "onClick", "view", "Landroid/view/View;", "onDestroyView", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onPause", "onResume", "openBrowser", "targetUrl", "pageNavigator", "tag", "shareWebUrl", "showPoPup", "toCopy", "context", "Landroid/content/Context;", "text", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "app_debug"})
@com.xuexiang.xpage.annotation.Page(params = {"com.xuexiang.xuidemo.base.webview.key_url"})
public final class XPageWebViewFragment extends com.idormy.sms.forwarder.core.BaseFragment<com.idormy.sms.forwarder.databinding.FragmentAgentwebBinding> implements android.view.View.OnClickListener {
    private com.just.agentweb.core.AgentWeb mAgentWeb;
    private androidx.appcompat.widget.PopupMenu mPopupMenu;
    private com.just.agentweb.download.DownloadingService mDownloadingService;
    
    /**
     * 更新于 AgentWeb 4.0.0，下载监听
     */
    private com.just.agentweb.download.DownloadListenerAdapter mDownloadListenerAdapter;
    
    /**
     * 和浏览器相关，包括和JS的交互
     */
    private android.webkit.WebChromeClient mWebChromeClient;
    
    /**
     * 和网页url加载相关，统计加载时间
     */
    private android.webkit.WebViewClient mWebViewClient;
    
    /**
     * 菜单事件
     */
    private final androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener mOnMenuItemClickListener = null;
    
    /**
     * 权限申请拦截器
     */
    private com.just.agentweb.action.PermissionInterceptor mPermissionInterceptor;
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.core.webview.XPageWebViewFragment.Companion Companion = null;
    
    public XPageWebViewFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.idormy.sms.forwarder.databinding.FragmentAgentwebBinding viewBindingInflate(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull
    android.view.ViewGroup container) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    protected com.xuexiang.xui.widget.actionbar.TitleBar initTitle() {
        return null;
    }
    
    /**
     * 初始化控件
     */
    @java.lang.Override
    protected void initViews() {
    }
    
    private final com.just.agentweb.widget.IWebLayout<?, ?> getWebLayout() {
        return null;
    }
    
    private final void addBackgroundChild(android.widget.FrameLayout frameLayout) {
    }
    
    @java.lang.Override
    protected void initListeners() {
    }
    
    private final void pageNavigator(int tag) {
    }
    
    @java.lang.Override
    @com.xuexiang.xaop.annotation.SingleClick
    public void onClick(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    private final com.just.agentweb.core.web.IAgentWebSettings<?> getSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUrl() {
        return null;
    }
    
    /**
     * 和网页url加载相关，统计加载时间
     */
    @kotlin.Suppress(names = {"DEPRECATION"})
    @java.lang.Deprecated
    private static void getMWebViewClient$annotations() {
    }
    
    /**
     * 显示更多菜单
     *
     * @param view 菜单依附在该View下面
     */
    private final void showPoPup(android.view.View view) {
    }
    
    /**
     * 打开浏览器
     *
     * @param targetUrl 外部浏览器打开的地址
     */
    private final void openBrowser(java.lang.String targetUrl) {
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
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.NotNull
    android.view.KeyEvent event) {
        return false;
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    private final com.just.agentweb.core.client.MiddlewareWebClientBase getMiddlewareWebClient() {
        return null;
    }
    
    private final com.just.agentweb.core.client.MiddlewareWebChromeBase getMiddlewareWebChrome() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/idormy/sms/forwarder/core/webview/XPageWebViewFragment$Companion;", "", "()V", "openUrl", "Landroidx/fragment/app/Fragment;", "xPageActivity", "Lcom/xuexiang/xpage/base/XPageActivity;", "url", "", "fragment", "Lcom/xuexiang/xpage/base/XPageFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * 打开网页
         *
         * @param xPageActivity
         * @param url
         * @return
         */
        @org.jetbrains.annotations.NotNull
        public final androidx.fragment.app.Fragment openUrl(@org.jetbrains.annotations.Nullable
        com.xuexiang.xpage.base.XPageActivity xPageActivity, @org.jetbrains.annotations.Nullable
        java.lang.String url) {
            return null;
        }
        
        /**
         * 打开网页
         *
         * @param fragment
         * @param url
         * @return
         */
        @org.jetbrains.annotations.NotNull
        public final androidx.fragment.app.Fragment openUrl(@org.jetbrains.annotations.Nullable
        com.xuexiang.xpage.base.XPageFragment fragment, @org.jetbrains.annotations.Nullable
        java.lang.String url) {
            return null;
        }
    }
}