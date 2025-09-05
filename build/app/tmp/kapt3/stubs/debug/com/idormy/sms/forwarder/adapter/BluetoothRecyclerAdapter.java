package com.idormy.sms.forwarder.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0015\u0016B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\bH\u0016J\u001c\u0010\u000e\u001a\u00020\t2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0016R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/idormy/sms/forwarder/adapter/BluetoothRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/idormy/sms/forwarder/adapter/BluetoothRecyclerAdapter$ViewHolder;", "itemList", "", "Landroid/bluetooth/BluetoothDevice;", "itemClickListener", "Lkotlin/Function1;", "", "", "removeClickListener", "editClickListener", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DeviceType", "ViewHolder", "app_debug"})
public final class BluetoothRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.idormy.sms.forwarder.adapter.BluetoothRecyclerAdapter.ViewHolder> {
    private final java.util.List<android.bluetooth.BluetoothDevice> itemList = null;
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> itemClickListener;
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> removeClickListener;
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> editClickListener;
    
    public BluetoothRecyclerAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<android.bluetooth.BluetoothDevice> itemList, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> itemClickListener, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> removeClickListener, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> editClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.idormy.sms.forwarder.adapter.BluetoothRecyclerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.adapter.BluetoothRecyclerAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0003J\u0012\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/idormy/sms/forwarder/adapter/BluetoothRecyclerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lcom/idormy/sms/forwarder/adapter/BluetoothRecyclerAdapter;Landroid/view/View;)V", "editIcon", "Landroid/widget/ImageView;", "imageDeviceIcon", "removeIcon", "textDeviceAddress", "Landroid/widget/TextView;", "textDeviceName", "bind", "", "device", "Landroid/bluetooth/BluetoothDevice;", "getDeviceType", "Lcom/idormy/sms/forwarder/adapter/BluetoothRecyclerAdapter$DeviceType;", "onClick", "v", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        private final android.widget.TextView textDeviceName = null;
        private final android.widget.TextView textDeviceAddress = null;
        private final android.widget.ImageView imageDeviceIcon = null;
        private final android.widget.ImageView editIcon = null;
        private final android.widget.ImageView removeIcon = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @android.annotation.SuppressLint(value = {"MissingPermission"})
        public final void bind(@org.jetbrains.annotations.NotNull
        android.bluetooth.BluetoothDevice device) {
        }
        
        @java.lang.Override
        public void onClick(@org.jetbrains.annotations.Nullable
        android.view.View v) {
        }
        
        @android.annotation.SuppressLint(value = {"MissingPermission"})
        private final com.idormy.sms.forwarder.adapter.BluetoothRecyclerAdapter.DeviceType getDeviceType(android.bluetooth.BluetoothDevice device) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lcom/idormy/sms/forwarder/adapter/BluetoothRecyclerAdapter$DeviceType;", "", "(Ljava/lang/String;I)V", "CELLPHONE", "HEADPHONES", "HEADSET_HFP", "IMAGING", "LAPTOP", "MISC_HID", "NETWORK_PAN", "WRISTBAND", "UNKNOWN", "app_debug"})
    public static enum DeviceType {
        /*public static final*/ CELLPHONE /* = new CELLPHONE() */,
        /*public static final*/ HEADPHONES /* = new HEADPHONES() */,
        /*public static final*/ HEADSET_HFP /* = new HEADSET_HFP() */,
        /*public static final*/ IMAGING /* = new IMAGING() */,
        /*public static final*/ LAPTOP /* = new LAPTOP() */,
        /*public static final*/ MISC_HID /* = new MISC_HID() */,
        /*public static final*/ NETWORK_PAN /* = new NETWORK_PAN() */,
        /*public static final*/ WRISTBAND /* = new WRISTBAND() */,
        /*public static final*/ UNKNOWN /* = new UNKNOWN() */;
        
        DeviceType() {
        }
    }
}