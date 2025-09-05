package com.idormy.sms.forwarder.database.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "Logs", foreignKeys = {@androidx.room.ForeignKey(entity = com.idormy.sms.forwarder.database.entity.Msg.class, childColumns = {"msg_id"}, onUpdate = 5, onDelete = 5, parentColumns = {"id"}), @androidx.room.ForeignKey(entity = com.idormy.sms.forwarder.database.entity.Rule.class, childColumns = {"rule_id"}, onUpdate = 5, onDelete = 5, parentColumns = {"id"}), @androidx.room.ForeignKey(entity = com.idormy.sms.forwarder.database.entity.Sender.class, childColumns = {"sender_id"}, onUpdate = 5, onDelete = 5, parentColumns = {"id"})}, indices = {@androidx.room.Index(unique = true, value = {"id"}), @androidx.room.Index(value = {"msg_id"}), @androidx.room.Index(value = {"rule_id"}), @androidx.room.Index(value = {"sender_id"})})
@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\nH\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\rH\u00c6\u0003JY\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\t\u00100\u001a\u00020\nH\u00d6\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u00d6\u0003J\t\u00105\u001a\u00020\nH\u00d6\u0001J\t\u00106\u001a\u00020\u0005H\u00d6\u0001J\u0019\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\nH\u00d6\u0001R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012\u00a8\u0006<"}, d2 = {"Lcom/idormy/sms/forwarder/database/entity/Logs;", "Landroid/os/Parcelable;", "id", "", "type", "", "msgId", "ruleId", "senderId", "forwardStatus", "", "forwardResponse", "time", "Ljava/util/Date;", "(JLjava/lang/String;JJJILjava/lang/String;Ljava/util/Date;)V", "getForwardResponse", "()Ljava/lang/String;", "setForwardResponse", "(Ljava/lang/String;)V", "getForwardStatus", "()I", "setForwardStatus", "(I)V", "getId", "()J", "setId", "(J)V", "getMsgId", "setMsgId", "getRuleId", "setRuleId", "getSenderId", "setSenderId", "getTime", "()Ljava/util/Date;", "setTime", "(Ljava/util/Date;)V", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class Logs implements android.os.Parcelable {
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey(autoGenerate = true)
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
    public static final android.os.Parcelable.Creator<com.idormy.sms.forwarder.database.entity.Logs> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.entity.Logs copy(long id, @org.jetbrains.annotations.NotNull
    java.lang.String type, long msgId, long ruleId, long senderId, int forwardStatus, @org.jetbrains.annotations.NotNull
    java.lang.String forwardResponse, @org.jetbrains.annotations.NotNull
    java.util.Date time) {
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
    
    public Logs(long id, @org.jetbrains.annotations.NotNull
    java.lang.String type, long msgId, long ruleId, long senderId, int forwardStatus, @org.jetbrains.annotations.NotNull
    java.lang.String forwardResponse, @org.jetbrains.annotations.NotNull
    java.util.Date time) {
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
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.idormy.sms.forwarder.database.entity.Logs> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.idormy.sms.forwarder.database.entity.Logs createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.idormy.sms.forwarder.database.entity.Logs[] newArray(int size) {
            return null;
        }
    }
}