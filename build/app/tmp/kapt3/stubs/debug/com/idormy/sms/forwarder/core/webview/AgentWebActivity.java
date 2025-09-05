package com.idormy.sms.forwarder.core.webview;

import java.lang.System;

/**
 * 壳浏览器
 *
 * @author xuexiang
 * @since 2019/1/5 上午12:15
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\u0006H\u0014J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/idormy/sms/forwarder/core/webview/AgentWebActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mAgentWebFragment", "Lcom/idormy/sms/forwarder/core/webview/AgentWebFragment;", "loadUrl", "", "url", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "openFragment", "Companion", "app_debug"})
public final class AgentWebActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.idormy.sms.forwarder.core.webview.AgentWebFragment mAgentWebFragment;
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.core.webview.AgentWebActivity.Companion Companion = null;
    
    public AgentWebActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadUrl(java.lang.String url) {
    }
    
    private final void openFragment(java.lang.String url) {
    }
    
    @java.lang.Override
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.NotNull
    android.view.KeyEvent event) {
        return false;
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a8\u0006\t"}, d2 = {"Lcom/idormy/sms/forwarder/core/webview/AgentWebActivity$Companion;", "", "()V", "goWeb", "", "context", "Landroid/content/Context;", "url", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * 请求浏览器
         *
         * @param url
         */
        public final void goWeb(@org.jetbrains.annotations.Nullable
        android.content.Context context, @org.jetbrains.annotations.Nullable
        java.lang.String url) {
        }
    }
}