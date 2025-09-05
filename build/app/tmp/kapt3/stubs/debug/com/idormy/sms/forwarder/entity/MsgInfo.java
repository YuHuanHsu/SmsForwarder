package com.idormy.sms.forwarder.entity;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000eJ\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0007H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\nH\u00c6\u0003J\t\u00101\u001a\u00020\nH\u00c6\u0003J\t\u00102\u001a\u00020\nH\u00c6\u0003J\t\u00103\u001a\u00020\nH\u00c6\u0003Jc\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\nH\u00c6\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u00d6\u0003J\u001a\u00109\u001a\u00020\u00032\b\b\u0002\u0010:\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u0003J\u000e\u0010<\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u0003J\u001a\u0010&\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u0003J\t\u0010?\u001a\u00020\nH\u00d6\u0001J$\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u0003H\u0007J\u0012\u0010C\u001a\u00020\u00032\b\u0010D\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010E\u001a\u00020\u0003H\u0016J\u0014\u0010;\u001a\u00020\u0003*\u00020\u00032\u0006\u0010;\u001a\u00020\u0003H\u0002J\u001e\u0010F\u001a\u00020\u0003*\u00020\u00032\u0006\u0010G\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u0003H\u0002J\u0016\u0010H\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u0003H\u0002J\u0016\u0010I\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u0003H\u0002J\u0016\u0010J\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u0003H\u0002J0\u0010K\u001a\u00020\u0003*\u00020\u00032\u0006\u0010L\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00032\b\b\u0002\u0010N\u001a\u000206H\u0002R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\u0011\u0010!\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u0011\u0010%\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0014\"\u0004\b(\u0010\u0016R\u001a\u0010\r\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012\u00a8\u0006O"}, d2 = {"Lcom/idormy/sms/forwarder/entity/MsgInfo;", "Ljava/io/Serializable;", "type", "", "from", "content", "date", "Ljava/util/Date;", "simInfo", "simSlot", "", "subId", "callType", "uid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;IIII)V", "getCallType", "()I", "setCallType", "(I)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getDate", "()Ljava/util/Date;", "setDate", "(Ljava/util/Date;)V", "getFrom", "setFrom", "getSimInfo", "setSimInfo", "getSimSlot", "setSimSlot", "smsVoForSend", "getSmsVoForSend", "getSubId", "setSubId", "titleForSend", "getTitleForSend", "getType", "setType", "getUid", "setUid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "getContentForSend", "ruleSmsTemplate", "regexReplace", "getContentFromJson", "jsonTemplate", "titleTemplate", "hashCode", "replaceTemplate", "template", "encoderName", "toJsonStr", "string", "toString", "replaceAppNameTag", "packageName", "replaceContactNameTag", "replaceLocationTag", "replacePhoneAreaTag", "replaceTag", "tag", "info", "ignoreCase", "app_debug"})
public final class MsgInfo implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull
    private java.lang.String type;
    @org.jetbrains.annotations.NotNull
    private java.lang.String from;
    @org.jetbrains.annotations.NotNull
    private java.lang.String content;
    @org.jetbrains.annotations.NotNull
    private java.util.Date date;
    @org.jetbrains.annotations.NotNull
    private java.lang.String simInfo;
    private int simSlot;
    private int subId;
    private int callType;
    private int uid;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String titleForSend = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String smsVoForSend = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.entity.MsgInfo copy(@org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    java.lang.String from, @org.jetbrains.annotations.NotNull
    java.lang.String content, @org.jetbrains.annotations.NotNull
    java.util.Date date, @org.jetbrains.annotations.NotNull
    java.lang.String simInfo, int simSlot, int subId, int callType, int uid) {
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
    
    public MsgInfo(@org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    java.lang.String from, @org.jetbrains.annotations.NotNull
    java.lang.String content, @org.jetbrains.annotations.NotNull
    java.util.Date date, @org.jetbrains.annotations.NotNull
    java.lang.String simInfo, int simSlot, int subId, int callType, int uid) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
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
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFrom() {
        return null;
    }
    
    public final void setFrom(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getContent() {
        return null;
    }
    
    public final void setContent(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSimInfo() {
        return null;
    }
    
    public final void setSimInfo(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getSimSlot() {
        return 0;
    }
    
    public final void setSimSlot(int p0) {
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getSubId() {
        return 0;
    }
    
    public final void setSubId(int p0) {
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getCallType() {
        return 0;
    }
    
    public final void setCallType(int p0) {
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getUid() {
        return 0;
    }
    
    public final void setUid(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitleForSend() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSmsVoForSend() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitleForSend(@org.jetbrains.annotations.NotNull
    java.lang.String titleTemplate, @org.jetbrains.annotations.NotNull
    java.lang.String regexReplace) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getContentForSend(@org.jetbrains.annotations.NotNull
    java.lang.String ruleSmsTemplate, @org.jetbrains.annotations.NotNull
    java.lang.String regexReplace) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getContentFromJson(@org.jetbrains.annotations.NotNull
    java.lang.String jsonTemplate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final java.lang.String replaceTemplate(@org.jetbrains.annotations.NotNull
    java.lang.String template, @org.jetbrains.annotations.NotNull
    java.lang.String regexReplace, @org.jetbrains.annotations.NotNull
    java.lang.String encoderName) {
        return null;
    }
    
    private final java.lang.String regexReplace(java.lang.String $this$regexReplace, java.lang.String regexReplace) {
        return null;
    }
    
    private final java.lang.String replaceTag(java.lang.String $this$replaceTag, java.lang.String tag, java.lang.String info, java.lang.String encoderName, boolean ignoreCase) {
        return null;
    }
    
    private final java.lang.String replaceContactNameTag(java.lang.String $this$replaceContactNameTag, java.lang.String encoderName) {
        return null;
    }
    
    private final java.lang.String replacePhoneAreaTag(java.lang.String $this$replacePhoneAreaTag, java.lang.String encoderName) {
        return null;
    }
    
    private final java.lang.String replaceAppNameTag(java.lang.String $this$replaceAppNameTag, java.lang.String packageName, java.lang.String encoderName) {
        return null;
    }
    
    private final java.lang.String replaceLocationTag(java.lang.String $this$replaceLocationTag, java.lang.String encoderName) {
        return null;
    }
    
    private final java.lang.String toJsonStr(java.lang.String string) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
}