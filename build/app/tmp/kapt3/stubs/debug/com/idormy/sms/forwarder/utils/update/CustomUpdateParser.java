package com.idormy.sms.forwarder.utils.update;

import java.lang.System;

/**
 * 版本更新信息自定义json解析器
 * 具体使用参见： https://github.com/xuexiangjys/XUpdate/wiki/%E9%AB%98%E9%98%B6%E4%BD%BF%E7%94%A8#%E8%87%AA%E5%AE%9A%E4%B9%89%E7%89%88%E6%9C%AC%E6%9B%B4%E6%96%B0%E8%A7%A3%E6%9E%90%E5%99%A8
 *
 * @author xuexiang
 * @since 2020-02-18 13:01
 */
@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/idormy/sms/forwarder/utils/update/CustomUpdateParser;", "Lcom/xuexiang/xupdate/proxy/impl/AbstractUpdateParser;", "()V", "parseJson", "Lcom/xuexiang/xupdate/entity/UpdateEntity;", "json", "", "app_debug"})
public final class CustomUpdateParser extends com.xuexiang.xupdate.proxy.impl.AbstractUpdateParser {
    
    public CustomUpdateParser() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @java.lang.Override
    public com.xuexiang.xupdate.entity.UpdateEntity parseJson(@org.jetbrains.annotations.NotNull
    java.lang.String json) throws java.lang.Exception {
        return null;
    }
}