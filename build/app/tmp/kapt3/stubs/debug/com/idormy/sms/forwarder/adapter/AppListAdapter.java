package com.idormy.sms.forwarder.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J$\u0010\u000f\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0007H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/idormy/sms/forwarder/adapter/AppListAdapter;", "Lcom/idormy/sms/forwarder/adapter/base/broccoli/BroccoliRecyclerAdapter;", "Lcom/idormy/sms/forwarder/utils/AppInfo;", "mIsAnim", "", "(Z)V", "getItemLayoutId", "", "viewType", "onBindBroccoli", "", "holder", "Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;", "broccoli", "Lme/samlss/broccoli/Broccoli;", "onBindData", "model", "position", "app_debug"})
public final class AppListAdapter extends com.idormy.sms.forwarder.adapter.base.broccoli.BroccoliRecyclerAdapter<com.idormy.sms.forwarder.utils.AppInfo> {
    
    /**
     * 是否是加载占位
     */
    private final boolean mIsAnim = false;
    
    public AppListAdapter(boolean mIsAnim) {
        super(null);
    }
    
    @java.lang.Override
    protected int getItemLayoutId(int viewType) {
        return 0;
    }
    
    /**
     * 绑定控件
     *
     * @param holder
     * @param model
     * @param position
     */
    @java.lang.Override
    protected void onBindData(@org.jetbrains.annotations.Nullable
    com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder holder, @org.jetbrains.annotations.Nullable
    com.idormy.sms.forwarder.utils.AppInfo model, int position) {
    }
    
    /**
     * 绑定占位控件
     *
     * @param holder
     * @param broccoli
     */
    @java.lang.Override
    protected void onBindBroccoli(@org.jetbrains.annotations.Nullable
    com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder holder, @org.jetbrains.annotations.Nullable
    me.samlss.broccoli.Broccoli broccoli) {
    }
}