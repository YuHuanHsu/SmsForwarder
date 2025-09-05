package com.idormy.sms.forwarder.fragment.client;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0014J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/idormy/sms/forwarder/fragment/client/CloneFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Lcom/idormy/sms/forwarder/databinding/FragmentClientCloneBinding;", "Landroid/view/View$OnClickListener;", "()V", "TAG", "", "backupFile", "backupPath", "defaultSelection", "", "exportCountDownHelper", "Lcom/xuexiang/xui/utils/CountDownButtonHelper;", "importCountDownHelper", "pullCountDownHelper", "pushCountDownHelper", "initArgs", "", "initListeners", "initTitle", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "initViews", "onClick", "v", "Landroid/view/View;", "onDestroyView", "pullData", "pushData", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
@com.xuexiang.xpage.annotation.Page(name = "\u4e00\u952e\u6362\u65b0\u673a")
public final class CloneFragment extends com.idormy.sms.forwarder.core.BaseFragment<com.idormy.sms.forwarder.databinding.FragmentClientCloneBinding> implements android.view.View.OnClickListener {
    private final java.lang.String TAG = null;
    private java.lang.String backupPath;
    private final java.lang.String backupFile = "SmsForwarder.json";
    private com.xuexiang.xui.utils.CountDownButtonHelper pushCountDownHelper;
    private com.xuexiang.xui.utils.CountDownButtonHelper pullCountDownHelper;
    private com.xuexiang.xui.utils.CountDownButtonHelper exportCountDownHelper;
    private com.xuexiang.xui.utils.CountDownButtonHelper importCountDownHelper;
    @com.xuexiang.xrouter.annotation.AutoWired(name = "key_default_selection")
    @kotlin.jvm.JvmField
    public int defaultSelection = 0;
    
    public CloneFragment() {
        super();
    }
    
    @java.lang.Override
    protected void initArgs() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.idormy.sms.forwarder.databinding.FragmentClientCloneBinding viewBindingInflate(@org.jetbrains.annotations.NotNull
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
    
    private final void pushData() {
    }
    
    private final void pullData() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}