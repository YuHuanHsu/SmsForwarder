package com.idormy.sms.forwarder.database.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0006\u0010\u000b\u001a\u00020\bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00100\rJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0007J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0015J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u000eH\u0007J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u000eH\u0007J\u001c\u0010\u001c\u001a\u00020\b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0016\u001a\u00020\u0017R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/idormy/sms/forwarder/database/repository/RuleRepository;", "", "ruleDao", "Lcom/idormy/sms/forwarder/database/dao/RuleDao;", "(Lcom/idormy/sms/forwarder/database/dao/RuleDao;)V", "listener", "Lcom/idormy/sms/forwarder/database/repository/Listener;", "delete", "", "id", "", "deleteAll", "get", "Lio/reactivex/Single;", "Lcom/idormy/sms/forwarder/database/entity/Rule;", "getAll", "", "getAllNonCache", "getOne", "getRuleList", "type", "", "status", "", "simSlot", "insert", "rule", "update", "updateStatusByIds", "ids", "app_debug"})
public final class RuleRepository {
    private final com.idormy.sms.forwarder.database.dao.RuleDao ruleDao = null;
    private com.idormy.sms.forwarder.database.repository.Listener listener;
    
    public RuleRepository(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.dao.RuleDao ruleDao) {
        super();
    }
    
    @androidx.annotation.WorkerThread
    public final void insert(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Rule rule) {
    }
    
    @androidx.annotation.WorkerThread
    public final void delete(long id) {
    }
    
    public final void deleteAll() {
    }
    
    @androidx.annotation.WorkerThread
    public final void update(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Rule rule) {
    }
    
    public final void updateStatusByIds(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> ids, int status) {
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.WorkerThread
    public final io.reactivex.Single<com.idormy.sms.forwarder.database.entity.Rule> get(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.WorkerThread
    public final com.idormy.sms.forwarder.database.entity.Rule getOne(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Single<java.util.List<com.idormy.sms.forwarder.database.entity.Rule>> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.idormy.sms.forwarder.database.entity.Rule> getAllNonCache() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.idormy.sms.forwarder.database.entity.Rule> getRuleList(@org.jetbrains.annotations.NotNull
    java.lang.String type, int status, @org.jetbrains.annotations.NotNull
    java.lang.String simSlot) {
        return null;
    }
}