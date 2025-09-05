package com.idormy.sms.forwarder.utils;

import java.lang.System;

/**
 * 常用工具类
 */
@kotlin.Suppress(names = {"RegExpRedundantEscape", "unused", "RegExpUnnecessaryNonCapturingGroup"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/idormy/sms/forwarder/utils/CommonUtils;", "", "()V", "Companion", "app_debug"})
public final class CommonUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.CommonUtils.Companion Companion = null;
    
    /**
     * 这里填写你的应用隐私政策网页地址
     */
    private static final java.lang.String PRIVACY_URL = "https://gitee.com/pp/SmsForwarder/raw/main/PRIVACY";
    
    private CommonUtils() {
        super();
    }
    
    /**
     * 显示隐私政策的提示
     *
     * @param context
     * @param submitListener 同意的监听
     * @return
     */
    @org.jetbrains.annotations.NotNull
    @kotlin.Suppress(names = {"SameParameterValue", "NAME_SHADOWING"})
    @kotlin.jvm.JvmStatic
    public static final android.app.Dialog showPrivacyDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.SingleButtonCallback submitListener) {
        return null;
    }
    
    /**
     * 请求浏览器
     *
     * @param url
     */
    @kotlin.jvm.JvmStatic
    public static final void goWeb(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String url) {
    }
    
    /**
     * 打开用户协议和隐私协议
     *
     * @param fragment
     * @param isPrivacy   是否是隐私协议
     * @param isImmersive 是否沉浸式
     */
    @kotlin.jvm.JvmStatic
    public static final void gotoProtocol(@org.jetbrains.annotations.Nullable
    com.xuexiang.xpage.base.XPageFragment fragment, boolean isPrivacy, boolean isImmersive) {
    }
    
    /**
     * 是否是深色的颜色
     *
     * @param color
     * @return
     */
    @kotlin.jvm.JvmStatic
    public static final boolean isColorDark(@androidx.annotation.ColorInt
    int color) {
        return false;
    }
    
    /**
     * 打开Markdown链接并渲染
     *
     * @param fragment
     * @param url   Markdown链接
     * @param isImmersive 是否沉浸式
     */
    @kotlin.jvm.JvmStatic
    public static final void previewMarkdown(@org.jetbrains.annotations.Nullable
    com.xuexiang.xpage.base.XPageFragment fragment, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String url, boolean isImmersive) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0006J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0006J=\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00042\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e\u00a2\u0006\u0002\u0010\u001fJ\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040!J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010$\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004H\u0002J\u001a\u0010\'\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0007J\"\u0010(\u001a\u00020\u00152\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0007J\u0016\u0010-\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u0004J\u0012\u0010/\u001a\u00020\u00062\b\b\u0001\u00100\u001a\u000201H\u0007J\u000e\u00102\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J*\u00103\u001a\u00020\u00152\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u00104\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0006H\u0007J\"\u00105\u001a\u00020\u00152\b\u0010)\u001a\u0004\u0018\u0001062\u0006\u0010\u0011\u001a\u00020\u00042\b\u00107\u001a\u0004\u0018\u000108J\u000e\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0004J\u0006\u0010;\u001a\u00020\u0015J\u001a\u0010<\u001a\u00020=2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010>\u001a\u0004\u0018\u00010?H\u0007J\u000e\u0010@\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lcom/idormy/sms/forwarder/utils/CommonUtils$Companion;", "", "()V", "PRIVACY_URL", "", "checkDomain", "", "domain", "checkEmail", "email", "checkIP", "ip", "checkPort", "port", "checkTemplateTag", "template", "checkUrl", "url", "emptyResult", "checkUrlScheme", "createTagButtons", "", "context", "Landroid/content/Context;", "gridLayout", "Landroid/widget/GridLayout;", "editText", "Landroid/widget/EditText;", "scene", "excludeButtons", "", "(Landroid/content/Context;Landroid/widget/GridLayout;Landroid/widget/EditText;Ljava/lang/String;[Ljava/lang/String;)V", "getIPAddresses", "", "getPrivacyContent", "Landroid/text/SpannableStringBuilder;", "getPrivacyLink", "Landroid/text/SpannableString;", "privacyUrl", "goWeb", "gotoProtocol", "fragment", "Lcom/xuexiang/xpage/base/XPageFragment;", "isPrivacy", "isImmersive", "insertOrReplaceText2Cursor", "str", "isColorDark", "color", "", "isNotificationListenerServiceEnabled", "previewMarkdown", "title", "previewPicture", "Landroidx/fragment/app/Fragment;", "view", "Landroid/view/View;", "removeInterfaceFromIP", "ipAddress", "restartApplication", "showPrivacyDialog", "Landroid/app/Dialog;", "submitListener", "Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$SingleButtonCallback;", "toggleNotificationListenerService", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * 显示隐私政策的提示
         *
         * @param context
         * @param submitListener 同意的监听
         * @return
         */
        @org.jetbrains.annotations.NotNull
        @kotlin.Suppress(names = {"SameParameterValue", "NAME_SHADOWING"})
        @kotlin.jvm.JvmStatic
        public final android.app.Dialog showPrivacyDialog(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.Nullable
        com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.SingleButtonCallback submitListener) {
            return null;
        }
        
        /**
         * @return 隐私政策说明
         */
        private final android.text.SpannableStringBuilder getPrivacyContent(android.content.Context context) {
            return null;
        }
        
        /**
         * @param context 隐私政策的链接
         * @return
         */
        @kotlin.Suppress(names = {"SameParameterValue"})
        private final android.text.SpannableString getPrivacyLink(android.content.Context context, java.lang.String privacyUrl) {
            return null;
        }
        
        /**
         * 请求浏览器
         *
         * @param url
         */
        @kotlin.jvm.JvmStatic
        public final void goWeb(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.Nullable
        java.lang.String url) {
        }
        
        /**
         * 打开用户协议和隐私协议
         *
         * @param fragment
         * @param isPrivacy   是否是隐私协议
         * @param isImmersive 是否沉浸式
         */
        @kotlin.jvm.JvmStatic
        public final void gotoProtocol(@org.jetbrains.annotations.Nullable
        com.xuexiang.xpage.base.XPageFragment fragment, boolean isPrivacy, boolean isImmersive) {
        }
        
        /**
         * 是否是深色的颜色
         *
         * @param color
         * @return
         */
        @kotlin.jvm.JvmStatic
        public final boolean isColorDark(@androidx.annotation.ColorInt
        int color) {
            return false;
        }
        
        public final void insertOrReplaceText2Cursor(@org.jetbrains.annotations.NotNull
        android.widget.EditText editText, @org.jetbrains.annotations.NotNull
        java.lang.String str) {
        }
        
        /**
         * 大图预览
         *
         * @param fragment
         * @param url      图片资源
         * @param view     小图加载控件
         */
        public final void previewPicture(@org.jetbrains.annotations.Nullable
        androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull
        java.lang.String url, @org.jetbrains.annotations.Nullable
        android.view.View view) {
        }
        
        /**
         * 打开Markdown链接并渲染
         *
         * @param fragment
         * @param url   Markdown链接
         * @param isImmersive 是否沉浸式
         */
        @kotlin.jvm.JvmStatic
        public final void previewMarkdown(@org.jetbrains.annotations.Nullable
        com.xuexiang.xpage.base.XPageFragment fragment, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.lang.String url, boolean isImmersive) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String checkTemplateTag(@org.jetbrains.annotations.NotNull
        java.lang.String template) {
            return null;
        }
        
        public final boolean checkUrl(@org.jetbrains.annotations.Nullable
        java.lang.String url, boolean emptyResult) {
            return false;
        }
        
        public final boolean checkUrlScheme(@org.jetbrains.annotations.Nullable
        java.lang.String url, boolean emptyResult) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String checkIP(@org.jetbrains.annotations.NotNull
        java.lang.String ip) {
            return null;
        }
        
        public final boolean checkDomain(@org.jetbrains.annotations.NotNull
        java.lang.String domain) {
            return false;
        }
        
        public final boolean checkPort(@org.jetbrains.annotations.NotNull
        java.lang.String port) {
            return false;
        }
        
        public final boolean checkEmail(@org.jetbrains.annotations.NotNull
        java.lang.String email) {
            return false;
        }
        
        public final boolean isNotificationListenerServiceEnabled(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return false;
        }
        
        public final void toggleNotificationListenerService(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getIPAddresses() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String removeInterfaceFromIP(@org.jetbrains.annotations.NotNull
        java.lang.String ipAddress) {
            return null;
        }
        
        public final void restartApplication() {
        }
        
        public final void createTagButtons(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        android.widget.GridLayout gridLayout, @org.jetbrains.annotations.NotNull
        android.widget.EditText editText, @org.jetbrains.annotations.NotNull
        java.lang.String scene, @org.jetbrains.annotations.NotNull
        java.lang.String[] excludeButtons) {
        }
    }
}