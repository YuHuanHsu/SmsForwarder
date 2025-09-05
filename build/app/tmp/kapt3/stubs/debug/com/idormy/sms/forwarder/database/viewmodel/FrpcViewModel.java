package com.idormy.sms.forwarder.database.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u001e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/idormy/sms/forwarder/database/viewmodel/FrpcViewModel;", "Landroidx/lifecycle/ViewModel;", "dao", "Lcom/idormy/sms/forwarder/database/dao/FrpcDao;", "(Lcom/idormy/sms/forwarder/database/dao/FrpcDao;)V", "allFrpc", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/idormy/sms/forwarder/database/entity/Frpc;", "getAllFrpc", "()Lkotlinx/coroutines/flow/Flow;", "delete", "", "frpc", "insert", "name", "", "config", "autorun", "", "update", "app_debug"})
public final class FrpcViewModel extends androidx.lifecycle.ViewModel {
    private final com.idormy.sms.forwarder.database.dao.FrpcDao dao = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.idormy.sms.forwarder.database.entity.Frpc>> allFrpc = null;
    
    public FrpcViewModel(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.dao.FrpcDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.idormy.sms.forwarder.database.entity.Frpc>> getAllFrpc() {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String config, int autorun) {
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Frpc frpc) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Frpc frpc) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.Frpc frpc) {
    }
}