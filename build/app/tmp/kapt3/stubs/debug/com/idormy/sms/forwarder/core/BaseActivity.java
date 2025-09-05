package com.idormy.sms.forwarder.core;

import java.lang.System;

/**
 * 基础容器Activity
 *
 * @author XUE
 * @since 2019/3/22 11:21
 */
@kotlin.Suppress(names = {"MemberVisibilityCanBePrivate", "UNCHECKED_CAST", "DEPRECATION", "EmptyMethod"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 .*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\u00020\u0003:\u0001.B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0014J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0010H\u0014J\'\u0010\u001a\u001a\u0002H\u001b\"\n\b\u0001\u0010\u001b*\u0004\u0018\u00010\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u0002H\u001b\u0018\u00010\u001e\u00a2\u0006\u0002\u0010\u001fJ/\u0010 \u001a\u0002H\u001b\"\n\b\u0001\u0010\u001b*\u0004\u0018\u00010\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u0002H\u001b\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020\r\u00a2\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u0010H\u0004J\u0010\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'J\'\u0010(\u001a\u0002H\u001b\"\n\b\u0001\u0010\u001b*\u0004\u0018\u00010\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u0002H\u001b\u0018\u00010\u001e\u00a2\u0006\u0002\u0010\u001fJ\b\u0010)\u001a\u00020\u0010H\u0004J\u0019\u0010*\u001a\u0004\u0018\u00018\u00002\b\u0010+\u001a\u0004\u0018\u00010,H\u0014\u00a2\u0006\u0002\u0010-R*\u0010\u0006\u001a\u0004\u0018\u00018\u00002\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000@DX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\r8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u000e\u00a8\u0006/"}, d2 = {"Lcom/idormy/sms/forwarder/core/BaseActivity;", "Binding", "Landroidx/viewbinding/ViewBinding;", "Lcom/xuexiang/xpage/base/XPageActivity;", "()V", "<set-?>", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "setBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "isSupportSlideBack", "", "()Z", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "getCustomRootView", "Landroid/view/View;", "initStatusBarStyle", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRelease", "openNewPage", "T", "Lcom/xuexiang/xpage/base/XPageFragment;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/xuexiang/xpage/base/XPageFragment;", "openPage", "addToBackStack", "(Ljava/lang/Class;Z)Lcom/xuexiang/xpage/base/XPageFragment;", "registerSlideBack", "serializeObject", "", "object", "", "switchPage", "unregisterSlideBack", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "(Landroid/view/LayoutInflater;)Landroidx/viewbinding/ViewBinding;", "Companion", "app_debug"})
public class BaseActivity<Binding extends androidx.viewbinding.ViewBinding> extends com.xuexiang.xpage.base.XPageActivity {
    
    /**
     * ViewBinding
     */
    @org.jetbrains.annotations.Nullable
    private Binding binding;
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.core.BaseActivity.Companion Companion = null;
    
    /**
     * 是否支持侧滑返回
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_SUPPORT_SLIDE_BACK = "key_support_slide_back";
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final Binding getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.Nullable
    Binding p0) {
    }
    
    @java.lang.Override
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull
    android.content.Context newBase) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    protected android.view.View getCustomRootView() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * 构建ViewBinding
     *
     * @param inflater  inflater
     * @return ViewBinding
     */
    @org.jetbrains.annotations.Nullable
    protected Binding viewBindingInflate(@org.jetbrains.annotations.Nullable
    android.view.LayoutInflater inflater) {
        return null;
    }
    
    /**
     * 初始化状态栏的样式
     */
    protected void initStatusBarStyle() {
    }
    
    /**
     * 打开fragment
     *
     * @param clazz          页面类
     * @param addToBackStack 是否添加到栈中
     * @return 打开的fragment对象
     */
    public final <T extends com.xuexiang.xpage.base.XPageFragment>T openPage(@org.jetbrains.annotations.Nullable
    java.lang.Class<T> clazz, boolean addToBackStack) {
        return null;
    }
    
    /**
     * 打开fragment
     *
     * @return 打开的fragment对象
     */
    public final <T extends com.xuexiang.xpage.base.XPageFragment>T openNewPage(@org.jetbrains.annotations.Nullable
    java.lang.Class<T> clazz) {
        return null;
    }
    
    /**
     * 切换fragment
     *
     * @param clazz 页面类
     * @return 打开的fragment对象
     */
    public final <T extends com.xuexiang.xpage.base.XPageFragment>T switchPage(@org.jetbrains.annotations.Nullable
    java.lang.Class<T> clazz) {
        return null;
    }
    
    /**
     * 序列化对象
     *
     * @param object
     * @return
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String serializeObject(@org.jetbrains.annotations.Nullable
    java.lang.Object object) {
        return null;
    }
    
    @java.lang.Override
    protected void onRelease() {
    }
    
    /**
     * 注册侧滑回调
     */
    protected final void registerSlideBack() {
    }
    
    /**
     * 注销侧滑回调
     */
    protected final void unregisterSlideBack() {
    }
    
    protected boolean isSupportSlideBack() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/idormy/sms/forwarder/core/BaseActivity$Companion;", "", "()V", "KEY_SUPPORT_SLIDE_BACK", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}