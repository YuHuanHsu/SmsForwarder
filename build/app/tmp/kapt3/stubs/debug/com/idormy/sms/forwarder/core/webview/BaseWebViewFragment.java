package com.idormy.sms.forwarder.core.webview;

import java.lang.System;

/**
 * 基础web
 *
 * @author xuexiang
 * @since 2019/5/28 10:22
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/idormy/sms/forwarder/core/webview/BaseWebViewFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Landroidx/viewbinding/ViewBinding;", "()V", "mAgentWeb", "Lcom/just/agentweb/core/AgentWeb;", "onDestroyView", "", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onPause", "onResume", "app_debug"})
public abstract class BaseWebViewFragment extends com.idormy.sms.forwarder.core.BaseFragment<androidx.viewbinding.ViewBinding> {
    private com.just.agentweb.core.AgentWeb mAgentWeb;
    
    public BaseWebViewFragment() {
        super();
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
}