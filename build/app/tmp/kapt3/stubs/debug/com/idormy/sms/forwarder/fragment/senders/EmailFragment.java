package com.idormy.sms.forwarder.fragment.senders;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\b\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010\'\u001a\u00020\u0006H\u0002J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060)2\u0006\u0010*\u001a\u00020\u0006H\u0002J \u0010+\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060,0\u0012H\u0002J\b\u0010-\u001a\u00020 H\u0014J\b\u0010.\u001a\u00020 H\u0014J\n\u0010/\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u00100\u001a\u00020 H\u0014J\u0010\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020 2\u0006\u00105\u001a\u000206H\u0017J\b\u00107\u001a\u00020 H\u0016J\u0010\u00108\u001a\u00020 2\u0006\u00109\u001a\u00020:H\u0002J\u0018\u0010;\u001a\u00020\u00022\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006@"}, d2 = {"Lcom/idormy/sms/forwarder/fragment/senders/EmailFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Lcom/idormy/sms/forwarder/databinding/FragmentSendersEmailBinding;", "Landroid/view/View$OnClickListener;", "()V", "TAG", "", "downloadPath", "kotlin.jvm.PlatformType", "encryptionProtocol", "isClone", "", "mCountDownHelper", "Lcom/xuexiang/xui/utils/CountDownButtonHelper;", "mailType", "recipientItemId", "", "recipientItemMap", "", "Landroid/widget/LinearLayout;", "senderId", "", "senderType", "titleBar", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "viewModel", "Lcom/idormy/sms/forwarder/database/viewmodel/SenderViewModel;", "getViewModel", "()Lcom/idormy/sms/forwarder/database/viewmodel/SenderViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addRecipientItem", "", "email", "cert", "", "checkSetting", "Lcom/idormy/sms/forwarder/entity/setting/EmailSetting;", "convertCertToBase64String", "pfxFilePath", "findSupportedFiles", "", "directoryPath", "getRecipientsFromRecipientItemMap", "Lkotlin/Pair;", "initArgs", "initListeners", "initTitle", "initViews", "isSupportedFile", "file", "Ljava/io/File;", "onClick", "v", "Landroid/view/View;", "onDestroyView", "pickCert", "etKeyStore", "Landroid/widget/EditText;", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
@com.xuexiang.xpage.annotation.Page(name = "Email")
public final class EmailFragment extends com.idormy.sms.forwarder.core.BaseFragment<com.idormy.sms.forwarder.databinding.FragmentSendersEmailBinding> implements android.view.View.OnClickListener {
    private final java.lang.String TAG = null;
    private com.xuexiang.xui.widget.actionbar.TitleBar titleBar;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.xuexiang.xui.utils.CountDownButtonHelper mCountDownHelper;
    private java.lang.String mailType;
    private java.util.Map<java.lang.Integer, android.widget.LinearLayout> recipientItemMap;
    private final java.lang.String downloadPath = null;
    private java.lang.String encryptionProtocol = "Plain";
    @com.xuexiang.xrouter.annotation.AutoWired(name = "key_sender_id")
    @kotlin.jvm.JvmField
    public long senderId = 0L;
    @com.xuexiang.xrouter.annotation.AutoWired(name = "key_sender_type")
    @kotlin.jvm.JvmField
    public int senderType = 0;
    @com.xuexiang.xrouter.annotation.AutoWired(name = "key_sender_clone")
    @kotlin.jvm.JvmField
    public boolean isClone = false;
    private int recipientItemId = 0;
    
    public EmailFragment() {
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
    protected com.idormy.sms.forwarder.databinding.FragmentSendersEmailBinding viewBindingInflate(@org.jetbrains.annotations.NotNull
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
    
    private final com.idormy.sms.forwarder.entity.setting.EmailSetting checkSetting() {
        return null;
    }
    
    /**
     * 动态增删recipient
     *
     * @param email            recipient的email
     * @param cert             recipient的cert，为空则不设置
     */
    private final void addRecipientItem(java.lang.String email, java.lang.Object cert) {
    }
    
    /**
     * 从EditText控件中获取全部recipients
     *
     * @return 全部recipients
     */
    private final java.util.Map<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> getRecipientsFromRecipientItemMap() {
        return null;
    }
    
    private final void pickCert(android.widget.EditText etKeyStore) {
    }
    
    private final java.util.List<java.lang.String> findSupportedFiles(java.lang.String directoryPath) {
        return null;
    }
    
    private final boolean isSupportedFile(java.io.File file) {
        return false;
    }
    
    private final java.lang.String convertCertToBase64String(java.lang.String pfxFilePath) {
        return null;
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}