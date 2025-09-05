package com.idormy.sms.forwarder.database.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0011J\b\u0010\u0015\u001a\u00020\rH\u0002J\u001a\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\rR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/idormy/sms/forwarder/database/viewmodel/MsgViewModel;", "Landroidx/lifecycle/ViewModel;", "dao", "Lcom/idormy/sms/forwarder/database/dao/MsgDao;", "(Lcom/idormy/sms/forwarder/database/dao/MsgDao;)V", "allMsg", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/idormy/sms/forwarder/database/entity/MsgAndLogs;", "getAllMsg", "()Lkotlinx/coroutines/flow/Flow;", "filter", "", "", "", "type", "delete", "", "id", "", "deleteAll", "getOtherCondition", "setFilter", "setType", "app_debug"})
public final class MsgViewModel extends androidx.lifecycle.ViewModel {
    private final com.idormy.sms.forwarder.database.dao.MsgDao dao = null;
    private java.lang.String type = "sms";
    private java.util.Map<java.lang.String, java.lang.Object> filter;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.idormy.sms.forwarder.database.entity.MsgAndLogs>> allMsg = null;
    
    public MsgViewModel(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.dao.MsgDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.viewmodel.MsgViewModel setType(@org.jetbrains.annotations.NotNull
    java.lang.String type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.viewmodel.MsgViewModel setFilter(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.Object> filter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.idormy.sms.forwarder.database.entity.MsgAndLogs>> getAllMsg() {
        return null;
    }
    
    public final void delete(long id) {
    }
    
    public final void deleteAll() {
    }
    
    private final java.lang.String getOtherCondition() {
        return null;
    }
}