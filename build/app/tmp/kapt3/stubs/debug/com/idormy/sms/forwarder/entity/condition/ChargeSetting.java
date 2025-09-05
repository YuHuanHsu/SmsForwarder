package com.idormy.sms.forwarder.entity.condition;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005B#\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J.\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0007J\u0006\u0010#\u001a\u00020\u0003J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0006\u0010%\u001a\u00020\u0003J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0002J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001J\t\u0010(\u001a\u00020\u0007H\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012\u00a8\u0006)"}, d2 = {"Lcom/idormy/sms/forwarder/entity/condition/ChargeSetting;", "Ljava/io/Serializable;", "statusCheckId", "", "pluggedCheckId", "(II)V", "description", "", "status", "plugged", "(Ljava/lang/String;II)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getPlugged", "()I", "setPlugged", "(I)V", "getStatus", "setStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "", "getMsg", "statusNew", "statusOld", "pluggedNew", "pluggedOld", "batteryInfo", "getPluggedCheckId", "getPluggedStr", "getStatusCheckId", "getStatusStr", "hashCode", "toString", "app_debug"})
public final class ChargeSetting implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    private java.lang.String description;
    private int status;
    private int plugged;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.entity.condition.ChargeSetting copy(@org.jetbrains.annotations.NotNull
    java.lang.String description, int status, int plugged) {
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
    
    public ChargeSetting() {
        super();
    }
    
    public ChargeSetting(@org.jetbrains.annotations.NotNull
    java.lang.String description, int status, int plugged) {
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
    
    public final int getPlugged() {
        return 0;
    }
    
    public final void setPlugged(int p0) {
    }
    
    public ChargeSetting(int statusCheckId, int pluggedCheckId) {
        super();
    }
    
    private final java.lang.String getStatusStr(int status) {
        return null;
    }
    
    public final int getStatusCheckId() {
        return 0;
    }
    
    private final java.lang.String getPluggedStr(int plugged) {
        return null;
    }
    
    public final int getPluggedCheckId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMsg(int statusNew, int statusOld, int pluggedNew, int pluggedOld, @org.jetbrains.annotations.NotNull
    java.lang.String batteryInfo) {
        return null;
    }
}