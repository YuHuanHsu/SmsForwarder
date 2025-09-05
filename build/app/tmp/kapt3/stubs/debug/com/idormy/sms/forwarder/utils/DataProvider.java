package com.idormy.sms.forwarder.utils;

import java.lang.System;

@kotlin.Suppress(names = {"SameParameterValue"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017H\u0007R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00048GX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048GX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048GX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\b\u00a8\u0006\u001d"}, d2 = {"Lcom/idormy/sms/forwarder/utils/DataProvider;", "", "()V", "emptyCallInfo", "", "Lcom/idormy/sms/forwarder/entity/CallInfo;", "getEmptyCallInfo$annotations", "getEmptyCallInfo", "()Ljava/util/List;", "emptyContactInfo", "Lcom/idormy/sms/forwarder/entity/ContactInfo;", "getEmptyContactInfo$annotations", "getEmptyContactInfo", "emptySmsInfo", "Lcom/idormy/sms/forwarder/entity/SmsInfo;", "getEmptySmsInfo$annotations", "getEmptySmsInfo", "timePeriodOption", "", "getTimePeriodOption$annotations", "getTimePeriodOption", "getTimePeriod", "totalHour", "", "interval", "isCurrentTimeInPeriod", "", "periodStartIndex", "periodEndIndex", "app_debug"})
public final class DataProvider {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.DataProvider INSTANCE = null;
    
    private DataProvider() {
        super();
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getEmptySmsInfo$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull
    @com.xuexiang.xaop.annotation.MemoryCache
    public static final java.util.List<com.idormy.sms.forwarder.entity.SmsInfo> getEmptySmsInfo() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getEmptyCallInfo$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull
    @com.xuexiang.xaop.annotation.MemoryCache
    public static final java.util.List<com.idormy.sms.forwarder.entity.CallInfo> getEmptyCallInfo() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getEmptyContactInfo$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull
    @com.xuexiang.xaop.annotation.MemoryCache
    public static final java.util.List<com.idormy.sms.forwarder.entity.ContactInfo> getEmptyContactInfo() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getTimePeriodOption$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull
    @com.xuexiang.xaop.annotation.MemoryCache
    public static final java.util.List<java.lang.String> getTimePeriodOption() {
        return null;
    }
    
    /**
     * 获取时间段
     *
     * @param interval 时间间隔（分钟）
     * @return
     */
    private final java.util.List<java.lang.String> getTimePeriod(int totalHour, int interval) {
        return null;
    }
    
    /**
     * 判断当前时间是否在时间段内
     */
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final boolean isCurrentTimeInPeriod(int periodStartIndex, int periodEndIndex) {
        return false;
    }
}