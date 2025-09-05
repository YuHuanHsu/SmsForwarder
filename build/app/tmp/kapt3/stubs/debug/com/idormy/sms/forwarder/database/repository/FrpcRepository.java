package com.idormy.sms.forwarder.database.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0006\u0010\t\u001a\u00020\u0006J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0\u000bJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000eJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000eJ\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u0013\u001a\u00020\bJ\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\fH\u0007J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/idormy/sms/forwarder/database/repository/FrpcRepository;", "", "frpcDao", "Lcom/idormy/sms/forwarder/database/dao/FrpcDao;", "(Lcom/idormy/sms/forwarder/database/dao/FrpcDao;)V", "delete", "", "uid", "", "deleteAll", "get", "Lio/reactivex/Single;", "Lcom/idormy/sms/forwarder/database/entity/Frpc;", "getAll", "", "getAllNonCache", "getAutorun", "getByUids", "uids", "instr", "insert", "frpc", "update", "app_debug"})
public final class FrpcRepository {
    private final com.idormy.sms.forwarder.database.dao.FrpcDao frpcDao = null;
    
    public FrpcRepository(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.dao.FrpcDao frpcDao) {
        super();
    }
    
    @androidx.annotation.WorkerThread
    public final void insert(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Frpc frpc) {
    }
    
    @androidx.annotation.WorkerThread
    public final void delete(@org.jetbrains.annotations.NotNull
    java.lang.String uid) {
    }
    
    public final void deleteAll() {
    }
    
    @androidx.annotation.WorkerThread
    public final void update(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Frpc frpc) {
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.WorkerThread
    public final io.reactivex.Single<com.idormy.sms.forwarder.database.entity.Frpc> get(@org.jetbrains.annotations.NotNull
    java.lang.String uid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.idormy.sms.forwarder.database.entity.Frpc> getAllNonCache() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Single<java.util.List<com.idormy.sms.forwarder.database.entity.Frpc>> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.idormy.sms.forwarder.database.entity.Frpc> getAutorun() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.idormy.sms.forwarder.database.entity.Frpc> getByUids(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> uids, @org.jetbrains.annotations.NotNull
    java.lang.String instr) {
        return null;
    }
}