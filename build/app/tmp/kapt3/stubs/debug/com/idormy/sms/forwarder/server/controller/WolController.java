package com.idormy.sms.forwarder.server.controller;

import java.lang.System;

@com.yanzhenjie.andserver.annotation.RequestMapping(path = {"/wol"})
@com.yanzhenjie.andserver.annotation.RestController
@kotlin.Suppress(names = {"PrivatePropertyName"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/idormy/sms/forwarder/server/controller/WolController;", "", "()V", "TAG", "", "send", "bean", "Lcom/idormy/sms/forwarder/server/model/BaseRequest;", "Lcom/idormy/sms/forwarder/server/model/WolData;", "wakeOnLAN", "", "macAddress", "broadcastAddress", "port", "", "app_debug"})
public final class WolController {
    private final java.lang.String TAG = null;
    
    public WolController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @com.yanzhenjie.andserver.annotation.PostMapping(value = {"/send"})
    @com.yanzhenjie.andserver.annotation.CrossOrigin(methods = {com.yanzhenjie.andserver.annotation.RequestMethod.POST})
    public final java.lang.String send(@org.jetbrains.annotations.NotNull
    @com.yanzhenjie.andserver.annotation.RequestBody
    com.idormy.sms.forwarder.server.model.BaseRequest<com.idormy.sms.forwarder.server.model.WolData> bean) {
        return null;
    }
    
    private final void wakeOnLAN(java.lang.String macAddress, java.lang.String broadcastAddress, int port) {
    }
}