package com.idormy.sms.forwarder.utils.sdkinit;

import java.lang.System;

/**
 * X系列基础库初始化
 *
 * @author xuexiang
 * @since 2019-06-30 23:54
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/idormy/sms/forwarder/utils/sdkinit/XBasicLibInit;", "", "()V", "Companion", "app_debug"})
public final class XBasicLibInit {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.sdkinit.XBasicLibInit.Companion Companion = null;
    
    private XBasicLibInit() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\r"}, d2 = {"Lcom/idormy/sms/forwarder/utils/sdkinit/XBasicLibInit$Companion;", "", "()V", "init", "", "application", "Landroid/app/Application;", "initRouter", "initXAOP", "initXHttp2", "initXPage", "initXUI", "initXUtil", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * 初始化基础库SDK
         */
        public final void init(@org.jetbrains.annotations.NotNull
        android.app.Application application) {
        }
        
        /**
         * 初始化XUtil工具类
         */
        private final void initXUtil(android.app.Application application) {
        }
        
        /**
         * 初始化XHttp2
         */
        private final void initXHttp2(android.app.Application application) {
        }
        
        /**
         * 初始化XPage页面框架
         */
        private final void initXPage(android.app.Application application) {
        }
        
        /**
         * 初始化XAOP
         */
        private final void initXAOP(android.app.Application application) {
        }
        
        /**
         * 初始化XUI框架
         */
        private final void initXUI(android.app.Application application) {
        }
        
        /**
         * 初始化路由框架
         */
        private final void initRouter(android.app.Application application) {
        }
    }
}