package com.idormy.sms.forwarder.entity;

import java.lang.System;

/**
 * 图片预览实体类
 *
 * @author xuexiang
 * @since 2018/12/7 下午5:34
 */
@kotlin.Suppress(names = {"unused", "DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 42\u00020\u0001:\u00014B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B\u0019\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tB\u000f\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fB1\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J7\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\b\u0010\"\u001a\u00020#H\u0016J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u00d6\u0003J\n\u0010(\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010)\u001a\u00020\u0003H\u0016J\n\u0010*\u001a\u0004\u0018\u00010\u0003H\u0016J\t\u0010+\u001a\u00020#H\u00d6\u0001J\u000e\u0010,\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010.\u001a\u00020-2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010/\u001a\u00020-2\u0006\u0010\b\u001a\u00020\u0003J\t\u00100\u001a\u00020\u0003H\u00d6\u0001J\u0018\u00101\u001a\u00020-2\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020#H\u0016R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0004\u00a8\u00065"}, d2 = {"Lcom/idormy/sms/forwarder/entity/ImageInfo;", "Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;", "url", "", "(Ljava/lang/String;)V", "bounds", "Landroid/graphics/Rect;", "(Ljava/lang/String;Landroid/graphics/Rect;)V", "videoUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "in", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "mUrl", "mBounds", "mVideoUrl", "description", "(Ljava/lang/String;Landroid/graphics/Rect;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "getMBounds", "()Landroid/graphics/Rect;", "setMBounds", "(Landroid/graphics/Rect;)V", "getMUrl", "setMUrl", "getMVideoUrl", "setMVideoUrl", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "getBounds", "getUrl", "getVideoUrl", "hashCode", "setBounds", "", "setUrl", "setVideoUrl", "toString", "writeToParcel", "dest", "flags", "CREATOR", "app_debug"})
public final class ImageInfo implements com.xuexiang.xui.widget.imageview.preview.enitity.IPreviewInfo {
    @org.jetbrains.annotations.NotNull
    private java.lang.String mUrl;
    @org.jetbrains.annotations.Nullable
    private android.graphics.Rect mBounds;
    @org.jetbrains.annotations.Nullable
    private java.lang.String mVideoUrl;
    @org.jetbrains.annotations.Nullable
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.entity.ImageInfo.CREATOR CREATOR = null;
    
    /**
     * 图片预览实体类
     *
     * @author xuexiang
     * @since 2018/12/7 下午5:34
     */
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.entity.ImageInfo copy(@org.jetbrains.annotations.NotNull
    java.lang.String mUrl, @org.jetbrains.annotations.Nullable
    android.graphics.Rect mBounds, @org.jetbrains.annotations.Nullable
    java.lang.String mVideoUrl, @org.jetbrains.annotations.Nullable
    java.lang.String description) {
        return null;
    }
    
    /**
     * 图片预览实体类
     *
     * @author xuexiang
     * @since 2018/12/7 下午5:34
     */
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    /**
     * 图片预览实体类
     *
     * @author xuexiang
     * @since 2018/12/7 下午5:34
     */
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    /**
     * 图片预览实体类
     *
     * @author xuexiang
     * @since 2018/12/7 下午5:34
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public ImageInfo(@org.jetbrains.annotations.NotNull
    java.lang.String mUrl, @org.jetbrains.annotations.Nullable
    android.graphics.Rect mBounds, @org.jetbrains.annotations.Nullable
    java.lang.String mVideoUrl, @org.jetbrains.annotations.Nullable
    java.lang.String description) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMUrl() {
        return null;
    }
    
    public final void setMUrl(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.Rect component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.Rect getMBounds() {
        return null;
    }
    
    public final void setMBounds(@org.jetbrains.annotations.Nullable
    android.graphics.Rect p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMVideoUrl() {
        return null;
    }
    
    public final void setMVideoUrl(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public ImageInfo(@org.jetbrains.annotations.NotNull
    java.lang.String url) {
        super();
    }
    
    public ImageInfo(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.Nullable
    android.graphics.Rect bounds) {
        super();
    }
    
    public ImageInfo(@org.jetbrains.annotations.Nullable
    java.lang.String videoUrl, @org.jetbrains.annotations.NotNull
    java.lang.String url) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getUrl() {
        return null;
    }
    
    public final void setUrl(@org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.graphics.Rect getBounds() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getVideoUrl() {
        return null;
    }
    
    public final void setBounds(@org.jetbrains.annotations.NotNull
    android.graphics.Rect bounds) {
    }
    
    public final void setVideoUrl(@org.jetbrains.annotations.NotNull
    java.lang.String videoUrl) {
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel dest, int flags) {
    }
    
    public ImageInfo(@org.jetbrains.annotations.NotNull
    android.os.Parcel in) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/idormy/sms/forwarder/entity/ImageInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/idormy/sms/forwarder/entity/ImageInfo;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/idormy/sms/forwarder/entity/ImageInfo;", "newInstance", "", "url", "", "bounds", "Landroid/graphics/Rect;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.idormy.sms.forwarder.entity.ImageInfo> {
        
        private CREATOR() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.idormy.sms.forwarder.entity.ImageInfo> newInstance(@org.jetbrains.annotations.NotNull
        java.lang.String url, @org.jetbrains.annotations.NotNull
        android.graphics.Rect bounds) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.idormy.sms.forwarder.entity.ImageInfo createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.idormy.sms.forwarder.entity.ImageInfo[] newArray(int size) {
            return null;
        }
    }
}