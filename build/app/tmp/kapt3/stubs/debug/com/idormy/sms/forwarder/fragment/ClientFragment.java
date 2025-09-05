package com.idormy.sms.forwarder.fragment;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName", "DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0014J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0017J\b\u0010\u001b\u001a\u00020\u0014H\u0016J \u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#H\u0002J\u0018\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/idormy/sms/forwarder/fragment/ClientFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Lcom/idormy/sms/forwarder/databinding/FragmentClientBinding;", "Landroid/view/View$OnClickListener;", "Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemClickListener;", "Lcom/xuexiang/xpage/model/PageInfo;", "()V", "CLIENT_FRAGMENT_LIST", "", "TAG", "", "appContext", "Lcom/idormy/sms/forwarder/App;", "mCountDownHelper", "Lcom/xuexiang/xui/utils/CountDownButtonHelper;", "serverConfig", "Lcom/idormy/sms/forwarder/server/model/ConfigData;", "serverHistory", "", "initListeners", "", "initTitle", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "initViews", "onClick", "v", "Landroid/view/View;", "onDestroyView", "onItemClick", "itemView", "item", "position", "", "queryConfig", "needToast", "", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
@com.xuexiang.xpage.annotation.Page(name = "\u4e3b\u52a8\u63a7\u5236\u00b7\u5ba2\u6237\u7aef")
public final class ClientFragment extends com.idormy.sms.forwarder.core.BaseFragment<com.idormy.sms.forwarder.databinding.FragmentClientBinding> implements android.view.View.OnClickListener, com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder.OnItemClickListener<com.xuexiang.xpage.model.PageInfo> {
    private final java.lang.String TAG = null;
    private com.idormy.sms.forwarder.App appContext;
    private com.idormy.sms.forwarder.server.model.ConfigData serverConfig;
    private java.util.Map<java.lang.String, java.lang.String> serverHistory;
    private com.xuexiang.xui.utils.CountDownButtonHelper mCountDownHelper;
    private java.util.List<? extends com.xuexiang.xpage.model.PageInfo> CLIENT_FRAGMENT_LIST;
    
    public ClientFragment() {
        super();
    }
    
    @java.lang.Override
    protected void initViews() {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    protected com.xuexiang.xui.widget.actionbar.TitleBar initTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.idormy.sms.forwarder.databinding.FragmentClientBinding viewBindingInflate(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override
    protected void initListeners() {
    }
    
    @java.lang.Override
    @com.xuexiang.xaop.annotation.SingleClick
    public void onClick(@org.jetbrains.annotations.NotNull
    android.view.View v) {
    }
    
    @java.lang.Override
    public void onItemClick(@org.jetbrains.annotations.NotNull
    android.view.View itemView, @org.jetbrains.annotations.NotNull
    com.xuexiang.xpage.model.PageInfo item, int position) {
    }
    
    private final void queryConfig(boolean needToast) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}