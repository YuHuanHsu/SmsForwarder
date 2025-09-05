package com.idormy.sms.forwarder.entity.setting;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u00a9\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012 \b\u0002\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000f0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0014J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J!\u00108\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000f0\u000eH\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\nH\u00c6\u0003J\t\u0010C\u001a\u00020\nH\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\u00ad\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032 \b\u0002\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010F\u001a\u00020\n2\b\u0010G\u001a\u0004\u0018\u00010HH\u00d6\u0003J\u0006\u0010I\u001a\u00020JJ\t\u0010K\u001a\u00020JH\u00d6\u0001J\t\u0010L\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0016\"\u0004\b(\u0010\u0018R2\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u0010\u0018R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0016\"\u0004\b6\u0010\u0018\u00a8\u0006M"}, d2 = {"Lcom/idormy/sms/forwarder/entity/setting/EmailSetting;", "Ljava/io/Serializable;", "mailType", "", "fromEmail", "pwd", "nickname", "host", "port", "ssl", "", "startTls", "title", "recipients", "", "Lkotlin/Pair;", "toEmail", "keystore", "password", "encryptionProtocol", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEncryptionProtocol", "()Ljava/lang/String;", "setEncryptionProtocol", "(Ljava/lang/String;)V", "getFromEmail", "setFromEmail", "getHost", "setHost", "getKeystore", "setKeystore", "getMailType", "setMailType", "getNickname", "setNickname", "getPassword", "setPassword", "getPort", "setPort", "getPwd", "setPwd", "getRecipients", "()Ljava/util/Map;", "setRecipients", "(Ljava/util/Map;)V", "getSsl", "()Z", "setSsl", "(Z)V", "getStartTls", "setStartTls", "getTitle", "setTitle", "getToEmail", "setToEmail", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "getEncryptionProtocolCheckId", "", "hashCode", "toString", "app_debug"})
public final class EmailSetting implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    private java.lang.String mailType;
    @org.jetbrains.annotations.NotNull
    private java.lang.String fromEmail;
    @org.jetbrains.annotations.NotNull
    private java.lang.String pwd;
    @org.jetbrains.annotations.NotNull
    private java.lang.String nickname;
    @org.jetbrains.annotations.NotNull
    private java.lang.String host;
    @org.jetbrains.annotations.NotNull
    private java.lang.String port;
    private boolean ssl;
    private boolean startTls;
    @org.jetbrains.annotations.NotNull
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull
    private java.util.Map<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> recipients;
    @org.jetbrains.annotations.NotNull
    private java.lang.String toEmail;
    @org.jetbrains.annotations.NotNull
    private java.lang.String keystore;
    @org.jetbrains.annotations.NotNull
    private java.lang.String password;
    @org.jetbrains.annotations.NotNull
    private java.lang.String encryptionProtocol;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.entity.setting.EmailSetting copy(@org.jetbrains.annotations.NotNull
    java.lang.String mailType, @org.jetbrains.annotations.NotNull
    java.lang.String fromEmail, @org.jetbrains.annotations.NotNull
    java.lang.String pwd, @org.jetbrains.annotations.NotNull
    java.lang.String nickname, @org.jetbrains.annotations.NotNull
    java.lang.String host, @org.jetbrains.annotations.NotNull
    java.lang.String port, boolean ssl, boolean startTls, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> recipients, @org.jetbrains.annotations.NotNull
    java.lang.String toEmail, @org.jetbrains.annotations.NotNull
    java.lang.String keystore, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String encryptionProtocol) {
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
    
    public EmailSetting() {
        super();
    }
    
    public EmailSetting(@org.jetbrains.annotations.NotNull
    java.lang.String mailType, @org.jetbrains.annotations.NotNull
    java.lang.String fromEmail, @org.jetbrains.annotations.NotNull
    java.lang.String pwd, @org.jetbrains.annotations.NotNull
    java.lang.String nickname, @org.jetbrains.annotations.NotNull
    java.lang.String host, @org.jetbrains.annotations.NotNull
    java.lang.String port, boolean ssl, boolean startTls, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> recipients, @org.jetbrains.annotations.NotNull
    java.lang.String toEmail, @org.jetbrains.annotations.NotNull
    java.lang.String keystore, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String encryptionProtocol) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMailType() {
        return null;
    }
    
    public final void setMailType(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFromEmail() {
        return null;
    }
    
    public final void setFromEmail(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPwd() {
        return null;
    }
    
    public final void setPwd(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNickname() {
        return null;
    }
    
    public final void setNickname(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getHost() {
        return null;
    }
    
    public final void setHost(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPort() {
        return null;
    }
    
    public final void setPort(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getSsl() {
        return false;
    }
    
    public final void setSsl(boolean p0) {
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean getStartTls() {
        return false;
    }
    
    public final void setStartTls(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> getRecipients() {
        return null;
    }
    
    public final void setRecipients(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getToEmail() {
        return null;
    }
    
    public final void setToEmail(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKeystore() {
        return null;
    }
    
    public final void setKeystore(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEncryptionProtocol() {
        return null;
    }
    
    public final void setEncryptionProtocol(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getEncryptionProtocolCheckId() {
        return 0;
    }
}