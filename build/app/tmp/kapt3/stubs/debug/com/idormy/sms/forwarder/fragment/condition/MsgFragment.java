package com.idormy.sms.forwarder.fragment.condition;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0014J\b\u0010\u001e\u001a\u00020\u001cH\u0014J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010 \u001a\u00020\u001cH\u0014J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#H\u0017J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u0018H\u0002J\u0018\u0010&\u001a\u00020\u00022\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00060\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/idormy/sms/forwarder/fragment/condition/MsgFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Lcom/idormy/sms/forwarder/databinding/FragmentTasksConditionMsgBinding;", "Landroid/view/View$OnClickListener;", "()V", "TAG", "", "appListObserver", "Landroidx/lifecycle/Observer;", "kotlin.jvm.PlatformType", "appListSpinnerAdapter", "Lcom/idormy/sms/forwarder/adapter/spinner/AppListSpinnerAdapter;", "appListSpinnerList", "Ljava/util/ArrayList;", "Lcom/idormy/sms/forwarder/adapter/spinner/AppListAdapterItem;", "callType", "", "callTypeIndex", "eventData", "resultCode", "ruleType", "titleBar", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "checkForm", "Lcom/idormy/sms/forwarder/database/entity/Rule;", "checkMultiMatch", "ruleStr", "initAppSpinner", "", "initArgs", "initListeners", "initTitle", "initViews", "onClick", "v", "Landroid/view/View;", "testRule", "rule", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
@com.xuexiang.xpage.annotation.Page(name = "Msg")
public final class MsgFragment extends com.idormy.sms.forwarder.core.BaseFragment<com.idormy.sms.forwarder.databinding.FragmentTasksConditionMsgBinding> implements android.view.View.OnClickListener {
    private final java.lang.String TAG = null;
    private com.xuexiang.xui.widget.actionbar.TitleBar titleBar;
    private int callType = 1;
    private int callTypeIndex = 0;
    private int resultCode = 1008;
    private final java.util.ArrayList<com.idormy.sms.forwarder.adapter.spinner.AppListAdapterItem> appListSpinnerList = null;
    private com.idormy.sms.forwarder.adapter.spinner.AppListSpinnerAdapter<?> appListSpinnerAdapter;
    private final androidx.lifecycle.Observer<java.lang.String> appListObserver = null;
    @org.jetbrains.annotations.NotNull
    @com.xuexiang.xrouter.annotation.AutoWired(name = "event_params_condition")
    @kotlin.jvm.JvmField
    public java.lang.String ruleType = "sms";
    @org.jetbrains.annotations.Nullable
    @com.xuexiang.xrouter.annotation.AutoWired(name = "event_data_condition")
    @kotlin.jvm.JvmField
    public java.lang.String eventData;
    
    public MsgFragment() {
        super();
    }
    
    @java.lang.Override
    protected void initArgs() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.idormy.sms.forwarder.databinding.FragmentTasksConditionMsgBinding viewBindingInflate(@org.jetbrains.annotations.NotNull
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
    protected void initListeners() {
    }
    
    @java.lang.Override
    @com.xuexiang.xaop.annotation.SingleClick
    public void onClick(@org.jetbrains.annotations.NotNull
    android.view.View v) {
    }
    
    private final void initAppSpinner() {
    }
    
    private final com.idormy.sms.forwarder.database.entity.Rule checkForm() {
        return null;
    }
    
    private final int checkMultiMatch(java.lang.String ruleStr) {
        return 0;
    }
    
    private final void testRule(com.idormy.sms.forwarder.database.entity.Rule rule) {
    }
}