package com.idormy.sms.forwarder.database.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0006\u0010\t\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0007J\u0019\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/idormy/sms/forwarder/database/repository/MsgRepository;", "", "msgDao", "Lcom/idormy/sms/forwarder/database/dao/MsgDao;", "(Lcom/idormy/sms/forwarder/database/dao/MsgDao;)V", "delete", "", "id", "", "deleteAll", "deleteTimeAgo", "time", "insert", "msg", "Lcom/idormy/sms/forwarder/database/entity/Msg;", "(Lcom/idormy/sms/forwarder/database/entity/Msg;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MsgRepository {
    private final com.idormy.sms.forwarder.database.dao.MsgDao msgDao = null;
    
    public MsgRepository(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.dao.MsgDao msgDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.WorkerThread
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Msg msg, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
    
    @androidx.annotation.WorkerThread
    public final void delete(long id) {
    }
    
    public final void deleteAll() {
    }
    
    @androidx.annotation.WorkerThread
    public final void deleteTimeAgo(long time) {
    }
}