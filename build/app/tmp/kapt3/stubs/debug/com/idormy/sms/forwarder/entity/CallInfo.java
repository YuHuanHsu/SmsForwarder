package com.idormy.sms.forwarder.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u00a2\u0006\u0002\u0010\rJ\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0006H\u00c6\u0003J\t\u0010+\u001a\u00020\bH\u00c6\u0003J\t\u0010,\u001a\u00020\bH\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\bH\u00c6\u0003J\t\u0010/\u001a\u00020\bH\u00c6\u0003JY\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bH\u00c6\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u00d6\u0003J\t\u00105\u001a\u00020\bH\u00d6\u0001J\b\u00106\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001e\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u0011\u0010\u001e\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0013R\u001e\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u0011\u0010$\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u0013R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b\'\u0010\u0019\u00a8\u00067"}, d2 = {"Lcom/idormy/sms/forwarder/entity/CallInfo;", "Ljava/io/Serializable;", "name", "", "number", "dateLong", "", "duration", "", "type", "viaNumber", "simId", "subId", "(Ljava/lang/String;Ljava/lang/String;JIILjava/lang/String;II)V", "getDateLong", "()J", "setDateLong", "(J)V", "getDuration", "()I", "setDuration", "(I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getNumber", "setNumber", "getSimId", "setSimId", "simImageId", "getSimImageId", "getSubId", "setSubId", "getType", "setType", "typeImageId", "getTypeImageId", "getViaNumber", "setViaNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class CallInfo implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull
    private java.lang.String number;
    private long dateLong;
    private int duration;
    private int type;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "via_number")
    private java.lang.String viaNumber;
    @com.google.gson.annotations.SerializedName(value = "sim_id")
    private int simId;
    @com.google.gson.annotations.SerializedName(value = "sub_id")
    private int subId;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.entity.CallInfo copy(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String number, long dateLong, int duration, int type, @org.jetbrains.annotations.NotNull
    java.lang.String viaNumber, int simId, int subId) {
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
    
    public CallInfo() {
        super();
    }
    
    public CallInfo(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String number, long dateLong, int duration, int type, @org.jetbrains.annotations.NotNull
    java.lang.String viaNumber, int simId, int subId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNumber() {
        return null;
    }
    
    public final void setNumber(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getDateLong() {
        return 0L;
    }
    
    public final void setDateLong(long p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getDuration() {
        return 0;
    }
    
    public final void setDuration(int p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getType() {
        return 0;
    }
    
    public final void setType(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getViaNumber() {
        return null;
    }
    
    public final void setViaNumber(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getSimId() {
        return 0;
    }
    
    public final void setSimId(int p0) {
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getSubId() {
        return 0;
    }
    
    public final void setSubId(int p0) {
    }
    
    public final int getTypeImageId() {
        return 0;
    }
    
    public final int getSimImageId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
}