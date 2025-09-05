package com.idormy.sms.forwarder.utils.mail;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u001d\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00070\u001eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u001d\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00070\u001eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u001d\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00070\u001eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u001d\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00070\u001eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/idormy/sms/forwarder/utils/mail/SmimeUtils;", "", "properties", "Ljava/util/Properties;", "authenticator", "Ljakarta/mail/Authenticator;", "from", "", "nickname", "subject", "body", "attachFiles", "", "Ljava/io/File;", "toAddress", "ccAddress", "bccAddress", "recipientX509Cert", "Ljava/security/cert/X509Certificate;", "senderPrivateKey", "Ljava/security/PrivateKey;", "senderX509Cert", "(Ljava/util/Properties;Ljakarta/mail/Authenticator;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/security/cert/X509Certificate;Ljava/security/PrivateKey;Ljava/security/cert/X509Certificate;)V", "TAG", "getEncryptedMessage", "Ljakarta/mail/internet/MimeMessage;", "originalMessage", "getOriginalMessage", "getSignedMessage", "sendEncryptedEmail", "Lkotlin/Pair;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendPlainEmail", "sendSignedAndEncryptedEmail", "sendSignedEmail", "app_debug"})
public final class SmimeUtils {
    private final java.util.Properties properties = null;
    private final jakarta.mail.Authenticator authenticator = null;
    private final java.lang.String from = null;
    private final java.lang.String nickname = null;
    private final java.lang.String subject = null;
    private final java.lang.String body = null;
    private final java.util.List<java.io.File> attachFiles = null;
    private final java.util.List<java.lang.String> toAddress = null;
    private final java.util.List<java.lang.String> ccAddress = null;
    private final java.util.List<java.lang.String> bccAddress = null;
    private final java.security.cert.X509Certificate recipientX509Cert = null;
    private final java.security.PrivateKey senderPrivateKey = null;
    private final java.security.cert.X509Certificate senderX509Cert = null;
    private final java.lang.String TAG = null;
    
    public SmimeUtils(@org.jetbrains.annotations.NotNull
    java.util.Properties properties, @org.jetbrains.annotations.NotNull
    jakarta.mail.Authenticator authenticator, @org.jetbrains.annotations.NotNull
    java.lang.String from, @org.jetbrains.annotations.NotNull
    java.lang.String nickname, @org.jetbrains.annotations.NotNull
    java.lang.String subject, @org.jetbrains.annotations.NotNull
    java.lang.String body, @org.jetbrains.annotations.NotNull
    java.util.List<java.io.File> attachFiles, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> toAddress, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> ccAddress, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> bccAddress, @org.jetbrains.annotations.Nullable
    java.security.cert.X509Certificate recipientX509Cert, @org.jetbrains.annotations.Nullable
    java.security.PrivateKey senderPrivateKey, @org.jetbrains.annotations.Nullable
    java.security.cert.X509Certificate senderX509Cert) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object sendPlainEmail(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object sendSignedEmail(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object sendEncryptedEmail(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object sendSignedAndEncryptedEmail(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> continuation) {
        return null;
    }
    
    private final jakarta.mail.internet.MimeMessage getOriginalMessage() {
        return null;
    }
    
    private final jakarta.mail.internet.MimeMessage getSignedMessage(jakarta.mail.internet.MimeMessage originalMessage) {
        return null;
    }
    
    private final jakarta.mail.internet.MimeMessage getEncryptedMessage(jakarta.mail.internet.MimeMessage originalMessage) {
        return null;
    }
}