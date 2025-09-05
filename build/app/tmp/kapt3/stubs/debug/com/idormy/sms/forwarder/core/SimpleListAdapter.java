package com.idormy.sms.forwarder.core;

import java.lang.System;

/**
 * 主副标题显示适配器
 *
 * @author xuexiang
 * @since 2018/12/19 上午12:19
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u001e\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0014\u0015B1\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012 \u0010\u0007\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ0\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0016\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0014\u00a8\u0006\u0016"}, d2 = {"Lcom/idormy/sms/forwarder/core/SimpleListAdapter;", "Lcom/xuexiang/xui/adapter/listview/BaseListAdapter;", "", "", "Lcom/idormy/sms/forwarder/core/SimpleListAdapter$ViewHolder;", "context", "Landroid/content/Context;", "data", "", "(Landroid/content/Context;Ljava/util/List;)V", "convert", "", "holder", "item", "position", "", "getLayoutId", "newViewHolder", "convertView", "Landroid/view/View;", "Companion", "ViewHolder", "app_debug"})
public final class SimpleListAdapter extends com.xuexiang.xui.adapter.listview.BaseListAdapter<java.util.Map<java.lang.String, ? extends java.lang.String>, com.idormy.sms.forwarder.core.SimpleListAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.core.SimpleListAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_TITLE = "key_title";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_SUB_TITLE = "key_sub_title";
    
    public SimpleListAdapter(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>> data) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.idormy.sms.forwarder.core.SimpleListAdapter.ViewHolder newViewHolder(@org.jetbrains.annotations.NotNull
    android.view.View convertView) {
        return null;
    }
    
    @java.lang.Override
    protected int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override
    protected void convert(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.core.SimpleListAdapter.ViewHolder holder, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.String> item, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/idormy/sms/forwarder/core/SimpleListAdapter$ViewHolder;", "", "()V", "mTvSubTitle", "Landroid/widget/TextView;", "getMTvSubTitle", "()Landroid/widget/TextView;", "setMTvSubTitle", "(Landroid/widget/TextView;)V", "mTvTitle", "getMTvTitle", "setMTvTitle", "app_debug"})
    public static final class ViewHolder {
        
        /**
         * 标题
         */
        @org.jetbrains.annotations.Nullable
        private android.widget.TextView mTvTitle;
        
        /**
         * 副标题
         */
        @org.jetbrains.annotations.Nullable
        private android.widget.TextView mTvSubTitle;
        
        public ViewHolder() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.widget.TextView getMTvTitle() {
            return null;
        }
        
        public final void setMTvTitle(@org.jetbrains.annotations.Nullable
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.widget.TextView getMTvSubTitle() {
            return null;
        }
        
        public final void setMTvSubTitle(@org.jetbrains.annotations.Nullable
        android.widget.TextView p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/idormy/sms/forwarder/core/SimpleListAdapter$Companion;", "", "()V", "KEY_SUB_TITLE", "", "KEY_TITLE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}