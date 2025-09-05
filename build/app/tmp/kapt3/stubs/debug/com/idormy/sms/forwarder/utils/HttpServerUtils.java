package com.idormy.sms.forwarder.utils;

import java.lang.System;

/**
 * HttpServer工具类
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/idormy/sms/forwarder/utils/HttpServerUtils;", "", "()V", "Companion", "app_debug"})
public final class HttpServerUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.HttpServerUtils.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference enableServerAutorun$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference serverSignKey$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference safetyMeasures$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference serverSm4Key$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference serverPublicKey$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference serverPrivateKey$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference timeTolerance$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference serverWebPath$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference serverAddress$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference serverHistory$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference serverConfig$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference clientSignKey$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference clientSafetyMeasures$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference enableApiClone$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference enableApiSmsSend$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference enableApiSmsQuery$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference enableApiCallQuery$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference enableApiContactQuery$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference enableApiContactAdd$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference enableApiBatteryQuery$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference enableApiWol$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference enableApiLocation$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference apiLocationCache$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference wolHistory$delegate = null;
    
    private HttpServerUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\bZ\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010q\u001a\u00020\u00132\u0006\u0010r\u001a\u00020\u00132\u0006\u0010s\u001a\u00020\u0013J\u0012\u0010t\u001a\u00020u2\n\u0010v\u001a\u0006\u0012\u0002\b\u00030wJ\u000e\u0010x\u001a\u00020u2\u0006\u0010y\u001a\u00020zJ\u0006\u0010{\u001a\u00020zJ\u0010\u0010|\u001a\u00020\u00132\b\u0010}\u001a\u0004\u0018\u00010\u0001J\u000e\u0010~\u001a\u00020\u001a2\u0006\u0010y\u001a\u00020zR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001a8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b \u0010\u000b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010!\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001a8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b$\u0010\u000b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR+\u0010%\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001a8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b(\u0010\u000b\u001a\u0004\b&\u0010\u001d\"\u0004\b\'\u0010\u001fR+\u0010)\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001a8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b,\u0010\u000b\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR+\u0010-\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001a8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b0\u0010\u000b\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR+\u00101\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001a8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b4\u0010\u000b\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR+\u00105\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001a8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b8\u0010\u000b\u001a\u0004\b6\u0010\u001d\"\u0004\b7\u0010\u001fR+\u00109\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001a8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b<\u0010\u000b\u001a\u0004\b:\u0010\u001d\"\u0004\b;\u0010\u001fR+\u0010=\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001a8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b@\u0010\u000b\u001a\u0004\b>\u0010\u001d\"\u0004\b?\u0010\u001fR+\u0010A\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001a8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bD\u0010\u000b\u001a\u0004\bB\u0010\u001d\"\u0004\bC\u0010\u001fR+\u0010E\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bH\u0010\u000b\u001a\u0004\bF\u0010\u000f\"\u0004\bG\u0010\u0011R+\u0010I\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bL\u0010\u000b\u001a\u0004\bJ\u0010\u0016\"\u0004\bK\u0010\u0018R+\u0010M\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bP\u0010\u000b\u001a\u0004\bN\u0010\u0016\"\u0004\bO\u0010\u0018R+\u0010Q\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bT\u0010\u000b\u001a\u0004\bR\u0010\u0016\"\u0004\bS\u0010\u0018R+\u0010U\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bX\u0010\u000b\u001a\u0004\bV\u0010\u0016\"\u0004\bW\u0010\u0018R+\u0010Y\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\\\u0010\u000b\u001a\u0004\bZ\u0010\u0016\"\u0004\b[\u0010\u0018R+\u0010]\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b`\u0010\u000b\u001a\u0004\b^\u0010\u0016\"\u0004\b_\u0010\u0018R+\u0010a\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bd\u0010\u000b\u001a\u0004\bb\u0010\u0016\"\u0004\bc\u0010\u0018R+\u0010e\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bh\u0010\u000b\u001a\u0004\bf\u0010\u0016\"\u0004\bg\u0010\u0018R+\u0010i\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bl\u0010\u000b\u001a\u0004\bj\u0010\u000f\"\u0004\bk\u0010\u0011R+\u0010m\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bp\u0010\u000b\u001a\u0004\bn\u0010\u0016\"\u0004\bo\u0010\u0018\u00a8\u0006\u007f"}, d2 = {"Lcom/idormy/sms/forwarder/utils/HttpServerUtils$Companion;", "", "()V", "<set-?>", "Lcom/idormy/sms/forwarder/entity/LocationInfo;", "apiLocationCache", "getApiLocationCache", "()Lcom/idormy/sms/forwarder/entity/LocationInfo;", "setApiLocationCache", "(Lcom/idormy/sms/forwarder/entity/LocationInfo;)V", "apiLocationCache$delegate", "Lcom/idormy/sms/forwarder/utils/SharedPreference;", "", "clientSafetyMeasures", "getClientSafetyMeasures", "()I", "setClientSafetyMeasures", "(I)V", "clientSafetyMeasures$delegate", "", "clientSignKey", "getClientSignKey", "()Ljava/lang/String;", "setClientSignKey", "(Ljava/lang/String;)V", "clientSignKey$delegate", "", "enableApiBatteryQuery", "getEnableApiBatteryQuery", "()Z", "setEnableApiBatteryQuery", "(Z)V", "enableApiBatteryQuery$delegate", "enableApiCallQuery", "getEnableApiCallQuery", "setEnableApiCallQuery", "enableApiCallQuery$delegate", "enableApiClone", "getEnableApiClone", "setEnableApiClone", "enableApiClone$delegate", "enableApiContactAdd", "getEnableApiContactAdd", "setEnableApiContactAdd", "enableApiContactAdd$delegate", "enableApiContactQuery", "getEnableApiContactQuery", "setEnableApiContactQuery", "enableApiContactQuery$delegate", "enableApiLocation", "getEnableApiLocation", "setEnableApiLocation", "enableApiLocation$delegate", "enableApiSmsQuery", "getEnableApiSmsQuery", "setEnableApiSmsQuery", "enableApiSmsQuery$delegate", "enableApiSmsSend", "getEnableApiSmsSend", "setEnableApiSmsSend", "enableApiSmsSend$delegate", "enableApiWol", "getEnableApiWol", "setEnableApiWol", "enableApiWol$delegate", "enableServerAutorun", "getEnableServerAutorun", "setEnableServerAutorun", "enableServerAutorun$delegate", "safetyMeasures", "getSafetyMeasures", "setSafetyMeasures", "safetyMeasures$delegate", "serverAddress", "getServerAddress", "setServerAddress", "serverAddress$delegate", "serverConfig", "getServerConfig", "setServerConfig", "serverConfig$delegate", "serverHistory", "getServerHistory", "setServerHistory", "serverHistory$delegate", "serverPrivateKey", "getServerPrivateKey", "setServerPrivateKey", "serverPrivateKey$delegate", "serverPublicKey", "getServerPublicKey", "setServerPublicKey", "serverPublicKey$delegate", "serverSignKey", "getServerSignKey", "setServerSignKey", "serverSignKey$delegate", "serverSm4Key", "getServerSm4Key", "setServerSm4Key", "serverSm4Key$delegate", "serverWebPath", "getServerWebPath", "setServerWebPath", "serverWebPath$delegate", "timeTolerance", "getTimeTolerance", "setTimeTolerance", "timeTolerance$delegate", "wolHistory", "getWolHistory", "setWolHistory", "wolHistory$delegate", "calcSign", "timestamp", "signSecret", "checkSign", "", "req", "Lcom/idormy/sms/forwarder/server/model/BaseRequest;", "compareVersion", "cloneInfo", "Lcom/idormy/sms/forwarder/entity/CloneInfo;", "exportSettings", "response", "output", "restoreSettings", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean getEnableServerAutorun() {
            return false;
        }
        
        public final void setEnableServerAutorun(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getServerSignKey() {
            return null;
        }
        
        public final void setServerSignKey(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        public final int getSafetyMeasures() {
            return 0;
        }
        
        public final void setSafetyMeasures(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getServerSm4Key() {
            return null;
        }
        
        public final void setServerSm4Key(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getServerPublicKey() {
            return null;
        }
        
        public final void setServerPublicKey(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getServerPrivateKey() {
            return null;
        }
        
        public final void setServerPrivateKey(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        public final int getTimeTolerance() {
            return 0;
        }
        
        public final void setTimeTolerance(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getServerWebPath() {
            return null;
        }
        
        public final void setServerWebPath(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getServerAddress() {
            return null;
        }
        
        public final void setServerAddress(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getServerHistory() {
            return null;
        }
        
        public final void setServerHistory(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getServerConfig() {
            return null;
        }
        
        public final void setServerConfig(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getClientSignKey() {
            return null;
        }
        
        public final void setClientSignKey(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        public final int getClientSafetyMeasures() {
            return 0;
        }
        
        public final void setClientSafetyMeasures(int p0) {
        }
        
        public final boolean getEnableApiClone() {
            return false;
        }
        
        public final void setEnableApiClone(boolean p0) {
        }
        
        public final boolean getEnableApiSmsSend() {
            return false;
        }
        
        public final void setEnableApiSmsSend(boolean p0) {
        }
        
        public final boolean getEnableApiSmsQuery() {
            return false;
        }
        
        public final void setEnableApiSmsQuery(boolean p0) {
        }
        
        public final boolean getEnableApiCallQuery() {
            return false;
        }
        
        public final void setEnableApiCallQuery(boolean p0) {
        }
        
        public final boolean getEnableApiContactQuery() {
            return false;
        }
        
        public final void setEnableApiContactQuery(boolean p0) {
        }
        
        public final boolean getEnableApiContactAdd() {
            return false;
        }
        
        public final void setEnableApiContactAdd(boolean p0) {
        }
        
        public final boolean getEnableApiBatteryQuery() {
            return false;
        }
        
        public final void setEnableApiBatteryQuery(boolean p0) {
        }
        
        public final boolean getEnableApiWol() {
            return false;
        }
        
        public final void setEnableApiWol(boolean p0) {
        }
        
        public final boolean getEnableApiLocation() {
            return false;
        }
        
        public final void setEnableApiLocation(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.idormy.sms.forwarder.entity.LocationInfo getApiLocationCache() {
            return null;
        }
        
        public final void setApiLocationCache(@org.jetbrains.annotations.NotNull
        com.idormy.sms.forwarder.entity.LocationInfo p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getWolHistory() {
            return null;
        }
        
        public final void setWolHistory(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String calcSign(@org.jetbrains.annotations.NotNull
        java.lang.String timestamp, @org.jetbrains.annotations.NotNull
        java.lang.String signSecret) {
            return null;
        }
        
        @kotlin.jvm.Throws(exceptionClasses = {com.yanzhenjie.andserver.error.HttpException.class})
        public final void checkSign(@org.jetbrains.annotations.NotNull
        com.idormy.sms.forwarder.server.model.BaseRequest<?> req) {
        }
        
        @kotlin.jvm.Throws(exceptionClasses = {com.yanzhenjie.andserver.error.HttpException.class})
        public final void compareVersion(@org.jetbrains.annotations.NotNull
        com.idormy.sms.forwarder.entity.CloneInfo cloneInfo) throws com.yanzhenjie.andserver.error.HttpException {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.idormy.sms.forwarder.entity.CloneInfo exportSettings() {
            return null;
        }
        
        public final boolean restoreSettings(@org.jetbrains.annotations.NotNull
        com.idormy.sms.forwarder.entity.CloneInfo cloneInfo) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String response(@org.jetbrains.annotations.Nullable
        java.lang.Object output) {
            return null;
        }
    }
}