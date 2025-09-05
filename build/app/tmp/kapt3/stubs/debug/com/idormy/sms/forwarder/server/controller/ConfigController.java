package com.idormy.sms.forwarder.server.controller;

import java.lang.System;

@com.yanzhenjie.andserver.annotation.RequestMapping(path = {"/config"})
@com.yanzhenjie.andserver.annotation.RestController
@kotlin.Suppress(names = {"PrivatePropertyName"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/idormy/sms/forwarder/server/controller/ConfigController;", "", "()V", "TAG", "", "test", "Lcom/idormy/sms/forwarder/server/model/ConfigData;", "bean", "Lcom/idormy/sms/forwarder/server/model/BaseRequest;", "app_debug"})
public final class ConfigController {
    private final java.lang.String TAG = null;
    
    public ConfigController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @com.yanzhenjie.andserver.annotation.PostMapping(value = {"/query"})
    @com.yanzhenjie.andserver.annotation.CrossOrigin(methods = {com.yanzhenjie.andserver.annotation.RequestMethod.POST})
    public final com.idormy.sms.forwarder.server.model.ConfigData test(@org.jetbrains.annotations.NotNull
    @com.yanzhenjie.andserver.annotation.RequestBody
    com.idormy.sms.forwarder.server.model.BaseRequest<?> bean) {
        return null;
    }
}