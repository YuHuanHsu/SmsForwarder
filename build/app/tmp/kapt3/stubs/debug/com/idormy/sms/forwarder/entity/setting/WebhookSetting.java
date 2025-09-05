package com.idormy.sms.forwarder.entity.setting;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003J\t\u0010.\u001a\u00020\u000bH\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\u008d\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00102\u001a\u00020\u000f2\b\u00103\u001a\u0004\u0018\u000104H\u00d6\u0003J\u0006\u00105\u001a\u000206J\u0006\u00107\u001a\u000206J\t\u00108\u001a\u000206H\u00d6\u0001J\t\u00109\u001a\u00020\u0003H\u00d6\u0001R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010$\u00a8\u0006:"}, d2 = {"Lcom/idormy/sms/forwarder/entity/setting/WebhookSetting;", "Ljava/io/Serializable;", "method", "", "webServer", "secret", "response", "webParams", "headers", "", "proxyType", "Ljava/net/Proxy$Type;", "proxyHost", "proxyPort", "proxyAuthenticator", "", "proxyUsername", "proxyPassword", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/net/Proxy$Type;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getHeaders", "()Ljava/util/Map;", "getMethod", "()Ljava/lang/String;", "getProxyAuthenticator", "()Z", "getProxyHost", "getProxyPassword", "getProxyPort", "getProxyType", "()Ljava/net/Proxy$Type;", "getProxyUsername", "getResponse", "getSecret", "getWebParams", "getWebServer", "setWebServer", "(Ljava/lang/String;)V", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "getMethodCheckId", "", "getProxyTypeCheckId", "hashCode", "toString", "app_debug"})
public final class WebhookSetting implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String method = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String webServer;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String secret = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String response = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String webParams = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.lang.String> headers = null;
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
    public final com.idormy.sms.forwarder.entity.setting.WebhookSetting copy(@org.jetbrains.annotations.NotNull
    java.lang.String method, @org.jetbrains.annotations.NotNull
    java.lang.String webServer, @org.jetbrains.annotations.NotNull
    java.lang.String secret, @org.jetbrains.annotations.NotNull
    java.lang.String response, @org.jetbrains.annotations.NotNull
    java.lang.String webParams, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.String> headers, @org.jetbrains.annotations.NotNull
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
    
    public WebhookSetting() {
        super();
    }
    
    public WebhookSetting(@org.jetbrains.annotations.NotNull
    java.lang.String method, @org.jetbrains.annotations.NotNull
    java.lang.String webServer, @org.jetbrains.annotations.NotNull
    java.lang.String secret, @org.jetbrains.annotations.NotNull
    java.lang.String response, @org.jetbrains.annotations.NotNull
    java.lang.String webParams, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.String> headers, @org.jetbrains.annotations.NotNull
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
    public final java.lang.String getMethod() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWebServer() {
        return null;
    }
    
    public final void setWebServer(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSecret() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWebParams() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.String> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.String> getHeaders() {
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
    
    public final int getMethodCheckId() {
        return 0;
    }
    
    public final int getProxyTypeCheckId() {
        return 0;
    }
}