package com.idormy.sms.forwarder.entity.action;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0006H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0006H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0006H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003Jc\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u00d6\u0003J\t\u00102\u001a\u00020\u0006H\u00d6\u0001J\t\u00103\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019\u00a8\u00064"}, d2 = {"Lcom/idormy/sms/forwarder/entity/action/AlarmSetting;", "Ljava/io/Serializable;", "description", "", "action", "volume", "", "playTimes", "music", "repeatTimes", "vibrate", "flashTimes", "flash", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getFlash", "setFlash", "getFlashTimes", "()I", "setFlashTimes", "(I)V", "getMusic", "setMusic", "getPlayTimes", "setPlayTimes", "getRepeatTimes", "setRepeatTimes", "getVibrate", "setVibrate", "getVolume", "setVolume", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class AlarmSetting implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull
    private java.lang.String action;
    private int volume;
    private int playTimes;
    @org.jetbrains.annotations.NotNull
    private java.lang.String music;
    private int repeatTimes;
    @org.jetbrains.annotations.NotNull
    private java.lang.String vibrate;
    private int flashTimes;
    @org.jetbrains.annotations.NotNull
    private java.lang.String flash;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.entity.action.AlarmSetting copy(@org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String action, int volume, int playTimes, @org.jetbrains.annotations.NotNull
    java.lang.String music, int repeatTimes, @org.jetbrains.annotations.NotNull
    java.lang.String vibrate, int flashTimes, @org.jetbrains.annotations.NotNull
    java.lang.String flash) {
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
    
    public AlarmSetting() {
        super();
    }
    
    public AlarmSetting(@org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String action, int volume, int playTimes, @org.jetbrains.annotations.NotNull
    java.lang.String music, int repeatTimes, @org.jetbrains.annotations.NotNull
    java.lang.String vibrate, int flashTimes, @org.jetbrains.annotations.NotNull
    java.lang.String flash) {
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
    
    public final int getVolume() {
        return 0;
    }
    
    public final void setVolume(int p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getPlayTimes() {
        return 0;
    }
    
    public final void setPlayTimes(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMusic() {
        return null;
    }
    
    public final void setMusic(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getRepeatTimes() {
        return 0;
    }
    
    public final void setRepeatTimes(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVibrate() {
        return null;
    }
    
    public final void setVibrate(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getFlashTimes() {
        return 0;
    }
    
    public final void setFlashTimes(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFlash() {
        return null;
    }
    
    public final void setFlash(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
}