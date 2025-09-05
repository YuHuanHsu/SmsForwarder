package com.idormy.sms.forwarder.database.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\b\u0010\b\u001a\u00020\u0003H\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\nH\'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\'J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\'J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u0016H\'J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0019"}, d2 = {"Lcom/idormy/sms/forwarder/database/dao/FrpcDao;", "", "delete", "", "frpc", "Lcom/idormy/sms/forwarder/database/entity/Frpc;", "uid", "", "deleteAll", "get", "Lio/reactivex/Single;", "getAll", "", "getAllRaw", "query", "Landroidx/sqlite/db/SupportSQLiteQuery;", "getAutorun", "getByUids", "uids", "getOne", "insert", "pagingSource", "Landroidx/paging/PagingSource;", "", "update", "app_debug"})
public abstract interface FrpcDao {
    
    @androidx.room.Insert
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Frpc frpc);
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Frpc frpc);
    
    @androidx.room.Query(value = "DELETE FROM Frpc where uid=:uid")
    public abstract void delete(@org.jetbrains.annotations.NotNull
    java.lang.String uid);
    
    @androidx.room.Query(value = "DELETE FROM Frpc")
    public abstract void deleteAll();
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Frpc frpc);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Frpc where uid=:uid")
    public abstract io.reactivex.Single<com.idormy.sms.forwarder.database.entity.Frpc> get(@org.jetbrains.annotations.NotNull
    java.lang.String uid);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Frpc where uid=:uid")
    public abstract com.idormy.sms.forwarder.database.entity.Frpc getOne(@org.jetbrains.annotations.NotNull
    java.lang.String uid);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Frpc where autorun=1")
    public abstract java.util.List<com.idormy.sms.forwarder.database.entity.Frpc> getAutorun();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Frpc WHERE uid IN (:uids)")
    public abstract java.util.List<com.idormy.sms.forwarder.database.entity.Frpc> getByUids(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> uids);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Frpc ORDER BY time DESC")
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.idormy.sms.forwarder.database.entity.Frpc> pagingSource();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Frpc ORDER BY time DESC")
    public abstract io.reactivex.Single<java.util.List<com.idormy.sms.forwarder.database.entity.Frpc>> getAll();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.RawQuery(observedEntities = {com.idormy.sms.forwarder.database.entity.Frpc.class})
    @androidx.room.Transaction
    public abstract java.util.List<com.idormy.sms.forwarder.database.entity.Frpc> getAllRaw(@org.jetbrains.annotations.NotNull
    androidx.sqlite.db.SupportSQLiteQuery query);
}