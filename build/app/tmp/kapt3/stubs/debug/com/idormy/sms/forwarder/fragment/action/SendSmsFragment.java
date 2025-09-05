package com.idormy.sms.forwarder.fragment.action;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName", "DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0015J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0015J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0017J\b\u0010\u001b\u001a\u00020\u0014H\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/idormy/sms/forwarder/fragment/action/SendSmsFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Lcom/idormy/sms/forwarder/databinding/FragmentTasksActionSendSmsBinding;", "Landroid/view/View$OnClickListener;", "()V", "TAG", "", "description", "eventData", "mCountDownHelper", "Lcom/xuexiang/xui/utils/CountDownButtonHelper;", "msgContent", "phoneNumbers", "simSlot", "", "titleBar", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "checkSetting", "Lcom/idormy/sms/forwarder/entity/action/SmsSetting;", "initArgs", "", "initListeners", "initTitle", "initViews", "onClick", "v", "Landroid/view/View;", "onDestroyView", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
@com.xuexiang.xpage.annotation.Page(name = "SendSms")
public final class SendSmsFragment extends com.idormy.sms.forwarder.core.BaseFragment<com.idormy.sms.forwarder.databinding.FragmentTasksActionSendSmsBinding> implements android.view.View.OnClickListener {
    private final java.lang.String TAG = null;
    private com.xuexiang.xui.widget.actionbar.TitleBar titleBar;
    private com.xuexiang.xui.utils.CountDownButtonHelper mCountDownHelper;
    @org.jetbrains.annotations.Nullable
    @com.xuexiang.xrouter.annotation.AutoWired(name = "event_data_action")
    @kotlin.jvm.JvmField
    public java.lang.String eventData;
    private java.lang.String description = "";
    private int simSlot = 1;
    private java.lang.String phoneNumbers = "";
    private java.lang.String msgContent = "";
    
    public SendSmsFragment() {
        super();
    }
    
    @java.lang.Override
    protected void initArgs() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.idormy.sms.forwarder.databinding.FragmentTasksActionSendSmsBinding viewBindingInflate(@org.jetbrains.annotations.NotNull
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
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
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
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final com.idormy.sms.forwarder.entity.action.SmsSetting checkSetting() {
        return null;
    }
}