package com.idormy.sms.forwarder.fragment.senders;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u001bH\u0014J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u001e\u001a\u00020\u001bH\u0014J\u001a\u0010\u001f\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\tH\u0016J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%H\u0017J\b\u0010&\u001a\u00020\u001bH\u0016J\u0018\u0010\'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006,"}, d2 = {"Lcom/idormy/sms/forwarder/fragment/senders/WeworkRobotFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Lcom/idormy/sms/forwarder/databinding/FragmentSendersWeworkRobotBinding;", "Landroid/view/View$OnClickListener;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "()V", "TAG", "", "isClone", "", "mCountDownHelper", "Lcom/xuexiang/xui/utils/CountDownButtonHelper;", "senderId", "", "senderType", "", "titleBar", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "viewModel", "Lcom/idormy/sms/forwarder/database/viewmodel/SenderViewModel;", "getViewModel", "()Lcom/idormy/sms/forwarder/database/viewmodel/SenderViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "checkSetting", "Lcom/idormy/sms/forwarder/entity/setting/WeworkRobotSetting;", "initArgs", "", "initListeners", "initTitle", "initViews", "onCheckedChanged", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "onClick", "v", "Landroid/view/View;", "onDestroyView", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
@com.xuexiang.xpage.annotation.Page(name = "\u4f01\u4e1a\u5fae\u4fe1\u7fa4\u673a\u5668\u4eba")
public final class WeworkRobotFragment extends com.idormy.sms.forwarder.core.BaseFragment<com.idormy.sms.forwarder.databinding.FragmentSendersWeworkRobotBinding> implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener {
    private final java.lang.String TAG = null;
    private com.xuexiang.xui.widget.actionbar.TitleBar titleBar;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.xuexiang.xui.utils.CountDownButtonHelper mCountDownHelper;
    @com.xuexiang.xrouter.annotation.AutoWired(name = "key_sender_id")
    @kotlin.jvm.JvmField
    public long senderId = 0L;
    @com.xuexiang.xrouter.annotation.AutoWired(name = "key_sender_type")
    @kotlin.jvm.JvmField
    public int senderType = 0;
    @com.xuexiang.xrouter.annotation.AutoWired(name = "key_sender_clone")
    @kotlin.jvm.JvmField
    public boolean isClone = false;
    
    public WeworkRobotFragment() {
        super();
    }
    
    private final com.idormy.sms.forwarder.database.viewmodel.SenderViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void initArgs() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.idormy.sms.forwarder.databinding.FragmentSendersWeworkRobotBinding viewBindingInflate(@org.jetbrains.annotations.NotNull
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
    
    private final com.idormy.sms.forwarder.entity.setting.WeworkRobotSetting checkSetting() {
        return null;
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}