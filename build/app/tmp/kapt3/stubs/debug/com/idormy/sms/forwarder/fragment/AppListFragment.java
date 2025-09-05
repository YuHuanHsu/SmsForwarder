package com.idormy.sms.forwarder.fragment;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName", "DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0014J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00050\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/idormy/sms/forwarder/fragment/AppListFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Lcom/idormy/sms/forwarder/databinding/FragmentAppListBinding;", "()V", "TAG", "", "appListAdapter", "Lcom/idormy/sms/forwarder/adapter/AppListAdapter;", "appListObserver", "Landroidx/lifecycle/Observer;", "kotlin.jvm.PlatformType", "currentType", "getAppsList", "", "Lcom/idormy/sms/forwarder/utils/AppInfo;", "refresh", "", "initListeners", "", "initTitle", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "initViews", "onDestroyView", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
@com.xuexiang.xpage.annotation.Page(name = "\u5e94\u7528\u5217\u8868")
public final class AppListFragment extends com.idormy.sms.forwarder.core.BaseFragment<com.idormy.sms.forwarder.databinding.FragmentAppListBinding> {
    private final java.lang.String TAG = null;
    private com.idormy.sms.forwarder.adapter.AppListAdapter appListAdapter;
    private final androidx.lifecycle.Observer<java.lang.String> appListObserver = null;
    private java.lang.String currentType = "user";
    
    public AppListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.idormy.sms.forwarder.databinding.FragmentAppListBinding viewBindingInflate(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull
    android.view.ViewGroup container) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
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
    
    @java.lang.Override
    protected void initListeners() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    private final java.util.List<com.idormy.sms.forwarder.utils.AppInfo> getAppsList(boolean refresh) {
        return null;
    }
}