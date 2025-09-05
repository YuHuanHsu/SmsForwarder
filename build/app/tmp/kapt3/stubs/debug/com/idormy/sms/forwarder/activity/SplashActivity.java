package com.idormy.sms.forwarder.activity;

import java.lang.System;

@android.annotation.SuppressLint(value = {"CustomSplashScreen"})
@kotlin.Suppress(names = {"PropertyName"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0014J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0014J\b\u0010\u0013\u001a\u00020\u000bH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/idormy/sms/forwarder/activity/SplashActivity;", "Lcom/xuexiang/xui/widget/activity/BaseSplashActivity;", "Lme/jessyan/autosize/internal/CancelAdapt;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getSplashDurationMillis", "", "onCreateActivity", "", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onSplashFinished", "whereToJump", "app_debug"})
public final class SplashActivity extends com.xuexiang.xui.widget.activity.BaseSplashActivity implements me.jessyan.autosize.internal.CancelAdapt {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String TAG = null;
    
    public SplashActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTAG() {
        return null;
    }
    
    @java.lang.Override
    protected long getSplashDurationMillis() {
        return 0L;
    }
    
    /**
     * activity启动后的初始化
     */
    @java.lang.Override
    protected void onCreateActivity() {
    }
    
    /**
     * 启动页结束后的动作
     */
    @java.lang.Override
    protected void onSplashFinished() {
    }
    
    private final void whereToJump() {
    }
    
    /**
     * 菜单、返回键响应
     */
    @java.lang.Override
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.NotNull
    android.view.KeyEvent event) {
        return false;
    }
}