package com.idormy.sms.forwarder.utils.update;

import java.lang.System;

/**
 * 自定义版本更新提示
 *
 * @author xuexiang
 * @since 2019/4/15 上午12:01
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/idormy/sms/forwarder/utils/update/CustomUpdateFailureListener;", "Lcom/xuexiang/xupdate/listener/OnUpdateFailureListener;", "mNeedErrorTip", "", "(Z)V", "onFailure", "", "error", "Lcom/xuexiang/xupdate/entity/UpdateError;", "app_debug"})
public final class CustomUpdateFailureListener implements com.xuexiang.xupdate.listener.OnUpdateFailureListener {
    
    /**
     * 是否需要错误提示
     */
    private final boolean mNeedErrorTip = false;
    
    @kotlin.jvm.JvmOverloads
    public CustomUpdateFailureListener() {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public CustomUpdateFailureListener(boolean mNeedErrorTip) {
        super();
    }
    
    /**
     * 更新失败
     *
     * @param error 错误
     */
    @java.lang.Override
    public void onFailure(@org.jetbrains.annotations.NotNull
    com.xuexiang.xupdate.entity.UpdateError error) {
    }
}