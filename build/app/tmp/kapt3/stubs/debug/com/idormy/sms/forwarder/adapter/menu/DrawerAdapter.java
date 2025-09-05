package com.idormy.sms.forwarder.adapter.menu;

import java.lang.System;

@kotlin.Suppress(names = {"LeakingThis", "UNCHECKED_CAST"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB\u001b\u0012\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\u0010\u0010\u001a\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eR\u0018\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/idormy/sms/forwarder/adapter/menu/DrawerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/idormy/sms/forwarder/adapter/menu/DrawerAdapter$ViewHolder;", "items", "", "Lcom/idormy/sms/forwarder/adapter/menu/DrawerItem;", "(Ljava/util/List;)V", "holderFactories", "Landroid/util/SparseArray;", "listener", "Lcom/idormy/sms/forwarder/adapter/menu/DrawerAdapter$OnItemSelectedListener;", "viewTypes", "", "Ljava/lang/Class;", "", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "processViewTypes", "setListener", "setSelected", "OnItemSelectedListener", "ViewHolder", "app_debug"})
public final class DrawerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.idormy.sms.forwarder.adapter.menu.DrawerAdapter.ViewHolder> {
    private final java.util.List<com.idormy.sms.forwarder.adapter.menu.DrawerItem<? extends com.idormy.sms.forwarder.adapter.menu.DrawerAdapter.ViewHolder>> items = null;
    private final java.util.Map<java.lang.Class<? extends com.idormy.sms.forwarder.adapter.menu.DrawerItem<?>>, java.lang.Integer> viewTypes = null;
    private final android.util.SparseArray<com.idormy.sms.forwarder.adapter.menu.DrawerItem<?>> holderFactories = null;
    private com.idormy.sms.forwarder.adapter.menu.DrawerAdapter.OnItemSelectedListener listener;
    
    public DrawerAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<? extends com.idormy.sms.forwarder.adapter.menu.DrawerItem<? extends com.idormy.sms.forwarder.adapter.menu.DrawerAdapter.ViewHolder>> items) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.idormy.sms.forwarder.adapter.menu.DrawerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.adapter.menu.DrawerAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    private final void processViewTypes() {
    }
    
    public final void setSelected(int position) {
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable
    com.idormy.sms.forwarder.adapter.menu.DrawerAdapter.OnItemSelectedListener listener) {
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lcom/idormy/sms/forwarder/adapter/menu/DrawerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "adapter", "Lcom/idormy/sms/forwarder/adapter/menu/DrawerAdapter;", "getAdapter", "()Lcom/idormy/sms/forwarder/adapter/menu/DrawerAdapter;", "setAdapter", "(Lcom/idormy/sms/forwarder/adapter/menu/DrawerAdapter;)V", "onClick", "", "v", "app_debug"})
    public static abstract class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.Nullable
        private com.idormy.sms.forwarder.adapter.menu.DrawerAdapter adapter;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.idormy.sms.forwarder.adapter.menu.DrawerAdapter getAdapter() {
            return null;
        }
        
        public final void setAdapter(@org.jetbrains.annotations.Nullable
        com.idormy.sms.forwarder.adapter.menu.DrawerAdapter p0) {
        }
        
        @java.lang.Override
        public void onClick(@org.jetbrains.annotations.NotNull
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/idormy/sms/forwarder/adapter/menu/DrawerAdapter$OnItemSelectedListener;", "", "onItemSelected", "", "position", "", "app_debug"})
    public static abstract interface OnItemSelectedListener {
        
        public abstract void onItemSelected(int position);
    }
}