package com.idormy.sms.forwarder.entity.setting;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\u0006\u0010 \u001a\u00020!J\t\u0010\"\u001a\u00020!H\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011\u00a8\u0006$"}, d2 = {"Lcom/idormy/sms/forwarder/entity/setting/WeworkRobotSetting;", "Ljava/io/Serializable;", "webHook", "", "msgType", "atAll", "", "atUserIds", "atMobiles", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getAtAll", "()Z", "setAtAll", "(Z)V", "getAtMobiles", "()Ljava/lang/String;", "setAtMobiles", "(Ljava/lang/String;)V", "getAtUserIds", "setAtUserIds", "getMsgType", "getWebHook", "setWebHook", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "getMsgTypeCheckId", "", "hashCode", "toString", "app_debug"})
public final class WeworkRobotSetting implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    private java.lang.String webHook;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String msgType = null;
    private boolean atAll;
    @org.jetbrains.annotations.NotNull
    private java.lang.String atUserIds;
    @org.jetbrains.annotations.NotNull
    private java.lang.String atMobiles;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.entity.setting.WeworkRobotSetting copy(@org.jetbrains.annotations.NotNull
    java.lang.String webHook, @org.jetbrains.annotations.NotNull
    java.lang.String msgType, boolean atAll, @org.jetbrains.annotations.NotNull
    java.lang.String atUserIds, @org.jetbrains.annotations.NotNull
    java.lang.String atMobiles) {
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
    
    public WeworkRobotSetting() {
        super();
    }
    
    public WeworkRobotSetting(@org.jetbrains.annotations.NotNull
    java.lang.String webHook, @org.jetbrains.annotations.NotNull
    java.lang.String msgType, boolean atAll, @org.jetbrains.annotations.NotNull
    java.lang.String atUserIds, @org.jetbrains.annotations.NotNull
    java.lang.String atMobiles) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWebHook() {
        return null;
    }
    
    public final void setWebHook(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMsgType() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getAtAll() {
        return false;
    }
    
    public final void setAtAll(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAtUserIds() {
        return null;
    }
    
    public final void setAtUserIds(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAtMobiles() {
        return null;
    }
    
    public final void setAtMobiles(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getMsgTypeCheckId() {
        return 0;
    }
}