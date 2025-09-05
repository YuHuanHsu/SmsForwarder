package com.idormy.sms.forwarder.utils;

import java.lang.System;

/**
 * 转发历史工具类
 *
 * @author pppscn
 * @since 2022年5月9日
 */
@kotlin.Suppress(names = {"UNCHECKED_CAST", "unused"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u001b*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u001bB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0007J\u001b\u0010\t\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\n\u001a\u00020\u0005H\u0002\u00a2\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010\rJ$\u0010\u000e\u001a\u00028\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0096\u0002\u00a2\u0006\u0002\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010\u0007J\u001b\u0010\u0016\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0017\u001a\u0002H\u0001H\u0002\u00a2\u0006\u0002\u0010\u0018J,\u0010\u0019\u001a\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0002\u0010\u001aR\u0010\u0010\u0006\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/idormy/sms/forwarder/utils/HistoryUtils;", "T", "Lkotlin/properties/ReadWriteProperty;", "", "name", "", "default", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/Object;", "deSerialization", "str", "(Ljava/lang/String;)Ljava/lang/Object;", "getPreference", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "putPreference", "", "value", "serialize", "obj", "(Ljava/lang/Object;)Ljava/lang/String;", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Companion", "app_debug"})
public final class HistoryUtils<T extends java.lang.Object> implements kotlin.properties.ReadWriteProperty<java.lang.Object, T> {
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.HistoryUtils.Companion Companion = null;
    public static android.content.SharedPreferences preference;
    
    public HistoryUtils(@org.jetbrains.annotations.NotNull
    java.lang.String name, T p1_772401952) {
        super();
    }
    
    @java.lang.Override
    public void setValue(@org.jetbrains.annotations.Nullable
    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull
    kotlin.reflect.KProperty<?> property, T value) {
    }
    
    @java.lang.Override
    public T getValue(@org.jetbrains.annotations.Nullable
    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull
    kotlin.reflect.KProperty<?> property) {
        return null;
    }
    
    /**
     * 查找数据 返回给调用方法一个具体的对象
     * 如果查找不到类型就采用反序列化方法来返回类型
     * default是默认对象 以防止会返回空对象的异常
     * 即如果name没有查找到value 就返回默认的序列化对象，然后经过反序列化返回
     */
    private final T getPreference(java.lang.String name, T p1_772401952) {
        return null;
    }
    
    private final void putPreference(java.lang.String name, T value) {
    }
    
    /**
     * 序列化对象
     * @throws IOException
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    private final <T extends java.lang.Object>java.lang.String serialize(T obj) {
        return null;
    }
    
    /**
     * 反序列化对象
     * @param str
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class, java.lang.ClassNotFoundException.class})
    private final <T extends java.lang.Object>T deSerialization(java.lang.String str) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\t\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/idormy/sms/forwarder/utils/HistoryUtils$Companion;", "", "()V", "preference", "Landroid/content/SharedPreferences;", "getPreference", "()Landroid/content/SharedPreferences;", "setPreference", "(Landroid/content/SharedPreferences;)V", "clearPreference", "", "", "key", "", "init", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.SharedPreferences getPreference() {
            return null;
        }
        
        public final void setPreference(@org.jetbrains.annotations.NotNull
        android.content.SharedPreferences p0) {
        }
        
        public final void init(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
        
        public final void clearPreference() {
        }
        
        public final boolean clearPreference(@org.jetbrains.annotations.NotNull
        java.lang.String key) {
            return false;
        }
    }
}