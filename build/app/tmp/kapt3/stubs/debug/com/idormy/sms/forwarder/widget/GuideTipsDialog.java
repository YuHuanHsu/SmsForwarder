package com.idormy.sms.forwarder.widget;

import java.lang.System;

/**
 * 小贴士弹窗
 *
 * @author xuexiang
 * @since 2019-08-22 17:02
 */
@kotlin.Suppress(names = {"SameReturnValue"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \"2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\"B\u001d\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0017J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\bH\u0002J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u000bH\u0002J\u0016\u0010!\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/idormy/sms/forwarder/widget/GuideTipsDialog;", "Lcom/xuexiang/xui/widget/dialog/BaseDialog;", "Landroid/view/View$OnClickListener;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "context", "Landroid/content/Context;", "tips", "", "Lcom/idormy/sms/forwarder/core/http/entity/TipInfo;", "(Landroid/content/Context;Ljava/util/List;)V", "mIndex", "", "mTips", "mTvContent", "Landroid/widget/TextView;", "mTvNext", "mTvPrevious", "mTvTitle", "initViews", "", "onCheckedChanged", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "", "onClick", "view", "Landroid/view/View;", "onDetachedFromWindow", "showRichText", "tipInfo", "switchTipInfo", "index", "updateTips", "Companion", "app_debug"})
public final class GuideTipsDialog extends com.xuexiang.xui.widget.dialog.BaseDialog implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener {
    private java.util.List<com.idormy.sms.forwarder.core.http.entity.TipInfo> mTips;
    private int mIndex = -1;
    private android.widget.TextView mTvPrevious;
    private android.widget.TextView mTvNext;
    private android.widget.TextView mTvTitle;
    private android.widget.TextView mTvContent;
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.widget.GuideTipsDialog.Companion Companion = null;
    private static final java.lang.String KEY_IS_IGNORE_TIPS = "com.idormy.sms.forwarder.widget.key_is_ignore_tips_";
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference isIgnoreTips$delegate = null;
    
    public GuideTipsDialog(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.List<com.idormy.sms.forwarder.core.http.entity.TipInfo> tips) {
        super(null, 0);
    }
    
    /**
     * 初始化弹窗
     */
    private final void initViews() {
    }
    
    /**
     * 更新提示信息
     *
     * @param tips 提示信息
     */
    private final void updateTips(java.util.List<com.idormy.sms.forwarder.core.http.entity.TipInfo> tips) {
    }
    
    /**
     * 切换提示信息
     *
     * @param index 索引
     */
    private final void switchTipInfo(int index) {
    }
    
    /**
     * 显示富文本
     *
     * @param tipInfo 提示信息
     */
    private final void showRichText(com.idormy.sms.forwarder.core.http.entity.TipInfo tipInfo) {
    }
    
    @java.lang.Override
    @com.xuexiang.xaop.annotation.SingleClick(value = 300L)
    public void onClick(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    @java.lang.Override
    public void onCheckedChanged(@org.jetbrains.annotations.NotNull
    android.widget.CompoundButton buttonView, boolean isChecked) {
    }
    
    @java.lang.Override
    public void onDetachedFromWindow() {
    }
    
    /**
     * 显示提示
     *
     * @param context 上下文
     */
    @kotlin.jvm.JvmStatic
    public static final void showTips(@org.jetbrains.annotations.Nullable
    android.content.Context context) {
    }
    
    /**
     * 强制显示提示
     *
     * @param context 上下文
     */
    @kotlin.jvm.JvmStatic
    public static final void showTipsForce(@org.jetbrains.annotations.Nullable
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/idormy/sms/forwarder/widget/GuideTipsDialog$Companion;", "", "()V", "KEY_IS_IGNORE_TIPS", "", "<set-?>", "", "isIgnoreTips", "()Z", "setIgnoreTips", "(Z)V", "isIgnoreTips$delegate", "Lcom/idormy/sms/forwarder/utils/SharedPreference;", "setIsIgnoreTips", "isIgnore", "showTips", "", "context", "Landroid/content/Context;", "showTipsForce", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * 显示提示
         *
         * @param context 上下文
         */
        @kotlin.jvm.JvmStatic
        public final void showTips(@org.jetbrains.annotations.Nullable
        android.content.Context context) {
        }
        
        /**
         * 强制显示提示
         *
         * @param context 上下文
         */
        @kotlin.jvm.JvmStatic
        public final void showTipsForce(@org.jetbrains.annotations.Nullable
        android.content.Context context) {
        }
        
        public final boolean setIsIgnoreTips(boolean isIgnore) {
            return false;
        }
        
        public final boolean isIgnoreTips() {
            return false;
        }
        
        public final void setIgnoreTips(boolean p0) {
        }
    }
}