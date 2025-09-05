package com.idormy.sms.forwarder.entity.setting;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0013J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0007H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0007H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\fH\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\u0095\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00106\u001a\u00020\u00072\b\u00107\u001a\u0004\u0018\u000108H\u00d6\u0003J\u0006\u00109\u001a\u00020:J\t\u0010;\u001a\u00020:H\u00d6\u0001J\t\u0010<\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0015\u00a8\u0006="}, d2 = {"Lcom/idormy/sms/forwarder/entity/setting/WeworkAgentSetting;", "Ljava/io/Serializable;", "corpID", "", "agentID", "secret", "atAll", "", "toUser", "toParty", "toTag", "proxyType", "Ljava/net/Proxy$Type;", "proxyHost", "proxyPort", "proxyAuthenticator", "proxyUsername", "proxyPassword", "customizeAPI", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/Proxy$Type;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgentID", "()Ljava/lang/String;", "getAtAll", "()Z", "getCorpID", "setCorpID", "(Ljava/lang/String;)V", "getCustomizeAPI", "getProxyAuthenticator", "getProxyHost", "getProxyPassword", "getProxyPort", "getProxyType", "()Ljava/net/Proxy$Type;", "getProxyUsername", "getSecret", "getToParty", "getToTag", "getToUser", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "getProxyTypeCheckId", "", "hashCode", "toString", "app_debug"})
public final class WeworkAgentSetting implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    private java.lang.String corpID;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String agentID = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String secret = null;
    private final boolean atAll = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String toUser = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String toParty = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String toTag = null;
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
    private final java.lang.String customizeAPI = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.entity.setting.WeworkAgentSetting copy(@org.jetbrains.annotations.NotNull
    java.lang.String corpID, @org.jetbrains.annotations.NotNull
    java.lang.String agentID, @org.jetbrains.annotations.NotNull
    java.lang.String secret, boolean atAll, @org.jetbrains.annotations.NotNull
    java.lang.String toUser, @org.jetbrains.annotations.NotNull
    java.lang.String toParty, @org.jetbrains.annotations.NotNull
    java.lang.String toTag, @org.jetbrains.annotations.NotNull
    java.net.Proxy.Type proxyType, @org.jetbrains.annotations.NotNull
    java.lang.String proxyHost, @org.jetbrains.annotations.NotNull
    java.lang.String proxyPort, boolean proxyAuthenticator, @org.jetbrains.annotations.NotNull
    java.lang.String proxyUsername, @org.jetbrains.annotations.NotNull
    java.lang.String proxyPassword, @org.jetbrains.annotations.NotNull
    java.lang.String customizeAPI) {
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
    
    public WeworkAgentSetting() {
        super();
    }
    
    public WeworkAgentSetting(@org.jetbrains.annotations.NotNull
    java.lang.String corpID, @org.jetbrains.annotations.NotNull
    java.lang.String agentID, @org.jetbrains.annotations.NotNull
    java.lang.String secret, boolean atAll, @org.jetbrains.annotations.NotNull
    java.lang.String toUser, @org.jetbrains.annotations.NotNull
    java.lang.String toParty, @org.jetbrains.annotations.NotNull
    java.lang.String toTag, @org.jetbrains.annotations.NotNull
    java.net.Proxy.Type proxyType, @org.jetbrains.annotations.NotNull
    java.lang.String proxyHost, @org.jetbrains.annotations.NotNull
    java.lang.String proxyPort, boolean proxyAuthenticator, @org.jetbrains.annotations.NotNull
    java.lang.String proxyUsername, @org.jetbrains.annotations.NotNull
    java.lang.String proxyPassword, @org.jetbrains.annotations.NotNull
    java.lang.String customizeAPI) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCorpID() {
        return null;
    }
    
    public final void setCorpID(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAgentID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSecret() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getAtAll() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getToUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getToParty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getToTag() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.net.Proxy.Type component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.net.Proxy.Type getProxyType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProxyHost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProxyPort() {
        return null;
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final boolean getProxyAuthenticator() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProxyUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProxyPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCustomizeAPI() {
        return null;
    }
    
    public final int getProxyTypeCheckId() {
        return 0;
    }
}