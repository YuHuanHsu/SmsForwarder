package com.idormy.sms.forwarder.fragment;

import java.lang.System;

@kotlin.Suppress(names = {"SpellCheckingInspection", "PrivatePropertyName"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0003J\u001a\u0010\u001d\u001a\u00020\u00182\b\b\u0001\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020#H\u0002J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020#H\u0002J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020#H\u0002J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020#H\u0002J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020#H\u0002J\u0010\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020#H\u0002J \u00100\u001a\u00020\u00182\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u000202H\u0002J\u0010\u00105\u001a\u00020\u00182\u0006\u00106\u001a\u00020#H\u0002J\b\u00107\u001a\u00020\u0006H\u0002J\n\u00108\u001a\u0004\u0018\u000109H\u0002J\b\u0010:\u001a\u00020\u0018H\u0002J\b\u0010;\u001a\u00020\u0018H\u0014J\n\u0010<\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010=\u001a\u00020\u0018H\u0015J\u0010\u0010>\u001a\u00020\u00182\u0006\u0010?\u001a\u00020@H\u0017J\b\u0010A\u001a\u00020\u0018H\u0016J\u0012\u0010B\u001a\u00020\u00182\b\b\u0002\u0010C\u001a\u00020\u0006H\u0002J\u0012\u0010D\u001a\u00020\u00182\b\b\u0002\u0010C\u001a\u00020\u0006H\u0002J\u0010\u0010E\u001a\u00020\u00182\u0006\u0010F\u001a\u00020GH\u0002J\u0012\u0010H\u001a\u00020\u00182\b\b\u0001\u0010H\u001a\u00020\u001cH\u0002J\u0012\u0010I\u001a\u00020\u00182\b\b\u0001\u0010I\u001a\u00020\u001cH\u0002J\u0012\u0010J\u001a\u00020\u00182\b\b\u0001\u0010J\u001a\u00020\u001cH\u0002J \u0010K\u001a\u00020\u00182\u0006\u0010L\u001a\u00020\u001c2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020NH\u0003J*\u0010P\u001a\u00020\u00182\b\b\u0001\u0010Q\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020\u001a2\u0006\u0010S\u001a\u0002022\u0006\u0010T\u001a\u00020NH\u0002J \u0010U\u001a\u00020\u00182\u0006\u0010V\u001a\u00020\u001c2\u0006\u0010W\u001a\u00020N2\u0006\u0010X\u001a\u00020NH\u0003J \u0010Y\u001a\u00020\u00182\u0006\u0010Z\u001a\u00020\u001c2\u0006\u0010[\u001a\u00020N2\u0006\u0010\\\u001a\u00020NH\u0003J:\u0010]\u001a\u00020\u00182\b\b\u0001\u0010^\u001a\u00020\u001c2\u0006\u0010_\u001a\u00020\u001a2\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020a2\u0006\u0010c\u001a\u0002022\u0006\u0010d\u001a\u000202H\u0002J@\u0010e\u001a\u00020\u00182\u0006\u0010f\u001a\u00020\u001c2\u0006\u0010g\u001a\u00020N2\u0006\u0010h\u001a\u00020N2\u0006\u0010i\u001a\u00020N2\u0006\u0010j\u001a\u00020N2\u0006\u0010k\u001a\u00020N2\u0006\u0010l\u001a\u00020NH\u0003J\u0010\u0010m\u001a\u00020\u00182\u0006\u0010n\u001a\u00020\u001cH\u0003J\u0018\u0010o\u001a\u00020\u00182\u0006\u0010p\u001a\u00020\u001c2\u0006\u0010q\u001a\u00020#H\u0003J\u0018\u0010r\u001a\u00020\u00182\u0006\u0010s\u001a\u00020\u001a2\u0006\u0010t\u001a\u00020\u001cH\u0003J\u0010\u0010u\u001a\u00020\u00182\u0006\u0010v\u001a\u00020aH\u0002J\u0010\u0010w\u001a\u00020\u00182\u0006\u0010x\u001a\u00020\u001cH\u0003J\u0018\u0010y\u001a\u00020\u00022\u0006\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020}H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00060\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u000f\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006~"}, d2 = {"Lcom/idormy/sms/forwarder/fragment/SettingsFragment;", "Lcom/idormy/sms/forwarder/core/BaseFragment;", "Lcom/idormy/sms/forwarder/databinding/FragmentSettingsBinding;", "Landroid/view/View$OnClickListener;", "()V", "TAG", "", "appListObserver", "Landroidx/lifecycle/Observer;", "kotlin.jvm.PlatformType", "appListSpinnerAdapter", "Lcom/idormy/sms/forwarder/adapter/spinner/AppListSpinnerAdapter;", "appListSpinnerList", "Ljava/util/ArrayList;", "Lcom/idormy/sms/forwarder/adapter/spinner/AppListAdapterItem;", "hashMap", "Ljava/util/HashMap;", "", "initViewsFinished", "", "mTimeOption", "titleBar", "Lcom/xuexiang/xui/widget/actionbar/TitleBar;", "batterySetting", "", "layoutBatterySetting", "Landroid/widget/LinearLayout;", "sbBatterySetting", "Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;", "checkWithReboot", "sbWithReboot", "tvAutoStartup", "Landroid/widget/TextView;", "editAddExtraDeviceMark", "etExtraDeviceMark", "Landroid/widget/EditText;", "editAddExtraSim1", "etExtraSim1", "editAddExtraSim2", "etExtraSim2", "editAddSubidSim1", "etSubidSim1", "editAddSubidSim2", "etSubidSim2", "editExtraAppList", "textAppList", "editNotifyContent", "etNotifyContent", "editRetryDelayTime", "xsbRetryTimes", "Lcom/xuexiang/xui/widget/picker/XSeekBar;", "xsbDelayTime", "xsbTimeout", "editSmsTemplate", "textSmsTemplate", "getAutoStartTips", "getContainer", "Lcom/idormy/sms/forwarder/activity/MainActivity;", "initAppSpinner", "initListeners", "initTitle", "initViews", "onClick", "v", "Landroid/view/View;", "onResume", "restartBluetoothService", "action", "restartLocationService", "startToAutoStartSetting", "context", "Landroid/content/Context;", "switchDebugMode", "switchDirectlyToClient", "switchDirectlyToTask", "switchEnableAppNotify", "sbEnableAppNotify", "scbCancelAppNotify", "Lcom/xuexiang/xui/widget/button/SmoothCheckBox;", "scbNotUserPresent", "switchEnableBluetooth", "sbEnableBluetooth", "layoutBluetoothSetting", "xsbScanInterval", "scbIgnoreAnonymous", "switchEnableCactus", "sbEnableCactus", "scbPlaySilenceMusic", "scbOnePixelActivity", "switchEnableLoadAppList", "sbEnableLoadAppList", "scbLoadUserApp", "scbLoadSystemApp", "switchEnableLocation", "sbEnableLocation", "layoutLocationSetting", "rgAccuracy", "Landroid/widget/RadioGroup;", "rgPowerRequirement", "xsbMinInterval", "xsbMinDistance", "switchEnablePhone", "sbEnablePhone", "scbCallType1", "scbCallType2", "scbCallType3", "scbCallType4", "scbCallType5", "scbCallType6", "switchEnableSms", "sbEnableSms", "switchEnableSmsCommand", "sbEnableSmsCommand", "etSafePhone", "switchExcludeFromRecents", "layoutExcludeFromRecents", "sbExcludeFromRecents", "switchLanguage", "rgMainLanguages", "switchSmsTemplate", "sbSmsTemplate", "viewBindingInflate", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
@com.xuexiang.xpage.annotation.Page(name = "\u901a\u7528\u8bbe\u7f6e")
public final class SettingsFragment extends com.idormy.sms.forwarder.core.BaseFragment<com.idormy.sms.forwarder.databinding.FragmentSettingsBinding> implements android.view.View.OnClickListener {
    private final java.lang.String TAG = null;
    private com.xuexiang.xui.widget.actionbar.TitleBar titleBar;
    private final java.util.List<java.lang.String> mTimeOption = null;
    private boolean initViewsFinished = false;
    private final java.util.ArrayList<com.idormy.sms.forwarder.adapter.spinner.AppListAdapterItem> appListSpinnerList = null;
    private com.idormy.sms.forwarder.adapter.spinner.AppListSpinnerAdapter<?> appListSpinnerAdapter;
    private final androidx.lifecycle.Observer<java.lang.String> appListObserver = null;
    private final java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> hashMap = null;
    
    public SettingsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.idormy.sms.forwarder.databinding.FragmentSettingsBinding viewBindingInflate(@org.jetbrains.annotations.NotNull
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
    
    @android.annotation.SuppressLint(value = {"NewApi", "SetTextI18n"})
    @java.lang.Override
    protected void initViews() {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    protected void initListeners() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override
    @com.xuexiang.xaop.annotation.SingleClick
    public void onClick(@org.jetbrains.annotations.NotNull
    android.view.View v) {
    }
    
    @android.annotation.SuppressLint(value = {"UseSwitchCompatOrMaterialCode"})
    private final void switchEnableSms(com.xuexiang.xui.widget.button.switchbutton.SwitchButton sbEnableSms) {
    }
    
    @android.annotation.SuppressLint(value = {"UseSwitchCompatOrMaterialCode"})
    private final void switchEnablePhone(com.xuexiang.xui.widget.button.switchbutton.SwitchButton sbEnablePhone, com.xuexiang.xui.widget.button.SmoothCheckBox scbCallType1, com.xuexiang.xui.widget.button.SmoothCheckBox scbCallType2, com.xuexiang.xui.widget.button.SmoothCheckBox scbCallType3, com.xuexiang.xui.widget.button.SmoothCheckBox scbCallType4, com.xuexiang.xui.widget.button.SmoothCheckBox scbCallType5, com.xuexiang.xui.widget.button.SmoothCheckBox scbCallType6) {
    }
    
    @android.annotation.SuppressLint(value = {"UseSwitchCompatOrMaterialCode"})
    private final void switchEnableAppNotify(com.xuexiang.xui.widget.button.switchbutton.SwitchButton sbEnableAppNotify, com.xuexiang.xui.widget.button.SmoothCheckBox scbCancelAppNotify, com.xuexiang.xui.widget.button.SmoothCheckBox scbNotUserPresent) {
    }
    
    private final void switchEnableBluetooth(@android.annotation.SuppressLint(value = {"UseSwitchCompatOrMaterialCode"})
    com.xuexiang.xui.widget.button.switchbutton.SwitchButton sbEnableBluetooth, android.widget.LinearLayout layoutBluetoothSetting, com.xuexiang.xui.widget.picker.XSeekBar xsbScanInterval, com.xuexiang.xui.widget.button.SmoothCheckBox scbIgnoreAnonymous) {
    }
    
    private final void restartBluetoothService(java.lang.String action) {
    }
    
    private final void switchEnableLocation(@android.annotation.SuppressLint(value = {"UseSwitchCompatOrMaterialCode"})
    com.xuexiang.xui.widget.button.switchbutton.SwitchButton sbEnableLocation, android.widget.LinearLayout layoutLocationSetting, android.widget.RadioGroup rgAccuracy, android.widget.RadioGroup rgPowerRequirement, com.xuexiang.xui.widget.picker.XSeekBar xsbMinInterval, com.xuexiang.xui.widget.picker.XSeekBar xsbMinDistance) {
    }
    
    private final void restartLocationService(java.lang.String action) {
    }
    
    @android.annotation.SuppressLint(value = {"UseSwitchCompatOrMaterialCode"})
    private final void switchEnableSmsCommand(com.xuexiang.xui.widget.button.switchbutton.SwitchButton sbEnableSmsCommand, android.widget.EditText etSafePhone) {
    }
    
    private final void editExtraAppList(android.widget.EditText textAppList) {
    }
    
    @android.annotation.SuppressLint(value = {"UseSwitchCompatOrMaterialCode"})
    private final void switchEnableLoadAppList(com.xuexiang.xui.widget.button.switchbutton.SwitchButton sbEnableLoadAppList, com.xuexiang.xui.widget.button.SmoothCheckBox scbLoadUserApp, com.xuexiang.xui.widget.button.SmoothCheckBox scbLoadSystemApp) {
    }
    
    private final void checkWithReboot(@android.annotation.SuppressLint(value = {"UseSwitchCompatOrMaterialCode"})
    com.xuexiang.xui.widget.button.switchbutton.SwitchButton sbWithReboot, android.widget.TextView tvAutoStartup) {
    }
    
    @android.annotation.SuppressLint(value = {"UseSwitchCompatOrMaterialCode"})
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.M)
    private final void batterySetting(android.widget.LinearLayout layoutBatterySetting, com.xuexiang.xui.widget.button.switchbutton.SwitchButton sbBatterySetting) {
    }
    
    @android.annotation.SuppressLint(value = {"ObsoleteSdkInt,UseSwitchCompatOrMaterialCode"})
    private final void switchExcludeFromRecents(android.widget.LinearLayout layoutExcludeFromRecents, com.xuexiang.xui.widget.button.switchbutton.SwitchButton sbExcludeFromRecents) {
    }
    
    @android.annotation.SuppressLint(value = {"UseSwitchCompatOrMaterialCode"})
    private final void switchEnableCactus(com.xuexiang.xui.widget.button.switchbutton.SwitchButton sbEnableCactus, com.xuexiang.xui.widget.button.SmoothCheckBox scbPlaySilenceMusic, com.xuexiang.xui.widget.button.SmoothCheckBox scbOnePixelActivity) {
    }
    
    private final void editRetryDelayTime(com.xuexiang.xui.widget.picker.XSeekBar xsbRetryTimes, com.xuexiang.xui.widget.picker.XSeekBar xsbDelayTime, com.xuexiang.xui.widget.picker.XSeekBar xsbTimeout) {
    }
    
    private final void editAddExtraDeviceMark(android.widget.EditText etExtraDeviceMark) {
    }
    
    private final void editAddSubidSim1(android.widget.EditText etSubidSim1) {
    }
    
    private final void editAddSubidSim2(android.widget.EditText etSubidSim2) {
    }
    
    private final void editAddExtraSim1(android.widget.EditText etExtraSim1) {
    }
    
    private final void editAddExtraSim2(android.widget.EditText etExtraSim2) {
    }
    
    private final void editNotifyContent(android.widget.EditText etNotifyContent) {
    }
    
    @android.annotation.SuppressLint(value = {"UseSwitchCompatOrMaterialCode", "SetTextI18n"})
    private final void switchSmsTemplate(com.xuexiang.xui.widget.button.switchbutton.SwitchButton sbSmsTemplate) {
    }
    
    private final void editSmsTemplate(android.widget.EditText textSmsTemplate) {
    }
    
    private final void switchDirectlyToClient(@android.annotation.SuppressLint(value = {"UseSwitchCompatOrMaterialCode"})
    com.xuexiang.xui.widget.button.switchbutton.SwitchButton switchDirectlyToClient) {
    }
    
    private final void switchDirectlyToTask(@android.annotation.SuppressLint(value = {"UseSwitchCompatOrMaterialCode"})
    com.xuexiang.xui.widget.button.switchbutton.SwitchButton switchDirectlyToTask) {
    }
    
    private final void switchDebugMode(@android.annotation.SuppressLint(value = {"UseSwitchCompatOrMaterialCode"})
    com.xuexiang.xui.widget.button.switchbutton.SwitchButton switchDebugMode) {
    }
    
    private final void switchLanguage(android.widget.RadioGroup rgMainLanguages) {
    }
    
    private final java.lang.String getAutoStartTips() {
        return null;
    }
    
    private final void startToAutoStartSetting(android.content.Context context) {
    }
    
    private final void initAppSpinner() {
    }
}