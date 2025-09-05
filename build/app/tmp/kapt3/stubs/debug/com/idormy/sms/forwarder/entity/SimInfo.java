package com.idormy.sms.forwarder.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003JM\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\u0006H\u00d6\u0001J\b\u0010\'\u001a\u00020\u0003H\u0016R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018\u00a8\u0006("}, d2 = {"Lcom/idormy/sms/forwarder/entity/SimInfo;", "Ljava/io/Serializable;", "mCarrierName", "", "mIccId", "mSimSlotIndex", "", "mNumber", "mCountryIso", "mSubscriptionId", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "getMCarrierName", "()Ljava/lang/String;", "setMCarrierName", "(Ljava/lang/String;)V", "getMCountryIso", "setMCountryIso", "getMIccId", "setMIccId", "getMNumber", "setMNumber", "getMSimSlotIndex", "()I", "setMSimSlotIndex", "(I)V", "getMSubscriptionId", "setMSubscriptionId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class SimInfo implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "carrier_name")
    private java.lang.String mCarrierName;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "icc_id")
    private java.lang.String mIccId;
    @com.google.gson.annotations.SerializedName(value = "sim_slot_index")
    private int mSimSlotIndex;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "number")
    private java.lang.String mNumber;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "country_iso")
    private java.lang.String mCountryIso;
    @com.google.gson.annotations.SerializedName(value = "subscription_id")
    private int mSubscriptionId;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.entity.SimInfo copy(@org.jetbrains.annotations.Nullable
    java.lang.String mCarrierName, @org.jetbrains.annotations.Nullable
    java.lang.String mIccId, int mSimSlotIndex, @org.jetbrains.annotations.Nullable
    java.lang.String mNumber, @org.jetbrains.annotations.Nullable
    java.lang.String mCountryIso, int mSubscriptionId) {
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
    
    public SimInfo() {
        super();
    }
    
    public SimInfo(@org.jetbrains.annotations.Nullable
    java.lang.String mCarrierName, @org.jetbrains.annotations.Nullable
    java.lang.String mIccId, int mSimSlotIndex, @org.jetbrains.annotations.Nullable
    java.lang.String mNumber, @org.jetbrains.annotations.Nullable
    java.lang.String mCountryIso, int mSubscriptionId) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMCarrierName() {
        return null;
    }
    
    public final void setMCarrierName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMIccId() {
        return null;
    }
    
    public final void setMIccId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getMSimSlotIndex() {
        return 0;
    }
    
    public final void setMSimSlotIndex(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMNumber() {
        return null;
    }
    
    public final void setMNumber(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMCountryIso() {
        return null;
    }
    
    public final void setMCountryIso(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getMSubscriptionId() {
        return 0;
    }
    
    public final void setMSubscriptionId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
}