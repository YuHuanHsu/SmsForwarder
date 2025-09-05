package com.idormy.sms.forwarder.server.component;

import java.lang.System;

@com.yanzhenjie.andserver.annotation.Interceptor
@kotlin.Suppress(names = {"PrivatePropertyName"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/idormy/sms/forwarder/server/component/LoggerInterceptor;", "Lcom/yanzhenjie/andserver/framework/HandlerInterceptor;", "()V", "TAG", "", "onIntercept", "", "request", "Lcom/yanzhenjie/andserver/http/HttpRequest;", "respons", "Lcom/yanzhenjie/andserver/http/HttpResponse;", "handler", "Lcom/yanzhenjie/andserver/framework/handler/RequestHandler;", "app_debug"})
public final class LoggerInterceptor implements com.yanzhenjie.andserver.framework.HandlerInterceptor {
    private final java.lang.String TAG = "LoggerInterceptor";
    
    public LoggerInterceptor() {
        super();
    }
    
    @java.lang.Override
    public boolean onIntercept(@org.jetbrains.annotations.NotNull
    com.yanzhenjie.andserver.http.HttpRequest request, @org.jetbrains.annotations.NotNull
    com.yanzhenjie.andserver.http.HttpResponse respons, @org.jetbrains.annotations.NotNull
    com.yanzhenjie.andserver.framework.handler.RequestHandler handler) {
        return false;
    }
}