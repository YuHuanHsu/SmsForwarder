# 原始碼結構 - SmsForwarder

## 專案根目錄結構

```
SmsForwarder/
├── app/                          # 主要應用程式模組
│   ├── src/                      # 原始碼目錄
│   ├── build.gradle              # 模組建置配置
│   ├── proguard-rules.pro        # ProGuard 規則
│   └── lint.xml                  # Lint 檢查配置
├── docs/                         # 專案文檔
│   ├── architecture/             # 架構文檔
│   ├── epics/                    # Epic 開發計畫
│   └── stories/                  # 用戶故事
├── gradle/                       # Gradle 包裝器
├── build.gradle                  # 專案建置配置
├── settings.gradle               # 專案設定
├── versions.gradle               # 版本管理
├── gradle.properties             # Gradle 屬性配置
└── CLAUDE.md                     # 開發指南
```

## 應用程式結構 (app/src/)

### 主要原始碼目錄 (main/)

```
app/src/main/
├── java/com/idormy/sms/forwarder/
│   ├── App.kt                    # 應用程式入口
│   ├── activity/                 # Activity 類別
│   ├── adapter/                  # RecyclerView 適配器
│   ├── core/                     # 核心基底類別
│   ├── database/                 # 資料庫相關
│   │   ├── entity/               # 資料實體
│   │   ├── repository/           # 資料存取層
│   │   └── viewmodel/            # ViewModel 類別
│   ├── entity/                   # 資料模型
│   │   ├── result/               # API 回應模型
│   │   └── setting/              # 設定相關模型
│   ├── fragment/                 # Fragment 類別
│   │   └── senders/              # 發送器設定頁面
│   ├── receiver/                 # 廣播接收器
│   ├── server/                   # HTTP 伺服器
│   ├── service/                  # 背景服務
│   ├── utils/                    # 工具類別
│   │   └── sender/               # 各平台發送工具
│   ├── widget/                   # 自訂 UI 元件
│   └── workers/                  # WorkManager 工作
├── res/                          # 資源檔案
│   ├── drawable/                 # 圖片資源
│   ├── layout/                   # Layout XML
│   ├── mipmap-*/                 # 應用程式圖示
│   ├── values/                   # 字串和樣式資源
│   └── values-*/                 # 多語言資源
└── assets/                       # 資產檔案
```

## 核心模組詳解

### 資料庫模組 (database/)

#### 實體類別 (entity/)
```
database/entity/
├── Sender.kt                     # 發送器設定實體
├── Rule.kt                       # 轉發規則實體
├── Logs.kt                       # 日誌記錄實體
├── LogsDetail.kt                 # 日誌詳情實體
├── Msg.kt                        # 訊息實體
├── Task.kt                       # 任務實體
└── Frpc.kt                       # Frpc 設定實體
```

#### 資料存取層 (repository/)
```
database/repository/
├── SenderRepository.kt           # 發送器資料存取
├── FrpcRepository.kt             # Frpc 資料存取
└── Listener.kt                   # 資料變更監聽器介面
```

#### ViewModel 類別 (viewmodel/)
```
database/viewmodel/
├── BaseViewModelFactory.kt       # ViewModel 工廠類別
├── SenderViewModel.kt            # 發送器 ViewModel
├── RuleViewModel.kt              # 規則 ViewModel
├── LogsViewModel.kt              # 日誌 ViewModel
├── MsgViewModel.kt               # 訊息 ViewModel
├── TaskViewModel.kt              # 任務 ViewModel
└── FrpcViewModel.kt              # Frpc ViewModel
```

### 設定模型模組 (entity/setting/)

```
entity/setting/
├── TelegramSetting.kt            # Telegram 設定
├── DingtalkSetting.kt            # 釘釘設定
├── EmailSetting.kt               # 電子郵件設定
├── WebhookSetting.kt             # Webhook 設定
├── FeiShuSetting.kt              # 飛書設定
└── [Other Platform Settings]     # 其他平台設定
```

### 發送器工具模組 (utils/sender/)

```
utils/sender/
├── TelegramUtils.kt              # Telegram 發送邏輯
├── DingtalkUtils.kt              # 釘釘發送邏輯
├── EmailUtils.kt                 # 電子郵件發送邏輯
├── WebhookUtils.kt               # Webhook 發送邏輯
├── FeiShuUtils.kt                # 飛書發送邏輯
└── [Other Platform Utils]        # 其他平台發送邏輯
```

### UI 模組結構

#### Fragment 結構 (fragment/)
```
fragment/
├── senders/                      # 發送器設定頁面
│   ├── TelegramFragment.kt       # Telegram 設定頁面
│   ├── DingtalkFragment.kt       # 釘釘設定頁面
│   ├── EmailFragment.kt          # 電子郵件設定頁面
│   └── [Other Sender Fragments]  # 其他發送器頁面
├── RulesFragment.kt              # 規則管理頁面
├── LogsFragment.kt               # 日誌查看頁面
└── SettingsFragment.kt           # 全域設定頁面
```

#### Layout 結構 (res/layout/)
```
res/layout/
├── fragment_senders_telegram.xml # Telegram 設定 UI
├── fragment_senders_dingtalk.xml # 釘釘設定 UI
├── fragment_rules.xml            # 規則管理 UI
├── fragment_logs.xml             # 日誌查看 UI
├── activity_main.xml             # 主活動 UI
└── [Other Layout Files]          # 其他 UI 檔案
```

## 測試結構 (test/ & androidTest/)

```
app/src/
├── test/                         # 單元測試
│   └── java/com/idormy/sms/forwarder/
│       ├── entity/               # 資料模型測試
│       │   └── setting/          # 設定模型測試
│       ├── utils/                # 工具類別測試
│       │   └── sender/           # 發送器測試
│       └── database/             # 資料庫邏輯測試
└── androidTest/                  # Android 整合測試
    └── java/com/idormy/sms/forwarder/
        ├── ui/                   # UI 測試
        └── database/             # 資料庫整合測試
```

## 重要檔案說明

### 設定檔案
- **App.kt**: 應用程式初始化和全域配置
- **Constants.kt**: 常數定義和配置項目
- **SettingUtils.kt**: 設定管理工具類別

### 核心工具
- **SendUtils.kt**: 發送邏輯協調器
- **LogUtils.kt**: 日誌記錄工具
- **NetworkUtils.kt**: 網路狀態檢查

### 資源管理
- **strings.xml**: 多語言字串資源
- **colors.xml**: 顏色定義
- **dimens.xml**: 尺寸定義
- **styles.xml**: 樣式定義

## 命名慣例

### 檔案命名
- **Activity**: `*Activity.kt` (例：`MainActivity.kt`)
- **Fragment**: `*Fragment.kt` (例：`TelegramFragment.kt`)
- **Utils**: `*Utils.kt` (例：`TelegramUtils.kt`)
- **Setting**: `*Setting.kt` (例：`TelegramSetting.kt`)
- **ViewModel**: `*ViewModel.kt` (例：`SenderViewModel.kt`)

### 資源命名
- **Layout**: `fragment_*, activity_*, item_*`
- **Drawable**: `ic_*, bg_*, selector_*`
- **String**: `camelCase` 格式
- **ID**: `snake_case` 格式

## 模組相依性

```
App.kt
├── Database Module
│   ├── Entity Classes
│   ├── Repository Classes
│   └── ViewModel Classes
├── Network Module
│   ├── Sender Utils
│   └── HTTP Client
├── UI Module
│   ├── Activities
│   ├── Fragments
│   └── Adapters
└── Service Module
    ├── Background Services
    ├── Broadcast Receivers
    └── WorkManager Jobs
```

---

*最後更新: 2025-09-04*