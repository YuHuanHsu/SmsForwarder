package com.idormy.sms.forwarder.core.http.subscriber;

import java.lang.System;

/**
 * 带错误toast提示的网络请求订阅
 *
 * @author xuexiang
 * @since 2019-11-18 23:10
 */
@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0011\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/idormy/sms/forwarder/core/http/subscriber/TipRequestSubscriber;", "T", "Lcom/xuexiang/xhttp2/subsciber/BaseSubscriber;", "()V", "req", "Lcom/xuexiang/xhttp2/model/XHttpRequest;", "(Lcom/xuexiang/xhttp2/model/XHttpRequest;)V", "url", "", "(Ljava/lang/String;)V", "mUrl", "onError", "", "e", "Lcom/xuexiang/xhttp2/exception/ApiException;", "app_debug"})
public abstract class TipRequestSubscriber<T extends java.lang.Object> extends com.xuexiang.xhttp2.subsciber.BaseSubscriber<T> {
    
    /**
     * 记录一下请求的url,确定出错的请求是哪个请求
     */
    private java.lang.String mUrl;
    
    public TipRequestSubscriber() {
        super();
    }
    
    public TipRequestSubscriber(@org.jetbrains.annotations.NotNull
    com.xuexiang.xhttp2.model.XHttpRequest req) {
        super();
    }
    
    public TipRequestSubscriber(@org.jetbrains.annotations.Nullable
    java.lang.String url) {
        super();
    }
    
    @java.lang.Override
    public void onError(@org.jetbrains.annotations.NotNull
    com.xuexiang.xhttp2.exception.ApiException e) {
    }
}