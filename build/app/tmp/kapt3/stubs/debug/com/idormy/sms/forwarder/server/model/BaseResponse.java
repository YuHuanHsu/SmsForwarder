package com.idormy.sms.forwarder.server.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003JJ\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010)\u001a\u00020\u0004H\u00d6\u0001J\t\u0010*\u001a\u00020\u0006H\u00d6\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006+"}, d2 = {"Lcom/idormy/sms/forwarder/server/model/BaseResponse;", "T", "", "code", "", "msg", "", "data", "timestamp", "", "sign", "(ILjava/lang/String;Ljava/lang/Object;JLjava/lang/String;)V", "getCode", "()I", "setCode", "(I)V", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "getSign", "setSign", "getTimestamp", "()J", "setTimestamp", "(J)V", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/Object;JLjava/lang/String;)Lcom/idormy/sms/forwarder/server/model/BaseResponse;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class BaseResponse<T extends java.lang.Object> {
    private int code;
    @org.jetbrains.annotations.NotNull
    private java.lang.String msg;
    @org.jetbrains.annotations.Nullable
    private T data;
    private long timestamp;
    @org.jetbrains.annotations.Nullable
    private java.lang.String sign;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.server.model.BaseResponse<T> copy(int code, @org.jetbrains.annotations.NotNull
    java.lang.String msg, @org.jetbrains.annotations.Nullable
    T data, long timestamp, @org.jetbrains.annotations.Nullable
    java.lang.String sign) {
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
    
    public BaseResponse(int code, @org.jetbrains.annotations.NotNull
    java.lang.String msg, @org.jetbrains.annotations.Nullable
    T data, long timestamp, @org.jetbrains.annotations.Nullable
    java.lang.String sign) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getCode() {
        return 0;
    }
    
    public final void setCode(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMsg() {
        return null;
    }
    
    public final void setMsg(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final T component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final T getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable
    T p0) {
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    public final void setTimestamp(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSign() {
        return null;
    }
    
    public final void setSign(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
}