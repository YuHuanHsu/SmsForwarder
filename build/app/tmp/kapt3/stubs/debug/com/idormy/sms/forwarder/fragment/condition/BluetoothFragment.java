package com.idormy.sms.forwarder.fragment.condition;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName", "SameParameterValue", "DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001aH\u0015J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u001d\u001a\u00020\u001aH\u0014J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0017J\b\u0010!\u001a\u00020\u001aH\u0016J\b\u0010\"\u001a\u00020\u001aH\u0003J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/idormy/sms/forwarder/fragment/condition/BluetoothFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Lcom/idormy/sms/forwarder/databinding/FragmentTasksConditionBluetoothBinding;", "Landroid/view/View$OnClickListener;", "()V", "TAG", "", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothReceiver", "Landroid/content/BroadcastReceiver;", "bluetoothRecyclerAdapter", "Lcom/idormy/sms/forwarder/adapter/BluetoothRecyclerAdapter;", "discoveredDevices", "", "Landroid/bluetooth/BluetoothDevice;", "eventData", "mCountDownHelper", "Lcom/xuexiang/xui/utils/CountDownButtonHelper;", "titleBar", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "checkSetting", "Lcom/idormy/sms/forwarder/entity/condition/BluetoothSetting;", "updateView", "", "initArgs", "", "initListeners", "initTitle", "initViews", "onClick", "v", "Landroid/view/View;", "onDestroyView", "startBluetoothDiscovery", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
@com.xuexiang.xpage.annotation.Page(name = "Bluetooth")
public final class BluetoothFragment extends com.idormy.sms.forwarder.core.BaseFragment<com.idormy.sms.forwarder.databinding.FragmentTasksConditionBluetoothBinding> implements android.view.View.OnClickListener {
    private final java.lang.String TAG = null;
    private com.xuexiang.xui.widget.actionbar.TitleBar titleBar;
    private com.xuexiang.xui.utils.CountDownButtonHelper mCountDownHelper;
    private android.bluetooth.BluetoothAdapter bluetoothAdapter;
    private com.idormy.sms.forwarder.adapter.BluetoothRecyclerAdapter bluetoothRecyclerAdapter;
    private java.util.List<android.bluetooth.BluetoothDevice> discoveredDevices;
    private final android.content.BroadcastReceiver bluetoothReceiver = null;
    @org.jetbrains.annotations.Nullable
    @com.xuexiang.xrouter.annotation.AutoWired(name = "event_data_condition")
    @kotlin.jvm.JvmField
    public java.lang.String eventData;
    
    public BluetoothFragment() {
        super();
    }
    
    @java.lang.Override
    protected void initArgs() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.idormy.sms.forwarder.databinding.FragmentTasksConditionBluetoothBinding viewBindingInflate(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull
    android.view.ViewGroup container) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    protected com.xuexiang.xui.widget.actionbar.TitleBar initTitle() {
        return null;
    }
    
    /**
     * 初始化控件
     */
    @java.lang.Override
    protected void initViews() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override
    protected void initListeners() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    @com.xuexiang.xaop.annotation.SingleClick
    public void onClick(@org.jetbrains.annotations.NotNull
    android.view.View v) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission", "NotifyDataSetChanged"})
    private final void startBluetoothDiscovery() {
    }
    
    private final com.idormy.sms.forwarder.entity.condition.BluetoothSetting checkSetting(boolean updateView) {
        return null;
    }
}