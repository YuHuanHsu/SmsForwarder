package com.idormy.sms.forwarder.entity.condition;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB7\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J;\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u00d6\u0003J\u0006\u0010\'\u001a\u00020\u0003J\u0006\u0010(\u001a\u00020\u0003J\u0006\u0010)\u001a\u00020\u0003J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001J\t\u0010+\u001a\u00020\u0007H\u00d6\u0001R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001a\u00a8\u0006,"}, d2 = {"Lcom/idormy/sms/forwarder/entity/condition/BluetoothSetting;", "Ljava/io/Serializable;", "actionCheckId", "", "stateCheckId", "resultCheckId", "deviceAddress", "", "(IIILjava/lang/String;)V", "description", "action", "state", "result", "device", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getDevice", "setDevice", "getResult", "()I", "setResult", "(I)V", "getState", "setState", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "getActionCheckId", "getResultCheckId", "getStateCheckId", "hashCode", "toString", "app_debug"})
public final class BluetoothSetting implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull
    private java.lang.String action;
    private int state;
    private int result;
    @org.jetbrains.annotations.NotNull
    private java.lang.String device;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.entity.condition.BluetoothSetting copy(@org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String action, int state, int result, @org.jetbrains.annotations.NotNull
    java.lang.String device) {
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
    
    public BluetoothSetting() {
        super();
    }
    
    public BluetoothSetting(@org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String action, int state, int result, @org.jetbrains.annotations.NotNull
    java.lang.String device) {
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
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAction() {
        return null;
    }
    
    public final void setAction(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getState() {
        return 0;
    }
    
    public final void setState(int p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getResult() {
        return 0;
    }
    
    public final void setResult(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDevice() {
        return null;
    }
    
    public final void setDevice(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public BluetoothSetting(int actionCheckId, int stateCheckId, int resultCheckId, @org.jetbrains.annotations.NotNull
    java.lang.String deviceAddress) {
        super();
    }
    
    public final int getActionCheckId() {
        return 0;
    }
    
    public final int getStateCheckId() {
        return 0;
    }
    
    public final int getResultCheckId() {
        return 0;
    }
}