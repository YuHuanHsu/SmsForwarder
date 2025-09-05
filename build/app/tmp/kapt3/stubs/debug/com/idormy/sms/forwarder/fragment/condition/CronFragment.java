package com.idormy.sms.forwarder.fragment.condition;

import java.lang.System;

@kotlin.Suppress(names = {"PrivatePropertyName"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010&\u001a\u00020\'H\u0002J\b\u0010(\u001a\u00020\'H\u0002J\b\u0010)\u001a\u00020\'H\u0002J\b\u0010*\u001a\u00020\'H\u0002J\b\u0010+\u001a\u00020\'H\u0002J\b\u0010,\u001a\u00020\'H\u0002J\b\u0010-\u001a\u00020\'H\u0002J\b\u0010.\u001a\u00020/H\u0003J(\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\t2\b\b\u0002\u00105\u001a\u000204H\u0002J\b\u00106\u001a\u00020\'H\u0014J\b\u00107\u001a\u00020\'H\u0003J\b\u00108\u001a\u00020\'H\u0003J\b\u00109\u001a\u00020\'H\u0015J\b\u0010:\u001a\u00020\'H\u0003J\b\u0010;\u001a\u00020\'H\u0003J\b\u0010<\u001a\u00020\'H\u0003J\n\u0010=\u001a\u0004\u0018\u00010!H\u0014J\b\u0010>\u001a\u00020\'H\u0014J\b\u0010?\u001a\u00020\'H\u0002J\b\u0010@\u001a\u00020\'H\u0003J\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0002J&\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\b\b\u0002\u0010D\u001a\u00020\u0006H\u0002J\u0010\u0010E\u001a\u00020\'2\u0006\u0010F\u001a\u00020GH\u0017J\b\u0010H\u001a\u00020\'H\u0016J \u0010I\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010J\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0006H\u0002J\u0010\u0010K\u001a\u00020\'2\u0006\u0010L\u001a\u00020MH\u0002J\u0018\u0010N\u001a\u00020\u00022\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020RH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006S"}, d2 = {"Lcom/idormy/sms/forwarder/fragment/condition/CronFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Lcom/idormy/sms/forwarder/databinding/FragmentTasksConditionCronBinding;", "Landroid/view/View$OnClickListener;", "()V", "TAG", "", "day", "dayList", "", "description", "eventData", "expression", "hour", "hoursList", "mCountDownHelper", "Lcom/xuexiang/xui/utils/CountDownButtonHelper;", "minute", "minutesList", "month", "monthList", "regexNum", "Lkotlin/text/Regex;", "second", "secondsList", "selectedDayList", "selectedHourList", "selectedMinuteList", "selectedMonthList", "selectedSecondList", "selectedWeekList", "selectedYearList", "titleBar", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "week", "weekList", "year", "yearList", "afterDayChanged", "", "afterHourChanged", "afterMinuteChanged", "afterMonthChanged", "afterSecondChanged", "afterWeekChanged", "afterYearChanged", "checkSetting", "Lcom/idormy/sms/forwarder/entity/condition/CronSetting;", "getSelectedItems", "parent", "Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;", "selectedList", "", "dataType", "initArgs", "initDayInputHelper", "initHourInputHelper", "initListeners", "initMinuteInputHelper", "initMonthInputHelper", "initSecondInputHelper", "initTitle", "initViews", "initWeekInputHelper", "initYearInputHelper", "mergeContinuousEnum", "input", "mergeContinuousItems", "stringFormat", "onClick", "v", "Landroid/view/View;", "onDestroyView", "restoreMergedItems", "mergedString", "switchInputHelper", "layout", "Landroid/widget/LinearLayout;", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
@com.xuexiang.xpage.annotation.Page(name = "Cron")
public final class CronFragment extends com.idormy.sms.forwarder.core.BaseFragment<com.idormy.sms.forwarder.databinding.FragmentTasksConditionCronBinding> implements android.view.View.OnClickListener {
    private final java.lang.String TAG = null;
    private com.xuexiang.xui.widget.actionbar.TitleBar titleBar;
    private com.xuexiang.xui.utils.CountDownButtonHelper mCountDownHelper;
    @org.jetbrains.annotations.Nullable
    @com.xuexiang.xrouter.annotation.AutoWired(name = "event_data_condition")
    @kotlin.jvm.JvmField
    public java.lang.String eventData;
    private final java.util.List<java.lang.String> secondsList = null;
    private java.lang.String selectedSecondList = "";
    private final java.util.List<java.lang.String> minutesList = null;
    private java.lang.String selectedMinuteList = "";
    private final java.util.List<java.lang.String> hoursList = null;
    private java.lang.String selectedHourList = "";
    private final java.util.List<java.lang.String> dayList = null;
    private java.lang.String selectedDayList = "";
    private final java.util.List<java.lang.String> monthList = null;
    private java.lang.String selectedMonthList = "";
    private final java.util.List<java.lang.String> weekList = null;
    private java.lang.String selectedWeekList = "";
    private final java.util.List<java.lang.String> yearList = null;
    private java.lang.String selectedYearList = "";
    private final kotlin.text.Regex regexNum = null;
    private java.lang.String second = "*";
    private java.lang.String minute = "*";
    private java.lang.String hour = "*";
    private java.lang.String day = "*";
    private java.lang.String month = "*";
    private java.lang.String week = "?";
    private java.lang.String year = "*";
    private java.lang.String expression;
    private java.lang.String description = "";
    
    public CronFragment() {
        super();
    }
    
    @java.lang.Override
    protected void initArgs() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.idormy.sms.forwarder.databinding.FragmentTasksConditionCronBinding viewBindingInflate(@org.jetbrains.annotations.NotNull
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
    public void onDestroyView() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override
    protected void initListeners() {
    }
    
    @java.lang.Override
    @com.xuexiang.xaop.annotation.SingleClick
    public void onClick(@org.jetbrains.annotations.NotNull
    android.view.View v) {
    }
    
    private final void switchInputHelper(android.widget.LinearLayout layout) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initSecondInputHelper() {
    }
    
    private final void afterSecondChanged() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initMinuteInputHelper() {
    }
    
    private final void afterMinuteChanged() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initHourInputHelper() {
    }
    
    private final void afterHourChanged() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initDayInputHelper() {
    }
    
    private final void afterDayChanged() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initMonthInputHelper() {
    }
    
    private final void afterMonthChanged() {
    }
    
    private final void initWeekInputHelper() {
    }
    
    private final void afterWeekChanged() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initYearInputHelper() {
    }
    
    private final void afterYearChanged() {
    }
    
    private final java.lang.String getSelectedItems(com.xuexiang.xui.widget.flowlayout.FlowTagLayout parent, java.util.List<java.lang.Integer> selectedList, int dataType) {
        return null;
    }
    
    private final java.util.List<java.lang.String> mergeContinuousEnum(java.util.List<java.lang.String> input) {
        return null;
    }
    
    private final java.util.List<java.lang.String> mergeContinuousItems(java.util.List<java.lang.String> input, java.lang.String stringFormat) {
        return null;
    }
    
    private final java.util.List<java.lang.String> restoreMergedItems(java.lang.String mergedString, java.lang.String stringFormat) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final com.idormy.sms.forwarder.entity.condition.CronSetting checkSetting() {
        return null;
    }
}