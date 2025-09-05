package com.idormy.sms.forwarder.adapter.base.delegate;

import java.lang.System;

/**
 * 通用的DelegateAdapter适配器
 *
 * @author xuexiang
 * @since 2020/3/20 12:44 AM
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B\u0017\b\u0016\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH$J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0014\u00a8\u0006\u0011"}, d2 = {"Lcom/idormy/sms/forwarder/adapter/base/delegate/BaseDelegateAdapter;", "T", "Lcom/idormy/sms/forwarder/adapter/base/delegate/XDelegateAdapter;", "Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;", "()V", "list", "", "(Ljava/util/Collection;)V", "data", "", "([Ljava/lang/Object;)V", "getItemLayoutId", "", "viewType", "getViewHolder", "parent", "Landroid/view/ViewGroup;", "app_debug"})
public abstract class BaseDelegateAdapter<T extends java.lang.Object> extends com.idormy.sms.forwarder.adapter.base.delegate.XDelegateAdapter<T, com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder> {
    
    public BaseDelegateAdapter() {
        super();
    }
    
    public BaseDelegateAdapter(@org.jetbrains.annotations.Nullable
    java.util.Collection<? extends T> list) {
        super();
    }
    
    public BaseDelegateAdapter(@org.jetbrains.annotations.Nullable
    T[] data) {
        super();
    }
    
    /**
     * 适配的布局
     *
     * @param viewType
     * @return
     */
    protected abstract int getItemLayoutId(int viewType);
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder getViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
}