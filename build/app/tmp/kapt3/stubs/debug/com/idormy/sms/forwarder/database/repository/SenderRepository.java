package com.idormy.sms.forwarder.database.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007J\u0006\u0010\u000f\u001a\u00020\rJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\u0007J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00140\u0011J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0007J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0012H\u0007J\u000e\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0012J\u001c\u0010\u001e\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\u0006\u0010\u001f\u001a\u00020 R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/idormy/sms/forwarder/database/repository/SenderRepository;", "", "senderDao", "Lcom/idormy/sms/forwarder/database/dao/SenderDao;", "(Lcom/idormy/sms/forwarder/database/dao/SenderDao;)V", "count", "Lkotlinx/coroutines/flow/Flow;", "", "getCount", "()Lkotlinx/coroutines/flow/Flow;", "listener", "Lcom/idormy/sms/forwarder/database/repository/Listener;", "delete", "", "id", "deleteAll", "get", "Lio/reactivex/Single;", "Lcom/idormy/sms/forwarder/database/entity/Sender;", "getAll", "", "getAllNonCache", "getByIds", "ids", "instr", "", "getOne", "insert", "sender", "update", "updateStatusByIds", "status", "", "app_debug"})
public final class SenderRepository {
    private final com.idormy.sms.forwarder.database.dao.SenderDao senderDao = null;
    private com.idormy.sms.forwarder.database.repository.Listener listener;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.Long> count = null;
    
    public SenderRepository(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.dao.SenderDao senderDao) {
        super();
    }
    
    @androidx.annotation.WorkerThread
    public final void insert(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Sender sender) {
    }
    
    @androidx.annotation.WorkerThread
    public final void delete(long id) {
    }
    
    public final void deleteAll() {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Sender sender) {
    }
    
    public final void updateStatusByIds(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> ids, int status) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Single<com.idormy.sms.forwarder.database.entity.Sender> get(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.entity.Sender getOne(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.idormy.sms.forwarder.database.entity.Sender> getByIds(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> ids, @org.jetbrains.annotations.NotNull
    java.lang.String instr) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.idormy.sms.forwarder.database.entity.Sender> getAllNonCache() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Single<java.util.List<com.idormy.sms.forwarder.database.entity.Sender>> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Long> getCount() {
        return null;
    }
}