package com.idormy.sms.forwarder.adapter.menu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\rH&\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0011\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/idormy/sms/forwarder/adapter/menu/DrawerItem;", "T", "Lcom/idormy/sms/forwarder/adapter/menu/DrawerAdapter$ViewHolder;", "", "()V", "isChecked", "", "bindViewHolder", "", "holder", "(Lcom/idormy/sms/forwarder/adapter/menu/DrawerAdapter$ViewHolder;)V", "createViewHolder", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)Lcom/idormy/sms/forwarder/adapter/menu/DrawerAdapter$ViewHolder;", "isSelectable", "setChecked", "checked", "app_debug"})
public abstract class DrawerItem<T extends com.idormy.sms.forwarder.adapter.menu.DrawerAdapter.ViewHolder> {
    private boolean isChecked = false;
    
    public DrawerItem() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract T createViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent);
    
    public abstract void bindViewHolder(@org.jetbrains.annotations.NotNull
    T holder);
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.adapter.menu.DrawerItem<T> setChecked(boolean checked) {
        return null;
    }
    
    public final boolean isChecked() {
        return false;
    }
    
    public boolean isSelectable() {
        return false;
    }
}