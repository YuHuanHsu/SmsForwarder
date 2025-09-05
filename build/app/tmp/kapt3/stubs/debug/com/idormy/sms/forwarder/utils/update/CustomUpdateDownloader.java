package com.idormy.sms.forwarder.utils.update;

import java.lang.System;

/**
 * 重写DefaultUpdateDownloader，在取消下载时，弹出提示
 *
 * @author xuexiang
 * @since 2019-06-14 23:47
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/idormy/sms/forwarder/utils/update/CustomUpdateDownloader;", "Lcom/xuexiang/xupdate/proxy/impl/DefaultUpdateDownloader;", "()V", "mIsStartDownload", "", "cancelDownload", "", "startDownload", "updateEntity", "Lcom/xuexiang/xupdate/entity/UpdateEntity;", "downloadListener", "Lcom/xuexiang/xupdate/service/OnFileDownloadListener;", "app_debug"})
public final class CustomUpdateDownloader extends com.xuexiang.xupdate.proxy.impl.DefaultUpdateDownloader {
    private boolean mIsStartDownload = false;
    
    public CustomUpdateDownloader() {
        super();
    }
    
    @java.lang.Override
    public void startDownload(@org.jetbrains.annotations.NotNull
    com.xuexiang.xupdate.entity.UpdateEntity updateEntity, @org.jetbrains.annotations.Nullable
    com.xuexiang.xupdate.service.OnFileDownloadListener downloadListener) {
    }
    
    @java.lang.Override
    public void cancelDownload() {
    }
}