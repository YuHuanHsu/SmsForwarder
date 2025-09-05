package com.idormy.sms.forwarder.adapter;

import java.lang.System;

@kotlin.Suppress(names = {"EmptyMethod"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0010\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/idormy/sms/forwarder/adapter/TaskPagingAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/idormy/sms/forwarder/database/entity/Task;", "Lcom/idormy/sms/forwarder/adapter/TaskPagingAdapter$MyViewHolder;", "itemClickListener", "Lcom/idormy/sms/forwarder/adapter/TaskPagingAdapter$OnItemClickListener;", "(Lcom/idormy/sms/forwarder/adapter/TaskPagingAdapter$OnItemClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "MyViewHolder", "OnItemClickListener", "app_debug"})
public final class TaskPagingAdapter extends androidx.paging.PagingDataAdapter<com.idormy.sms.forwarder.database.entity.Task, com.idormy.sms.forwarder.adapter.TaskPagingAdapter.MyViewHolder> {
    private final com.idormy.sms.forwarder.adapter.TaskPagingAdapter.OnItemClickListener itemClickListener = null;
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.adapter.TaskPagingAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static androidx.recyclerview.widget.DiffUtil.ItemCallback<com.idormy.sms.forwarder.database.entity.Task> diffCallback;
    
    public TaskPagingAdapter(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.adapter.TaskPagingAdapter.OnItemClickListener itemClickListener) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.idormy.sms.forwarder.adapter.TaskPagingAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.adapter.TaskPagingAdapter.MyViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/idormy/sms/forwarder/adapter/TaskPagingAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/idormy/sms/forwarder/databinding/AdapterTasksCardViewListItemBinding;", "(Lcom/idormy/sms/forwarder/databinding/AdapterTasksCardViewListItemBinding;)V", "getBinding", "()Lcom/idormy/sms/forwarder/databinding/AdapterTasksCardViewListItemBinding;", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.idormy.sms.forwarder.databinding.AdapterTasksCardViewListItemBinding binding = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull
        com.idormy.sms.forwarder.databinding.AdapterTasksCardViewListItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.idormy.sms.forwarder.databinding.AdapterTasksCardViewListItemBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/idormy/sms/forwarder/adapter/TaskPagingAdapter$OnItemClickListener;", "", "onItemClicked", "", "view", "Landroid/view/View;", "item", "Lcom/idormy/sms/forwarder/database/entity/Task;", "onItemRemove", "id", "", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClicked(@org.jetbrains.annotations.Nullable
        android.view.View view, @org.jetbrains.annotations.NotNull
        com.idormy.sms.forwarder.database.entity.Task item);
        
        public abstract void onItemRemove(@org.jetbrains.annotations.Nullable
        android.view.View view, int id);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/idormy/sms/forwarder/adapter/TaskPagingAdapter$Companion;", "", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/idormy/sms/forwarder/database/entity/Task;", "getDiffCallback", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "setDiffCallback", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.idormy.sms.forwarder.database.entity.Task> getDiffCallback() {
            return null;
        }
        
        public final void setDiffCallback(@org.jetbrains.annotations.NotNull
        androidx.recyclerview.widget.DiffUtil.ItemCallback<com.idormy.sms.forwarder.database.entity.Task> p0) {
        }
    }
}