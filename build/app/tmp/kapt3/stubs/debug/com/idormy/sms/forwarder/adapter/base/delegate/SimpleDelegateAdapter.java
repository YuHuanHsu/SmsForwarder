package com.idormy.sms.forwarder.adapter.base.delegate;

import java.lang.System;

/**
 * 简易DelegateAdapter适配器
 *
 * @author xuexiang
 * @since 2020/3/20 12:55 AM
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\u00a2\u0006\u0002\u0010\nB\'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0014J\b\u0010\u0012\u001a\u00020\u0006H\u0016R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/idormy/sms/forwarder/adapter/base/delegate/SimpleDelegateAdapter;", "T", "Lcom/idormy/sms/forwarder/adapter/base/delegate/BaseDelegateAdapter;", "layoutId", "", "layoutHelper", "Lcom/alibaba/android/vlayout/LayoutHelper;", "(ILcom/alibaba/android/vlayout/LayoutHelper;)V", "list", "", "(ILcom/alibaba/android/vlayout/LayoutHelper;Ljava/util/Collection;)V", "data", "", "(ILcom/alibaba/android/vlayout/LayoutHelper;[Ljava/lang/Object;)V", "mLayoutHelper", "mLayoutId", "getItemLayoutId", "viewType", "onCreateLayoutHelper", "app_debug"})
public abstract class SimpleDelegateAdapter<T extends java.lang.Object> extends com.idormy.sms.forwarder.adapter.base.delegate.BaseDelegateAdapter<T> {
    private int mLayoutId;
    private com.alibaba.android.vlayout.LayoutHelper mLayoutHelper;
    
    public SimpleDelegateAdapter(int layoutId, @org.jetbrains.annotations.NotNull
    com.alibaba.android.vlayout.LayoutHelper layoutHelper) {
        super();
    }
    
    public SimpleDelegateAdapter(int layoutId, @org.jetbrains.annotations.NotNull
    com.alibaba.android.vlayout.LayoutHelper layoutHelper, @org.jetbrains.annotations.Nullable
    java.util.Collection<? extends T> list) {
        super();
    }
    
    public SimpleDelegateAdapter(int layoutId, @org.jetbrains.annotations.NotNull
    com.alibaba.android.vlayout.LayoutHelper layoutHelper, @org.jetbrains.annotations.Nullable
    T[] data) {
        super();
    }
    
    @java.lang.Override
    protected int getItemLayoutId(int viewType) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.alibaba.android.vlayout.LayoutHelper onCreateLayoutHelper() {
        return null;
    }
}