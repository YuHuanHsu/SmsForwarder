package com.idormy.sms.forwarder.entity.result;

import java.lang.System;

@kotlin.Suppress(names = {"PropertyName"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003JF\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011\u00a8\u0006("}, d2 = {"Lcom/idormy/sms/forwarder/entity/result/FeishuAppResult;", "", "code", "", "msg", "", "tenant_access_token", "expire", "content", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getCode", "()J", "setCode", "(J)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getExpire", "()Ljava/lang/Long;", "setExpire", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getMsg", "setMsg", "getTenant_access_token", "setTenant_access_token", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/idormy/sms/forwarder/entity/result/FeishuAppResult;", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class FeishuAppResult {
    private long code;
    @org.jetbrains.annotations.NotNull
    private java.lang.String msg;
    @org.jetbrains.annotations.Nullable
    private java.lang.String tenant_access_token;
    @org.jetbrains.annotations.Nullable
    private java.lang.Long expire;
    @org.jetbrains.annotations.Nullable
    private java.lang.String content;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.entity.result.FeishuAppResult copy(long code, @org.jetbrains.annotations.NotNull
    java.lang.String msg, @org.jetbrains.annotations.Nullable
    java.lang.String tenant_access_token, @org.jetbrains.annotations.Nullable
    java.lang.Long expire, @org.jetbrains.annotations.Nullable
    java.lang.String content) {
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
    
    public FeishuAppResult(long code, @org.jetbrains.annotations.NotNull
    java.lang.String msg, @org.jetbrains.annotations.Nullable
    java.lang.String tenant_access_token, @org.jetbrains.annotations.Nullable
    java.lang.Long expire, @org.jetbrains.annotations.Nullable
    java.lang.String content) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getCode() {
        return 0L;
    }
    
    public final void setCode(long p0) {
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
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTenant_access_token() {
        return null;
    }
    
    public final void setTenant_access_token(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getExpire() {
        return null;
    }
    
    public final void setExpire(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getContent() {
        return null;
    }
    
    public final void setContent(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
}