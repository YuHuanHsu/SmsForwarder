package com.idormy.sms.forwarder.entity.condition;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nBK\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\u0012J\t\u0010\'\u001a\u00020\fH\u00c6\u0003J\t\u0010(\u001a\u00020\fH\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\tH\u00c6\u0003JO\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010/\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u000101H\u00d6\u0003J\u0006\u00102\u001a\u00020\u0003J\t\u00103\u001a\u00020\u0003H\u00d6\u0001J\t\u00104\u001a\u00020\fH\u00d6\u0001R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 \u00a8\u00065"}, d2 = {"Lcom/idormy/sms/forwarder/entity/condition/LockScreenSetting;", "Ljava/io/Serializable;", "actionCheckId", "", "timeAfterOff", "timeAfterOn", "timeAfterLocked", "timeAfterUnlocked", "checkAgain", "", "(IIIIIZ)V", "description", "", "action", "timeAfterScreenOff", "timeAfterScreenOn", "timeAfterScreenLocked", "timeAfterScreenUnlocked", "(Ljava/lang/String;Ljava/lang/String;IIIIZ)V", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "getCheckAgain", "()Z", "setCheckAgain", "(Z)V", "getDescription", "setDescription", "getTimeAfterScreenLocked", "()I", "setTimeAfterScreenLocked", "(I)V", "getTimeAfterScreenOff", "setTimeAfterScreenOff", "getTimeAfterScreenOn", "setTimeAfterScreenOn", "getTimeAfterScreenUnlocked", "setTimeAfterScreenUnlocked", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "getActionCheckId", "hashCode", "toString", "app_debug"})
public final class LockScreenSetting implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull
    private java.lang.String action;
    private int timeAfterScreenOff;
    private int timeAfterScreenOn;
    private int timeAfterScreenLocked;
    private int timeAfterScreenUnlocked;
    private boolean checkAgain;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.entity.condition.LockScreenSetting copy(@org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String action, int timeAfterScreenOff, int timeAfterScreenOn, int timeAfterScreenLocked, int timeAfterScreenUnlocked, boolean checkAgain) {
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
    
    public LockScreenSetting() {
        super();
    }
    
    public LockScreenSetting(@org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String action, int timeAfterScreenOff, int timeAfterScreenOn, int timeAfterScreenLocked, int timeAfterScreenUnlocked, boolean checkAgain) {
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
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAction() {
        return null;
    }
    
    public final void setAction(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getTimeAfterScreenOff() {
        return 0;
    }
    
    public final void setTimeAfterScreenOff(int p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getTimeAfterScreenOn() {
        return 0;
    }
    
    public final void setTimeAfterScreenOn(int p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getTimeAfterScreenLocked() {
        return 0;
    }
    
    public final void setTimeAfterScreenLocked(int p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getTimeAfterScreenUnlocked() {
        return 0;
    }
    
    public final void setTimeAfterScreenUnlocked(int p0) {
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getCheckAgain() {
        return false;
    }
    
    public final void setCheckAgain(boolean p0) {
    }
    
    public LockScreenSetting(int actionCheckId, int timeAfterOff, int timeAfterOn, int timeAfterLocked, int timeAfterUnlocked, boolean checkAgain) {
        super();
    }
    
    public final int getActionCheckId() {
        return 0;
    }
}