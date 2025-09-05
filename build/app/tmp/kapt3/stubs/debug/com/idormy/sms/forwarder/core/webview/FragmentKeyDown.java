package com.idormy.sms.forwarder.core.webview;

import java.lang.System;

/**
 * @author xuexiang
 * @since 2019/1/4 下午11:32
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/idormy/sms/forwarder/core/webview/FragmentKeyDown;", "", "onFragmentKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "app_debug"})
public abstract interface FragmentKeyDown {
    
    /**
     * fragment按键监听
     * @param keyCode
     * @param event
     * @return
     */
    public abstract boolean onFragmentKeyDown(int keyCode, @org.jetbrains.annotations.Nullable
    android.view.KeyEvent event);
}