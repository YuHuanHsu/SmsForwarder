package com.idormy.sms.forwarder.utils.update;

import java.lang.System;

/**
 * 版本更新提示弹窗
 *
 * @author xuexiang
 * @since 2019-06-15 00:06
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\f"}, d2 = {"Lcom/idormy/sms/forwarder/utils/update/UpdateTipDialog;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/content/DialogInterface$OnDismissListener;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "Companion", "app_debug"})
public final class UpdateTipDialog extends androidx.appcompat.app.AppCompatActivity implements android.content.DialogInterface.OnDismissListener {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.update.UpdateTipDialog.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_CONTENT = "com.idormy.sms.forwarder.utils.update.KEY_CONTENT";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DOWNLOAD_TYPE_NAME = "GitHub";
    private static final java.lang.String DOWNLOAD_URL = "https://github.com/pppscn/SmsForwarder/releases";
    
    public UpdateTipDialog() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onDismiss(@org.jetbrains.annotations.NotNull
    android.content.DialogInterface dialog) {
    }
    
    /**
     * 显示版本更新重试提示弹窗
     *
     * @param content
     */
    @kotlin.jvm.JvmStatic
    public static final void show(@org.jetbrains.annotations.Nullable
    java.lang.String content) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/idormy/sms/forwarder/utils/update/UpdateTipDialog$Companion;", "", "()V", "DOWNLOAD_TYPE_NAME", "", "DOWNLOAD_URL", "KEY_CONTENT", "show", "", "content", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * 显示版本更新重试提示弹窗
         *
         * @param content
         */
        @kotlin.jvm.JvmStatic
        public final void show(@org.jetbrains.annotations.Nullable
        java.lang.String content) {
        }
    }
}