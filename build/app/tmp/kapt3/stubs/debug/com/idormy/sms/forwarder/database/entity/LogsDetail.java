package com.idormy.sms.forwarder.database.entity;

import java.lang.System;

@androidx.room.DatabaseView(value = "SELECT LOGS.id,LOGS.type,LOGS.msg_id,LOGS.rule_id,LOGS.sender_id,LOGS.forward_status,LOGS.forward_response,LOGS.TIME,Rule.filed AS rule_filed,Rule.`check` AS rule_check,Rule.value AS rule_value,Rule.sim_slot AS rule_sim_slot,Sender.type AS sender_type,Sender.NAME AS sender_name FROM LOGS  LEFT JOIN Rule ON LOGS.rule_id = Rule.id LEFT JOIN Sender ON LOGS.sender_id = Sender.id")
@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0014J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\t\u0010?\u001a\u00020\u0005H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\t\u0010A\u001a\u00020\nH\u00c6\u0003J\t\u0010B\u001a\u00020\u0005H\u00c6\u0003J\t\u0010C\u001a\u00020\u0005H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\nH\u00c6\u0003J\t\u0010H\u001a\u00020\u0005H\u00c6\u0003J\t\u0010I\u001a\u00020\rH\u00c6\u0003J\t\u0010J\u001a\u00020\u0005H\u00c6\u0003J\u0095\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0005H\u00c6\u0001J\t\u0010L\u001a\u00020\nH\u00d6\u0001J\u0013\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PH\u00d6\u0003J\t\u0010Q\u001a\u00020\nH\u00d6\u0001J\t\u0010R\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\nH\u00d6\u0001R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001e\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001e\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001e\"\u0004\b(\u0010 R\u001e\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010\u0018R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R\u0011\u0010/\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b0\u0010\u001aR\u001e\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010\u0018R\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001cR\u0011\u00105\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b6\u0010\u001aR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0016\"\u0004\b<\u0010\u0018\u00a8\u0006X"}, d2 = {"Lcom/idormy/sms/forwarder/database/entity/LogsDetail;", "Landroid/os/Parcelable;", "id", "", "type", "", "msgId", "ruleId", "senderId", "forwardStatus", "", "forwardResponse", "time", "Ljava/util/Date;", "ruleFiled", "ruleCheck", "ruleValue", "ruleSimSlot", "senderType", "senderName", "(JLjava/lang/String;JJJILjava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getForwardResponse", "()Ljava/lang/String;", "setForwardResponse", "(Ljava/lang/String;)V", "getForwardStatus", "()I", "setForwardStatus", "(I)V", "getId", "()J", "setId", "(J)V", "getMsgId", "setMsgId", "getRuleCheck", "setRuleCheck", "getRuleFiled", "setRuleFiled", "getRuleId", "setRuleId", "getRuleSimSlot", "setRuleSimSlot", "getRuleValue", "setRuleValue", "getSenderId", "setSenderId", "senderImageId", "getSenderImageId", "getSenderName", "setSenderName", "getSenderType", "setSenderType", "statusImageId", "getStatusImageId", "getTime", "()Ljava/util/Date;", "setTime", "(Ljava/util/Date;)V", "getType", "setType", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class LogsDetail implements android.os.Parcelable {
    @androidx.room.ColumnInfo(name = "id")
    private long id;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "type", defaultValue = "sms")
    private java.lang.String type;
    @androidx.room.ColumnInfo(name = "msg_id", defaultValue = "0")
    private long msgId;
    @androidx.room.ColumnInfo(name = "rule_id", defaultValue = "0")
    private long ruleId;
    @androidx.room.ColumnInfo(name = "sender_id", defaultValue = "0")
    private long senderId;
    @androidx.room.ColumnInfo(name = "forward_status", defaultValue = "1")
    private int forwardStatus;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "forward_response", defaultValue = "")
    private java.lang.String forwardResponse;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "time")
    private java.util.Date time;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "rule_filed", defaultValue = "")
    private java.lang.String ruleFiled;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "rule_check", defaultValue = "")
    private java.lang.String ruleCheck;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "rule_value", defaultValue = "")
    private java.lang.String ruleValue;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "rule_sim_slot", defaultValue = "")
    private java.lang.String ruleSimSlot;
    @androidx.room.ColumnInfo(name = "sender_type", defaultValue = "1")
    private int senderType;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "sender_name", defaultValue = "")
    private java.lang.String senderName;
    public static final android.os.Parcelable.Creator<com.idormy.sms.forwarder.database.entity.LogsDetail> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.entity.LogsDetail copy(long id, @org.jetbrains.annotations.NotNull
    java.lang.String type, long msgId, long ruleId, long senderId, int forwardStatus, @org.jetbrains.annotations.NotNull
    java.lang.String forwardResponse, @org.jetbrains.annotations.NotNull
    java.util.Date time, @org.jetbrains.annotations.NotNull
    java.lang.String ruleFiled, @org.jetbrains.annotations.NotNull
    java.lang.String ruleCheck, @org.jetbrains.annotations.NotNull
    java.lang.String ruleValue, @org.jetbrains.annotations.NotNull
    java.lang.String ruleSimSlot, int senderType, @org.jetbrains.annotations.NotNull
    java.lang.String senderName) {
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
    
    public LogsDetail(long id, @org.jetbrains.annotations.NotNull
    java.lang.String type, long msgId, long ruleId, long senderId, int forwardStatus, @org.jetbrains.annotations.NotNull
    java.lang.String forwardResponse, @org.jetbrains.annotations.NotNull
    java.util.Date time, @org.jetbrains.annotations.NotNull
    java.lang.String ruleFiled, @org.jetbrains.annotations.NotNull
    java.lang.String ruleCheck, @org.jetbrains.annotations.NotNull
    java.lang.String ruleValue, @org.jetbrains.annotations.NotNull
    java.lang.String ruleSimSlot, int senderType, @org.jetbrains.annotations.NotNull
    java.lang.String senderName) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getMsgId() {
        return 0L;
    }
    
    public final void setMsgId(long p0) {
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getRuleId() {
        return 0L;
    }
    
    public final void setRuleId(long p0) {
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long getSenderId() {
        return 0L;
    }
    
    public final void setSenderId(long p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getForwardStatus() {
        return 0;
    }
    
    public final void setForwardStatus(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getForwardResponse() {
        return null;
    }
    
    public final void setForwardResponse(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getTime() {
        return null;
    }
    
    public final void setTime(@org.jetbrains.annotations.NotNull
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRuleFiled() {
        return null;
    }
    
    public final void setRuleFiled(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRuleCheck() {
        return null;
    }
    
    public final void setRuleCheck(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRuleValue() {
        return null;
    }
    
    public final void setRuleValue(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRuleSimSlot() {
        return null;
    }
    
    public final void setRuleSimSlot(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getSenderType() {
        return 0;
    }
    
    public final void setSenderType(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSenderName() {
        return null;
    }
    
    public final void setSenderName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getStatusImageId() {
        return 0;
    }
    
    public final int getSenderImageId() {
        return 0;
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.idormy.sms.forwarder.database.entity.LogsDetail> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.idormy.sms.forwarder.database.entity.LogsDetail createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.idormy.sms.forwarder.database.entity.LogsDetail[] newArray(int size) {
            return null;
        }
    }
}