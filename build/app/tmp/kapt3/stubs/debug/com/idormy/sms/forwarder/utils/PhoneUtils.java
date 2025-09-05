package com.idormy.sms.forwarder.utils;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/idormy/sms/forwarder/utils/PhoneUtils;", "", "()V", "Companion", "app_debug"})
public final class PhoneUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.PhoneUtils.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG = "PhoneUtils";
    
    private PhoneUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\f\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000fJ\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J:\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0004J\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001d\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u001aH\u0002J\u0014\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020$0#H\u0007J\u0006\u0010%\u001a\u00020\u0006J,\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0004J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\"\u0010*\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/idormy/sms/forwarder/utils/PhoneUtils$Companion;", "", "()V", "TAG", "", "calculateMatchLength", "", "number1", "number2", "call", "", "phoneNumber", "dial", "getCallInfoList", "", "Lcom/idormy/sms/forwarder/entity/CallInfo;", "type", "limit", "offset", "getCallMsg", "callInfo", "getContactByNumber", "Lcom/idormy/sms/forwarder/entity/ContactInfo;", "getContactInfoList", "name", "isFuzzy", "", "getDeviceName", "getLastCallInfo", "callType", "getPhoneArea", "getSimId", "mId", "isSimId", "getSimMultiInfo", "", "Lcom/idormy/sms/forwarder/entity/SimInfo;", "getSimSlotCount", "getSmsInfoList", "Lcom/idormy/sms/forwarder/entity/SmsInfo;", "keyword", "isValidPhoneNumber", "sendSms", "subId", "mobileList", "message", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * 获取 sim 卡槽数量，注意不是 sim 卡的数量。
         */
        public final int getSimSlotCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @android.annotation.SuppressLint(value = {"Range"})
        public final java.util.Map<java.lang.Integer, com.idormy.sms.forwarder.entity.SimInfo> getSimMultiInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDeviceName() {
            return null;
        }
        
        /**
         * 发送短信
         * <p>需添加权限 {@code <uses-permission android:name="android.permission.SEND_SMS" />}</p>
         *
         * @param subId 发送卡的subId，传入 -1 则 SmsManager.getDefault()
         * @param mobileList 接收号码列表
         * @param message     短信内容
         */
        @org.jetbrains.annotations.Nullable
        @androidx.annotation.RequiresPermission(value = "android.permission.SEND_SMS")
        @android.annotation.SuppressLint(value = {"SoonBlockedPrivateApi", "DiscouragedPrivateApi"})
        @kotlin.Suppress(names = {"DEPRECATION"})
        public final java.lang.String sendSms(int subId, @org.jetbrains.annotations.NotNull
        java.lang.String mobileList, @org.jetbrains.annotations.NotNull
        java.lang.String message) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.idormy.sms.forwarder.entity.CallInfo> getCallInfoList(int type, int limit, int offset, @org.jetbrains.annotations.Nullable
        java.lang.String phoneNumber) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        @android.annotation.SuppressLint(value = {"Range"})
        public final com.idormy.sms.forwarder.entity.CallInfo getLastCallInfo(int callType, @org.jetbrains.annotations.Nullable
        java.lang.String phoneNumber) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.idormy.sms.forwarder.entity.ContactInfo> getContactInfoList(int limit, int offset, @org.jetbrains.annotations.Nullable
        java.lang.String phoneNumber, @org.jetbrains.annotations.Nullable
        java.lang.String name, boolean isFuzzy) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPhoneArea(@org.jetbrains.annotations.NotNull
        java.lang.String phoneNumber) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.idormy.sms.forwarder.entity.ContactInfo> getContactByNumber(@org.jetbrains.annotations.Nullable
        java.lang.String phoneNumber) {
            return null;
        }
        
        private final int calculateMatchLength(java.lang.String number1, java.lang.String number2) {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCallMsg(@org.jetbrains.annotations.NotNull
        com.idormy.sms.forwarder.entity.CallInfo callInfo) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.idormy.sms.forwarder.entity.SmsInfo> getSmsInfoList(int type, int limit, int offset, @org.jetbrains.annotations.NotNull
        java.lang.String keyword) {
            return null;
        }
        
        /**
         * 跳至拨号界面
         *
         * @param phoneNumber 电话号码
         */
        public final void dial(@org.jetbrains.annotations.Nullable
        java.lang.String phoneNumber) {
        }
        
        /**
         * 拨打电话
         *
         * 需添加权限 `<uses-permission android:name="android.permission.CALL_PHONE" />`
         *
         * @param phoneNumber 电话号码
         */
        public final void call(@org.jetbrains.annotations.Nullable
        java.lang.String phoneNumber) {
        }
        
        /**
         * 将 subscription_id 转成 卡槽ID： 0=Sim1, 1=Sim2, -1=获取失败
         *
         * TODO: 这里有坑，每个品牌定制系统的字段不太一样，不一定能获取到卡槽ID
         * 测试通过：MIUI   测试失败：原生 Android 11（Google Pixel 2 XL）
         *
         * @param mId SubscriptionId
         * @param isSimId 是否已经是SimId无需转换（待做机型兼容）
         */
        private final int getSimId(int mId, boolean isSimId) {
            return 0;
        }
        
        private final boolean isValidPhoneNumber(java.lang.String phoneNumber) {
            return false;
        }
    }
}