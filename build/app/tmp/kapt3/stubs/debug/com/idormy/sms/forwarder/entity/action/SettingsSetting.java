package com.idormy.sms.forwarder.entity.action;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\\\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u00f5\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u001eJ\t\u0010W\u001a\u00020\u0003H\u00c6\u0003J\t\u0010X\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0005H\u00c6\u0003J\t\u0010[\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0012H\u00c6\u0003J\t\u0010]\u001a\u00020\u0012H\u00c6\u0003J\t\u0010^\u001a\u00020\u0015H\u00c6\u0003J\t\u0010_\u001a\u00020\u0012H\u00c6\u0003J\t\u0010`\u001a\u00020\u0005H\u00c6\u0003J\t\u0010a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010g\u001a\u00020\u0012H\u00c6\u0003J\t\u0010h\u001a\u00020\u0005H\u00c6\u0003J\t\u0010i\u001a\u00020\u0005H\u00c6\u0003J\t\u0010j\u001a\u00020\u0005H\u00c6\u0003J\t\u0010k\u001a\u00020\u0005H\u00c6\u0003J\t\u0010l\u001a\u00020\u0005H\u00c6\u0003J\t\u0010m\u001a\u00020\u0005H\u00c6\u0003J\t\u0010n\u001a\u00020\u0005H\u00c6\u0003J\u00f9\u0001\u0010o\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0012H\u00c6\u0001J\u0013\u0010p\u001a\u00020\u00052\b\u0010q\u001a\u0004\u0018\u00010rH\u00d6\u0003J\t\u0010s\u001a\u00020\u0012H\u00d6\u0001J\t\u0010t\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001a\u0010\u001d\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010*\"\u0004\b4\u0010,R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010*\"\u0004\b6\u0010,R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010*\"\u0004\b:\u0010,R\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010*\"\u0004\b<\u0010,R\u001a\u0010\u001b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010*\"\u0004\b>\u0010,R\u001a\u0010\u001a\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010*\"\u0004\b@\u0010,R\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010*\"\u0004\bB\u0010,R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010*\"\u0004\bD\u0010,R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010*\"\u0004\bF\u0010,R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010*\"\u0004\bH\u0010,R\u001a\u0010\u0017\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010*\"\u0004\bJ\u0010,R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010&\"\u0004\bL\u0010(R\u001a\u0010\u0016\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010&\"\u0004\bN\u0010(R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010\u0013\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010&\"\u0004\bT\u0010(R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010 \"\u0004\bV\u0010\"\u00a8\u0006u"}, d2 = {"Lcom/idormy/sms/forwarder/entity/action/SettingsSetting;", "Ljava/io/Serializable;", "description", "", "enableSms", "", "enablePhone", "enableCallType1", "enableCallType2", "enableCallType3", "enableCallType4", "enableCallType5", "enableCallType6", "enableAppNotify", "enableCancelAppNotify", "enableNotUserPresent", "enableLocation", "locationAccuracy", "", "locationPowerRequirement", "locationMinInterval", "", "locationMinDistance", "enableSmsCommand", "smsCommandSafePhone", "enableLoadAppList", "enableLoadUserAppList", "enableLoadSystemAppList", "cancelExtraAppNotify", "duplicateMessagesLimits", "(Ljava/lang/String;ZZZZZZZZZZZZIIJIZLjava/lang/String;ZZZLjava/lang/String;I)V", "getCancelExtraAppNotify", "()Ljava/lang/String;", "setCancelExtraAppNotify", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getDuplicateMessagesLimits", "()I", "setDuplicateMessagesLimits", "(I)V", "getEnableAppNotify", "()Z", "setEnableAppNotify", "(Z)V", "getEnableCallType1", "setEnableCallType1", "getEnableCallType2", "setEnableCallType2", "getEnableCallType3", "setEnableCallType3", "getEnableCallType4", "setEnableCallType4", "getEnableCallType5", "setEnableCallType5", "getEnableCallType6", "setEnableCallType6", "getEnableCancelAppNotify", "setEnableCancelAppNotify", "getEnableLoadAppList", "setEnableLoadAppList", "getEnableLoadSystemAppList", "setEnableLoadSystemAppList", "getEnableLoadUserAppList", "setEnableLoadUserAppList", "getEnableLocation", "setEnableLocation", "getEnableNotUserPresent", "setEnableNotUserPresent", "getEnablePhone", "setEnablePhone", "getEnableSms", "setEnableSms", "getEnableSmsCommand", "setEnableSmsCommand", "getLocationAccuracy", "setLocationAccuracy", "getLocationMinDistance", "setLocationMinDistance", "getLocationMinInterval", "()J", "setLocationMinInterval", "(J)V", "getLocationPowerRequirement", "setLocationPowerRequirement", "getSmsCommandSafePhone", "setSmsCommandSafePhone", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_debug"})
public final class SettingsSetting implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    private java.lang.String description;
    private boolean enableSms;
    private boolean enablePhone;
    private boolean enableCallType1;
    private boolean enableCallType2;
    private boolean enableCallType3;
    private boolean enableCallType4;
    private boolean enableCallType5;
    private boolean enableCallType6;
    private boolean enableAppNotify;
    private boolean enableCancelAppNotify;
    private boolean enableNotUserPresent;
    private boolean enableLocation;
    private int locationAccuracy;
    private int locationPowerRequirement;
    private long locationMinInterval;
    private int locationMinDistance;
    private boolean enableSmsCommand;
    @org.jetbrains.annotations.NotNull
    private java.lang.String smsCommandSafePhone;
    private boolean enableLoadAppList;
    private boolean enableLoadUserAppList;
    private boolean enableLoadSystemAppList;
    @org.jetbrains.annotations.NotNull
    private java.lang.String cancelExtraAppNotify;
    private int duplicateMessagesLimits;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.entity.action.SettingsSetting copy(@org.jetbrains.annotations.NotNull
    java.lang.String description, boolean enableSms, boolean enablePhone, boolean enableCallType1, boolean enableCallType2, boolean enableCallType3, boolean enableCallType4, boolean enableCallType5, boolean enableCallType6, boolean enableAppNotify, boolean enableCancelAppNotify, boolean enableNotUserPresent, boolean enableLocation, int locationAccuracy, int locationPowerRequirement, long locationMinInterval, int locationMinDistance, boolean enableSmsCommand, @org.jetbrains.annotations.NotNull
    java.lang.String smsCommandSafePhone, boolean enableLoadAppList, boolean enableLoadUserAppList, boolean enableLoadSystemAppList, @org.jetbrains.annotations.NotNull
    java.lang.String cancelExtraAppNotify, int duplicateMessagesLimits) {
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
    
    public SettingsSetting() {
        super();
    }
    
    public SettingsSetting(@org.jetbrains.annotations.NotNull
    java.lang.String description, boolean enableSms, boolean enablePhone, boolean enableCallType1, boolean enableCallType2, boolean enableCallType3, boolean enableCallType4, boolean enableCallType5, boolean enableCallType6, boolean enableAppNotify, boolean enableCancelAppNotify, boolean enableNotUserPresent, boolean enableLocation, int locationAccuracy, int locationPowerRequirement, long locationMinInterval, int locationMinDistance, boolean enableSmsCommand, @org.jetbrains.annotations.NotNull
    java.lang.String smsCommandSafePhone, boolean enableLoadAppList, boolean enableLoadUserAppList, boolean enableLoadSystemAppList, @org.jetbrains.annotations.NotNull
    java.lang.String cancelExtraAppNotify, int duplicateMessagesLimits) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getEnableSms() {
        return false;
    }
    
    public final void setEnableSms(boolean p0) {
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getEnablePhone() {
        return false;
    }
    
    public final void setEnablePhone(boolean p0) {
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getEnableCallType1() {
        return false;
    }
    
    public final void setEnableCallType1(boolean p0) {
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getEnableCallType2() {
        return false;
    }
    
    public final void setEnableCallType2(boolean p0) {
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean getEnableCallType3() {
        return false;
    }
    
    public final void setEnableCallType3(boolean p0) {
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getEnableCallType4() {
        return false;
    }
    
    public final void setEnableCallType4(boolean p0) {
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean getEnableCallType5() {
        return false;
    }
    
    public final void setEnableCallType5(boolean p0) {
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean getEnableCallType6() {
        return false;
    }
    
    public final void setEnableCallType6(boolean p0) {
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean getEnableAppNotify() {
        return false;
    }
    
    public final void setEnableAppNotify(boolean p0) {
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final boolean getEnableCancelAppNotify() {
        return false;
    }
    
    public final void setEnableCancelAppNotify(boolean p0) {
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean getEnableNotUserPresent() {
        return false;
    }
    
    public final void setEnableNotUserPresent(boolean p0) {
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final boolean getEnableLocation() {
        return false;
    }
    
    public final void setEnableLocation(boolean p0) {
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int getLocationAccuracy() {
        return 0;
    }
    
    public final void setLocationAccuracy(int p0) {
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getLocationPowerRequirement() {
        return 0;
    }
    
    public final void setLocationPowerRequirement(int p0) {
    }
    
    public final long component16() {
        return 0L;
    }
    
    public final long getLocationMinInterval() {
        return 0L;
    }
    
    public final void setLocationMinInterval(long p0) {
    }
    
    public final int component17() {
        return 0;
    }
    
    public final int getLocationMinDistance() {
        return 0;
    }
    
    public final void setLocationMinDistance(int p0) {
    }
    
    public final boolean component18() {
        return false;
    }
    
    public final boolean getEnableSmsCommand() {
        return false;
    }
    
    public final void setEnableSmsCommand(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSmsCommandSafePhone() {
        return null;
    }
    
    public final void setSmsCommandSafePhone(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean component20() {
        return false;
    }
    
    public final boolean getEnableLoadAppList() {
        return false;
    }
    
    public final void setEnableLoadAppList(boolean p0) {
    }
    
    public final boolean component21() {
        return false;
    }
    
    public final boolean getEnableLoadUserAppList() {
        return false;
    }
    
    public final void setEnableLoadUserAppList(boolean p0) {
    }
    
    public final boolean component22() {
        return false;
    }
    
    public final boolean getEnableLoadSystemAppList() {
        return false;
    }
    
    public final void setEnableLoadSystemAppList(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCancelExtraAppNotify() {
        return null;
    }
    
    public final void setCancelExtraAppNotify(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int component24() {
        return 0;
    }
    
    public final int getDuplicateMessagesLimits() {
        return 0;
    }
    
    public final void setDuplicateMessagesLimits(int p0) {
    }
}