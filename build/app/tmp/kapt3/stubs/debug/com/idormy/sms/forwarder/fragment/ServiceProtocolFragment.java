package com.idormy.sms.forwarder.fragment;

import java.lang.System;

/**
 * 服务协议【本地加载】
 *
 * @author xuexiang
 * @since 2021/5/18 1:35 AM
 */
@kotlin.Suppress(names = {"REDUNDANT_MODIFIER_IN_GETTER"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0014J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0014J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014R\u0014\u0010\u0004\u001a\u00020\u00058CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00058CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/idormy/sms/forwarder/fragment/ServiceProtocolFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Lcom/idormy/sms/forwarder/databinding/FragmentServiceProtocolBinding;", "()V", "accountProtocol", "", "getAccountProtocol", "()Ljava/lang/String;", "isImmersive", "", "privacyProtocol", "getPrivacyProtocol", "title", "initArgs", "", "initTitle", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "initViews", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "app_debug"})
@com.xuexiang.xpage.annotation.Page
public final class ServiceProtocolFragment extends com.idormy.sms.forwarder.core.BaseFragment<com.idormy.sms.forwarder.databinding.FragmentServiceProtocolBinding> {
    @org.jetbrains.annotations.Nullable
    @com.xuexiang.xrouter.annotation.AutoWired(name = "key_protocol_title")
    @kotlin.jvm.JvmField
    public java.lang.String title;
    @com.xuexiang.xrouter.annotation.AutoWired(name = "key_is_immersive")
    @kotlin.jvm.JvmField
    public boolean isImmersive = false;
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.fragment.ServiceProtocolFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_PROTOCOL_TITLE = "key_protocol_title";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_IS_IMMERSIVE = "key_is_immersive";
    
    /**
     * 用户协议asset本地保存路径
     */
    private static final java.lang.String ACCOUNT_PROTOCOL_ASSET_PATH = "protocol/account_protocol.txt";
    
    /**
     * 隐私政策asset本地保存路径
     */
    private static final java.lang.String PRIVACY_PROTOCOL_ASSET_PATH = "protocol/privacy_protocol.txt";
    
    public ServiceProtocolFragment() {
        super();
    }
    
    @java.lang.Override
    protected void initArgs() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.idormy.sms.forwarder.databinding.FragmentServiceProtocolBinding viewBindingInflate(@org.jetbrains.annotations.NotNull
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
    
    @com.xuexiang.xaop.annotation.MemoryCache(value = "account_protocol")
    private final java.lang.String getAccountProtocol() {
        return null;
    }
    
    @com.xuexiang.xaop.annotation.MemoryCache(value = "privacy_protocol")
    private final java.lang.String getPrivacyProtocol() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/idormy/sms/forwarder/fragment/ServiceProtocolFragment$Companion;", "", "()V", "ACCOUNT_PROTOCOL_ASSET_PATH", "", "KEY_IS_IMMERSIVE", "KEY_PROTOCOL_TITLE", "PRIVACY_PROTOCOL_ASSET_PATH", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}