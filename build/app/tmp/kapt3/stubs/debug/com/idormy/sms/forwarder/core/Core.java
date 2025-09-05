package com.idormy.sms.forwarder.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010(\u001a\u00020)H\u0016J\u000e\u0010*\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\u000e\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020$8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\u000e\u001a\u0004\b%\u0010&\u00a8\u0006,"}, d2 = {"Lcom/idormy/sms/forwarder/core/Core;", "Landroidx/work/Configuration$Provider;", "()V", "app", "Landroid/app/Application;", "getApp", "()Landroid/app/Application;", "setApp", "(Landroid/app/Application;)V", "frpc", "Lcom/idormy/sms/forwarder/database/repository/FrpcRepository;", "getFrpc", "()Lcom/idormy/sms/forwarder/database/repository/FrpcRepository;", "frpc$delegate", "Lkotlin/Lazy;", "logs", "Lcom/idormy/sms/forwarder/database/repository/LogsRepository;", "getLogs", "()Lcom/idormy/sms/forwarder/database/repository/LogsRepository;", "logs$delegate", "msg", "Lcom/idormy/sms/forwarder/database/repository/MsgRepository;", "getMsg", "()Lcom/idormy/sms/forwarder/database/repository/MsgRepository;", "msg$delegate", "rule", "Lcom/idormy/sms/forwarder/database/repository/RuleRepository;", "getRule", "()Lcom/idormy/sms/forwarder/database/repository/RuleRepository;", "rule$delegate", "sender", "Lcom/idormy/sms/forwarder/database/repository/SenderRepository;", "getSender", "()Lcom/idormy/sms/forwarder/database/repository/SenderRepository;", "sender$delegate", "task", "Lcom/idormy/sms/forwarder/database/repository/TaskRepository;", "getTask", "()Lcom/idormy/sms/forwarder/database/repository/TaskRepository;", "task$delegate", "getWorkManagerConfiguration", "Landroidx/work/Configuration;", "init", "", "app_debug"})
public final class Core implements androidx.work.Configuration.Provider {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.core.Core INSTANCE = null;
    public static android.app.Application app;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy frpc$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy msg$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy logs$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy rule$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy sender$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy task$delegate = null;
    
    private Core() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.app.Application getApp() {
        return null;
    }
    
    public final void setApp(@org.jetbrains.annotations.NotNull
    android.app.Application p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.repository.FrpcRepository getFrpc() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.repository.MsgRepository getMsg() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.repository.LogsRepository getLogs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.repository.RuleRepository getRule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.repository.SenderRepository getSender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.repository.TaskRepository getTask() {
        return null;
    }
    
    public final void init(@org.jetbrains.annotations.NotNull
    android.app.Application app) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.work.Configuration getWorkManagerConfiguration() {
        return null;
    }
}