package com.idormy.sms.forwarder.utils.update;

import java.lang.System;

/**
 * XHttp2实现的请求更新
 *
 * @author xuexiang
 * @since 2018/8/12 上午11:46
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J,\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J(\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0016\u00a8\u0006\u0013"}, d2 = {"Lcom/idormy/sms/forwarder/utils/update/XHttpUpdateHttpServiceImpl;", "Lcom/xuexiang/xupdate/proxy/IUpdateHttpService;", "()V", "asyncGet", "", "url", "", "params", "", "", "callBack", "Lcom/xuexiang/xupdate/proxy/IUpdateHttpService$Callback;", "asyncPost", "cancelDownload", "download", "path", "fileName", "callback", "Lcom/xuexiang/xupdate/proxy/IUpdateHttpService$DownloadCallback;", "app_debug"})
public final class XHttpUpdateHttpServiceImpl implements com.xuexiang.xupdate.proxy.IUpdateHttpService {
    
    public XHttpUpdateHttpServiceImpl() {
        super();
    }
    
    @java.lang.Override
    public void asyncGet(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, ? extends java.lang.Object> params, @org.jetbrains.annotations.NotNull
    com.xuexiang.xupdate.proxy.IUpdateHttpService.Callback callBack) {
    }
    
    @java.lang.Override
    public void asyncPost(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, ? extends java.lang.Object> params, @org.jetbrains.annotations.NotNull
    com.xuexiang.xupdate.proxy.IUpdateHttpService.Callback callBack) {
    }
    
    @java.lang.Override
    public void download(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.lang.String path, @org.jetbrains.annotations.NotNull
    java.lang.String fileName, @org.jetbrains.annotations.NotNull
    com.xuexiang.xupdate.proxy.IUpdateHttpService.DownloadCallback callback) {
    }
    
    @java.lang.Override
    public void cancelDownload(@org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
}