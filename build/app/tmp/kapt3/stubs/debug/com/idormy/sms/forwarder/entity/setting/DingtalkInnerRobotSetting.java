package com.idormy.sms.forwarder.entity.setting;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u000eH\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\nH\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\u0081\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010.\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u000100H\u00d6\u0003J\u0006\u00101\u001a\u000202J\u0006\u00103\u001a\u000202J\t\u00104\u001a\u000202H\u00d6\u0001J\t\u00105\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013\u00a8\u00066"}, d2 = {"Lcom/idormy/sms/forwarder/entity/setting/DingtalkInnerRobotSetting;", "Ljava/io/Serializable;", "agentID", "", "appKey", "appSecret", "userIds", "msgKey", "titleTemplate", "proxyType", "Ljava/net/Proxy$Type;", "proxyHost", "proxyPort", "proxyAuthenticator", "", "proxyUsername", "proxyPassword", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/Proxy$Type;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getAgentID", "()Ljava/lang/String;", "getAppKey", "getAppSecret", "getMsgKey", "getProxyAuthenticator", "()Z", "getProxyHost", "getProxyPassword", "getProxyPort", "getProxyType", "()Ljava/net/Proxy$Type;", "getProxyUsername", "getTitleTemplate", "getUserIds", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "getMsgTypeCheckId", "", "getProxyTypeCheckId", "hashCode", "toString", "app_debug"})
public final class DingtalkInnerRobotSetting implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String agentID = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String appKey = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String appSecret = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String userIds = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String msgKey = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String titleTemplate = null;
    @org.jetbrains.annotations.NotNull
    private final java.net.Proxy.Type proxyType = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String proxyHost = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String proxyPort = null;
    private final boolean proxyAuthenticator = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String proxyUsername = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String proxyPassword = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.entity.setting.DingtalkInnerRobotSetting copy(@org.jetbrains.annotations.NotNull
    java.lang.String agentID, @org.jetbrains.annotations.NotNull
    java.lang.String appKey, @org.jetbrains.annotations.NotNull
    java.lang.String appSecret, @org.jetbrains.annotations.NotNull
    java.lang.String userIds, @org.jetbrains.annotations.NotNull
    java.lang.String msgKey, @org.jetbrains.annotations.NotNull
    java.lang.String titleTemplate, @org.jetbrains.annotations.NotNull
    java.net.Proxy.Type proxyType, @org.jetbrains.annotations.NotNull
    java.lang.String proxyHost, @org.jetbrains.annotations.NotNull
    java.lang.String proxyPort, boolean proxyAuthenticator, @org.jetbrains.annotations.NotNull
    java.lang.String proxyUsername, @org.jetbrains.annotations.NotNull
    java.lang.String proxyPassword) {
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
    
    public DingtalkInnerRobotSetting() {
        super();
    }
    
    public DingtalkInnerRobotSetting(@org.jetbrains.annotations.NotNull
    java.lang.String agentID, @org.jetbrains.annotations.NotNull
    java.lang.String appKey, @org.jetbrains.annotations.NotNull
    java.lang.String appSecret, @org.jetbrains.annotations.NotNull
    java.lang.String userIds, @org.jetbrains.annotations.NotNull
    java.lang.String msgKey, @org.jetbrains.annotations.NotNull
    java.lang.String titleTemplate, @org.jetbrains.annotations.NotNull
    java.net.Proxy.Type proxyType, @org.jetbrains.annotations.NotNull
    java.lang.String proxyHost, @org.jetbrains.annotations.NotNull
    java.lang.String proxyPort, boolean proxyAuthenticator, @org.jetbrains.annotations.NotNull
    java.lang.String proxyUsername, @org.jetbrains.annotations.NotNull
    java.lang.String proxyPassword) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAgentID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAppKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAppSecret() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserIds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMsgKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitleTemplate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.net.Proxy.Type component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.net.Proxy.Type getProxyType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProxyHost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProxyPort() {
        return null;
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean getProxyAuthenticator() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProxyUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProxyPassword() {
        return null;
    }
    
    public final int getProxyTypeCheckId() {
        return 0;
    }
    
    public final int getMsgTypeCheckId() {
        return 0;
    }
}