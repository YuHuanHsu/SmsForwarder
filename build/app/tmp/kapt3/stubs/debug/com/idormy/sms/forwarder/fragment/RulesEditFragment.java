package com.idormy.sms.forwarder.fragment;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u00101\u001a\u000202H\u0002J\u0012\u00103\u001a\u00020\u00112\b\u00104\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u00105\u001a\u00020\u00112\b\u00106\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u000208H\u0002J\b\u0010:\u001a\u000208H\u0002J\b\u0010;\u001a\u000208H\u0014J\b\u0010<\u001a\u000208H\u0002J\b\u0010=\u001a\u000208H\u0014J\b\u0010>\u001a\u000208H\u0003J\n\u0010?\u001a\u0004\u0018\u00010*H\u0014J\b\u0010@\u001a\u000208H\u0014J\u001a\u0010A\u001a\u0002082\b\u0010B\u001a\u0004\u0018\u00010C2\u0006\u0010D\u001a\u00020\u0014H\u0016J\u0010\u0010E\u001a\u0002082\u0006\u0010F\u001a\u00020GH\u0017J\u0010\u0010H\u001a\u0002082\u0006\u0010I\u001a\u000202H\u0002J\u0018\u0010J\u001a\u00020\u00022\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020NH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00070\u00070\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u0006\u0012\u0002\b\u00030$X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b/\u00100\u001a\u0004\b-\u0010.\u00a8\u0006O"}, d2 = {"Lcom/idormy/sms/forwarder/fragment/RulesEditFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Lcom/idormy/sms/forwarder/databinding/FragmentRulesEditBinding;", "Landroid/view/View$OnClickListener;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "()V", "TAG", "", "appListObserver", "Landroidx/lifecycle/Observer;", "kotlin.jvm.PlatformType", "appListSpinnerAdapter", "Lcom/idormy/sms/forwarder/adapter/spinner/AppListSpinnerAdapter;", "appListSpinnerList", "Ljava/util/ArrayList;", "Lcom/idormy/sms/forwarder/adapter/spinner/AppListAdapterItem;", "callType", "", "callTypeIndex", "isClone", "", "mTimeOption", "", "ruleId", "", "ruleType", "senderId", "senderListAll", "", "Lcom/idormy/sms/forwarder/database/entity/Sender;", "senderListSelected", "senderRecyclerAdapter", "Lcom/idormy/sms/forwarder/adapter/SenderRecyclerAdapter;", "senderRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "senderSpinnerAdapter", "Lcom/idormy/sms/forwarder/adapter/spinner/SenderSpinnerAdapter;", "senderSpinnerList", "Lcom/idormy/sms/forwarder/adapter/spinner/SenderSpinnerItem;", "silentPeriodEnd", "silentPeriodStart", "titleBar", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "viewModel", "Lcom/idormy/sms/forwarder/database/viewmodel/RuleViewModel;", "getViewModel", "()Lcom/idormy/sms/forwarder/database/viewmodel/RuleViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "checkForm", "Lcom/idormy/sms/forwarder/database/entity/Rule;", "checkMultiMatch", "ruleStr", "checkRegexReplace", "regexReplace", "checkSenderLogicShow", "", "getSenderList", "initAppSpinner", "initArgs", "initForm", "initListeners", "initSenderSpinner", "initTitle", "initViews", "onCheckedChanged", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "onClick", "v", "Landroid/view/View;", "testRule", "rule", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
@com.xuexiang.xpage.annotation.Page(name = "\u8f6c\u53d1\u89c4\u5219\u00b7\u7f16\u8f91\u5668")
public final class RulesEditFragment extends com.idormy.sms.forwarder.core.BaseFragment<com.idormy.sms.forwarder.databinding.FragmentRulesEditBinding> implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener {
    private final java.lang.String TAG = null;
    private com.xuexiang.xui.widget.actionbar.TitleBar titleBar;
    private final kotlin.Lazy viewModel$delegate = null;
    private int callType = 1;
    private int callTypeIndex = 0;
    private final java.util.List<java.lang.String> mTimeOption = null;
    private int silentPeriodStart = 0;
    private int silentPeriodEnd = 0;
    private java.util.List<com.idormy.sms.forwarder.database.entity.Sender> senderListAll;
    private final java.util.List<com.idormy.sms.forwarder.adapter.spinner.SenderSpinnerItem> senderSpinnerList = null;
    private com.idormy.sms.forwarder.adapter.spinner.SenderSpinnerAdapter<?> senderSpinnerAdapter;
    private long senderId = 0L;
    private java.util.List<com.idormy.sms.forwarder.database.entity.Sender> senderListSelected;
    private androidx.recyclerview.widget.RecyclerView senderRecyclerView;
    private com.idormy.sms.forwarder.adapter.SenderRecyclerAdapter senderRecyclerAdapter;
    private final java.util.ArrayList<com.idormy.sms.forwarder.adapter.spinner.AppListAdapterItem> appListSpinnerList = null;
    private com.idormy.sms.forwarder.adapter.spinner.AppListSpinnerAdapter<?> appListSpinnerAdapter;
    private final androidx.lifecycle.Observer<java.lang.String> appListObserver = null;
    @com.xuexiang.xrouter.annotation.AutoWired(name = "key_rule_id")
    @kotlin.jvm.JvmField
    public long ruleId = 0L;
    @org.jetbrains.annotations.NotNull
    @com.xuexiang.xrouter.annotation.AutoWired(name = "key_rule_type")
    @kotlin.jvm.JvmField
    public java.lang.String ruleType = "sms";
    @com.xuexiang.xrouter.annotation.AutoWired(name = "key_rule_clone")
    @kotlin.jvm.JvmField
    public boolean isClone = false;
    
    public RulesEditFragment() {
        super();
    }
    
    private final com.idormy.sms.forwarder.database.viewmodel.RuleViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void initArgs() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.idormy.sms.forwarder.databinding.FragmentRulesEditBinding viewBindingInflate(@org.jetbrains.annotations.NotNull
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
    public void onCheckedChanged(@org.jetbrains.annotations.Nullable
    android.widget.CompoundButton buttonView, boolean isChecked) {
    }
    
    @java.lang.Override
    @com.xuexiang.xaop.annotation.SingleClick
    public void onClick(@org.jetbrains.annotations.NotNull
    android.view.View v) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n", "NotifyDataSetChanged"})
    private final void initSenderSpinner() {
    }
    
    private final void getSenderList() {
    }
    
    private final void initAppSpinner() {
    }
    
    private final void initForm() {
    }
    
    private final void checkSenderLogicShow() {
    }
    
    private final com.idormy.sms.forwarder.database.entity.Rule checkForm() {
        return null;
    }
    
    private final int checkMultiMatch(java.lang.String ruleStr) {
        return 0;
    }
    
    private final int checkRegexReplace(java.lang.String regexReplace) {
        return 0;
    }
    
    private final void testRule(com.idormy.sms.forwarder.database.entity.Rule rule) {
    }
}