package com.idormy.sms.forwarder.utils.mail;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName", "DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\r\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002()B\u00ed\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u00a2\u0006\u0002\u0010!J\u0011\u0010%\u001a\u00020&H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'R\u000e\u0010\"\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lcom/idormy/sms/forwarder/utils/mail/EmailSender;", "", "host", "", "port", "from", "password", "nickname", "subject", "body", "", "attachFiles", "", "Ljava/io/File;", "toAddress", "ccAddress", "bccAddress", "listener", "Lcom/idormy/sms/forwarder/utils/mail/EmailSender$EmailTaskListener;", "openSSL", "", "startTls", "encryptionProtocol", "recipientX509Cert", "Ljava/security/cert/X509Certificate;", "senderPrivateKey", "Ljava/security/PrivateKey;", "senderX509Cert", "recipientPGPPublicKeyRing", "Lorg/bouncycastle/openpgp/PGPPublicKeyRing;", "senderPGPSecretKeyRing", "Lorg/bouncycastle/openpgp/PGPSecretKeyRing;", "senderPGPSecretKeyPassword", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/idormy/sms/forwarder/utils/mail/EmailSender$EmailTaskListener;ZZLjava/lang/String;Ljava/security/cert/X509Certificate;Ljava/security/PrivateKey;Ljava/security/cert/X509Certificate;Lorg/bouncycastle/openpgp/PGPPublicKeyRing;Lorg/bouncycastle/openpgp/PGPSecretKeyRing;Ljava/lang/String;)V", "TAG", "properties", "Ljava/util/Properties;", "sendEmail", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "EmailTaskListener", "MailAuthenticator", "app_debug"})
public final class EmailSender {
    private final java.lang.String host = null;
    private final java.lang.String port = null;
    private final java.lang.String from = null;
    private final java.lang.String password = null;
    private final java.lang.String nickname = null;
    private final java.lang.String subject = null;
    private final java.lang.CharSequence body = null;
    private final java.util.List<java.io.File> attachFiles = null;
    private final java.util.List<java.lang.String> toAddress = null;
    private final java.util.List<java.lang.String> ccAddress = null;
    private final java.util.List<java.lang.String> bccAddress = null;
    private final com.idormy.sms.forwarder.utils.mail.EmailSender.EmailTaskListener listener = null;
    private final boolean openSSL = false;
    private final boolean startTls = false;
    private final java.lang.String encryptionProtocol = null;
    private final java.security.cert.X509Certificate recipientX509Cert = null;
    private final java.security.PrivateKey senderPrivateKey = null;
    private final java.security.cert.X509Certificate senderX509Cert = null;
    private org.bouncycastle.openpgp.PGPPublicKeyRing recipientPGPPublicKeyRing;
    private org.bouncycastle.openpgp.PGPSecretKeyRing senderPGPSecretKeyRing;
    private final java.lang.String senderPGPSecretKeyPassword = null;
    private final java.lang.String TAG = null;
    private final java.util.Properties properties = null;
    
    public EmailSender(@org.jetbrains.annotations.NotNull
    java.lang.String host, @org.jetbrains.annotations.NotNull
    java.lang.String port, @org.jetbrains.annotations.NotNull
    java.lang.String from, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String nickname, @org.jetbrains.annotations.NotNull
    java.lang.String subject, @org.jetbrains.annotations.NotNull
    java.lang.CharSequence body, @org.jetbrains.annotations.NotNull
    java.util.List<java.io.File> attachFiles, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> toAddress, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> ccAddress, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> bccAddress, @org.jetbrains.annotations.Nullable
    com.idormy.sms.forwarder.utils.mail.EmailSender.EmailTaskListener listener, boolean openSSL, boolean startTls, @org.jetbrains.annotations.NotNull
    java.lang.String encryptionProtocol, @org.jetbrains.annotations.Nullable
    java.security.cert.X509Certificate recipientX509Cert, @org.jetbrains.annotations.Nullable
    java.security.PrivateKey senderPrivateKey, @org.jetbrains.annotations.Nullable
    java.security.cert.X509Certificate senderX509Cert, @org.jetbrains.annotations.Nullable
    org.bouncycastle.openpgp.PGPPublicKeyRing recipientPGPPublicKeyRing, @org.jetbrains.annotations.Nullable
    org.bouncycastle.openpgp.PGPSecretKeyRing senderPGPSecretKeyRing, @org.jetbrains.annotations.NotNull
    java.lang.String senderPGPSecretKeyPassword) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object sendEmail(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/idormy/sms/forwarder/utils/mail/EmailSender$EmailTaskListener;", "", "onEmailSent", "", "success", "", "message", "", "app_debug"})
    public static abstract interface EmailTaskListener {
        
        public abstract void onEmailSent(boolean success, @org.jetbrains.annotations.NotNull
        java.lang.String message);
    }
    
    /**
     * 发件箱auth校验
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0007\u001a\u00020\bH\u0014R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/idormy/sms/forwarder/utils/mail/EmailSender$MailAuthenticator;", "Ljakarta/mail/Authenticator;", "username", "", "password", "(Ljava/lang/String;Ljava/lang/String;)V", "userName", "getPasswordAuthentication", "Ljakarta/mail/PasswordAuthentication;", "app_debug"})
    static final class MailAuthenticator extends jakarta.mail.Authenticator {
        private java.lang.String password;
        private java.lang.String userName;
        
        public MailAuthenticator(@org.jetbrains.annotations.NotNull
        java.lang.String username, @org.jetbrains.annotations.NotNull
        java.lang.String password) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        protected jakarta.mail.PasswordAuthentication getPasswordAuthentication() {
            return null;
        }
    }
}