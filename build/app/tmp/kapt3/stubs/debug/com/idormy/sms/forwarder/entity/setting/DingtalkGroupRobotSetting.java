package com.idormy.sms.forwarder.entity.setting;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003JO\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010%\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\'H\u00d6\u0003J\u0006\u0010(\u001a\u00020)J\t\u0010*\u001a\u00020)H\u00d6\u0001J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013\u00a8\u0006,"}, d2 = {"Lcom/idormy/sms/forwarder/entity/setting/DingtalkGroupRobotSetting;", "Ljava/io/Serializable;", "token", "", "secret", "atAll", "", "atMobiles", "atDingtalkIds", "msgtype", "titleTemplate", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAtAll", "()Z", "setAtAll", "(Z)V", "getAtDingtalkIds", "()Ljava/lang/String;", "setAtDingtalkIds", "(Ljava/lang/String;)V", "getAtMobiles", "setAtMobiles", "getMsgtype", "setMsgtype", "getSecret", "setSecret", "getTitleTemplate", "getToken", "setToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "getMsgTypeCheckId", "", "hashCode", "toString", "app_debug"})
public final class DingtalkGroupRobotSetting implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    private java.lang.String token;
    @org.jetbrains.annotations.NotNull
    private java.lang.String secret;
    private boolean atAll;
    @org.jetbrains.annotations.NotNull
    private java.lang.String atMobiles;
    @org.jetbrains.annotations.NotNull
    private java.lang.String atDingtalkIds;
    @org.jetbrains.annotations.NotNull
    private java.lang.String msgtype;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String titleTemplate = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.entity.setting.DingtalkGroupRobotSetting copy(@org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    java.lang.String secret, boolean atAll, @org.jetbrains.annotations.NotNull
    java.lang.String atMobiles, @org.jetbrains.annotations.NotNull
    java.lang.String atDingtalkIds, @org.jetbrains.annotations.NotNull
    java.lang.String msgtype, @org.jetbrains.annotations.NotNull
    java.lang.String titleTemplate) {
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
    
    public DingtalkGroupRobotSetting() {
        super();
    }
    
    public DingtalkGroupRobotSetting(@org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    java.lang.String secret, boolean atAll, @org.jetbrains.annotations.NotNull
    java.lang.String atMobiles, @org.jetbrains.annotations.NotNull
    java.lang.String atDingtalkIds, @org.jetbrains.annotations.NotNull
    java.lang.String msgtype, @org.jetbrains.annotations.NotNull
    java.lang.String titleTemplate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSecret() {
        return null;
    }
    
    public final void setSecret(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
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
    public final java.lang.String getAtMobiles() {
        return null;
    }
    
    public final void setAtMobiles(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAtDingtalkIds() {
        return null;
    }
    
    public final void setAtDingtalkIds(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMsgtype() {
        return null;
    }
    
    public final void setMsgtype(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitleTemplate() {
        return null;
    }
    
    public final int getMsgTypeCheckId() {
        return 0;
    }
}