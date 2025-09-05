package com.idormy.sms.forwarder.fragment.senders;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J8\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u001e2\u0006\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\"\u001a\u00020#H\u0002J(\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070%2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0%H\u0002J\b\u0010&\u001a\u00020\u001dH\u0014J\b\u0010\'\u001a\u00020\u001dH\u0014J\n\u0010(\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010)\u001a\u00020\u001dH\u0014J\u001a\u0010*\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020\u000eH\u0016J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u000200H\u0017J\b\u00101\u001a\u00020\u001dH\u0016J\u0018\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\u00a8\u00067"}, d2 = {"Lcom/idormy/sms/forwarder/fragment/senders/WebhookFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Lcom/idormy/sms/forwarder/databinding/FragmentSendersWebhookBinding;", "Landroid/view/View$OnClickListener;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "()V", "TAG", "", "headerItemId", "", "headerItemMap", "Ljava/util/HashMap;", "Landroid/widget/LinearLayout;", "isClone", "", "mCountDownHelper", "Lcom/xuexiang/xui/utils/CountDownButtonHelper;", "senderId", "", "senderType", "titleBar", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "viewModel", "Lcom/idormy/sms/forwarder/database/viewmodel/SenderViewModel;", "getViewModel", "()Lcom/idormy/sms/forwarder/database/viewmodel/SenderViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addHeaderItemLinearLayout", "", "", "linearLayoutWebNotifyHeaders", "key", "value", "checkSetting", "Lcom/idormy/sms/forwarder/entity/setting/WebhookSetting;", "getHeadersFromHeaderItemMap", "", "initArgs", "initListeners", "initTitle", "initViews", "onCheckedChanged", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "onClick", "v", "Landroid/view/View;", "onDestroyView", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
@com.xuexiang.xpage.annotation.Page(name = "Webhook")
public final class WebhookFragment extends com.idormy.sms.forwarder.core.BaseFragment<com.idormy.sms.forwarder.databinding.FragmentSendersWebhookBinding> implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener {
    private final java.lang.String TAG = null;
    private com.xuexiang.xui.widget.actionbar.TitleBar titleBar;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.xuexiang.xui.utils.CountDownButtonHelper mCountDownHelper;
    private java.util.HashMap<java.lang.Integer, android.widget.LinearLayout> headerItemMap;
    @com.xuexiang.xrouter.annotation.AutoWired(name = "key_sender_id")
    @kotlin.jvm.JvmField
    public long senderId = 0L;
    @com.xuexiang.xrouter.annotation.AutoWired(name = "key_sender_type")
    @kotlin.jvm.JvmField
    public int senderType = 0;
    @com.xuexiang.xrouter.annotation.AutoWired(name = "key_sender_clone")
    @kotlin.jvm.JvmField
    public boolean isClone = false;
    private int headerItemId = 0;
    
    public WebhookFragment() {
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
    protected com.idormy.sms.forwarder.databinding.FragmentSendersWebhookBinding viewBindingInflate(@org.jetbrains.annotations.NotNull
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
    
    private final com.idormy.sms.forwarder.entity.setting.WebhookSetting checkSetting() {
        return null;
    }
    
    /**
     * 动态增删header
     *
     * @param headerItemMap                管理item的map，用于删除指定header
     * @param linearLayoutWebNotifyHeaders 需要挂载item的LinearLayout
     * @param key                          header的key，为空则不设置
     * @param value                        header的value，为空则不设置
     */
    private final void addHeaderItemLinearLayout(java.util.Map<java.lang.Integer, android.widget.LinearLayout> headerItemMap, android.widget.LinearLayout linearLayoutWebNotifyHeaders, java.lang.String key, java.lang.String value) {
    }
    
    /**
     * 从EditText控件中获取全部headers
     *
     * @param headerItemMap 管理item的map
     * @return 全部headers
     */
    private final java.util.Map<java.lang.String, java.lang.String> getHeadersFromHeaderItemMap(java.util.Map<java.lang.Integer, ? extends android.widget.LinearLayout> headerItemMap) {
        return null;
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}