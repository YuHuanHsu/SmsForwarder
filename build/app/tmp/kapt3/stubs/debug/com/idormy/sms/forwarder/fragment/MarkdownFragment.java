package com.idormy.sms.forwarder.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0014J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\nH\u0014J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/idormy/sms/forwarder/fragment/MarkdownFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Lcom/idormy/sms/forwarder/databinding/FragmentMarkdownBinding;", "()V", "isImmersive", "", "title", "", "url", "initArgs", "", "initTitle", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "initViews", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "app_debug"})
@com.xuexiang.xpage.annotation.Page(name = "Markdown")
public final class MarkdownFragment extends com.idormy.sms.forwarder.core.BaseFragment<com.idormy.sms.forwarder.databinding.FragmentMarkdownBinding> {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.fragment.MarkdownFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_MD_TITLE = "key_md_title";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_MD_URL = "key_md_url";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_IS_IMMERSIVE = "key_is_immersive";
    @org.jetbrains.annotations.Nullable
    @com.xuexiang.xrouter.annotation.AutoWired(name = "key_md_title")
    @kotlin.jvm.JvmField
    public java.lang.String title;
    @org.jetbrains.annotations.Nullable
    @com.xuexiang.xrouter.annotation.AutoWired(name = "key_md_url")
    @kotlin.jvm.JvmField
    public java.lang.String url;
    @com.xuexiang.xrouter.annotation.AutoWired(name = "key_is_immersive")
    @kotlin.jvm.JvmField
    public boolean isImmersive = false;
    
    public MarkdownFragment() {
        super();
    }
    
    @java.lang.Override
    protected void initArgs() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.idormy.sms.forwarder.databinding.FragmentMarkdownBinding viewBindingInflate(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/idormy/sms/forwarder/fragment/MarkdownFragment$Companion;", "", "()V", "KEY_IS_IMMERSIVE", "", "KEY_MD_TITLE", "KEY_MD_URL", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}