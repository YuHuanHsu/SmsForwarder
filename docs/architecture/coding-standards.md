# 程式碼標準 - SmsForwarder

## 語言規範

### Kotlin 標準
- **主要語言**: Kotlin 1.7.21
- **程式碼風格**: 遵循 [Kotlin Coding Conventions](https://kotlinlang.org/docs/coding-conventions.html)
- **空安全**: 充分利用 Kotlin 的空安全特性，避免使用 `!!` 運算子
- **函式式特性**: 適當使用 lambda、高階函式和擴展函式

### Java 相容性
- **Java 版本**: Java 8 語言特性 (sourceCompatibility/targetCompatibility)
- **互操作**: Kotlin 和 Java 程式碼需要良好互操作
- **註解**: 使用適當的 `@JvmStatic`, `@JvmField` 等註解

## 檔案結構規範

### Package 組織
```kotlin
com.idormy.sms.forwarder
├── activity/           # 活動類別
├── adapter/            # 適配器類別  
├── core/               # 基底類別和介面
├── database/           # 資料庫相關
│   ├── entity/         # Room 實體
│   ├── repository/     # 資料存取層
│   └── viewmodel/      # ViewModel 類別
├── entity/             # 資料模型
│   ├── result/         # API 回應模型
│   └── setting/        # 設定模型
├── fragment/           # Fragment 類別
├── receiver/           # 廣播接收器
├── service/            # 服務類別
├── utils/              # 工具類別
│   └── sender/         # 發送器工具
├── widget/             # 自訂 UI 元件
└── workers/            # WorkManager 工作
```

### 檔案命名
- **類別檔案**: PascalCase (例：`TelegramSetting.kt`)
- **常數檔案**: 大寫加底線 (例：`Constants.kt`)
- **工具類別**: 複數形式 + Utils (例：`TelegramUtils.kt`)

## 類別設計規範

### Data Class 設計
```kotlin
data class TelegramSetting(
    val method: String = "POST",                    // 使用預設值確保向後相容
    var apiToken: String = "",                      // 可變屬性使用 var
    val chatId: String = "",                        // 不可變屬性使用 val
    val messageThreadId: String? = null,            // 可選屬性使用 nullable
    val chatType: String = "chat"                   // 新欄位必須有預設值
) : Serializable {                                  // 實作必要介面

    // Getter 方法遵循現有模式
    fun getMethodCheckId(): Int {
        return if (method == "GET") R.id.rb_method_get else R.id.rb_method_post
    }
    
    // 驗證方法
    fun validateSettings(): Boolean {
        return apiToken.isNotEmpty() && chatId.isNotEmpty()
    }
}
```

### ViewModel 設計
```kotlin
class SenderViewModel(private val repository: SenderRepository) : ViewModel() {
    
    // 使用 LiveData 或 StateFlow 暴露資料
    private val _senders = MutableLiveData<List<Sender>>()
    val senders: LiveData<List<Sender>> = _senders
    
    // 使用協程處理非同步操作
    fun insertOrUpdate(sender: Sender) {
        viewModelScope.launch {
            repository.insertOrUpdate(sender)
        }
    }
}
```

### Fragment 設計
```kotlin
@Page(name = "Telegram机器人")
class TelegramFragment : BaseFragment<FragmentSendersTelegramBinding?>() {
    
    private val TAG: String = TelegramFragment::class.java.simpleName
    private val viewModel by viewModels<SenderViewModel> { BaseViewModelFactory(context) }
    
    // 使用 ViewBinding
    override fun viewBindingInflate(
        inflater: LayoutInflater,
        container: ViewGroup,
    ): FragmentSendersTelegramBinding {
        return FragmentSendersTelegramBinding.inflate(inflater, container, false)
    }
    
    // 生命週期方法順序
    override fun initArgs() { }
    override fun initTitle(): TitleBar? { }
    override fun initViews() { }
    override fun initListeners() { }
}
```

## 程式碼品質規範

### 註解使用
```kotlin
/**
 * Telegram 發送工具類別
 * 提供 Telegram Bot API 的訊息發送功能
 */
class TelegramUtils private constructor() {
    companion object {
        private val TAG: String = TelegramUtils::class.java.simpleName
        
        /**
         * 發送訊息到 Telegram
         * 
         * @param setting Telegram 設定
         * @param msgInfo 訊息資訊
         * @param rule 轉發規則（可選）
         * @param senderIndex 發送器索引
         * @param logId 日誌 ID
         * @param msgId 訊息 ID
         */
        fun sendMsg(
            setting: TelegramSetting,
            msgInfo: MsgInfo,
            rule: Rule? = null,
            senderIndex: Int = 0,
            logId: Long = 0L,
            msgId: Long = 0L
        ) {
            // 實作內容
        }
    }
}
```

### 異常處理
```kotlin
fun sendMsg(setting: TelegramSetting, msgInfo: MsgInfo) {
    try {
        // 發送邏輯
        val response = httpClient.execute(request)
        handleResponse(response)
    } catch (e: IOException) {
        Log.e(TAG, "網路錯誤: ${e.message}", e)
        // 適當的錯誤處理
    } catch (e: Exception) {
        Log.e(TAG, "未預期錯誤: ${e.message}", e)
        // 記錄並回報錯誤
    }
}
```

### 日誌記錄
```kotlin
class TelegramUtils {
    companion object {
        private val TAG: String = TelegramUtils::class.java.simpleName
        
        fun sendMsg() {
            Log.d(TAG, "開始發送 Telegram 訊息")
            Log.i(TAG, "請求 URL: $requestUrl")
            Log.w(TAG, "警告: 代理設定可能不正確")
            Log.e(TAG, "錯誤: 發送失敗 - $errorMessage")
        }
    }
}
```

## UI 規範

### Layout 設計
```xml
<!-- 使用 ConstraintLayout 作為根容器 -->
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <!-- 使用 XUI 元件 -->
    <com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText
        android:id="@+id/et_api_token"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="@string/telegram_api_token"
        android:inputType="text" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

### ViewBinding 使用
```kotlin
class TelegramFragment : BaseFragment<FragmentSendersTelegramBinding?>() {
    
    override fun initViews() {
        // 使用 binding 存取 UI 元件
        binding!!.etApiToken.setText(settingVo.apiToken)
        binding!!.sbEnable.isChecked = sender.status == 1
        
        // 設置監聽器
        binding!!.btnTest.setOnClickListener(this)
    }
}
```

### 資源命名
```xml
<!-- strings.xml -->
<string name="telegram_api_token">Telegram API Token</string>
<string name="invalid_apiToken_or_chatId">API Token 或 Chat ID 無效</string>

<!-- IDs 使用 snake_case -->
<com.xuexiang.xui.widget.button.roundbutton.RoundButton
    android:id="@+id/btn_test"
    android:text="@string/test" />
```

## 測試規範

### 單元測試
```kotlin
@RunWith(JUnit4::class)
class TelegramSettingTest {
    
    @Test
    fun `測試預設值設定`() {
        val setting = TelegramSetting()
        assertEquals("POST", setting.method)
        assertEquals("chat", setting.chatType)
        assertNull(setting.messageThreadId)
    }
    
    @Test
    fun `測試 JSON 序列化`() {
        val setting = TelegramSetting(
            apiToken = "test_token",
            chatId = "test_chat",
            messageThreadId = "123"
        )
        
        val json = Gson().toJson(setting)
        assertNotNull(json)
        assertTrue(json.contains("messageThreadId"))
    }
    
    @Test
    fun `測試向後相容性`() {
        val oldJson = """{"method":"POST","apiToken":"token","chatId":"chat"}"""
        val setting = Gson().fromJson(oldJson, TelegramSetting::class.java)
        
        assertEquals("chat", setting.chatType)
        assertNull(setting.messageThreadId)
    }
}
```

### 測試檔案組織
```
app/src/test/java/com/idormy/sms/forwarder/
├── entity/
│   └── setting/
│       ├── TelegramSettingTest.kt
│       └── DingtalkSettingTest.kt
├── utils/
│   └── sender/
│       ├── TelegramUtilsTest.kt
│       └── SendUtilsTest.kt
└── database/
    ├── repository/
    └── viewmodel/
```

## 效能和安全規範

### 網路請求
```kotlin
// 使用適當的超時設定
request.retryCount(SettingUtils.requestRetryTimes)
    .retryDelay(SettingUtils.requestDelayTime * 1000)
    .timeStamp(true)
    .addInterceptor(LoggingInterceptor(logId))
```

### 資料驗證
```kotlin
fun validateSettings(): Boolean {
    if (apiToken.isEmpty() || chatId.isEmpty()) {
        return false
    }
    
    // 驗證 messageThreadId 格式（如果提供）
    messageThreadId?.let { threadId ->
        if (!threadId.matches(Regex("\\d+"))) {
            return false
        }
    }
    
    return true
}
```

### 安全考量
- **敏感資訊**: API Token 等敏感資訊不應記錄在日誌中
- **輸入驗證**: 所有用戶輸入需要適當驗證
- **權限檢查**: 確保應用程式權限使用合理

## 版本控制規範

### Commit 訊息
```
feat: 新增 Telegram 群組主題支援
fix: 修復 TelegramSetting 序列化問題
docs: 更新 API 文檔
test: 新增 TelegramUtils 單元測試
refactor: 重構發送器工具類別結構
```

### 分支策略
- **main**: 主要分支，穩定版本
- **develop**: 開發分支
- **feature/***: 功能分支
- **bugfix/***: 錯誤修復分支

---

*最後更新: 2025-09-04*