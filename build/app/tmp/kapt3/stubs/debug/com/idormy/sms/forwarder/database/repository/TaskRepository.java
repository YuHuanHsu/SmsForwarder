package com.idormy.sms.forwarder.database.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0006\u0010\t\u001a\u00020\u0006J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0\u000bJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000eJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\fH\u0007J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\fJ&\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012J\u001c\u0010\u001e\u001a\u00020\u00062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u001d\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/idormy/sms/forwarder/database/repository/TaskRepository;", "", "taskDao", "Lcom/idormy/sms/forwarder/database/dao/TaskDao;", "(Lcom/idormy/sms/forwarder/database/dao/TaskDao;)V", "delete", "", "id", "", "deleteAll", "get", "Lio/reactivex/Single;", "Lcom/idormy/sms/forwarder/database/entity/Task;", "getAll", "", "getAllNonCache", "getByType", "type", "", "getOne", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "task", "update", "updateExecTime", "taskId", "lastExecTime", "Ljava/util/Date;", "nextExecTime", "status", "updateStatusByIds", "ids", "app_debug"})
public final class TaskRepository {
    private final com.idormy.sms.forwarder.database.dao.TaskDao taskDao = null;
    
    public TaskRepository(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.dao.TaskDao taskDao) {
        super();
    }
    
    @androidx.annotation.WorkerThread
    public final long insert(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Task task) {
        return 0L;
    }
    
    @androidx.annotation.WorkerThread
    public final void delete(long id) {
    }
    
    public final void deleteAll() {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Task task) {
    }
    
    public final void updateExecTime(long taskId, @org.jetbrains.annotations.NotNull
    java.util.Date lastExecTime, @org.jetbrains.annotations.NotNull
    java.util.Date nextExecTime, int status) {
    }
    
    public final void updateStatusByIds(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> ids, int status) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Single<com.idormy.sms.forwarder.database.entity.Task> get(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getOne(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.idormy.sms.forwarder.database.entity.Task> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Single<java.util.List<com.idormy.sms.forwarder.database.entity.Task>> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.idormy.sms.forwarder.database.entity.Task> getAllNonCache() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.idormy.sms.forwarder.database.entity.Task> getByType(int type) {
        return null;
    }
}