package com.idormy.sms.forwarder.utils.tinker;

import java.lang.System;

@kotlin.Suppress(names = {"NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS", "UNCHECKED_CAST", "unused"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t\u00a2\u0006\u0002\u0010\nJ7\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0005\u001a\u00020\u00012\u001e\u0010\r\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000e0\t\"\b\u0012\u0002\b\u0003\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0013\u001a\u00020\u0007J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0007JA\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u00072\u001e\u0010\r\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000e0\t\"\b\u0012\u0002\b\u0003\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u0017J;\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u001e\u0010\r\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000e0\t\"\b\u0012\u0002\b\u0003\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u0018J\"\u0010\u0019\u001a\u0004\u0018\u00010\u00012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000eH\u0007J\"\u0010\u001d\u001a\u00020\u001e2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eJ\u001e\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u001e\u00a8\u0006\""}, d2 = {"Lcom/idormy/sms/forwarder/utils/tinker/ShareReflectUtil;", "", "()V", "expandFieldArray", "", "instance", "fieldName", "", "extraElements", "", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V", "findConstructor", "Ljava/lang/reflect/Constructor;", "parameterTypes", "Ljava/lang/Class;", "(Ljava/lang/Object;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "findField", "Ljava/lang/reflect/Field;", "originClazz", "name", "findMethod", "Ljava/lang/reflect/Method;", "clazz", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "getActivityThread", "context", "Landroid/content/Context;", "activityThread", "getValueOfStaticIntField", "", "defVal", "reduceFieldArray", "reduceSize", "app_debug"})
public final class ShareReflectUtil {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.tinker.ShareReflectUtil INSTANCE = null;
    
    private ShareReflectUtil() {
        super();
    }
    
    /**
     * Locates a given field anywhere in the class inheritance hierarchy.
     *
     * @param instance an object to search the field into.
     * @param name     field name
     * @return a field object
     * @throws NoSuchFieldException if the field cannot be located
     */
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.NoSuchFieldException.class})
    public final java.lang.reflect.Field findField(@org.jetbrains.annotations.NotNull
    java.lang.Object instance, @org.jetbrains.annotations.NotNull
    java.lang.String name) throws java.lang.NoSuchFieldException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.NoSuchFieldException.class})
    public final java.lang.reflect.Field findField(@org.jetbrains.annotations.NotNull
    java.lang.Class<?> originClazz, @org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    /**
     * Locates a given method anywhere in the class inheritance hierarchy.
     *
     * @param instance       an object to search the method into.
     * @param name           method name
     * @param parameterTypes method parameter types
     * @return a method object
     * @throws NoSuchMethodException if the method cannot be located
     */
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.NoSuchMethodException.class})
    public final java.lang.reflect.Method findMethod(@org.jetbrains.annotations.NotNull
    java.lang.Object instance, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.Class<?>... parameterTypes) {
        return null;
    }
    
    /**
     * Locates a given method anywhere in the class inheritance hierarchy.
     *
     * @param clazz          a class to search the method into.
     * @param name           method name
     * @param parameterTypes method parameter types
     * @return a method object
     * @throws NoSuchMethodException if the method cannot be located
     */
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.NoSuchMethodException.class})
    public final java.lang.reflect.Method findMethod(@org.jetbrains.annotations.Nullable
    java.lang.Class<?> clazz, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.Class<?>... parameterTypes) {
        return null;
    }
    
    /**
     * Locates a given constructor anywhere in the class inheritance hierarchy.
     *
     * @param instance       an object to search the constructor into.
     * @param parameterTypes constructor parameter types
     * @return a constructor object
     * @throws NoSuchMethodException if the constructor cannot be located
     */
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.NoSuchMethodException.class})
    public final java.lang.reflect.Constructor<?> findConstructor(@org.jetbrains.annotations.NotNull
    java.lang.Object instance, @org.jetbrains.annotations.NotNull
    java.lang.Class<?>... parameterTypes) {
        return null;
    }
    
    /**
     * Replace the value of a field containing a non null array, by a new array containing the
     * elements of the original array plus the elements of extraElements.
     *
     * @param instance      the instance whose field is to be modified.
     * @param fieldName     the field to modify.
     * @param extraElements elements to append at the end of the array.
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.NoSuchFieldException.class, java.lang.IllegalArgumentException.class, java.lang.IllegalAccessException.class})
    public final void expandFieldArray(@org.jetbrains.annotations.NotNull
    java.lang.Object instance, @org.jetbrains.annotations.NotNull
    java.lang.String fieldName, @org.jetbrains.annotations.NotNull
    java.lang.Object[] extraElements) throws java.lang.NoSuchFieldException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException {
    }
    
    /**
     * Replace the value of a field containing a non null array, by a new array containing the
     * elements of the original array plus the elements of extraElements.
     *
     * @param instance      the instance whose field is to be modified.
     * @param fieldName     the field to modify.
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.NoSuchFieldException.class, java.lang.IllegalArgumentException.class, java.lang.IllegalAccessException.class})
    public final void reduceFieldArray(@org.jetbrains.annotations.NotNull
    java.lang.Object instance, @org.jetbrains.annotations.NotNull
    java.lang.String fieldName, int reduceSize) throws java.lang.NoSuchFieldException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException {
    }
    
    @org.jetbrains.annotations.Nullable
    @android.annotation.SuppressLint(value = {"PrivateApi"})
    public final java.lang.Object getActivityThread(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.Class<?> activityThread) {
        return null;
    }
    
    /**
     * Handy method for fetching hidden integer constant value in system classes.
     *
     * @param clazz
     * @param fieldName
     * @return
     */
    public final int getValueOfStaticIntField(@org.jetbrains.annotations.NotNull
    java.lang.Class<?> clazz, @org.jetbrains.annotations.NotNull
    java.lang.String fieldName, int defVal) {
        return 0;
    }
}