package com.idormy.sms.forwarder.entity.setting;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\tH\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\rH\u00c6\u0003J\u0083\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00100\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u000102H\u00d6\u0003J\u0006\u00103\u001a\u000204J\u0006\u00105\u001a\u000204J\u0006\u00106\u001a\u000204J\u0006\u00107\u001a\u000204J\u001a\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u000202092\u0006\u0010:\u001a\u00020\u0003J\t\u0010;\u001a\u000204H\u00d6\u0001J\u0006\u0010<\u001a\u00020\rJ\u0006\u0010=\u001a\u00020\rJ\t\u0010>\u001a\u00020\u0003H\u00d6\u0001J\u0006\u0010?\u001a\u00020\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0013\u00a8\u0006@"}, d2 = {"Lcom/idormy/sms/forwarder/entity/setting/TelegramSetting;", "Ljava/io/Serializable;", "method", "", "apiToken", "chatId", "messageThreadId", "chatType", "proxyType", "Ljava/net/Proxy$Type;", "proxyHost", "proxyPort", "proxyAuthenticator", "", "proxyUsername", "proxyPassword", "parseMode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/Proxy$Type;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiToken", "()Ljava/lang/String;", "setApiToken", "(Ljava/lang/String;)V", "getChatId", "getChatType", "getMessageThreadId", "getMethod", "getParseMode", "getProxyAuthenticator", "()Z", "getProxyHost", "getProxyPassword", "getProxyPort", "getProxyType", "()Ljava/net/Proxy$Type;", "getProxyUsername", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "getChatTypeCheckId", "", "getMethodCheckId", "getParseModeCheckId", "getProxyTypeCheckId", "getSendParams", "", "content", "hashCode", "isChannel", "isForumGroup", "toString", "validateSettings", "app_debug"})
public final class TelegramSetting implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String method = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String apiToken;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String chatId = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String messageThreadId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String chatType = null;
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
    private final java.lang.String parseMode = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.entity.setting.TelegramSetting copy(@org.jetbrains.annotations.NotNull
    java.lang.String method, @org.jetbrains.annotations.NotNull
    java.lang.String apiToken, @org.jetbrains.annotations.NotNull
    java.lang.String chatId, @org.jetbrains.annotations.Nullable
    java.lang.String messageThreadId, @org.jetbrains.annotations.NotNull
    java.lang.String chatType, @org.jetbrains.annotations.NotNull
    java.net.Proxy.Type proxyType, @org.jetbrains.annotations.NotNull
    java.lang.String proxyHost, @org.jetbrains.annotations.NotNull
    java.lang.String proxyPort, boolean proxyAuthenticator, @org.jetbrains.annotations.NotNull
    java.lang.String proxyUsername, @org.jetbrains.annotations.NotNull
    java.lang.String proxyPassword, @org.jetbrains.annotations.NotNull
    java.lang.String parseMode) {
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
    
    public TelegramSetting() {
        super();
    }
    
    public TelegramSetting(@org.jetbrains.annotations.NotNull
    java.lang.String method, @org.jetbrains.annotations.NotNull
    java.lang.String apiToken, @org.jetbrains.annotations.NotNull
    java.lang.String chatId, @org.jetbrains.annotations.Nullable
    java.lang.String messageThreadId, @org.jetbrains.annotations.NotNull
    java.lang.String chatType, @org.jetbrains.annotations.NotNull
    java.net.Proxy.Type proxyType, @org.jetbrains.annotations.NotNull
    java.lang.String proxyHost, @org.jetbrains.annotations.NotNull
    java.lang.String proxyPort, boolean proxyAuthenticator, @org.jetbrains.annotations.NotNull
    java.lang.String proxyUsername, @org.jetbrains.annotations.NotNull
    java.lang.String proxyPassword, @org.jetbrains.annotations.NotNull
    java.lang.String parseMode) {
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
    public final java.lang.String getApiToken() {
        return null;
    }
    
    public final void setApiToken(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getChatId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMessageThreadId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getChatType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.net.Proxy.Type component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.net.Proxy.Type getProxyType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProxyHost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProxyPort() {
        return null;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean getProxyAuthenticator() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProxyUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProxyPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getParseMode() {
        return null;
    }
    
    public final int getMethodCheckId() {
        return 0;
    }
    
    public final int getProxyTypeCheckId() {
        return 0;
    }
    
    public final int getParseModeCheckId() {
        return 0;
    }
    
    public final int getChatTypeCheckId() {
        return 0;
    }
    
    public final boolean isForumGroup() {
        return false;
    }
    
    public final boolean isChannel() {
        return false;
    }
    
    public final boolean validateSettings() {
        return false;
    }
    
    /**
     * 取得發送所需的基本參數Map
     * @param content 訊息內容
     * @return 參數Map
     */
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.Object> getSendParams(@org.jetbrains.annotations.NotNull
    java.lang.String content) {
        return null;
    }
}