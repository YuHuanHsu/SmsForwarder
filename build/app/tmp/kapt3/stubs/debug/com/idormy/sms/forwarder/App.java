package com.idormy.sms.forwarder;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001<B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0014J\u0010\u00101\u001a\u00020.2\u0006\u00102\u001a\u000203H\u0017J\t\u00104\u001a\u000205H\u0097\u0001J\b\u00106\u001a\u00020.H\u0002J\b\u00107\u001a\u00020.H\u0016J\b\u00108\u001a\u00020.H\u0016J\u0010\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020;H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\u000e\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020$8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\u000e\u001a\u0004\b%\u0010&R\u001b\u0010(\u001a\u00020)8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010\u000e\u001a\u0004\b*\u0010+\u00a8\u0006="}, d2 = {"Lcom/idormy/sms/forwarder/App;", "Landroid/app/Application;", "Lcom/gyf/cactus/callback/CactusCallback;", "Landroidx/work/Configuration$Provider;", "()V", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "getApplicationScope", "()Lkotlinx/coroutines/CoroutineScope;", "database", "Lcom/idormy/sms/forwarder/database/AppDatabase;", "getDatabase", "()Lcom/idormy/sms/forwarder/database/AppDatabase;", "database$delegate", "Lkotlin/Lazy;", "frpcRepository", "Lcom/idormy/sms/forwarder/database/repository/FrpcRepository;", "getFrpcRepository", "()Lcom/idormy/sms/forwarder/database/repository/FrpcRepository;", "frpcRepository$delegate", "logsRepository", "Lcom/idormy/sms/forwarder/database/repository/LogsRepository;", "getLogsRepository", "()Lcom/idormy/sms/forwarder/database/repository/LogsRepository;", "logsRepository$delegate", "msgRepository", "Lcom/idormy/sms/forwarder/database/repository/MsgRepository;", "getMsgRepository", "()Lcom/idormy/sms/forwarder/database/repository/MsgRepository;", "msgRepository$delegate", "ruleRepository", "Lcom/idormy/sms/forwarder/database/repository/RuleRepository;", "getRuleRepository", "()Lcom/idormy/sms/forwarder/database/repository/RuleRepository;", "ruleRepository$delegate", "senderRepository", "Lcom/idormy/sms/forwarder/database/repository/SenderRepository;", "getSenderRepository", "()Lcom/idormy/sms/forwarder/database/repository/SenderRepository;", "senderRepository$delegate", "taskRepository", "Lcom/idormy/sms/forwarder/database/repository/TaskRepository;", "getTaskRepository", "()Lcom/idormy/sms/forwarder/database/repository/TaskRepository;", "taskRepository$delegate", "attachBaseContext", "", "base", "Landroid/content/Context;", "doWork", "times", "", "getWorkManagerConfiguration", "Landroidx/work/Configuration;", "initLibs", "onCreate", "onStop", "switchLanguage", "newLocale", "Ljava/util/Locale;", "Companion", "app_debug"})
public final class App extends android.app.Application implements com.gyf.cactus.callback.CactusCallback, androidx.work.Configuration.Provider {
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope applicationScope = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy database$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy frpcRepository$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy msgRepository$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy logsRepository$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy ruleRepository$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy senderRepository$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy taskRepository$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.idormy.sms.forwarder.App.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG = "SmsForwarder";
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    public static android.content.Context context;
    @org.jetbrains.annotations.NotNull
    private static java.util.Map<java.lang.String, java.lang.String> COMMON_TAG_MAP;
    @org.jetbrains.annotations.NotNull
    private static java.util.Map<java.lang.String, java.lang.String> SMS_TAG_MAP;
    @org.jetbrains.annotations.NotNull
    private static java.util.Map<java.lang.String, java.lang.String> CALL_TAG_MAP;
    @org.jetbrains.annotations.NotNull
    private static java.util.Map<java.lang.String, java.lang.String> APP_TAG_MAP;
    @org.jetbrains.annotations.NotNull
    private static java.util.Map<java.lang.String, java.lang.String> LOCATION_TAG_MAP;
    @org.jetbrains.annotations.NotNull
    private static java.util.Map<java.lang.String, java.lang.String> BATTERY_TAG_MAP;
    @org.jetbrains.annotations.NotNull
    private static java.util.Map<java.lang.String, java.lang.String> NETWORK_TAG_MAP;
    @org.jetbrains.annotations.NotNull
    private static java.util.Map<java.lang.String, java.lang.String> CALL_TYPE_MAP;
    @org.jetbrains.annotations.NotNull
    private static java.util.Map<java.lang.String, java.lang.String> FILED_MAP;
    @org.jetbrains.annotations.NotNull
    private static java.util.Map<java.lang.String, java.lang.String> CHECK_MAP;
    @org.jetbrains.annotations.NotNull
    private static java.util.Map<java.lang.String, java.lang.String> SIM_SLOT_MAP;
    @org.jetbrains.annotations.NotNull
    private static java.util.Map<java.lang.Integer, java.lang.String> FORWARD_STATUS_MAP;
    @org.jetbrains.annotations.NotNull
    private static java.util.Map<java.lang.String, java.lang.String> BARK_LEVEL_MAP;
    @org.jetbrains.annotations.NotNull
    private static java.util.Map<java.lang.String, java.lang.String> BARK_ENCRYPTION_ALGORITHM_MAP;
    @org.jetbrains.annotations.NotNull
    private static java.util.Map<java.lang.Integer, com.idormy.sms.forwarder.entity.SimInfo> SimInfoList;
    private static boolean LoadingAppList = false;
    @org.jetbrains.annotations.NotNull
    private static java.util.List<com.idormy.sms.forwarder.utils.AppInfo> UserAppList;
    @org.jetbrains.annotations.NotNull
    private static java.util.List<com.idormy.sms.forwarder.utils.AppInfo> SystemAppList;
    
    /**
     * @return 当前app是否是调试开发模式
     */
    private static boolean isDebug;
    @org.jetbrains.annotations.NotNull
    private static final androidx.lifecycle.MutableLiveData<java.lang.String> mEndDate = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.lifecycle.MutableLiveData<java.lang.String> mLastTimer = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.lifecycle.MutableLiveData<java.lang.String> mTimer = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.lifecycle.MutableLiveData<java.lang.Boolean> mStatus = null;
    @org.jetbrains.annotations.Nullable
    private static io.reactivex.disposables.Disposable mDisposable;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy LocationClient$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy Geocoder$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy DateFormat$delegate = null;
    private static boolean FrpclibInited = false;
    private static boolean isNeedSpaceBetweenWords = false;
    
    public App() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineScope getApplicationScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.AppDatabase getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.repository.FrpcRepository getFrpcRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.repository.MsgRepository getMsgRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.repository.LogsRepository getLogsRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.repository.RuleRepository getRuleRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.repository.SenderRepository getSenderRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.idormy.sms.forwarder.database.repository.TaskRepository getTaskRepository() {
        return null;
    }
    
    @java.lang.Override
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull
    android.content.Context base) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    /**
     * 初始化基础库
     */
    private final void initLibs() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override
    public void doWork(int times) {
    }
    
    @java.lang.Override
    public void onStop() {
    }
    
    private final void switchLanguage(java.util.Locale newLocale) {
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.NonNull
    @java.lang.Override
    public androidx.work.Configuration getWorkManagerConfiguration() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001b\u0010\u001f\u001a\u00020 8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b\'\u0010\tR&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR\u001a\u0010,\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001b\u00102\u001a\u0002038FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b4\u00105R&\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\tR\u001a\u0010:\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010/\"\u0004\b<\u00101R\u001b\u0010=\u001a\u00020>8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bA\u0010$\u001a\u0004\b?\u0010@R&\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0007\"\u0004\bD\u0010\tR&\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0007\"\u0004\bG\u0010\tR&\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0007\"\u0004\bJ\u0010\tR&\u0010K\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020L0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0007\"\u0004\bN\u0010\tR \u0010O\u001a\b\u0012\u0004\u0012\u00020Q0PX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u000e\u0010V\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R \u0010W\u001a\b\u0012\u0004\u0012\u00020Q0PX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010S\"\u0004\bY\u0010UR\u001e\u0010Z\u001a\u00020[8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001a\u0010`\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010/\"\u0004\ba\u00101R\u001a\u0010b\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010/\"\u0004\bc\u00101R\u001c\u0010d\u001a\u0004\u0018\u00010eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00050k\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00050k\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010mR\u0017\u0010p\u001a\b\u0012\u0004\u0012\u00020-0k\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010mR\u0017\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00050k\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010m\u00a8\u0006t"}, d2 = {"Lcom/idormy/sms/forwarder/App$Companion;", "", "()V", "APP_TAG_MAP", "", "", "getAPP_TAG_MAP", "()Ljava/util/Map;", "setAPP_TAG_MAP", "(Ljava/util/Map;)V", "BARK_ENCRYPTION_ALGORITHM_MAP", "getBARK_ENCRYPTION_ALGORITHM_MAP", "setBARK_ENCRYPTION_ALGORITHM_MAP", "BARK_LEVEL_MAP", "getBARK_LEVEL_MAP", "setBARK_LEVEL_MAP", "BATTERY_TAG_MAP", "getBATTERY_TAG_MAP", "setBATTERY_TAG_MAP", "CALL_TAG_MAP", "getCALL_TAG_MAP", "setCALL_TAG_MAP", "CALL_TYPE_MAP", "getCALL_TYPE_MAP", "setCALL_TYPE_MAP", "CHECK_MAP", "getCHECK_MAP", "setCHECK_MAP", "COMMON_TAG_MAP", "getCOMMON_TAG_MAP", "setCOMMON_TAG_MAP", "DateFormat", "Ljava/text/SimpleDateFormat;", "getDateFormat", "()Ljava/text/SimpleDateFormat;", "DateFormat$delegate", "Lkotlin/Lazy;", "FILED_MAP", "getFILED_MAP", "setFILED_MAP", "FORWARD_STATUS_MAP", "", "getFORWARD_STATUS_MAP", "setFORWARD_STATUS_MAP", "FrpclibInited", "", "getFrpclibInited", "()Z", "setFrpclibInited", "(Z)V", "Geocoder", "Landroid/location/Geocoder;", "getGeocoder", "()Landroid/location/Geocoder;", "Geocoder$delegate", "LOCATION_TAG_MAP", "getLOCATION_TAG_MAP", "setLOCATION_TAG_MAP", "LoadingAppList", "getLoadingAppList", "setLoadingAppList", "LocationClient", "Lcom/king/location/LocationClient;", "getLocationClient", "()Lcom/king/location/LocationClient;", "LocationClient$delegate", "NETWORK_TAG_MAP", "getNETWORK_TAG_MAP", "setNETWORK_TAG_MAP", "SIM_SLOT_MAP", "getSIM_SLOT_MAP", "setSIM_SLOT_MAP", "SMS_TAG_MAP", "getSMS_TAG_MAP", "setSMS_TAG_MAP", "SimInfoList", "Lcom/idormy/sms/forwarder/entity/SimInfo;", "getSimInfoList", "setSimInfoList", "SystemAppList", "", "Lcom/idormy/sms/forwarder/utils/AppInfo;", "getSystemAppList", "()Ljava/util/List;", "setSystemAppList", "(Ljava/util/List;)V", "TAG", "UserAppList", "getUserAppList", "setUserAppList", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "isDebug", "setDebug", "isNeedSpaceBetweenWords", "setNeedSpaceBetweenWords", "mDisposable", "Lio/reactivex/disposables/Disposable;", "getMDisposable", "()Lio/reactivex/disposables/Disposable;", "setMDisposable", "(Lio/reactivex/disposables/Disposable;)V", "mEndDate", "Landroidx/lifecycle/MutableLiveData;", "getMEndDate", "()Landroidx/lifecycle/MutableLiveData;", "mLastTimer", "getMLastTimer", "mStatus", "getMStatus", "mTimer", "getMTimer", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Context getContext() {
            return null;
        }
        
        public final void setContext(@org.jetbrains.annotations.NotNull
        android.content.Context p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.lang.String> getCOMMON_TAG_MAP() {
            return null;
        }
        
        public final void setCOMMON_TAG_MAP(@org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.String, java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.lang.String> getSMS_TAG_MAP() {
            return null;
        }
        
        public final void setSMS_TAG_MAP(@org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.String, java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.lang.String> getCALL_TAG_MAP() {
            return null;
        }
        
        public final void setCALL_TAG_MAP(@org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.String, java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.lang.String> getAPP_TAG_MAP() {
            return null;
        }
        
        public final void setAPP_TAG_MAP(@org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.String, java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.lang.String> getLOCATION_TAG_MAP() {
            return null;
        }
        
        public final void setLOCATION_TAG_MAP(@org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.String, java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.lang.String> getBATTERY_TAG_MAP() {
            return null;
        }
        
        public final void setBATTERY_TAG_MAP(@org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.String, java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.lang.String> getNETWORK_TAG_MAP() {
            return null;
        }
        
        public final void setNETWORK_TAG_MAP(@org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.String, java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.lang.String> getCALL_TYPE_MAP() {
            return null;
        }
        
        public final void setCALL_TYPE_MAP(@org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.String, java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.lang.String> getFILED_MAP() {
            return null;
        }
        
        public final void setFILED_MAP(@org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.String, java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.lang.String> getCHECK_MAP() {
            return null;
        }
        
        public final void setCHECK_MAP(@org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.String, java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.lang.String> getSIM_SLOT_MAP() {
            return null;
        }
        
        public final void setSIM_SLOT_MAP(@org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.String, java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.Integer, java.lang.String> getFORWARD_STATUS_MAP() {
            return null;
        }
        
        public final void setFORWARD_STATUS_MAP(@org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.Integer, java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.lang.String> getBARK_LEVEL_MAP() {
            return null;
        }
        
        public final void setBARK_LEVEL_MAP(@org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.String, java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.lang.String> getBARK_ENCRYPTION_ALGORITHM_MAP() {
            return null;
        }
        
        public final void setBARK_ENCRYPTION_ALGORITHM_MAP(@org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.String, java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.Integer, com.idormy.sms.forwarder.entity.SimInfo> getSimInfoList() {
            return null;
        }
        
        public final void setSimInfoList(@org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.Integer, com.idormy.sms.forwarder.entity.SimInfo> p0) {
        }
        
        public final boolean getLoadingAppList() {
            return false;
        }
        
        public final void setLoadingAppList(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.idormy.sms.forwarder.utils.AppInfo> getUserAppList() {
            return null;
        }
        
        public final void setUserAppList(@org.jetbrains.annotations.NotNull
        java.util.List<com.idormy.sms.forwarder.utils.AppInfo> p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.idormy.sms.forwarder.utils.AppInfo> getSystemAppList() {
            return null;
        }
        
        public final void setSystemAppList(@org.jetbrains.annotations.NotNull
        java.util.List<com.idormy.sms.forwarder.utils.AppInfo> p0) {
        }
        
        public final boolean isDebug() {
            return false;
        }
        
        public final void setDebug(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.lifecycle.MutableLiveData<java.lang.String> getMEndDate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.lifecycle.MutableLiveData<java.lang.String> getMLastTimer() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.lifecycle.MutableLiveData<java.lang.String> getMTimer() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getMStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final io.reactivex.disposables.Disposable getMDisposable() {
            return null;
        }
        
        public final void setMDisposable(@org.jetbrains.annotations.Nullable
        io.reactivex.disposables.Disposable p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.king.location.LocationClient getLocationClient() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.location.Geocoder getGeocoder() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.text.SimpleDateFormat getDateFormat() {
            return null;
        }
        
        public final boolean getFrpclibInited() {
            return false;
        }
        
        public final void setFrpclibInited(boolean p0) {
        }
        
        public final boolean isNeedSpaceBetweenWords() {
            return false;
        }
        
        public final void setNeedSpaceBetweenWords(boolean p0) {
        }
    }
}