package com.idormy.sms.forwarder.utils.sdkinit;

import java.lang.System;

/**
 * XUpdate 版本更新 SDK 初始化
 *
 * 详细使用参见：https://github.com/xuexiangjys/XUpdate/wiki
 *
 * @author xuexiang
 * @since 2019-06-18 15:51
 */
@kotlin.Suppress(names = {"SameParameterValue"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/idormy/sms/forwarder/utils/sdkinit/XUpdateInit;", "", "()V", "Companion", "app_debug"})
public final class XUpdateInit {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.sdkinit.XUpdateInit.Companion Companion = null;
    
    private XUpdateInit() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/idormy/sms/forwarder/utils/sdkinit/XUpdateInit$Companion;", "", "()V", "checkUpdate", "", "context", "Landroid/content/Context;", "needErrorTip", "", "joinPreviewProgram", "url", "", "init", "application", "Landroid/app/Application;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * 应用版本更新的检查地址
         */
        public final void init(@org.jetbrains.annotations.NotNull
        android.app.Application application) {
        }
        
        /**
         * 进行版本更新检查
         */
        public final void checkUpdate(@org.jetbrains.annotations.NotNull
        android.content.Context context, boolean needErrorTip, boolean joinPreviewProgram) {
        }
        
        /**
         * 进行版本更新检查
         *
         * @param context      上下文
         * @param url          版本更新检查的地址
         * @param needErrorTip 是否需要错误的提示
         */
        private final void checkUpdate(android.content.Context context, java.lang.String url, boolean needErrorTip) {
        }
    }
}