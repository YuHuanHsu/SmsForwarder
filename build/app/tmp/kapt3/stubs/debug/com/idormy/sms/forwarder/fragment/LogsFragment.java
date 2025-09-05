package com.idormy.sms.forwarder.fragment;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\u0012\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0002J\n\u0010 \u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010!\u001a\u00020\u001cH\u0014J\u001a\u0010\"\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&H\u0016J\u001a\u0010\'\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010(\u001a\u00020)H\u0016J\u001a\u0010*\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\u001cH\u0002J \u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u000201H\u0002J\u0018\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u00067"}, d2 = {"Lcom/idormy/sms/forwarder/fragment/LogsFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Lcom/idormy/sms/forwarder/databinding/FragmentLogsBinding;", "Lcom/idormy/sms/forwarder/adapter/MsgPagingAdapter$OnItemClickListener;", "()V", "TAG", "", "adapter", "Lcom/idormy/sms/forwarder/adapter/MsgPagingAdapter;", "currentFilter", "", "", "currentType", "logsFilterPopup", "Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;", "timePicker", "Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;", "titleBar", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "viewModel", "Lcom/idormy/sms/forwarder/database/viewmodel/MsgViewModel;", "getViewModel", "()Lcom/idormy/sms/forwarder/database/viewmodel/MsgViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getContainer", "Lcom/idormy/sms/forwarder/activity/MainActivity;", "initListeners", "", "initLogsFilterDialog", "needInit", "", "initTitle", "initViews", "onItemClicked", "view", "Landroid/view/View;", "item", "Lcom/idormy/sms/forwarder/database/entity/MsgAndLogs;", "onItemRemove", "id", "", "onLogsClicked", "Lcom/idormy/sms/forwarder/database/entity/LogsDetail;", "reloadData", "showTimePicker", "time", "title", "et", "Landroid/widget/EditText;", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
@com.xuexiang.xpage.annotation.Page(name = "\u8f6c\u53d1\u65e5\u5fd7")
public final class LogsFragment extends com.idormy.sms.forwarder.core.BaseFragment<com.idormy.sms.forwarder.databinding.FragmentLogsBinding> implements com.idormy.sms.forwarder.adapter.MsgPagingAdapter.OnItemClickListener {
    private final java.lang.String TAG = null;
    private com.xuexiang.xui.widget.actionbar.TitleBar titleBar;
    private com.idormy.sms.forwarder.adapter.MsgPagingAdapter adapter;
    private final kotlin.Lazy viewModel$delegate = null;
    private java.lang.String currentType = "sms";
    private java.util.Map<java.lang.String, java.lang.Object> currentFilter;
    private com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog logsFilterPopup;
    private com.xuexiang.xui.widget.picker.widget.TimePickerView timePicker;
    
    public LogsFragment() {
        super();
    }
    
    private final com.idormy.sms.forwarder.database.viewmodel.MsgViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.idormy.sms.forwarder.databinding.FragmentLogsBinding viewBindingInflate(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull
    android.view.ViewGroup container) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    protected com.xuexiang.xui.widget.actionbar.TitleBar initTitle() {
        return null;
    }
    
    private final com.idormy.sms.forwarder.activity.MainActivity getContainer() {
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
    
    @java.lang.Override
    public void onItemClicked(@org.jetbrains.annotations.Nullable
    android.view.View view, @org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.MsgAndLogs item) {
    }
    
    @java.lang.Override
    public void onLogsClicked(@org.jetbrains.annotations.Nullable
    android.view.View view, @org.jetbrains.annotations.NotNull
    com.idormy.sms.forwarder.database.entity.LogsDetail item) {
    }
    
    @java.lang.Override
    public void onItemRemove(@org.jetbrains.annotations.Nullable
    android.view.View view, int id) {
    }
    
    private final void reloadData() {
    }
    
    @kotlin.Suppress(names = {"SameParameterValue"})
    private final void initLogsFilterDialog(boolean needInit) {
    }
    
    private final void showTimePicker(java.lang.String time, java.lang.String title, android.widget.EditText et) {
    }
}