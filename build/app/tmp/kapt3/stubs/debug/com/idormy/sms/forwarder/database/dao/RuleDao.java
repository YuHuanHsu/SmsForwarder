package com.idormy.sms.forwarder.database.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\fH\'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\r\u001a\u00020\u000eH\'J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00120\u0003H\'J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\'J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0006H\'J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u000bH\'J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u000bH\'J\u001e\u0010\u001d\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0007\u001a\u00020\u0004H\'\u00a8\u0006\u001f"}, d2 = {"Lcom/idormy/sms/forwarder/database/dao/RuleDao;", "", "count", "Lio/reactivex/Single;", "", "type", "", "status", "delete", "Lio/reactivex/Completable;", "rule", "Lcom/idormy/sms/forwarder/database/entity/Rule;", "", "id", "", "deleteAll", "get", "getAll", "", "getAllRaw", "query", "Landroidx/sqlite/db/SupportSQLiteQuery;", "getOne", "getRuleList", "simSlot", "insert", "pagingSource", "Landroidx/paging/PagingSource;", "update", "updateStatusByIds", "ids", "app_debug"})
public abstract interface RuleDao {
    
    @androidx.room.Insert
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Rule rule);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Delete
    public abstract io.reactivex.Completable delete(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Rule rule);
    
    @androidx.room.Query(value = "DELETE FROM Rule where id=:id")
    public abstract void delete(long id);
    
    @androidx.room.Query(value = "DELETE FROM Rule")
    public abstract void deleteAll();
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Rule rule);
    
    @androidx.room.Query(value = "UPDATE Rule SET status=:status WHERE id IN (:ids)")
    public abstract void updateStatusByIds(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> ids, int status);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Rule where id=:id")
    public abstract io.reactivex.Single<com.idormy.sms.forwarder.database.entity.Rule> get(long id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Rule where id=:id")
    public abstract com.idormy.sms.forwarder.database.entity.Rule getOne(long id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT count(*) FROM Rule where type=:type and status=:status")
    public abstract io.reactivex.Single<java.lang.Integer> count(@org.jetbrains.annotations.NotNull
    java.lang.String type, int status);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Rule where type=:type ORDER BY id DESC")
    @androidx.room.Transaction
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.idormy.sms.forwarder.database.entity.Rule> pagingSource(@org.jetbrains.annotations.NotNull
    java.lang.String type);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Rule where type=:type and status=:status and (sim_slot=\'ALL\' or sim_slot=:simSlot)")
    @androidx.room.Transaction
    public abstract java.util.List<com.idormy.sms.forwarder.database.entity.Rule> getRuleList(@org.jetbrains.annotations.NotNull
    java.lang.String type, int status, @org.jetbrains.annotations.NotNull
    java.lang.String simSlot);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.RawQuery(observedEntities = {com.idormy.sms.forwarder.database.entity.Rule.class})
    @androidx.room.Transaction
    public abstract java.util.List<com.idormy.sms.forwarder.database.entity.Rule> getAllRaw(@org.jetbrains.annotations.NotNull
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Rule ORDER BY id DESC")
    public abstract io.reactivex.Single<java.util.List<com.idormy.sms.forwarder.database.entity.Rule>> getAll();
}