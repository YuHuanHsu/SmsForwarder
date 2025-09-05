package com.idormy.sms.forwarder.server.controller;

import java.lang.System;

@com.yanzhenjie.andserver.annotation.RequestMapping(path = {"/location"})
@com.yanzhenjie.andserver.annotation.RestController
@kotlin.Suppress(names = {"PrivatePropertyName"})
@android.annotation.SuppressLint(value = {"SimpleDateFormat"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/idormy/sms/forwarder/server/controller/LocationController;", "", "()V", "TAG", "", "query", "Lcom/idormy/sms/forwarder/entity/LocationInfo;", "bean", "Lcom/idormy/sms/forwarder/server/model/BaseRequest;", "Lcom/idormy/sms/forwarder/server/model/EmptyData;", "app_debug"})
public final class LocationController {
    private final java.lang.String TAG = null;
    
    public LocationController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @com.yanzhenjie.andserver.annotation.PostMapping(value = {"/query"})
    @com.yanzhenjie.andserver.annotation.CrossOrigin(methods = {com.yanzhenjie.andserver.annotation.RequestMethod.POST})
    public final com.idormy.sms.forwarder.entity.LocationInfo query(@org.jetbrains.annotations.NotNull
    @com.yanzhenjie.andserver.annotation.RequestBody
    com.idormy.sms.forwarder.server.model.BaseRequest<com.idormy.sms.forwarder.server.model.EmptyData> bean) {
        return null;
    }
}