package com.idormy.sms.forwarder.fragment.action;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName", "DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001a\u001a\u00020\u001bH\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0014J\b\u0010\u001f\u001a\u00020\u001dH\u0015J\b\u0010 \u001a\u00020\u001dH\u0003J\n\u0010!\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\"\u001a\u00020\u001dH\u0014J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%H\u0017J\b\u0010&\u001a\u00020\u001dH\u0016J\u0018\u0010\'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/idormy/sms/forwarder/fragment/action/RuleFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Lcom/idormy/sms/forwarder/databinding/FragmentTasksActionRuleBinding;", "Landroid/view/View$OnClickListener;", "()V", "TAG", "", "eventData", "mCountDownHelper", "Lcom/xuexiang/xui/utils/CountDownButtonHelper;", "ruleId", "", "ruleListAll", "", "Lcom/idormy/sms/forwarder/database/entity/Rule;", "ruleListSelected", "ruleRecyclerAdapter", "Lcom/idormy/sms/forwarder/adapter/RuleRecyclerAdapter;", "ruleRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "ruleSpinnerAdapter", "Lcom/idormy/sms/forwarder/adapter/spinner/RuleSpinnerAdapter;", "ruleSpinnerList", "Lcom/idormy/sms/forwarder/adapter/spinner/RuleSpinnerItem;", "titleBar", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "checkSetting", "Lcom/idormy/sms/forwarder/entity/action/RuleSetting;", "getRuleList", "", "initArgs", "initListeners", "initRule", "initTitle", "initViews", "onClick", "v", "Landroid/view/View;", "onDestroyView", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
@com.xuexiang.xpage.annotation.Page(name = "Rule")
public final class RuleFragment extends com.idormy.sms.forwarder.core.BaseFragment<com.idormy.sms.forwarder.databinding.FragmentTasksActionRuleBinding> implements android.view.View.OnClickListener {
    private final java.lang.String TAG = null;
    private com.xuexiang.xui.widget.actionbar.TitleBar titleBar;
    private com.xuexiang.xui.utils.CountDownButtonHelper mCountDownHelper;
    private java.util.List<com.idormy.sms.forwarder.database.entity.Rule> ruleListAll;
    private final java.util.List<com.idormy.sms.forwarder.adapter.spinner.RuleSpinnerItem> ruleSpinnerList = null;
    private com.idormy.sms.forwarder.adapter.spinner.RuleSpinnerAdapter<?> ruleSpinnerAdapter;
    private long ruleId = 0L;
    private java.util.List<com.idormy.sms.forwarder.database.entity.Rule> ruleListSelected;
    private androidx.recyclerview.widget.RecyclerView ruleRecyclerView;
    private com.idormy.sms.forwarder.adapter.RuleRecyclerAdapter ruleRecyclerAdapter;
    @org.jetbrains.annotations.Nullable
    @com.xuexiang.xrouter.annotation.AutoWired(name = "event_data_action")
    @kotlin.jvm.JvmField
    public java.lang.String eventData;
    
    public RuleFragment() {
        super();
    }
    
    @java.lang.Override
    protected void initArgs() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.idormy.sms.forwarder.databinding.FragmentTasksActionRuleBinding viewBindingInflate(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull
    android.view.ViewGroup container) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
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
    public void onDestroyView() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override
    protected void initListeners() {
    }
    
    @java.lang.Override
    @com.xuexiang.xaop.annotation.SingleClick
    public void onClick(@org.jetbrains.annotations.NotNull
    android.view.View v) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n", "NotifyDataSetChanged"})
    private final void initRule() {
    }
    
    private final void getRuleList() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final com.idormy.sms.forwarder.entity.action.RuleSetting checkSetting() {
        return null;
    }
}