package com.idormy.sms.forwarder.utils;

import java.lang.System;

/**
 * 非对称加密RSA加密和解密
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0010\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/idormy/sms/forwarder/utils/RSACrypt;", "", "()V", "DECRYPT_MAX_SIZE", "", "ENCRYPT_MAX_SIZE", "TRANSFORMATION", "", "decryptByPrivateKey", "input", "privateKey", "Ljava/security/PrivateKey;", "decryptByPublicKey", "publicKey", "Ljava/security/PublicKey;", "encryptByPrivateKey", "encryptByPublicKey", "getPrivateKey", "privateKeyStr", "getPublicKey", "publicKeyStr", "app_debug"})
public final class RSACrypt {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.RSACrypt INSTANCE = null;
    private static final java.lang.String TRANSFORMATION = "RSA";
    private static final int ENCRYPT_MAX_SIZE = 245;
    private static final int DECRYPT_MAX_SIZE = 256;
    
    private RSACrypt() {
        super();
    }
    
    /**
     * 私钥加密
     * @param input 原文
     * @param privateKey 私钥
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String encryptByPrivateKey(@org.jetbrains.annotations.NotNull
    java.lang.String input, @org.jetbrains.annotations.NotNull
    java.security.PrivateKey privateKey) {
        return null;
    }
    
    /**
     * 公钥加密
     * @param input 原文
     * @param publicKey 公钥
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String encryptByPublicKey(@org.jetbrains.annotations.NotNull
    java.lang.String input, @org.jetbrains.annotations.NotNull
    java.security.PublicKey publicKey) {
        return null;
    }
    
    /**
     * 私钥解密
     * @param input 秘文
     * @param privateKey 私钥
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String decryptByPrivateKey(@org.jetbrains.annotations.NotNull
    java.lang.String input, @org.jetbrains.annotations.NotNull
    java.security.PrivateKey privateKey) {
        return null;
    }
    
    /**
     * 公钥解密
     * @param input 秘文
     * @param publicKey 公钥
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String decryptByPublicKey(@org.jetbrains.annotations.NotNull
    java.lang.String input, @org.jetbrains.annotations.NotNull
    java.security.PublicKey publicKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.security.PrivateKey getPrivateKey(@org.jetbrains.annotations.NotNull
    java.lang.String privateKeyStr) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.security.PublicKey getPublicKey(@org.jetbrains.annotations.NotNull
    java.lang.String publicKeyStr) {
        return null;
    }
}