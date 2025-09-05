package com.idormy.sms.forwarder.fragment;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName", "DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0005\u00a2\u0006\u0002\u0010\u0006J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u0018\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020\u000eH\u0002J\b\u0010#\u001a\u00020$H\u0014J\n\u0010%\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010&\u001a\u00020$H\u0014J \u0010\'\u001a\u00020$2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u000eH\u0017J\u001a\u0010,\u001a\u00020$2\b\u0010-\u001a\u0004\u0018\u00010)2\u0006\u0010.\u001a\u00020/H\u0016J\u001a\u00100\u001a\u00020$2\b\u0010-\u001a\u0004\u0018\u00010)2\u0006\u00101\u001a\u00020\u000eH\u0016J\u0018\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001a\u0010\u001b\u00a8\u00067"}, d2 = {"Lcom/idormy/sms/forwarder/fragment/SendersFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Lcom/idormy/sms/forwarder/databinding/FragmentSendersBinding;", "Lcom/idormy/sms/forwarder/adapter/SenderPagingAdapter$OnItemClickListener;", "Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemClickListener;", "Lcom/xuexiang/xpage/model/PageInfo;", "()V", "SENDER_FRAGMENT_LIST", "", "TAG", "", "adapter", "Lcom/idormy/sms/forwarder/adapter/SenderPagingAdapter;", "currentStatus", "", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "getDialog", "()Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "dialog$delegate", "Lkotlin/Lazy;", "that", "titleBar", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "viewModel", "Lcom/idormy/sms/forwarder/database/viewmodel/SenderViewModel;", "getViewModel", "()Lcom/idormy/sms/forwarder/database/viewmodel/SenderViewModel;", "viewModel$delegate", "getContainer", "Lcom/idormy/sms/forwarder/activity/MainActivity;", "getFragment", "Ljava/lang/Class;", "Lcom/xuexiang/xpage/base/XPageFragment;", "type", "initListeners", "", "initTitle", "initViews", "onItemClick", "itemView", "Landroid/view/View;", "widgetInfo", "pos", "onItemClicked", "view", "item", "Lcom/idormy/sms/forwarder/database/entity/Sender;", "onItemRemove", "id", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
@com.xuexiang.xpage.annotation.Page(name = "\u53d1\u9001\u901a\u9053")
public final class SendersFragment extends com.idormy.sms.forwarder.core.BaseFragment<com.idormy.sms.forwarder.databinding.FragmentSendersBinding> implements com.idormy.sms.forwarder.adapter.SenderPagingAdapter.OnItemClickListener, com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder.OnItemClickListener<com.xuexiang.xpage.model.PageInfo> {
    private final java.lang.String TAG = null;
    private final com.idormy.sms.forwarder.fragment.SendersFragment that = null;
    private com.xuexiang.xui.widget.actionbar.TitleBar titleBar;
    private com.idormy.sms.forwarder.adapter.SenderPagingAdapter adapter;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy dialog$delegate = null;
    private int currentStatus = 1;
    private java.util.List<? extends com.xuexiang.xpage.model.PageInfo> SENDER_FRAGMENT_LIST;
    
    public SendersFragment() {
        super();
    }
    
    private final com.idormy.sms.forwarder.database.viewmodel.SenderViewModel getViewModel() {
        return null;
    }
    
    private final com.google.android.material.bottomsheet.BottomSheetDialog getDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.idormy.sms.forwarder.databinding.FragmentSendersBinding viewBindingInflate(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull
    android.view.ViewGroup container) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    protected com.xuexiang.xui.widget.actionbar.TitleBar initTitle() {
        return null;
    }
    
    private final com.idormy.sms.forwarder.activity.MainActivity getContainer() {
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
    public void onItemClicked(@org.jetbrains.annotations.Nullable
    android.view.View view, @org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Sender item) {
    }
    
    @java.lang.Override
    public void onItemRemove(@org.jetbrains.annotations.Nullable
    android.view.View view, int id) {
    }
    
    @java.lang.Override
    @com.xuexiang.xaop.annotation.SingleClick
    public void onItemClick(@org.jetbrains.annotations.NotNull
    android.view.View itemView, @org.jetbrains.annotations.NotNull
    com.xuexiang.xpage.model.PageInfo widgetInfo, int pos) {
    }
    
    private final java.lang.Class<? extends com.xuexiang.xpage.base.XPageFragment> getFragment(int type) {
        return null;
    }
}