package com.idormy.sms.forwarder.entity.action;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b1\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000fJ\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0006H\u00c6\u0003J\t\u0010,\u001a\u00020\u0006H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0006H\u00c6\u0003J\t\u0010/\u001a\u00020\u0006H\u00c6\u0003J\t\u00100\u001a\u00020\u0006H\u00c6\u0003J\t\u00101\u001a\u00020\u0006H\u00c6\u0003J\t\u00102\u001a\u00020\u0006H\u00c6\u0003J\t\u00103\u001a\u00020\u0006H\u00c6\u0003J\t\u00104\u001a\u00020\u0006H\u00c6\u0003Jw\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u0006H\u00c6\u0001J\u0013\u00106\u001a\u00020\u00062\b\u00107\u001a\u0004\u0018\u000108H\u00d6\u0003J\t\u00109\u001a\u00020:H\u00d6\u0001J\t\u0010;\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b\'\u0010\u0019R\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019\u00a8\u0006<"}, d2 = {"Lcom/idormy/sms/forwarder/entity/action/HttpServerSetting;", "Ljava/io/Serializable;", "description", "", "action", "enableApiClone", "", "enableApiSmsSend", "enableApiSmsQuery", "enableApiCallQuery", "enableApiContactQuery", "enableApiContactAdd", "enableApiWol", "enableApiLocation", "enableApiBatteryQuery", "(Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZ)V", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getEnableApiBatteryQuery", "()Z", "setEnableApiBatteryQuery", "(Z)V", "getEnableApiCallQuery", "setEnableApiCallQuery", "getEnableApiClone", "setEnableApiClone", "getEnableApiContactAdd", "setEnableApiContactAdd", "getEnableApiContactQuery", "setEnableApiContactQuery", "getEnableApiLocation", "setEnableApiLocation", "getEnableApiSmsQuery", "setEnableApiSmsQuery", "getEnableApiSmsSend", "setEnableApiSmsSend", "getEnableApiWol", "setEnableApiWol", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "app_debug"})
public final class HttpServerSetting implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull
    private java.lang.String action;
    private boolean enableApiClone;
    private boolean enableApiSmsSend;
    private boolean enableApiSmsQuery;
    private boolean enableApiCallQuery;
    private boolean enableApiContactQuery;
    private boolean enableApiContactAdd;
    private boolean enableApiWol;
    private boolean enableApiLocation;
    private boolean enableApiBatteryQuery;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.entity.action.HttpServerSetting copy(@org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String action, boolean enableApiClone, boolean enableApiSmsSend, boolean enableApiSmsQuery, boolean enableApiCallQuery, boolean enableApiContactQuery, boolean enableApiContactAdd, boolean enableApiWol, boolean enableApiLocation, boolean enableApiBatteryQuery) {
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
    
    public HttpServerSetting() {
        super();
    }
    
    public HttpServerSetting(@org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String action, boolean enableApiClone, boolean enableApiSmsSend, boolean enableApiSmsQuery, boolean enableApiCallQuery, boolean enableApiContactQuery, boolean enableApiContactAdd, boolean enableApiWol, boolean enableApiLocation, boolean enableApiBatteryQuery) {
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
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getEnableApiClone() {
        return false;
    }
    
    public final void setEnableApiClone(boolean p0) {
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getEnableApiSmsSend() {
        return false;
    }
    
    public final void setEnableApiSmsSend(boolean p0) {
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getEnableApiSmsQuery() {
        return false;
    }
    
    public final void setEnableApiSmsQuery(boolean p0) {
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean getEnableApiCallQuery() {
        return false;
    }
    
    public final void setEnableApiCallQuery(boolean p0) {
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getEnableApiContactQuery() {
        return false;
    }
    
    public final void setEnableApiContactQuery(boolean p0) {
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean getEnableApiContactAdd() {
        return false;
    }
    
    public final void setEnableApiContactAdd(boolean p0) {
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean getEnableApiWol() {
        return false;
    }
    
    public final void setEnableApiWol(boolean p0) {
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean getEnableApiLocation() {
        return false;
    }
    
    public final void setEnableApiLocation(boolean p0) {
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final boolean getEnableApiBatteryQuery() {
        return false;
    }
    
    public final void setEnableApiBatteryQuery(boolean p0) {
    }
}