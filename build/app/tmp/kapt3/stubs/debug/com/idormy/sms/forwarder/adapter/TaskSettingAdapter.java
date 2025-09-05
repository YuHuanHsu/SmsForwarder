package com.idormy.sms.forwarder.adapter;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0001 BC\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0013\u001a\u00020\tH\u0016J\u001c\u0010\u0014\u001a\u00020\n2\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\tH\u0016J\b\u0010\u001b\u001a\u00020\nH\u0016J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tH\u0016J\u000e\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/idormy/sms/forwarder/adapter/TaskSettingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/idormy/sms/forwarder/adapter/TaskSettingAdapter$ViewHolder;", "Lcom/idormy/sms/forwarder/adapter/base/ItemMoveCallback$Listener;", "itemList", "", "Lcom/idormy/sms/forwarder/entity/TaskSetting;", "removeClickListener", "Lkotlin/Function1;", "", "", "editClickListener", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getItemList", "()Ljava/util/List;", "setItemList", "(Ljava/util/List;)V", "touchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onDragFinished", "onItemMove", "fromPosition", "toPosition", "setTouchHelper", "ViewHolder", "app_debug"})
public final class TaskSettingAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.idormy.sms.forwarder.adapter.TaskSettingAdapter.ViewHolder> implements com.idormy.sms.forwarder.adapter.base.ItemMoveCallback.Listener {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.idormy.sms.forwarder.entity.TaskSetting> itemList;
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> removeClickListener;
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> editClickListener;
    private androidx.recyclerview.widget.ItemTouchHelper touchHelper;
    
    public TaskSettingAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.idormy.sms.forwarder.entity.TaskSetting> itemList, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> removeClickListener, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> editClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.idormy.sms.forwarder.entity.TaskSetting> getItemList() {
        return null;
    }
    
    public final void setItemList(@org.jetbrains.annotations.NotNull
    java.util.List<com.idormy.sms.forwarder.entity.TaskSetting> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.idormy.sms.forwarder.adapter.TaskSettingAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.adapter.TaskSettingAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setTouchHelper(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.ItemTouchHelper touchHelper) {
    }
    
    @java.lang.Override
    public void onItemMove(int fromPosition, int toPosition) {
    }
    
    @java.lang.Override
    public void onDragFinished() {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/idormy/sms/forwarder/adapter/TaskSettingAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lcom/idormy/sms/forwarder/adapter/TaskSettingAdapter;Landroid/view/View;)V", "description", "Landroid/widget/TextView;", "dragIcon", "Landroid/widget/ImageView;", "editIcon", "icon", "removeIcon", "title", "bind", "", "taskSetting", "Lcom/idormy/sms/forwarder/entity/TaskSetting;", "onClick", "v", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        private final android.widget.ImageView icon = null;
        private final android.widget.TextView title = null;
        private final android.widget.TextView description = null;
        private final android.widget.ImageView editIcon = null;
        private final android.widget.ImageView removeIcon = null;
        private final android.widget.ImageView dragIcon = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.idormy.sms.forwarder.entity.TaskSetting taskSetting) {
        }
        
        @java.lang.Override
        public void onClick(@org.jetbrains.annotations.Nullable
        android.view.View v) {
        }
    }
}