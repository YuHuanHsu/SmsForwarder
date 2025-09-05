package com.idormy.sms.forwarder.database.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0005H\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\f0\bH\'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\tH\'J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0018H\'J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0018H\'J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\tH\'J(\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0012H\'J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0012H\'J\u001e\u0010!\u001a\u00020\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u001f\u001a\u00020\u0012H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lcom/idormy/sms/forwarder/database/dao/TaskDao;", "", "delete", "", "taskId", "", "deleteAll", "get", "Lio/reactivex/Single;", "Lcom/idormy/sms/forwarder/database/entity/Task;", "id", "getAll", "", "getAllRaw", "query", "Landroidx/sqlite/db/SupportSQLiteQuery;", "getByType", "taskType", "", "getOne", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "task", "pagingSourceFixed", "Landroidx/paging/PagingSource;", "pagingSourceMine", "update", "updateExecTime", "lastExecTime", "Ljava/util/Date;", "nextExecTime", "status", "updateStatus", "updateStatusByIds", "ids", "app_debug"})
public abstract interface TaskDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract long insert(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Task task);
    
    @androidx.room.Query(value = "DELETE FROM Task WHERE id = :taskId")
    public abstract void delete(long taskId);
    
    @androidx.room.Query(value = "DELETE FROM Task")
    public abstract void deleteAll();
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Task task);
    
    @androidx.room.Query(value = "UPDATE Task SET last_exec_time = :lastExecTime, next_exec_time = :nextExecTime, status = :status WHERE id = :taskId")
    public abstract void updateExecTime(long taskId, @org.jetbrains.annotations.NotNull
    java.util.Date lastExecTime, @org.jetbrains.annotations.NotNull
    java.util.Date nextExecTime, int status);
    
    @androidx.room.Query(value = "UPDATE Task SET status = :status WHERE id = :id")
    public abstract void updateStatus(long id, int status);
    
    @androidx.room.Query(value = "UPDATE Task SET status=:status WHERE id IN (:ids)")
    public abstract void updateStatusByIds(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> ids, int status);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Task where id=:id")
    public abstract io.reactivex.Single<com.idormy.sms.forwarder.database.entity.Task> get(long id);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM Task where id=:id")
    public abstract java.lang.Object getOne(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.idormy.sms.forwarder.database.entity.Task> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Task where type < 1000 ORDER BY id DESC")
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.idormy.sms.forwarder.database.entity.Task> pagingSourceFixed();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Task where type >= 1000 ORDER BY id DESC")
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.idormy.sms.forwarder.database.entity.Task> pagingSourceMine();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Task ORDER BY id DESC")
    public abstract io.reactivex.Single<java.util.List<com.idormy.sms.forwarder.database.entity.Task>> getAll();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.RawQuery(observedEntities = {com.idormy.sms.forwarder.database.entity.Task.class})
    @androidx.room.Transaction
    public abstract java.util.List<com.idormy.sms.forwarder.database.entity.Task> getAllRaw(@org.jetbrains.annotations.NotNull
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Task WHERE status = 1 AND type = :taskType")
    public abstract java.util.List<com.idormy.sms.forwarder.database.entity.Task> getByType(int taskType);
}