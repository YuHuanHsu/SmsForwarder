package com.idormy.sms.forwarder.fragment.action;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName", "DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010#\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010%\u001a\u00020&H\u0002J\b\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020&H\u0002J\b\u0010*\u001a\u00020&H\u0014J\b\u0010+\u001a\u00020&H\u0014J\b\u0010,\u001a\u00020&H\u0003J\n\u0010-\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010.\u001a\u00020&H\u0014J\u001a\u0010/\u001a\u00020&2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020&2\u0006\u00105\u001a\u000206H\u0017J\b\u00107\u001a\u00020&H\u0016J\u0018\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lcom/idormy/sms/forwarder/fragment/action/NotificationFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Lcom/idormy/sms/forwarder/databinding/FragmentTasksActionNotificationBinding;", "Landroid/view/View$OnClickListener;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "()V", "TAG", "", "description", "eventData", "mCountDownHelper", "Lcom/xuexiang/xui/utils/CountDownButtonHelper;", "mTimeOption", "", "ruleId", "", "ruleType", "senderId", "senderListAll", "", "Lcom/idormy/sms/forwarder/database/entity/Sender;", "senderListSelected", "senderRecyclerAdapter", "Lcom/idormy/sms/forwarder/adapter/SenderRecyclerAdapter;", "senderSpinnerAdapter", "Lcom/idormy/sms/forwarder/adapter/spinner/SenderSpinnerAdapter;", "senderSpinnerList", "Lcom/idormy/sms/forwarder/adapter/spinner/SenderSpinnerItem;", "sendersRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "silentPeriodEnd", "", "silentPeriodStart", "titleBar", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "checkRegexReplace", "regexReplace", "checkSenderLogicShow", "", "checkSetting", "Lcom/idormy/sms/forwarder/database/entity/Rule;", "getSenderList", "initArgs", "initListeners", "initSenderSpinner", "initTitle", "initViews", "onCheckedChanged", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "", "onClick", "v", "Landroid/view/View;", "onDestroyView", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
@com.xuexiang.xpage.annotation.Page(name = "Notification")
public final class NotificationFragment extends com.idormy.sms.forwarder.core.BaseFragment<com.idormy.sms.forwarder.databinding.FragmentTasksActionNotificationBinding> implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener {
    private final java.lang.String TAG = null;
    private com.xuexiang.xui.widget.actionbar.TitleBar titleBar;
    private com.xuexiang.xui.utils.CountDownButtonHelper mCountDownHelper;
    @org.jetbrains.annotations.Nullable
    @com.xuexiang.xrouter.annotation.AutoWired(name = "event_data_action")
    @kotlin.jvm.JvmField
    public java.lang.String eventData;
    private final java.util.List<java.lang.String> mTimeOption = null;
    private int silentPeriodStart = 0;
    private int silentPeriodEnd = 0;
    private java.util.List<com.idormy.sms.forwarder.database.entity.Sender> senderListAll;
    private final java.util.List<com.idormy.sms.forwarder.adapter.spinner.SenderSpinnerItem> senderSpinnerList = null;
    private com.idormy.sms.forwarder.adapter.spinner.SenderSpinnerAdapter<?> senderSpinnerAdapter;
    private long senderId = 0L;
    private java.util.List<com.idormy.sms.forwarder.database.entity.Sender> senderListSelected;
    private androidx.recyclerview.widget.RecyclerView sendersRecyclerView;
    private com.idormy.sms.forwarder.adapter.SenderRecyclerAdapter senderRecyclerAdapter;
    private long ruleId = 0L;
    private java.lang.String ruleType = "app";
    private java.lang.String description = "";
    
    public NotificationFragment() {
        super();
    }
    
    @java.lang.Override
    protected void initArgs() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.idormy.sms.forwarder.databinding.FragmentTasksActionNotificationBinding viewBindingInflate(@org.jetbrains.annotations.NotNull
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
    
    private final void checkSenderLogicShow() {
    }
    
    private final com.idormy.sms.forwarder.database.entity.Rule checkSetting() {
        return null;
    }
    
    private final int checkRegexReplace(java.lang.String regexReplace) {
        return 0;
    }
}