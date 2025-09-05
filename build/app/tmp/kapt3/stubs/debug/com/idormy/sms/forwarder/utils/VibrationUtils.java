package com.idormy.sms.forwarder.utils;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J(\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00100\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\u001aJ8\u0010\u001e\u001a\u00020\u001a2\u001e\u0010\u001f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00100\u00162\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/idormy/sms/forwarder/utils/VibrationUtils;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "currentRepeat", "", "handler", "Landroid/os/Handler;", "<set-?>", "", "isVibrating", "()Z", "vibrator", "Landroid/os/Vibrator;", "createTriple", "Lkotlin/Triple;", "", "char", "", "length", "parsePattern", "", "pattern", "", "startVibration", "", "patternString", "repeatTimes", "stopVibration", "vibratePattern", "parsedPattern", "index", "app_debug"})
public final class VibrationUtils {
    private final android.os.Vibrator vibrator = null;
    private final android.os.Handler handler = null;
    private int currentRepeat = 0;
    private boolean isVibrating = false;
    
    public VibrationUtils(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    public final boolean isVibrating() {
        return false;
    }
    
    public final void startVibration(@org.jetbrains.annotations.NotNull
    java.lang.String patternString, int repeatTimes) {
    }
    
    public final void stopVibration() {
    }
    
    private final java.util.List<kotlin.Triple<java.lang.Long, java.lang.Boolean, java.lang.Integer>> parsePattern(java.lang.String pattern) {
        return null;
    }
    
    private final kotlin.Triple<java.lang.Long, java.lang.Boolean, java.lang.Integer> createTriple(char p0_1526187, long length) {
        return null;
    }
    
    private final void vibratePattern(java.util.List<kotlin.Triple<java.lang.Long, java.lang.Boolean, java.lang.Integer>> parsedPattern, int index, int repeatTimes) {
    }
}