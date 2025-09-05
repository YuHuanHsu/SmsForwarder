package com.idormy.sms.forwarder.utils;

import java.lang.System;

@kotlin.Suppress(names = {"unused", "UNCHECKED_CAST"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u0015*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0015B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0007J\u001d\u0010\t\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010\nJ$\u0010\u000b\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00032\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0096\u0002\u00a2\u0006\u0002\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010\u0007J,\u0010\u0013\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u00032\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0002\u0010\u0014R\u0010\u0010\u0006\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/idormy/sms/forwarder/utils/SharedPreference;", "T", "Lkotlin/properties/ReadWriteProperty;", "", "name", "", "default", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/Object;", "getPreference", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "putPreference", "", "value", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Companion", "app_debug"})
public final class SharedPreference<T extends java.lang.Object> implements kotlin.properties.ReadWriteProperty<java.lang.Object, T> {
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.SharedPreference.Companion Companion = null;
    public static android.content.SharedPreferences preference;
    
    public SharedPreference(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\t\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001b\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0001\u0010\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0002\u00a2\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\rJ\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017J\u001b\u0010\u0018\u001a\u00020\r\"\u0004\b\u0001\u0010\u000f2\u0006\u0010\u0019\u001a\u0002H\u000fH\u0002\u00a2\u0006\u0002\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u001b"}, d2 = {"Lcom/idormy/sms/forwarder/utils/SharedPreference$Companion;", "", "()V", "preference", "Landroid/content/SharedPreferences;", "getPreference", "()Landroid/content/SharedPreferences;", "setPreference", "(Landroid/content/SharedPreferences;)V", "clearPreference", "", "", "key", "", "deSerialization", "T", "str", "(Ljava/lang/String;)Ljava/lang/Object;", "exportPreference", "importPreference", "data", "init", "context", "Landroid/content/Context;", "serialize", "obj", "(Ljava/lang/Object;)Ljava/lang/String;", "app_debug"})
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
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String exportPreference() {
            return null;
        }
        
        public final void importPreference(@org.jetbrains.annotations.NotNull
        java.lang.String data) {
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
    }
}