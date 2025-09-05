package com.idormy.sms.forwarder.adapter.base.broccoli;

import java.lang.System;

/**
 * 使用Broccoli占位的基础适配器
 *
 * @author XUE
 * @since 2019/4/8 16:33
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J%\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0014\u00a2\u0006\u0002\u0010\u0013J\u001c\u0010\u0014\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\tH$J\'\u0010\u0016\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0011H$\u00a2\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\rJ\u001e\u0010\u001a\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/idormy/sms/forwarder/adapter/base/broccoli/BroccoliRecyclerAdapter;", "T", "Lcom/xuexiang/xui/adapter/recyclerview/BaseRecyclerAdapter;", "collection", "", "(Ljava/util/Collection;)V", "mBroccoliMap", "", "Landroid/view/View;", "Lme/samlss/broccoli/Broccoli;", "mHasLoad", "", "bindData", "", "holder", "Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;", "position", "", "item", "(Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;ILjava/lang/Object;)V", "onBindBroccoli", "broccoli", "onBindData", "model", "(Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;Ljava/lang/Object;I)V", "recycle", "refresh", "Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;", "app_debug"})
public abstract class BroccoliRecyclerAdapter<T extends java.lang.Object> extends com.xuexiang.xui.adapter.recyclerview.BaseRecyclerAdapter<T> {
    
    /**
     * 是否已经加载成功
     */
    private boolean mHasLoad = false;
    private final java.util.Map<android.view.View, me.samlss.broccoli.Broccoli> mBroccoliMap = null;
    
    public BroccoliRecyclerAdapter(@org.jetbrains.annotations.Nullable
    java.util.Collection<? extends T> collection) {
        super();
    }
    
    @java.lang.Override
    protected void bindData(@org.jetbrains.annotations.NotNull
    com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder holder, int position, T item) {
    }
    
    /**
     * 绑定控件
     *
     * @param holder
     * @param model
     * @param position
     */
    protected abstract void onBindData(@org.jetbrains.annotations.Nullable
    com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder holder, T model, int position);
    
    /**
     * 绑定占位控件
     *
     * @param broccoli
     */
    protected abstract void onBindBroccoli(@org.jetbrains.annotations.Nullable
    com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder holder, @org.jetbrains.annotations.Nullable
    me.samlss.broccoli.Broccoli broccoli);
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.xuexiang.xui.adapter.recyclerview.XRecyclerAdapter<?, ?> refresh(@org.jetbrains.annotations.NotNull
    java.util.Collection<? extends T> collection) {
        return null;
    }
    
    /**
     * 资源释放，防止内存泄漏
     */
    public final void recycle() {
    }
}