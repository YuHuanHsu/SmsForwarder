package com.idormy.sms.forwarder.utils.task;

import java.lang.System;

/**
 * 自动任务工具类 —— 用于存储自动任务相关的配置
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/idormy/sms/forwarder/utils/task/TaskUtils;", "", "()V", "Companion", "app_debug"})
public final class TaskUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.utils.task.TaskUtils.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference batteryInfo$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference batteryLevel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference batteryPct$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference batteryStatus$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference batteryPlugged$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference networkState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference dataSimSlot$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference wifiSsid$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference ipv4$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference ipv6$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference ipList$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference simState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference locationInfoOld$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference locationInfoNew$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference lockScreenAction$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference discoveredDevices$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference connectedDevices$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final com.idormy.sms.forwarder.utils.SharedPreference bluetoothState$delegate = null;
    
    private TaskUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010%\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\\\u001a\u00020\f2\u0006\u0010]\u001a\u00020\fJ\u000e\u0010^\u001a\u00020\f2\u0006\u0010]\u001a\u00020\fR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R+\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b!\u0010\u000b\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R+\u0010\"\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b%\u0010\u000b\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011RC\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040&2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040&8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b,\u0010\u000b\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R+\u0010-\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b0\u0010\u000b\u001a\u0004\b.\u0010\u000f\"\u0004\b/\u0010\u0011RC\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040&2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040&8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b4\u0010\u000b\u001a\u0004\b2\u0010)\"\u0004\b3\u0010+R+\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b8\u0010\u000b\u001a\u0004\b6\u0010\u0007\"\u0004\b7\u0010\tR+\u00109\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b<\u0010\u000b\u001a\u0004\b:\u0010\u0007\"\u0004\b;\u0010\tR+\u0010=\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b@\u0010\u000b\u001a\u0004\b>\u0010\u0007\"\u0004\b?\u0010\tR+\u0010B\u001a\u00020A2\u0006\u0010\u0003\u001a\u00020A8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bG\u0010\u000b\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR+\u0010H\u001a\u00020A2\u0006\u0010\u0003\u001a\u00020A8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bK\u0010\u000b\u001a\u0004\bI\u0010D\"\u0004\bJ\u0010FR+\u0010L\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bO\u0010\u000b\u001a\u0004\bM\u0010\u0007\"\u0004\bN\u0010\tR+\u0010P\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bS\u0010\u000b\u001a\u0004\bQ\u0010\u000f\"\u0004\bR\u0010\u0011R+\u0010T\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bW\u0010\u000b\u001a\u0004\bU\u0010\u000f\"\u0004\bV\u0010\u0011R+\u0010X\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b[\u0010\u000b\u001a\u0004\bY\u0010\u0007\"\u0004\bZ\u0010\t\u00a8\u0006_"}, d2 = {"Lcom/idormy/sms/forwarder/utils/task/TaskUtils$Companion;", "", "()V", "<set-?>", "", "batteryInfo", "getBatteryInfo", "()Ljava/lang/String;", "setBatteryInfo", "(Ljava/lang/String;)V", "batteryInfo$delegate", "Lcom/idormy/sms/forwarder/utils/SharedPreference;", "", "batteryLevel", "getBatteryLevel", "()I", "setBatteryLevel", "(I)V", "batteryLevel$delegate", "", "batteryPct", "getBatteryPct", "()F", "setBatteryPct", "(F)V", "batteryPct$delegate", "batteryPlugged", "getBatteryPlugged", "setBatteryPlugged", "batteryPlugged$delegate", "batteryStatus", "getBatteryStatus", "setBatteryStatus", "batteryStatus$delegate", "bluetoothState", "getBluetoothState", "setBluetoothState", "bluetoothState$delegate", "", "connectedDevices", "getConnectedDevices", "()Ljava/util/Map;", "setConnectedDevices", "(Ljava/util/Map;)V", "connectedDevices$delegate", "dataSimSlot", "getDataSimSlot", "setDataSimSlot", "dataSimSlot$delegate", "discoveredDevices", "getDiscoveredDevices", "setDiscoveredDevices", "discoveredDevices$delegate", "ipList", "getIpList", "setIpList", "ipList$delegate", "ipv4", "getIpv4", "setIpv4", "ipv4$delegate", "ipv6", "getIpv6", "setIpv6", "ipv6$delegate", "Lcom/idormy/sms/forwarder/entity/LocationInfo;", "locationInfoNew", "getLocationInfoNew", "()Lcom/idormy/sms/forwarder/entity/LocationInfo;", "setLocationInfoNew", "(Lcom/idormy/sms/forwarder/entity/LocationInfo;)V", "locationInfoNew$delegate", "locationInfoOld", "getLocationInfoOld", "setLocationInfoOld", "locationInfoOld$delegate", "lockScreenAction", "getLockScreenAction", "setLockScreenAction", "lockScreenAction$delegate", "networkState", "getNetworkState", "setNetworkState", "networkState$delegate", "simState", "getSimState", "setSimState", "simState$delegate", "wifiSsid", "getWifiSsid", "setWifiSsid", "wifiSsid$delegate", "getTypeGreyImageId", "type", "getTypeImageId", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int getTypeImageId(int type) {
            return 0;
        }
        
        public final int getTypeGreyImageId(int type) {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getBatteryInfo() {
            return null;
        }
        
        public final void setBatteryInfo(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        public final int getBatteryLevel() {
            return 0;
        }
        
        public final void setBatteryLevel(int p0) {
        }
        
        public final float getBatteryPct() {
            return 0.0F;
        }
        
        public final void setBatteryPct(float p0) {
        }
        
        public final int getBatteryStatus() {
            return 0;
        }
        
        public final void setBatteryStatus(int p0) {
        }
        
        public final int getBatteryPlugged() {
            return 0;
        }
        
        public final void setBatteryPlugged(int p0) {
        }
        
        public final int getNetworkState() {
            return 0;
        }
        
        public final void setNetworkState(int p0) {
        }
        
        public final int getDataSimSlot() {
            return 0;
        }
        
        public final void setDataSimSlot(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getWifiSsid() {
            return null;
        }
        
        public final void setWifiSsid(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getIpv4() {
            return null;
        }
        
        public final void setIpv4(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getIpv6() {
            return null;
        }
        
        public final void setIpv6(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getIpList() {
            return null;
        }
        
        public final void setIpList(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        public final int getSimState() {
            return 0;
        }
        
        public final void setSimState(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.idormy.sms.forwarder.entity.LocationInfo getLocationInfoOld() {
            return null;
        }
        
        public final void setLocationInfoOld(@org.jetbrains.annotations.NotNull
        com.idormy.sms.forwarder.entity.LocationInfo p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.idormy.sms.forwarder.entity.LocationInfo getLocationInfoNew() {
            return null;
        }
        
        public final void setLocationInfoNew(@org.jetbrains.annotations.NotNull
        com.idormy.sms.forwarder.entity.LocationInfo p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getLockScreenAction() {
            return null;
        }
        
        public final void setLockScreenAction(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.lang.String> getDiscoveredDevices() {
            return null;
        }
        
        public final void setDiscoveredDevices(@org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.String, java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.lang.String> getConnectedDevices() {
            return null;
        }
        
        public final void setConnectedDevices(@org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.String, java.lang.String> p0) {
        }
        
        public final int getBluetoothState() {
            return 0;
        }
        
        public final void setBluetoothState(int p0) {
        }
    }
}