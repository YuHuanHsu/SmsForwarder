package com.idormy.sms.forwarder.database.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "Sender")
@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0007H\u00c6\u0003J\t\u0010(\u001a\u00020\u0007H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u000bH\u00c6\u0003JE\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\t\u0010,\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u00d6\u0003J\t\u00101\u001a\u00020\u0005H\u00d6\u0001J\t\u00102\u001a\u00020\u0007H\u00d6\u0001J\u0019\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u001c\u00a8\u00068"}, d2 = {"Lcom/idormy/sms/forwarder/database/entity/Sender;", "Landroid/os/Parcelable;", "id", "", "type", "", "name", "", "jsonSetting", "status", "time", "Ljava/util/Date;", "(JILjava/lang/String;Ljava/lang/String;ILjava/util/Date;)V", "getId", "()J", "setId", "(J)V", "imageId", "getImageId", "()I", "getJsonSetting", "()Ljava/lang/String;", "setJsonSetting", "(Ljava/lang/String;)V", "getName", "setName", "getStatus", "setStatus", "(I)V", "statusImageId", "getStatusImageId", "getTime", "()Ljava/util/Date;", "setTime", "(Ljava/util/Date;)V", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class Sender implements android.os.Parcelable {
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long id;
    @androidx.room.ColumnInfo(name = "type", defaultValue = "1")
    private int type;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "name", defaultValue = "")
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "json_setting", defaultValue = "")
    private java.lang.String jsonSetting;
    @androidx.room.ColumnInfo(name = "status", defaultValue = "1")
    private int status;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "time")
    private java.util.Date time;
    public static final android.os.Parcelable.Creator<com.idormy.sms.forwarder.database.entity.Sender> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.entity.Sender copy(long id, int type, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String jsonSetting, int status, @org.jetbrains.annotations.NotNull
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
    
    public Sender(long id, int type, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String jsonSetting, int status, @org.jetbrains.annotations.NotNull
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
    
    public final void setName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getJsonSetting() {
        return null;
    }
    
    public final void setJsonSetting(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getStatus() {
        return 0;
    }
    
    public final void setStatus(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getTime() {
        return null;
    }
    
    public final void setTime(@org.jetbrains.annotations.NotNull
    java.util.Date p0) {
    }
    
    public final int getImageId() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.idormy.sms.forwarder.database.entity.Sender> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.idormy.sms.forwarder.database.entity.Sender createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.idormy.sms.forwarder.database.entity.Sender[] newArray(int size) {
            return null;
        }
    }
}