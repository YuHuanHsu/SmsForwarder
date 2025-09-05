package com.idormy.sms.forwarder.database.entity;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.idormy.sms.forwarder.database.ext.ConvertersSenderList.class})
@androidx.room.Entity(tableName = "Rule", foreignKeys = {@androidx.room.ForeignKey(entity = com.idormy.sms.forwarder.database.entity.Sender.class, childColumns = {"sender_id"}, onUpdate = 5, onDelete = 5, parentColumns = {"id"})}, indices = {@androidx.room.Index(unique = true, value = {"id"}), @androidx.room.Index(value = {"sender_id"}), @androidx.room.Index(value = {"sender_list"})})
@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 t2\u00020\u0001:\u0001tB\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010M\u001a\u00020@2\b\u0010N\u001a\u0004\u0018\u00010OJ\u0012\u0010P\u001a\u00020@2\b\u0010Q\u001a\u0004\u0018\u00010\u0005H\u0002J\t\u0010R\u001a\u00020\u0003H\u00c6\u0003J\t\u0010S\u001a\u00020\u000eH\u00c6\u0003J\t\u0010T\u001a\u00020\u0010H\u00c6\u0003J\u000f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\t\u0010V\u001a\u00020\u0005H\u00c6\u0003J\t\u0010W\u001a\u00020\u000eH\u00c6\u0003J\t\u0010X\u001a\u00020\u000eH\u00c6\u0003J\t\u0010Y\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0005H\u00c6\u0003J\t\u0010[\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0005H\u00c6\u0003J\t\u0010]\u001a\u00020\u0005H\u00c6\u0003J\t\u0010^\u001a\u00020\u0003H\u00c6\u0003J\t\u0010_\u001a\u00020\u0005H\u00c6\u0003J\t\u0010`\u001a\u00020\u0005H\u00c6\u0003J\t\u0010a\u001a\u00020\u0005H\u00c6\u0003J\u00af\u0001\u0010b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u0005H\u00c6\u0001J\t\u0010c\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010d\u001a\u00020@2\b\u0010e\u001a\u0004\u0018\u00010fH\u00d6\u0003J\u0006\u0010g\u001a\u00020\u000eJ\u0006\u0010h\u001a\u00020\u000eJ\u0010\u0010i\u001a\u00020\u00052\b\b\u0002\u0010j\u001a\u00020@J\u0006\u0010k\u001a\u00020\u000eJ\u0006\u0010l\u001a\u00020\u000eJ\t\u0010m\u001a\u00020\u000eH\u00d6\u0001J\t\u0010n\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020\u000eH\u00d6\u0001R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\'R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010\u001cR\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\"\"\u0004\b+\u0010$R$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR\u001e\u0010\u0017\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u0010\u001cR\u001e\u0010\u0016\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\'\"\u0004\b5\u00106R\u001e\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\'\"\u0004\b8\u00106R\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001a\"\u0004\b:\u0010\u001cR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001a\"\u0004\b<\u0010\u001cR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\'\"\u0004\b>\u00106R\u0011\u0010?\u001a\u00020@8F\u00a2\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010C\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\bD\u0010\'R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u001a\"\u0004\bJ\u0010\u001cR\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u001a\"\u0004\bL\u0010\u001c\u00a8\u0006u"}, d2 = {"Lcom/idormy/sms/forwarder/database/entity/Rule;", "Landroid/os/Parcelable;", "id", "", "type", "", "filed", "check", "value", "senderId", "smsTemplate", "regexReplace", "simSlot", "status", "", "time", "Ljava/util/Date;", "senderList", "", "Lcom/idormy/sms/forwarder/database/entity/Sender;", "senderLogic", "silentPeriodStart", "silentPeriodEnd", "silentDayOfWeek", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/List;Ljava/lang/String;IILjava/lang/String;)V", "getCheck", "()Ljava/lang/String;", "setCheck", "(Ljava/lang/String;)V", "description", "getDescription", "getFiled", "setFiled", "getId", "()J", "setId", "(J)V", "imageId", "getImageId", "()I", "getRegexReplace", "setRegexReplace", "getSenderId", "setSenderId", "getSenderList", "()Ljava/util/List;", "setSenderList", "(Ljava/util/List;)V", "getSenderLogic", "setSenderLogic", "getSilentDayOfWeek", "setSilentDayOfWeek", "getSilentPeriodEnd", "setSilentPeriodEnd", "(I)V", "getSilentPeriodStart", "setSilentPeriodStart", "getSimSlot", "setSimSlot", "getSmsTemplate", "setSmsTemplate", "getStatus", "setStatus", "statusChecked", "", "getStatusChecked", "()Z", "statusImageId", "getStatusImageId", "getTime", "()Ljava/util/Date;", "setTime", "(Ljava/util/Date;)V", "getType", "setType", "getValue", "setValue", "checkMsg", "msg", "Lcom/idormy/sms/forwarder/entity/MsgInfo;", "checkValue", "msgValue", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "getCheckCheckId", "getFiledCheckId", "getName", "appendSenderList", "getSenderLogicCheckId", "getSimSlotCheckId", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_debug"})
public final class Rule implements android.os.Parcelable {
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long id;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "type", defaultValue = "sms")
    private java.lang.String type;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "filed", defaultValue = "transpond_all")
    private java.lang.String filed;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "check", defaultValue = "is")
    private java.lang.String check;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "value", defaultValue = "")
    private java.lang.String value;
    @androidx.room.ColumnInfo(name = "sender_id", defaultValue = "0")
    private long senderId;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "sms_template", defaultValue = "")
    private java.lang.String smsTemplate;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "regex_replace", defaultValue = "")
    private java.lang.String regexReplace;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "sim_slot", defaultValue = "ALL")
    private java.lang.String simSlot;
    @androidx.room.ColumnInfo(name = "status", defaultValue = "1")
    private int status;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "time")
    private java.util.Date time;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "sender_list", defaultValue = "")
    private java.util.List<com.idormy.sms.forwarder.database.entity.Sender> senderList;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "sender_logic", defaultValue = "ALL")
    private java.lang.String senderLogic;
    @androidx.room.ColumnInfo(name = "silent_period_start", defaultValue = "0")
    private int silentPeriodStart;
    @androidx.room.ColumnInfo(name = "silent_period_end", defaultValue = "0")
    private int silentPeriodEnd;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "silent_day_of_week", defaultValue = "")
    private java.lang.String silentDayOfWeek;
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.database.entity.Rule.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = null;
    public static final android.os.Parcelable.Creator<com.idormy.sms.forwarder.database.entity.Rule> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.entity.Rule copy(long id, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    java.lang.String filed, @org.jetbrains.annotations.NotNull
    java.lang.String check, @org.jetbrains.annotations.NotNull
    java.lang.String value, long senderId, @org.jetbrains.annotations.NotNull
    java.lang.String smsTemplate, @org.jetbrains.annotations.NotNull
    java.lang.String regexReplace, @org.jetbrains.annotations.NotNull
    java.lang.String simSlot, int status, @org.jetbrains.annotations.NotNull
    java.util.Date time, @org.jetbrains.annotations.NotNull
    java.util.List<com.idormy.sms.forwarder.database.entity.Sender> senderList, @org.jetbrains.annotations.NotNull
    java.lang.String senderLogic, int silentPeriodStart, int silentPeriodEnd, @org.jetbrains.annotations.NotNull
    java.lang.String silentDayOfWeek) {
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
    
    public Rule(long id, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    java.lang.String filed, @org.jetbrains.annotations.NotNull
    java.lang.String check, @org.jetbrains.annotations.NotNull
    java.lang.String value, long senderId, @org.jetbrains.annotations.NotNull
    java.lang.String smsTemplate, @org.jetbrains.annotations.NotNull
    java.lang.String regexReplace, @org.jetbrains.annotations.NotNull
    java.lang.String simSlot, int status, @org.jetbrains.annotations.NotNull
    java.util.Date time, @org.jetbrains.annotations.NotNull
    java.util.List<com.idormy.sms.forwarder.database.entity.Sender> senderList, @org.jetbrains.annotations.NotNull
    java.lang.String senderLogic, int silentPeriodStart, int silentPeriodEnd, @org.jetbrains.annotations.NotNull
    java.lang.String silentDayOfWeek) {
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
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFiled() {
        return null;
    }
    
    public final void setFiled(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCheck() {
        return null;
    }
    
    public final void setCheck(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return null;
    }
    
    public final void setValue(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final long component6() {
        return 0L;
    }
    
    public final long getSenderId() {
        return 0L;
    }
    
    public final void setSenderId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSmsTemplate() {
        return null;
    }
    
    public final void setSmsTemplate(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRegexReplace() {
        return null;
    }
    
    public final void setRegexReplace(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSimSlot() {
        return null;
    }
    
    public final void setSimSlot(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getStatus() {
        return 0;
    }
    
    public final void setStatus(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component11() {
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
    public final java.util.List<com.idormy.sms.forwarder.database.entity.Sender> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.idormy.sms.forwarder.database.entity.Sender> getSenderList() {
        return null;
    }
    
    public final void setSenderList(@org.jetbrains.annotations.NotNull
    java.util.List<com.idormy.sms.forwarder.database.entity.Sender> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSenderLogic() {
        return null;
    }
    
    public final void setSenderLogic(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int getSilentPeriodStart() {
        return 0;
    }
    
    public final void setSilentPeriodStart(int p0) {
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getSilentPeriodEnd() {
        return 0;
    }
    
    public final void setSilentPeriodEnd(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSilentDayOfWeek() {
        return null;
    }
    
    public final void setSilentDayOfWeek(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName(boolean appendSenderList) {
        return null;
    }
    
    public final boolean getStatusChecked() {
        return false;
    }
    
    public final int getImageId() {
        return 0;
    }
    
    public final int getStatusImageId() {
        return 0;
    }
    
    public final int getSenderLogicCheckId() {
        return 0;
    }
    
    public final int getSimSlotCheckId() {
        return 0;
    }
    
    public final int getFiledCheckId() {
        return 0;
    }
    
    public final int getCheckCheckId() {
        return 0;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    public final boolean checkMsg(@org.jetbrains.annotations.Nullable
    com.idormy.sms.forwarder.entity.MsgInfo msg) throws java.lang.Exception {
        return false;
    }
    
    private final boolean checkValue(java.lang.String msgValue) {
        return false;
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
    public static final class Creator implements android.os.Parcelable.Creator<com.idormy.sms.forwarder.database.entity.Rule> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.idormy.sms.forwarder.database.entity.Rule createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.idormy.sms.forwarder.database.entity.Rule[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JJ\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/idormy/sms/forwarder/database/entity/Rule$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getRuleMatch", "type", "filed", "check", "value", "simSlot", "senderList", "", "Lcom/idormy/sms/forwarder/database/entity/Sender;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTAG() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getRuleMatch(@org.jetbrains.annotations.Nullable
        java.lang.String type, @org.jetbrains.annotations.Nullable
        java.lang.String filed, @org.jetbrains.annotations.Nullable
        java.lang.String check, @org.jetbrains.annotations.Nullable
        java.lang.String value, @org.jetbrains.annotations.Nullable
        java.lang.String simSlot, @org.jetbrains.annotations.Nullable
        java.util.List<com.idormy.sms.forwarder.database.entity.Sender> senderList) {
            return null;
        }
    }
}