package com.idormy.sms.forwarder.database.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\'J\b\u0010\u000e\u001a\u00020\u000bH\'J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\'J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\rH\'J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\f\u001a\u00020\rH\'J\u0019\u0010\u0014\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u0010H\'J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/idormy/sms/forwarder/database/dao/MsgDao;", "", "count", "Lio/reactivex/Single;", "", "type", "", "delete", "Lio/reactivex/Completable;", "msg", "Lcom/idormy/sms/forwarder/database/entity/Msg;", "", "id", "", "deleteAll", "sql", "Landroidx/sqlite/db/SupportSQLiteQuery;", "deleteTimeAgo", "time", "get", "insert", "(Lcom/idormy/sms/forwarder/database/entity/Msg;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pagingSource", "Landroidx/paging/PagingSource;", "Lcom/idormy/sms/forwarder/database/entity/MsgAndLogs;", "query", "update", "app_debug"})
public abstract interface MsgDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 5)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Msg msg, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Delete
    public abstract io.reactivex.Completable delete(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Msg msg);
    
    @androidx.room.Query(value = "DELETE FROM Msg where id=:id")
    public abstract void delete(long id);
    
    @androidx.room.RawQuery
    public abstract int deleteAll(@org.jetbrains.annotations.NotNull
    androidx.sqlite.db.SupportSQLiteQuery sql);
    
    @androidx.room.Query(value = "DELETE FROM Msg")
    public abstract void deleteAll();
    
    @androidx.room.Query(value = "DELETE FROM Msg where time<:time")
    public abstract void deleteTimeAgo(long time);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Update
    public abstract io.reactivex.Completable update(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Msg msg);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Msg where id=:id")
    public abstract io.reactivex.Single<com.idormy.sms.forwarder.database.entity.Msg> get(long id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT count(*) FROM Msg where type=:type")
    public abstract io.reactivex.Single<java.lang.Integer> count(@org.jetbrains.annotations.NotNull
    java.lang.String type);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Msg WHERE type = :type ORDER BY id DESC")
    @androidx.room.Transaction
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.idormy.sms.forwarder.database.entity.MsgAndLogs> pagingSource(@org.jetbrains.annotations.NotNull
    java.lang.String type);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.RawQuery(observedEntities = {com.idormy.sms.forwarder.database.entity.MsgAndLogs.class})
    @androidx.room.Transaction
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.idormy.sms.forwarder.database.entity.MsgAndLogs> pagingSource(@org.jetbrains.annotations.NotNull
    androidx.sqlite.db.SupportSQLiteQuery query);
}