package com.idormy.sms.forwarder.database.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0006\u0010\t\u001a\u00020\u0006J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bJ\u0019\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\fH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J \u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/idormy/sms/forwarder/database/repository/LogsRepository;", "", "logsDao", "Lcom/idormy/sms/forwarder/database/dao/LogsDao;", "(Lcom/idormy/sms/forwarder/database/dao/LogsDao;)V", "delete", "", "id", "", "deleteAll", "getIdsByTimeAndStatus", "", "Lcom/idormy/sms/forwarder/database/entity/Logs;", "hours", "", "statusList", "getOne", "Lcom/idormy/sms/forwarder/database/entity/LogsAndRuleAndSender;", "insert", "logs", "(Lcom/idormy/sms/forwarder/database/entity/Logs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateResponse", "response", "", "updateStatus", "status", "app_debug"})
public final class LogsRepository {
    private final com.idormy.sms.forwarder.database.dao.LogsDao logsDao = null;
    
    public LogsRepository(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.dao.LogsDao logsDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.WorkerThread
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Logs logs, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
    
    @androidx.annotation.WorkerThread
    public final void delete(long id) {
    }
    
    public final void deleteAll() {
    }
    
    @androidx.annotation.WorkerThread
    public final int updateStatus(long id, int status, @org.jetbrains.annotations.NotNull
    java.lang.String response) {
        return 0;
    }
    
    @androidx.annotation.WorkerThread
    public final int updateResponse(long id, @org.jetbrains.annotations.NotNull
    java.lang.String response) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.entity.LogsAndRuleAndSender getOne(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.idormy.sms.forwarder.database.entity.Logs> getIdsByTimeAndStatus(int hours, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> statusList) {
        return null;
    }
}