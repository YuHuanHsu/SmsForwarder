package com.idormy.sms.forwarder.adapter.base.broccoli;

import java.lang.System;

/**
 * 使用Broccoli占位的基础适配器
 *
 * @author xuexiang
 * @since 2021/1/9 4:52 PM
 */
@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\u00a2\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ%\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00028\u0000H\u0014\u00a2\u0006\u0002\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0011H$J%\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004H$\u00a2\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020\u0015J \u0010!\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\"2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0016R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/idormy/sms/forwarder/adapter/base/broccoli/BroccoliSimpleDelegateAdapter;", "T", "Lcom/idormy/sms/forwarder/adapter/base/delegate/SimpleDelegateAdapter;", "layoutId", "", "layoutHelper", "Lcom/alibaba/android/vlayout/LayoutHelper;", "(ILcom/alibaba/android/vlayout/LayoutHelper;)V", "list", "", "(ILcom/alibaba/android/vlayout/LayoutHelper;Ljava/util/Collection;)V", "data", "", "(ILcom/alibaba/android/vlayout/LayoutHelper;[Ljava/lang/Object;)V", "mBroccoliMap", "", "Landroid/view/View;", "Lme/samlss/broccoli/Broccoli;", "mHasLoad", "", "bindData", "", "holder", "Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;", "position", "item", "(Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;ILjava/lang/Object;)V", "onBindBroccoli", "broccoli", "onBindData", "model", "(Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;Ljava/lang/Object;I)V", "recycle", "refresh", "Lcom/idormy/sms/forwarder/adapter/base/delegate/XDelegateAdapter;", "collection", "app_debug"})
public abstract class BroccoliSimpleDelegateAdapter<T extends java.lang.Object> extends com.idormy.sms.forwarder.adapter.base.delegate.SimpleDelegateAdapter<T> {
    
    /**
     * 是否已经加载成功
     */
    private boolean mHasLoad = false;
    private final java.util.Map<android.view.View, me.samlss.broccoli.Broccoli> mBroccoliMap = null;
    
    public BroccoliSimpleDelegateAdapter(int layoutId, @org.jetbrains.annotations.NotNull
    com.alibaba.android.vlayout.LayoutHelper layoutHelper) {
        super(0, null);
    }
    
    public BroccoliSimpleDelegateAdapter(int layoutId, @org.jetbrains.annotations.NotNull
    com.alibaba.android.vlayout.LayoutHelper layoutHelper, @org.jetbrains.annotations.Nullable
    java.util.Collection<? extends T> list) {
        super(0, null);
    }
    
    public BroccoliSimpleDelegateAdapter(int layoutId, @org.jetbrains.annotations.Nullable
    com.alibaba.android.vlayout.LayoutHelper layoutHelper, @org.jetbrains.annotations.Nullable
    T[] data) {
        super(0, null);
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
    protected abstract void onBindData(@org.jetbrains.annotations.NotNull
    com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder holder, T model, int position);
    
    /**
     * 绑定占位控件
     *
     * @param holder
     * @param broccoli
     */
    protected abstract void onBindBroccoli(@org.jetbrains.annotations.NotNull
    com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder holder, @org.jetbrains.annotations.NotNull
    me.samlss.broccoli.Broccoli broccoli);
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.idormy.sms.forwarder.adapter.base.delegate.XDelegateAdapter<?, ?> refresh(@org.jetbrains.annotations.Nullable
    java.util.Collection<? extends T> collection) {
        return null;
    }
    
    /**
     * 资源释放，防止内存泄漏
     */
    public final void recycle() {
    }
}