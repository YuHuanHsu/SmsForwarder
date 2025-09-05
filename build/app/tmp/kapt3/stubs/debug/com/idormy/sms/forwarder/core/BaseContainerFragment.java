package com.idormy.sms.forwarder.core;

import java.lang.System;

/**
 * 修改列表样式为主副标题显示
 *
 * @author xuexiang
 * @since 2018/11/22 上午11:26
 */
@kotlin.Suppress(names = {"UNUSED_PARAMETER"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\u0006\u001a\u00020\u0007H\u0004J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003J.\u0010\f\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/idormy/sms/forwarder/core/BaseContainerFragment;", "Lcom/xuexiang/xpage/base/XPageContainerListFragment;", "()V", "initData", "", "initPage", "initTitle", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onDestroyView", "onItemClick", "view", "Landroid/view/View;", "position", "", "adapterView", "Landroid/widget/AdapterView;", "id", "", "onPause", "onResume", "app_debug"})
public abstract class BaseContainerFragment extends com.xuexiang.xpage.base.XPageContainerListFragment {
    
    public BaseContainerFragment() {
        super();
    }
    
    @java.lang.Override
    protected void initPage() {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.xuexiang.xui.widget.actionbar.TitleBar initTitle() {
        return null;
    }
    
    @java.lang.Override
    protected void initData() {
    }
    
    @java.lang.Override
    public void onItemClick(@org.jetbrains.annotations.Nullable
    android.widget.AdapterView<?> adapterView, @org.jetbrains.annotations.NotNull
    android.view.View view, int position, long id) {
    }
    
    @com.xuexiang.xaop.annotation.SingleClick
    private final void onItemClick(android.view.View view, int position) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onPause() {
    }
}