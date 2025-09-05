package com.idormy.sms.forwarder.database.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/idormy/sms/forwarder/database/viewmodel/SenderViewModel;", "Landroidx/lifecycle/ViewModel;", "dao", "Lcom/idormy/sms/forwarder/database/dao/SenderDao;", "(Lcom/idormy/sms/forwarder/database/dao/SenderDao;)V", "allSenders", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/idormy/sms/forwarder/database/entity/Sender;", "getAllSenders", "()Lkotlinx/coroutines/flow/Flow;", "status", "", "delete", "", "id", "", "insertOrUpdate", "sender", "setStatus", "app_debug"})
public final class SenderViewModel extends androidx.lifecycle.ViewModel {
    private final com.idormy.sms.forwarder.database.dao.SenderDao dao = null;
    private int status = 1;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.idormy.sms.forwarder.database.entity.Sender>> allSenders = null;
    
    public SenderViewModel(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.dao.SenderDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.viewmodel.SenderViewModel setStatus(int status) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.idormy.sms.forwarder.database.entity.Sender>> getAllSenders() {
        return null;
    }
    
    public final void insertOrUpdate(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Sender sender) {
    }
    
    public final void delete(long id) {
    }
}