package com.idormy.sms.forwarder.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\n\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\u0017\u001a\u00020\u0015H\u0014J\u001a\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006%"}, d2 = {"Lcom/idormy/sms/forwarder/fragment/RulesFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Lcom/idormy/sms/forwarder/databinding/FragmentRulesBinding;", "Lcom/idormy/sms/forwarder/adapter/RulePagingAdapter$OnItemClickListener;", "()V", "adapter", "Lcom/idormy/sms/forwarder/adapter/RulePagingAdapter;", "currentType", "", "that", "titleBar", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "viewModel", "Lcom/idormy/sms/forwarder/database/viewmodel/RuleViewModel;", "getViewModel", "()Lcom/idormy/sms/forwarder/database/viewmodel/RuleViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getContainer", "Lcom/idormy/sms/forwarder/activity/MainActivity;", "initListeners", "", "initTitle", "initViews", "onItemClicked", "view", "Landroid/view/View;", "item", "Lcom/idormy/sms/forwarder/database/entity/Rule;", "onItemRemove", "id", "", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
@com.xuexiang.xpage.annotation.Page(name = "\u8f6c\u53d1\u89c4\u5219")
public final class RulesFragment extends com.idormy.sms.forwarder.core.BaseFragment<com.idormy.sms.forwarder.databinding.FragmentRulesBinding> implements com.idormy.sms.forwarder.adapter.RulePagingAdapter.OnItemClickListener {
    private final com.idormy.sms.forwarder.fragment.RulesFragment that = null;
    private com.idormy.sms.forwarder.adapter.RulePagingAdapter adapter;
    private com.xuexiang.xui.widget.actionbar.TitleBar titleBar;
    private final kotlin.Lazy viewModel$delegate = null;
    private java.lang.String currentType = "sms";
    
    public RulesFragment() {
        super();
    }
    
    private final com.idormy.sms.forwarder.database.viewmodel.RuleViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.idormy.sms.forwarder.databinding.FragmentRulesBinding viewBindingInflate(@org.jetbrains.annotations.NotNull
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
    com.idormy.sms.forwarder.database.entity.Rule item) {
    }
    
    @java.lang.Override
    public void onItemRemove(@org.jetbrains.annotations.Nullable
    android.view.View view, int id) {
    }
}