package com.idormy.sms.forwarder.entity.condition;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\tH\u00c6\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J&\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0003J\u0006\u0010)\u001a\u00020\u0005J\t\u0010*\u001a\u00020\u0005H\u00d6\u0001J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016\u00a8\u0006,"}, d2 = {"Lcom/idormy/sms/forwarder/entity/condition/BatterySetting;", "Ljava/io/Serializable;", "description", "", "status", "", "levelMin", "levelMax", "keepReminding", "", "(Ljava/lang/String;IIIZ)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getKeepReminding", "()Z", "setKeepReminding", "(Z)V", "getLevelMax", "()I", "setLevelMax", "(I)V", "getLevelMin", "setLevelMin", "getStatus", "setStatus", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "getMsg", "statusNew", "levelNew", "levelOld", "batteryInfo", "getStatusCheckId", "hashCode", "toString", "app_debug"})
public final class BatterySetting implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    private java.lang.String description;
    private int status;
    private int levelMin;
    private int levelMax;
    private boolean keepReminding;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.entity.condition.BatterySetting copy(@org.jetbrains.annotations.NotNull
    java.lang.String description, int status, int levelMin, int levelMax, boolean keepReminding) {
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
    
    public BatterySetting() {
        super();
    }
    
    public BatterySetting(@org.jetbrains.annotations.NotNull
    java.lang.String description, int status, int levelMin, int levelMax, boolean keepReminding) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getStatus() {
        return 0;
    }
    
    public final void setStatus(int p0) {
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getLevelMin() {
        return 0;
    }
    
    public final void setLevelMin(int p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getLevelMax() {
        return 0;
    }
    
    public final void setLevelMax(int p0) {
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getKeepReminding() {
        return false;
    }
    
    public final void setKeepReminding(boolean p0) {
    }
    
    public final int getStatusCheckId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMsg(int statusNew, int levelNew, int levelOld, @org.jetbrains.annotations.NotNull
    java.lang.String batteryInfo) {
        return null;
    }
}