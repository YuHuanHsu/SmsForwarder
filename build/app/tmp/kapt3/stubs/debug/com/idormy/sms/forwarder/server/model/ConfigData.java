package com.idormy.sms.forwarder.server.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u00a7\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u00a2\u0006\u0002\u0010\u0016J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\rH\u00c6\u0003J\t\u0010?\u001a\u00020\rH\u00c6\u0003J\t\u0010@\u001a\u00020\rH\u00c6\u0003J\u0015\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u00c6\u0003J\t\u0010B\u001a\u00020\u0012H\u00c6\u0003J\t\u0010C\u001a\u00020\rH\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\t\u0010I\u001a\u00020\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\u00ab\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\rH\u00c6\u0001J\u0013\u0010M\u001a\u00020\u00032\b\u0010N\u001a\u0004\u0018\u00010OH\u00d6\u0003J\t\u0010P\u001a\u00020\u0012H\u00d6\u0001J\t\u0010Q\u001a\u00020\rH\u00d6\u0001R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R\u001e\u0010\u000f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R*\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u0010\u0014\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010\u0015\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010,\"\u0004\b<\u0010.\u00a8\u0006R"}, d2 = {"Lcom/idormy/sms/forwarder/server/model/ConfigData;", "Ljava/io/Serializable;", "enableApiClone", "", "enableApiSmsSend", "enableApiSmsQuery", "enableApiCallQuery", "enableApiContactQuery", "enableApiContactAdd", "enableApiBatteryQuery", "enableApiWol", "enableApiLocation", "extraDeviceMark", "", "extraSim1", "extraSim2", "simInfoList", "", "", "Lcom/idormy/sms/forwarder/entity/SimInfo;", "versionCode", "versionName", "(ZZZZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/String;)V", "getEnableApiBatteryQuery", "()Z", "setEnableApiBatteryQuery", "(Z)V", "getEnableApiCallQuery", "setEnableApiCallQuery", "getEnableApiClone", "setEnableApiClone", "getEnableApiContactAdd", "setEnableApiContactAdd", "getEnableApiContactQuery", "setEnableApiContactQuery", "getEnableApiLocation", "setEnableApiLocation", "getEnableApiSmsQuery", "setEnableApiSmsQuery", "getEnableApiSmsSend", "setEnableApiSmsSend", "getEnableApiWol", "setEnableApiWol", "getExtraDeviceMark", "()Ljava/lang/String;", "setExtraDeviceMark", "(Ljava/lang/String;)V", "getExtraSim1", "setExtraSim1", "getExtraSim2", "setExtraSim2", "getSimInfoList", "()Ljava/util/Map;", "setSimInfoList", "(Ljava/util/Map;)V", "getVersionCode", "()I", "setVersionCode", "(I)V", "getVersionName", "setVersionName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_debug"})
public final class ConfigData implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "enable_api_clone")
    private boolean enableApiClone;
    @com.google.gson.annotations.SerializedName(value = "enable_api_sms_send")
    private boolean enableApiSmsSend;
    @com.google.gson.annotations.SerializedName(value = "enable_api_sms_query")
    private boolean enableApiSmsQuery;
    @com.google.gson.annotations.SerializedName(value = "enable_api_call_query")
    private boolean enableApiCallQuery;
    @com.google.gson.annotations.SerializedName(value = "enable_api_contact_query")
    private boolean enableApiContactQuery;
    @com.google.gson.annotations.SerializedName(value = "enable_api_contact_add")
    private boolean enableApiContactAdd;
    @com.google.gson.annotations.SerializedName(value = "enable_api_battery_query")
    private boolean enableApiBatteryQuery;
    @com.google.gson.annotations.SerializedName(value = "enable_api_wol")
    private boolean enableApiWol;
    @com.google.gson.annotations.SerializedName(value = "enable_api_location")
    private boolean enableApiLocation;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "extra_device_mark")
    private java.lang.String extraDeviceMark;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "extra_sim1")
    private java.lang.String extraSim1;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "extra_sim2")
    private java.lang.String extraSim2;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "sim_info_list")
    private java.util.Map<java.lang.Integer, com.idormy.sms.forwarder.entity.SimInfo> simInfoList;
    @com.google.gson.annotations.SerializedName(value = "version_code")
    private int versionCode;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "version_name")
    private java.lang.String versionName;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.server.model.ConfigData copy(boolean enableApiClone, boolean enableApiSmsSend, boolean enableApiSmsQuery, boolean enableApiCallQuery, boolean enableApiContactQuery, boolean enableApiContactAdd, boolean enableApiBatteryQuery, boolean enableApiWol, boolean enableApiLocation, @org.jetbrains.annotations.NotNull
    java.lang.String extraDeviceMark, @org.jetbrains.annotations.NotNull
    java.lang.String extraSim1, @org.jetbrains.annotations.NotNull
    java.lang.String extraSim2, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.Integer, com.idormy.sms.forwarder.entity.SimInfo> simInfoList, int versionCode, @org.jetbrains.annotations.NotNull
    java.lang.String versionName) {
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
    
    public ConfigData() {
        super();
    }
    
    public ConfigData(boolean enableApiClone, boolean enableApiSmsSend, boolean enableApiSmsQuery, boolean enableApiCallQuery, boolean enableApiContactQuery, boolean enableApiContactAdd, boolean enableApiBatteryQuery, boolean enableApiWol, boolean enableApiLocation, @org.jetbrains.annotations.NotNull
    java.lang.String extraDeviceMark, @org.jetbrains.annotations.NotNull
    java.lang.String extraSim1, @org.jetbrains.annotations.NotNull
    java.lang.String extraSim2, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.Integer, com.idormy.sms.forwarder.entity.SimInfo> simInfoList, int versionCode, @org.jetbrains.annotations.NotNull
    java.lang.String versionName) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getEnableApiClone() {
        return false;
    }
    
    public final void setEnableApiClone(boolean p0) {
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getEnableApiSmsSend() {
        return false;
    }
    
    public final void setEnableApiSmsSend(boolean p0) {
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getEnableApiSmsQuery() {
        return false;
    }
    
    public final void setEnableApiSmsQuery(boolean p0) {
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getEnableApiCallQuery() {
        return false;
    }
    
    public final void setEnableApiCallQuery(boolean p0) {
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getEnableApiContactQuery() {
        return false;
    }
    
    public final void setEnableApiContactQuery(boolean p0) {
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean getEnableApiContactAdd() {
        return false;
    }
    
    public final void setEnableApiContactAdd(boolean p0) {
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getEnableApiBatteryQuery() {
        return false;
    }
    
    public final void setEnableApiBatteryQuery(boolean p0) {
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean getEnableApiWol() {
        return false;
    }
    
    public final void setEnableApiWol(boolean p0) {
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean getEnableApiLocation() {
        return false;
    }
    
    public final void setEnableApiLocation(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getExtraDeviceMark() {
        return null;
    }
    
    public final void setExtraDeviceMark(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getExtraSim1() {
        return null;
    }
    
    public final void setExtraSim1(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getExtraSim2() {
        return null;
    }
    
    public final void setExtraSim2(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.Integer, com.idormy.sms.forwarder.entity.SimInfo> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.Integer, com.idormy.sms.forwarder.entity.SimInfo> getSimInfoList() {
        return null;
    }
    
    public final void setSimInfoList(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.Integer, com.idormy.sms.forwarder.entity.SimInfo> p0) {
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int getVersionCode() {
        return 0;
    }
    
    public final void setVersionCode(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVersionName() {
        return null;
    }
    
    public final void setVersionName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
}