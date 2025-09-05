package com.idormy.sms.forwarder.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0010J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bH\u00c6\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\bH\u00c6\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\bH\u00c6\u0003Jq\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\bH\u00c6\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u00d6\u0003J\t\u00101\u001a\u00020\u0003H\u00d6\u0001J\t\u00102\u001a\u00020\u0005H\u00d6\u0001R&\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R&\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR&\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001c\u00a8\u00063"}, d2 = {"Lcom/idormy/sms/forwarder/entity/CloneInfo;", "Ljava/io/Serializable;", "versionCode", "", "versionName", "", "settings", "senderList", "", "Lcom/idormy/sms/forwarder/database/entity/Sender;", "ruleList", "Lcom/idormy/sms/forwarder/database/entity/Rule;", "frpcList", "Lcom/idormy/sms/forwarder/database/entity/Frpc;", "taskList", "Lcom/idormy/sms/forwarder/database/entity/Task;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getFrpcList", "()Ljava/util/List;", "setFrpcList", "(Ljava/util/List;)V", "getRuleList", "setRuleList", "getSenderList", "setSenderList", "getSettings", "()Ljava/lang/String;", "setSettings", "(Ljava/lang/String;)V", "getTaskList", "setTaskList", "getVersionCode", "()I", "setVersionCode", "(I)V", "getVersionName", "setVersionName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class CloneInfo implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "version_code")
    private int versionCode;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "version_name")
    private java.lang.String versionName;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "settings")
    private java.lang.String settings;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "sender_list")
    private java.util.List<com.idormy.sms.forwarder.database.entity.Sender> senderList;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "rule_list")
    private java.util.List<com.idormy.sms.forwarder.database.entity.Rule> ruleList;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "frpc_list")
    private java.util.List<com.idormy.sms.forwarder.database.entity.Frpc> frpcList;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "task_list")
    private java.util.List<com.idormy.sms.forwarder.database.entity.Task> taskList;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.entity.CloneInfo copy(int versionCode, @org.jetbrains.annotations.Nullable
    java.lang.String versionName, @org.jetbrains.annotations.NotNull
    java.lang.String settings, @org.jetbrains.annotations.Nullable
    java.util.List<com.idormy.sms.forwarder.database.entity.Sender> senderList, @org.jetbrains.annotations.Nullable
    java.util.List<com.idormy.sms.forwarder.database.entity.Rule> ruleList, @org.jetbrains.annotations.Nullable
    java.util.List<com.idormy.sms.forwarder.database.entity.Frpc> frpcList, @org.jetbrains.annotations.Nullable
    java.util.List<com.idormy.sms.forwarder.database.entity.Task> taskList) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public CloneInfo() {
        super();
    }
    
    public CloneInfo(int versionCode, @org.jetbrains.annotations.Nullable
    java.lang.String versionName, @org.jetbrains.annotations.NotNull
    java.lang.String settings, @org.jetbrains.annotations.Nullable
    java.util.List<com.idormy.sms.forwarder.database.entity.Sender> senderList, @org.jetbrains.annotations.Nullable
    java.util.List<com.idormy.sms.forwarder.database.entity.Rule> ruleList, @org.jetbrains.annotations.Nullable
    java.util.List<com.idormy.sms.forwarder.database.entity.Frpc> frpcList, @org.jetbrains.annotations.Nullable
    java.util.List<com.idormy.sms.forwarder.database.entity.Task> taskList) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getVersionCode() {
        return 0;
    }
    
    public final void setVersionCode(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVersionName() {
        return null;
    }
    
    public final void setVersionName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSettings() {
        return null;
    }
    
    public final void setSettings(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.idormy.sms.forwarder.database.entity.Sender> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.idormy.sms.forwarder.database.entity.Sender> getSenderList() {
        return null;
    }
    
    public final void setSenderList(@org.jetbrains.annotations.Nullable
    java.util.List<com.idormy.sms.forwarder.database.entity.Sender> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.idormy.sms.forwarder.database.entity.Rule> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.idormy.sms.forwarder.database.entity.Rule> getRuleList() {
        return null;
    }
    
    public final void setRuleList(@org.jetbrains.annotations.Nullable
    java.util.List<com.idormy.sms.forwarder.database.entity.Rule> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.idormy.sms.forwarder.database.entity.Frpc> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.idormy.sms.forwarder.database.entity.Frpc> getFrpcList() {
        return null;
    }
    
    public final void setFrpcList(@org.jetbrains.annotations.Nullable
    java.util.List<com.idormy.sms.forwarder.database.entity.Frpc> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.idormy.sms.forwarder.database.entity.Task> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.idormy.sms.forwarder.database.entity.Task> getTaskList() {
        return null;
    }
    
    public final void setTaskList(@org.jetbrains.annotations.Nullable
    java.util.List<com.idormy.sms.forwarder.database.entity.Task> p0) {
    }
}