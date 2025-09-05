package com.idormy.sms.forwarder.entity.result;

import java.lang.System;

@kotlin.Suppress(names = {"PropertyName"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003JF\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\r\u00a8\u0006("}, d2 = {"Lcom/idormy/sms/forwarder/entity/result/WeworkAgentResult;", "", "errcode", "", "errmsg", "", "access_token", "expires_in", "msgid", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getAccess_token", "()Ljava/lang/String;", "setAccess_token", "(Ljava/lang/String;)V", "getErrcode", "()J", "setErrcode", "(J)V", "getErrmsg", "setErrmsg", "getExpires_in", "()Ljava/lang/Long;", "setExpires_in", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getMsgid", "setMsgid", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/idormy/sms/forwarder/entity/result/WeworkAgentResult;", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class WeworkAgentResult {
    private long errcode;
    @org.jetbrains.annotations.NotNull
    private java.lang.String errmsg;
    @org.jetbrains.annotations.Nullable
    private java.lang.String access_token;
    @org.jetbrains.annotations.Nullable
    private java.lang.Long expires_in;
    @org.jetbrains.annotations.Nullable
    private java.lang.String msgid;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.entity.result.WeworkAgentResult copy(long errcode, @org.jetbrains.annotations.NotNull
    java.lang.String errmsg, @org.jetbrains.annotations.Nullable
    java.lang.String access_token, @org.jetbrains.annotations.Nullable
    java.lang.Long expires_in, @org.jetbrains.annotations.Nullable
    java.lang.String msgid) {
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
    
    public WeworkAgentResult(long errcode, @org.jetbrains.annotations.NotNull
    java.lang.String errmsg, @org.jetbrains.annotations.Nullable
    java.lang.String access_token, @org.jetbrains.annotations.Nullable
    java.lang.Long expires_in, @org.jetbrains.annotations.Nullable
    java.lang.String msgid) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getErrcode() {
        return 0L;
    }
    
    public final void setErrcode(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getErrmsg() {
        return null;
    }
    
    public final void setErrmsg(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAccess_token() {
        return null;
    }
    
    public final void setAccess_token(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getExpires_in() {
        return null;
    }
    
    public final void setExpires_in(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMsgid() {
        return null;
    }
    
    public final void setMsgid(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
}