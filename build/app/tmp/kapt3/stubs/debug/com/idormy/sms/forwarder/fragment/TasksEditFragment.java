package com.idormy.sms.forwarder.fragment;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName", "DEPRECATION", "UNUSED_PARAMETER", "EmptyMethod", "NotifyDataSetChanged"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020(H\u0002J\u0010\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020!H\u0002J\u0010\u0010,\u001a\u00020&2\u0006\u0010+\u001a\u00020!H\u0002J\b\u0010-\u001a\u00020&H\u0014J\b\u0010.\u001a\u00020&H\u0002J\b\u0010/\u001a\u00020&H\u0014J\b\u00100\u001a\u00020&H\u0002J\n\u00101\u001a\u0004\u0018\u00010$H\u0014J\b\u00102\u001a\u00020&H\u0014J\u0010\u00103\u001a\u00020&2\u0006\u00104\u001a\u000205H\u0017J\"\u00106\u001a\u00020&2\u0006\u00107\u001a\u00020!2\u0006\u00108\u001a\u00020!2\b\u00109\u001a\u0004\u0018\u00010:H\u0017J \u0010;\u001a\u00020&2\u0006\u0010<\u001a\u0002052\u0006\u0010=\u001a\u00020\u00052\u0006\u0010>\u001a\u00020!H\u0017J\u0010\u0010?\u001a\u00020&2\u0006\u0010+\u001a\u00020!H\u0002J\u0010\u0010@\u001a\u00020&2\u0006\u0010+\u001a\u00020!H\u0002J\u0010\u0010A\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0002J\u0018\u0010B\u001a\u00020\u00022\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u00020!8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006G"}, d2 = {"Lcom/idormy/sms/forwarder/fragment/TasksEditFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Lcom/idormy/sms/forwarder/databinding/FragmentTasksEditBinding;", "Landroid/view/View$OnClickListener;", "Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemClickListener;", "Lcom/xuexiang/xpage/model/PageInfo;", "()V", "TAG", "", "TASK_ACTION_FRAGMENT_LIST", "", "TASK_CONDITION_FRAGMENT_LIST", "actionsAdapter", "Lcom/idormy/sms/forwarder/adapter/TaskSettingAdapter;", "actionsList", "", "Lcom/idormy/sms/forwarder/entity/TaskSetting;", "actionsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "conditionsAdapter", "conditionsList", "conditionsRecyclerView", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "getDialog", "()Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "dialog$delegate", "Lkotlin/Lazy;", "isClone", "", "taskId", "", "taskType", "", "that", "titleBar", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "applyTask", "", "task", "Lcom/idormy/sms/forwarder/database/entity/Task;", "checkForm", "editAction", "position", "editCondition", "initArgs", "initForm", "initListeners", "initRecyclerViews", "initTitle", "initViews", "onClick", "v", "Landroid/view/View;", "onFragmentResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onItemClick", "itemView", "widgetInfo", "pos", "removeAction", "removeCondition", "testTask", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
@com.xuexiang.xpage.annotation.Page(name = "\u81ea\u52a8\u4efb\u52a1\u00b7\u7f16\u8f91\u5668")
public final class TasksEditFragment extends com.idormy.sms.forwarder.core.BaseFragment<com.idormy.sms.forwarder.databinding.FragmentTasksEditBinding> implements android.view.View.OnClickListener, com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder.OnItemClickListener<com.xuexiang.xpage.model.PageInfo> {
    private final java.lang.String TAG = null;
    private final com.idormy.sms.forwarder.fragment.TasksEditFragment that = null;
    private com.xuexiang.xui.widget.actionbar.TitleBar titleBar;
    private final kotlin.Lazy dialog$delegate = null;
    @com.xuexiang.xrouter.annotation.AutoWired(name = "key_task_id")
    @kotlin.jvm.JvmField
    public long taskId = 0L;
    @com.xuexiang.xrouter.annotation.AutoWired(name = "key_task_type")
    @kotlin.jvm.JvmField
    public int taskType = 0;
    @com.xuexiang.xrouter.annotation.AutoWired(name = "key_task_clone")
    @kotlin.jvm.JvmField
    public boolean isClone = false;
    private androidx.recyclerview.widget.RecyclerView conditionsRecyclerView;
    private com.idormy.sms.forwarder.adapter.TaskSettingAdapter conditionsAdapter;
    private java.util.List<com.idormy.sms.forwarder.entity.TaskSetting> conditionsList;
    private androidx.recyclerview.widget.RecyclerView actionsRecyclerView;
    private com.idormy.sms.forwarder.adapter.TaskSettingAdapter actionsAdapter;
    private java.util.List<com.idormy.sms.forwarder.entity.TaskSetting> actionsList;
    private java.util.List<? extends com.xuexiang.xpage.model.PageInfo> TASK_CONDITION_FRAGMENT_LIST;
    private java.util.List<? extends com.xuexiang.xpage.model.PageInfo> TASK_ACTION_FRAGMENT_LIST;
    
    public TasksEditFragment() {
        super();
    }
    
    private final com.google.android.material.bottomsheet.BottomSheetDialog getDialog() {
        return null;
    }
    
    @java.lang.Override
    protected void initArgs() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.idormy.sms.forwarder.databinding.FragmentTasksEditBinding viewBindingInflate(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull
    android.view.ViewGroup container) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    protected com.xuexiang.xui.widget.actionbar.TitleBar initTitle() {
        return null;
    }
    
    /**
     * 初始化控件
     */
    @java.lang.Override
    protected void initViews() {
    }
    
    @java.lang.Override
    protected void initListeners() {
    }
    
    @android.annotation.SuppressLint(value = {"InflateParams"})
    @java.lang.Override
    @com.xuexiang.xaop.annotation.SingleClick
    public void onClick(@org.jetbrains.annotations.NotNull
    android.view.View v) {
    }
    
    private final void initForm() {
    }
    
    private final com.idormy.sms.forwarder.database.entity.Task checkForm() {
        return null;
    }
    
    private final void testTask(com.idormy.sms.forwarder.database.entity.Task task) {
    }
    
    private final void applyTask(com.idormy.sms.forwarder.database.entity.Task task) {
    }
    
    @java.lang.Override
    @com.xuexiang.xaop.annotation.SingleClick
    public void onItemClick(@org.jetbrains.annotations.NotNull
    android.view.View itemView, @org.jetbrains.annotations.NotNull
    com.xuexiang.xpage.model.PageInfo widgetInfo, int pos) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override
    public void onFragmentResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    private final void initRecyclerViews() {
    }
    
    private final void editCondition(int position) {
    }
    
    private final void removeCondition(int position) {
    }
    
    private final void editAction(int position) {
    }
    
    private final void removeAction(int position) {
    }
}