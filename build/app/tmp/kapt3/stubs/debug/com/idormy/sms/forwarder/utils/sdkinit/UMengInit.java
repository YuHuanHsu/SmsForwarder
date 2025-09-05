package com.idormy.sms.forwarder.utils.sdkinit;

import java.lang.System;

/**
 * UMeng 统计 SDK初始化
 *
 * @author xuexiang
 * @since 2019-06-18 15:49
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/idormy/sms/forwarder/utils/sdkinit/UMengInit;", "", "()V", "Companion", "app_debug"})
public final class UMengInit {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.sdkinit.UMengInit.Companion Companion = null;
    private static final java.lang.String DEFAULT_CHANNEL_ID = "github";
    
    private UMengInit() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/idormy/sms/forwarder/utils/sdkinit/UMengInit$Companion;", "", "()V", "DEFAULT_CHANNEL_ID", "", "init", "", "context", "Landroid/content/Context;", "initApplication", "application", "Landroid/app/Application;", "realInit", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * 初始化SDK,合规指南【先进行预初始化，如果用户隐私同意后可以初始化UmengSDK进行信息上报】
         */
        @kotlin.jvm.JvmOverloads
        public final void init() {
        }
        
        /**
         * 初始化SDK,合规指南【先进行预初始化，如果用户隐私同意后可以初始化UmengSDK进行信息上报】
         */
        @kotlin.jvm.JvmOverloads
        public final void init(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
        
        /**
         * 初始化SDK,合规指南【先进行预初始化，如果用户隐私同意后可以初始化UmengSDK进行信息上报】
         */
        private final void initApplication(android.app.Application application) {
        }
        
        /**
         * 真实的初始化UmengSDK【进行设备信息的统计上报，必须在获得用户隐私同意后方可调用】
         */
        private final void realInit(android.app.Application application) {
        }
    }
}