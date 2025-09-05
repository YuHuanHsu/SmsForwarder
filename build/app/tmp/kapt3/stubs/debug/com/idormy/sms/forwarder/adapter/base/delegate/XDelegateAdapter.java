package com.idormy.sms.forwarder.adapter.base.delegate;

import java.lang.System;

/**
 * 基础DelegateAdapter
 *
 * @author xuexiang
 * @since 2020/3/20 12:17 AM
 */
@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bB\u0017\b\u0016\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u001b\u0010\u0019\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u001a\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001bJ#\u0010\u0019\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001dJ%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00028\u00012\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0018H\u0002J\b\u0010$\u001a\u00020\u001fH\u0007J\u0016\u0010%\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u001c\u001a\u00020\u0018J\u0017\u0010&\u001a\u0004\u0018\u00018\u00002\u0006\u0010!\u001a\u00020\u0018H\u0002\u00a2\u0006\u0002\u0010\'J\b\u0010(\u001a\u00020\u0018H\u0016J\u001d\u0010)\u001a\u00028\u00012\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0018H$\u00a2\u0006\u0002\u0010-J\u001a\u0010.\u001a\u00020/2\u0006\u0010*\u001a\u00020+2\b\b\u0001\u00100\u001a\u00020\u0018H\u0004J\u001f\u00101\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\b\u0010\u001a\u001a\u0004\u0018\u00018\u0000H\u0007\u00a2\u0006\u0002\u0010\u001bJ%\u00102\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u000e\u00103\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nH\u0007\u00a2\u0006\u0002\u00104J \u00102\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u000e\u00105\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007H\u0007J\u001d\u00106\u001a\u00020\u001f2\u0006\u0010 \u001a\u00028\u00012\u0006\u0010!\u001a\u00020\u0018H\u0016\u00a2\u0006\u0002\u00107J\u001d\u00108\u001a\u00028\u00012\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0018H\u0016\u00a2\u0006\u0002\u0010-J%\u00109\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u000e\u00103\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nH\u0007\u00a2\u0006\u0002\u00104J#\u00109\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001dJ \u00109\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u000e\u00105\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007H\u0017J\u0018\u0010:\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0017\u001a\u00020\u0018H\u0007R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0014\u001a\u0004\u0018\u00018\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lcom/idormy/sms/forwarder/adapter/base/delegate/XDelegateAdapter;", "T", "V", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/alibaba/android/vlayout/DelegateAdapter$Adapter;", "()V", "list", "", "(Ljava/util/Collection;)V", "data", "", "([Ljava/lang/Object;)V", "", "getData", "()Ljava/util/List;", "isEmpty", "", "()Z", "mData", "", "selectItem", "getSelectItem", "()Ljava/lang/Object;", "selectPosition", "", "add", "item", "(Ljava/lang/Object;)Lcom/idormy/sms/forwarder/adapter/base/delegate/XDelegateAdapter;", "pos", "(ILjava/lang/Object;)Lcom/idormy/sms/forwarder/adapter/base/delegate/XDelegateAdapter;", "bindData", "", "holder", "position", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;)V", "checkPosition", "clear", "delete", "getItem", "(I)Ljava/lang/Object;", "getItemCount", "getViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "inflateView", "Landroid/view/View;", "layoutId", "load", "loadMore", "array", "([Ljava/lang/Object;)Lcom/idormy/sms/forwarder/adapter/base/delegate/XDelegateAdapter;", "collection", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "onCreateViewHolder", "refresh", "setSelectPosition", "app_debug"})
public abstract class XDelegateAdapter<T extends java.lang.Object, V extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends com.alibaba.android.vlayout.DelegateAdapter.Adapter<V> {
    
    /**
     * 数据源
     */
    private final java.util.List<T> mData = null;
    
    /**
     * 当前点击的条目
     */
    private int selectPosition = -1;
    
    public XDelegateAdapter() {
        super();
    }
    
    public XDelegateAdapter(@org.jetbrains.annotations.Nullable
    java.util.Collection<? extends T> list) {
        super();
    }
    
    public XDelegateAdapter(@org.jetbrains.annotations.Nullable
    T[] data) {
        super();
    }
    
    /**
     * 构建自定义的ViewHolder
     *
     * @param parent
     * @param viewType
     * @return
     */
    @org.jetbrains.annotations.NotNull
    protected abstract V getViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType);
    
    /**
     * 绑定数据
     *
     * @param holder
     * @param position 索引
     * @param item     列表项
     */
    protected abstract void bindData(@org.jetbrains.annotations.NotNull
    V holder, int position, T item);
    
    /**
     * 加载布局获取控件
     *
     * @param parent   父布局
     * @param layoutId 布局ID
     * @return
     */
    @org.jetbrains.annotations.NotNull
    protected final android.view.View inflateView(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, @androidx.annotation.LayoutRes
    int layoutId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public V onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    V holder, int position) {
    }
    
    /**
     * 获取列表项
     *
     * @param position
     * @return
     */
    private final T getItem(int position) {
        return null;
    }
    
    private final boolean checkPosition(int position) {
        return false;
    }
    
    public final boolean isEmpty() {
        return false;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<T> getData() {
        return null;
    }
    
    /**
     * 给指定位置添加一项
     *
     * @param pos
     * @param item
     * @return
     */
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.adapter.base.delegate.XDelegateAdapter<?, ?> add(int pos, T item) {
        return null;
    }
    
    /**
     * 在列表末端增加一项
     *
     * @param item
     * @return
     */
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.adapter.base.delegate.XDelegateAdapter<?, ?> add(T item) {
        return null;
    }
    
    /**
     * 删除列表中指定索引的数据
     *
     * @param pos
     * @return
     */
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.adapter.base.delegate.XDelegateAdapter<?, ?> delete(int pos) {
        return null;
    }
    
    /**
     * 刷新列表中指定位置的数据
     *
     * @param pos
     * @param item
     * @return
     */
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.adapter.base.delegate.XDelegateAdapter<?, ?> refresh(int pos, T item) {
        return null;
    }
    
    /**
     * 刷新列表数据
     *
     * @param collection
     * @return
     */
    @org.jetbrains.annotations.NotNull
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public com.idormy.sms.forwarder.adapter.base.delegate.XDelegateAdapter<?, ?> refresh(@org.jetbrains.annotations.Nullable
    java.util.Collection<? extends T> collection) {
        return null;
    }
    
    /**
     * 刷新列表数据
     *
     * @param array
     * @return
     */
    @org.jetbrains.annotations.NotNull
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final com.idormy.sms.forwarder.adapter.base.delegate.XDelegateAdapter<?, ?> refresh(@org.jetbrains.annotations.Nullable
    T[] array) {
        return null;
    }
    
    /**
     * 加载更多
     *
     * @param collection
     * @return
     */
    @org.jetbrains.annotations.NotNull
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final com.idormy.sms.forwarder.adapter.base.delegate.XDelegateAdapter<?, ?> loadMore(@org.jetbrains.annotations.Nullable
    java.util.Collection<? extends T> collection) {
        return null;
    }
    
    /**
     * 加载更多
     *
     * @param array
     * @return
     */
    @org.jetbrains.annotations.NotNull
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final com.idormy.sms.forwarder.adapter.base.delegate.XDelegateAdapter<?, ?> loadMore(@org.jetbrains.annotations.Nullable
    T[] array) {
        return null;
    }
    
    /**
     * 添加一个
     *
     * @param item
     * @return
     */
    @org.jetbrains.annotations.NotNull
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final com.idormy.sms.forwarder.adapter.base.delegate.XDelegateAdapter<?, ?> load(@org.jetbrains.annotations.Nullable
    T item) {
        return null;
    }
    
    /**
     * 设置当前列表的选中项
     *
     * @param selectPosition
     * @return
     */
    @org.jetbrains.annotations.NotNull
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final com.idormy.sms.forwarder.adapter.base.delegate.XDelegateAdapter<?, ?> setSelectPosition(int selectPosition) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final T getSelectItem() {
        return null;
    }
    
    /**
     * 清除数据
     */
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void clear() {
    }
}