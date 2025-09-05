package com.idormy.sms.forwarder.core;

import java.lang.System;

/**
 * https://xuexiangjys.club/xpage/transfer?pageName=xxxxx&....
 * applink的中转
 *
 * @author xuexiang
 * @since 2019-07-06 9:37
 */
@com.xuexiang.xrouter.annotation.Router(path = "/xpage/transfer")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/idormy/sms/forwarder/core/XPageTransferActivity;", "Lcom/idormy/sms/forwarder/core/BaseActivity;", "Landroidx/viewbinding/ViewBinding;", "()V", "pageName", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class XPageTransferActivity extends com.idormy.sms.forwarder.core.BaseActivity<androidx.viewbinding.ViewBinding> {
    @org.jetbrains.annotations.Nullable
    @com.xuexiang.xrouter.annotation.AutoWired(name = "pageName")
    @kotlin.jvm.JvmField
    public java.lang.Void pageName;
    
    public XPageTransferActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}