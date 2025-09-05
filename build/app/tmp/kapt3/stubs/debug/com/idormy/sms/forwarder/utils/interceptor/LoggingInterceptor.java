package com.idormy.sms.forwarder.utils.interceptor;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u001a\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0003H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/idormy/sms/forwarder/utils/interceptor/LoggingInterceptor;", "Lcom/xuexiang/xhttp2/interceptor/HttpLoggingInterceptor;", "logId", "", "(J)V", "TAG", "", "log", "", "message", "logForRequest", "request", "Lokhttp3/Request;", "connection", "Lokhttp3/Connection;", "logForResponse", "Lokhttp3/Response;", "response", "tookMs", "app_debug"})
public final class LoggingInterceptor extends com.xuexiang.xhttp2.interceptor.HttpLoggingInterceptor {
    private final long logId = 0L;
    private final java.lang.String TAG = null;
    
    public LoggingInterceptor(long logId) {
        super(null);
    }
    
    @java.lang.Override
    public void log(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    /**
     * 记录请求日志
     *
     * @param request
     * @param connection
     * @throws IOException
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @java.lang.Override
    protected void logForRequest(@org.jetbrains.annotations.NotNull
    okhttp3.Request request, @org.jetbrains.annotations.Nullable
    okhttp3.Connection connection) throws java.io.IOException {
    }
    
    /**
     * 记录响应日志
     *
     * @param response
     * @param tookMs   请求花费的时间
     * @return
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected okhttp3.Response logForResponse(@org.jetbrains.annotations.NotNull
    okhttp3.Response response, long tookMs) {
        return null;
    }
}