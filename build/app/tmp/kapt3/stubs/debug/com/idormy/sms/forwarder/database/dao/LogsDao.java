package com.idormy.sms.forwarder.database.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\fH\'J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\r\u001a\u00020\u000eH\'J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\'J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000eH\'J\u0019\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u001c\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\'J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0006H\'J \u0010\u001e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0006H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/idormy/sms/forwarder/database/dao/LogsDao;", "", "count", "Lio/reactivex/Single;", "", "type", "", "forwardStatus", "delete", "Lio/reactivex/Completable;", "logs", "Lcom/idormy/sms/forwarder/database/entity/Logs;", "", "id", "", "deleteAll", "get", "getLogsRaw", "", "query", "Landroidx/sqlite/db/SupportSQLiteQuery;", "getOne", "Lcom/idormy/sms/forwarder/database/entity/LogsAndRuleAndSender;", "insert", "(Lcom/idormy/sms/forwarder/database/entity/Logs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pagingSource", "Landroidx/paging/PagingSource;", "update", "updateResponse", "response", "updateStatus", "status", "app_debug"})
public abstract interface LogsDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 5)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Logs logs, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Delete
    public abstract io.reactivex.Completable delete(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Logs logs);
    
    @androidx.room.Query(value = "DELETE FROM Logs where id=:id")
    public abstract void delete(long id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "DELETE FROM Logs where type=:type")
    public abstract io.reactivex.Completable deleteAll(@org.jetbrains.annotations.NotNull
    java.lang.String type);
    
    @androidx.room.Query(value = "DELETE FROM Logs")
    public abstract void deleteAll();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Update
    public abstract io.reactivex.Completable update(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Logs logs);
    
    @androidx.room.Query(value = "UPDATE Logs SET forward_status=:status,forward_response=CASE WHEN (trim(forward_response) = \'\' or trim(forward_response) = \'ok\') THEN :response ELSE forward_response || \'\n--------------------\n\' || :response END where id=:id")
    public abstract int updateStatus(long id, int status, @org.jetbrains.annotations.NotNull
    java.lang.String response);
    
    @androidx.room.Query(value = "UPDATE Logs SET forward_response=CASE WHEN (trim(forward_response) = \'\' or trim(forward_response) = \'ok\') THEN :response ELSE forward_response || \'\n\' || :response END where id=:id")
    public abstract int updateResponse(long id, @org.jetbrains.annotations.NotNull
    java.lang.String response);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Logs where id=:id")
    public abstract io.reactivex.Single<com.idormy.sms.forwarder.database.entity.Logs> get(long id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Logs where id=:id")
    @androidx.room.Transaction
    public abstract com.idormy.sms.forwarder.database.entity.LogsAndRuleAndSender getOne(long id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT count(*) FROM Logs where type=:type and forward_status=:forwardStatus")
    public abstract io.reactivex.Single<java.lang.Integer> count(@org.jetbrains.annotations.NotNull
    java.lang.String type, int forwardStatus);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Logs WHERE type = :type ORDER BY id DESC")
    @androidx.room.Transaction
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.idormy.sms.forwarder.database.entity.LogsAndRuleAndSender> pagingSource(@org.jetbrains.annotations.NotNull
    java.lang.String type);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.RawQuery(observedEntities = {com.idormy.sms.forwarder.database.entity.Logs.class})
    @androidx.room.Transaction
    public abstract java.util.List<com.idormy.sms.forwarder.database.entity.Logs> getLogsRaw(@org.jetbrains.annotations.NotNull
    androidx.sqlite.db.SupportSQLiteQuery query);
}