package com.idormy.sms.forwarder.database.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "Task")
@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000fJ\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0007H\u00c6\u0003J\t\u0010.\u001a\u00020\u0007H\u00c6\u0003J\t\u0010/\u001a\u00020\u0007H\u00c6\u0003J\t\u00100\u001a\u00020\u0007H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\rH\u00c6\u0003J\t\u00103\u001a\u00020\rH\u00c6\u0003Jc\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u00c6\u0001J\t\u00105\u001a\u00020\u0005H\u00d6\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u00d6\u0003J\t\u0010:\u001a\u00020\u0005H\u00d6\u0001J\t\u0010;\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0011R\u001e\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010&R\u0011\u0010\'\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010&\u00a8\u0006A"}, d2 = {"Lcom/idormy/sms/forwarder/database/entity/Task;", "Landroid/os/Parcelable;", "id", "", "type", "", "name", "", "description", "conditions", "actions", "status", "lastExecTime", "Ljava/util/Date;", "nextExecTime", "(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;)V", "getActions", "()Ljava/lang/String;", "getConditions", "getDescription", "greyImageId", "getGreyImageId", "()I", "getId", "()J", "setId", "(J)V", "imageId", "getImageId", "getLastExecTime", "()Ljava/util/Date;", "setLastExecTime", "(Ljava/util/Date;)V", "getName", "getNextExecTime", "setNextExecTime", "getStatus", "setStatus", "(I)V", "statusImageId", "getStatusImageId", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class Task implements android.os.Parcelable {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long id;
    @androidx.room.ColumnInfo(name = "type", defaultValue = "1")
    private int type;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "name", defaultValue = "")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "description", defaultValue = "")
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "conditions", defaultValue = "")
    private final java.lang.String conditions = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "actions", defaultValue = "")
    private final java.lang.String actions = null;
    @androidx.room.ColumnInfo(name = "status", defaultValue = "1")
    private int status;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "last_exec_time")
    private java.util.Date lastExecTime;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "next_exec_time")
    private java.util.Date nextExecTime;
    public static final android.os.Parcelable.Creator<com.idormy.sms.forwarder.database.entity.Task> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.entity.Task copy(long id, int type, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String conditions, @org.jetbrains.annotations.NotNull
    java.lang.String actions, int status, @org.jetbrains.annotations.NotNull
    java.util.Date lastExecTime, @org.jetbrains.annotations.NotNull
    java.util.Date nextExecTime) {
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
    
    public Task() {
        super();
    }
    
    public Task(long id, int type, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String conditions, @org.jetbrains.annotations.NotNull
    java.lang.String actions, int status, @org.jetbrains.annotations.NotNull
    java.util.Date lastExecTime, @org.jetbrains.annotations.NotNull
    java.util.Date nextExecTime) {
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
    
    public final int component2() {
        return 0;
    }
    
    public final int getType() {
        return 0;
    }
    
    public final void setType(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getConditions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getActions() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getStatus() {
        return 0;
    }
    
    public final void setStatus(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getLastExecTime() {
        return null;
    }
    
    public final void setLastExecTime(@org.jetbrains.annotations.NotNull
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getNextExecTime() {
        return null;
    }
    
    public final void setNextExecTime(@org.jetbrains.annotations.NotNull
    java.util.Date p0) {
    }
    
    public final int getImageId() {
        return 0;
    }
    
    public final int getGreyImageId() {
        return 0;
    }
    
    public final int getStatusImageId() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.idormy.sms.forwarder.database.entity.Task> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.idormy.sms.forwarder.database.entity.Task createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.idormy.sms.forwarder.database.entity.Task[] newArray(int size) {
            return null;
        }
    }
}