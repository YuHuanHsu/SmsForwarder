package com.idormy.sms.forwarder.utils;

import java.lang.System;

/**
 * SM4分组密码算法是我国自主设计的分组对称密码算法
 */
@kotlin.Suppress(names = {"unused", "MemberVisibilityCanBePrivate"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u0006J.\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007J2\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0002J.\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/idormy/sms/forwarder/utils/SM4Crypt;", "", "()V", "BC_PROVIDER", "Lorg/bouncycastle/jce/provider/BouncyCastleProvider;", "SM4_CBC_IV", "", "SM4_CBC_NOPADDING", "", "SM4_CBC_PKCS5", "SM4_CBC_PKCS7", "SM4_ECB_NOPADDING", "SM4_ECB_PKCS5", "SM4_ECB_PKCS7", "createSM4Key", "decrypt", "source", "key", "mode", "iv", "doSM4", "forEncryption", "", "encrypt", "app_debug"})
public final class SM4Crypt {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.SM4Crypt INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SM4_CBC_NOPADDING = "SM4/CBC/NoPadding";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SM4_CBC_PKCS5 = "SM4/CBC/PKCS5Padding";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SM4_CBC_PKCS7 = "SM4/CBC/PKCS7Padding";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SM4_ECB_NOPADDING = "SM4/ECB/NoPadding";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SM4_ECB_PKCS5 = "SM4/ECB/PKCS5Padding";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SM4_ECB_PKCS7 = "SM4/ECB/PKCS7Padding";
    private static final org.bouncycastle.jce.provider.BouncyCastleProvider BC_PROVIDER = null;
    private static final byte[] SM4_CBC_IV = {(byte)3, (byte)5, (byte)6, (byte)9, (byte)6, (byte)9, (byte)5, (byte)9, (byte)3, (byte)5, (byte)6, (byte)9, (byte)6, (byte)9, (byte)5, (byte)9};
    
    private SM4Crypt() {
        super();
    }
    
    /**
     * 获取随机密钥
     */
    @org.jetbrains.annotations.NotNull
    public final byte[] createSM4Key() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmOverloads
    public final byte[] encrypt(@org.jetbrains.annotations.NotNull
    byte[] source, @org.jetbrains.annotations.NotNull
    byte[] key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmOverloads
    public final byte[] encrypt(@org.jetbrains.annotations.NotNull
    byte[] source, @org.jetbrains.annotations.NotNull
    byte[] key, @org.jetbrains.annotations.NotNull
    java.lang.String mode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmOverloads
    public final byte[] encrypt(@org.jetbrains.annotations.NotNull
    byte[] source, @org.jetbrains.annotations.NotNull
    byte[] key, @org.jetbrains.annotations.NotNull
    java.lang.String mode, @org.jetbrains.annotations.Nullable
    byte[] iv) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmOverloads
    public final byte[] decrypt(@org.jetbrains.annotations.NotNull
    byte[] source, @org.jetbrains.annotations.NotNull
    byte[] key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmOverloads
    public final byte[] decrypt(@org.jetbrains.annotations.NotNull
    byte[] source, @org.jetbrains.annotations.NotNull
    byte[] key, @org.jetbrains.annotations.NotNull
    java.lang.String mode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmOverloads
    public final byte[] decrypt(@org.jetbrains.annotations.NotNull
    byte[] source, @org.jetbrains.annotations.NotNull
    byte[] key, @org.jetbrains.annotations.NotNull
    java.lang.String mode, @org.jetbrains.annotations.Nullable
    byte[] iv) {
        return null;
    }
    
    private final byte[] doSM4(boolean forEncryption, byte[] source, byte[] key, java.lang.String mode, byte[] iv) {
        return null;
    }
}