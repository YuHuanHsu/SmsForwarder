# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## 專案概述

SmsForwarder 是一個 Android 應用程式，用於簡訊轉發和監控。它能監控 Android 手機的簡訊、來電、APP 通知，並根據指定規則轉發到其他平台：釘釘群自訂機器人、釘釘企業內機器人、企業微信群機器人、企業微信應用訊息、飛書群機器人、飛書企業應用、電子郵件、bark、webhook、Telegram 機器人、Server 醬、PushPlus、手機簡訊等。

包括主動控制服務端與客戶端，讓您輕鬆遠端發簡訊、查簡訊、查通話、查話簿、查電量等功能。

## 建置指令

### 開發版本建置
```bash
./gradlew assembleDebug
```

### 正式版本建置
```bash
./gradlew assembleRelease
```

### 清理建置
```bash
./gradlew clean
```

### 執行測試
```bash
./gradlew test
```

### 安裝除錯版 APK
```bash
./gradlew installDebug
```

## 核心架構元件

### 主要套件結構
- `com.idormy.sms.forwarder.App.kt` - 主要應用程式類別
- `activity/` - UI 活動和畫面
- `adapter/` - RecyclerView 列表適配器
- `core/` - 核心業務邏輯和基底類別
- `database/` - Room 資料庫實體、DAO 和 ViewModel
- `entity/` - 資料模型和實體
- `fragment/` - UI 片段
- `receiver/` - 簡訊、來電、通知的廣播接收器
- `server/` - 遠端控制的 HTTP 伺服器元件
- `service/` - 監控和轉發的背景服務
- `utils/` - 工具類別和輔助器
- `workers/` - 背景工作管理器

### 資料庫架構
使用 Android Room 持久化函式庫：
- ViewModels: `SenderViewModel`, `RuleViewModel`, `LogsViewModel`, `MsgViewModel`, `TaskViewModel`, `FrpcViewModel`
- Repositories: `SenderRepository`, `FrpcRepository` 與 `Listener` 介面
- Factory: `BaseViewModelFactory` 用於 ViewModel 建立

### 核心技術
- **程式語言**: Kotlin 與 Java 互操作
- **UI 框架**: XUI 函式庫 (`com.github.pppscn:XUI:1.2.2_250201`)
- **資料庫**: Android Room
- **網路**: OkHttp 3.12.13 (為支援 API 19 而限制版本)
- **JSON**: Gson 2.10.1
- **更新**: XUpdate 函式庫用於應用程式內更新
- **HTTP 伺服器**: AndServer 用於遠端控制 API
- **背景處理**: Android WorkManager
- **圖片載入**: Glide 4.13.1

### 建置設定
- **最低 SDK**: 19 (Android 4.4)
- **目標 SDK**: 33
- **建置工具**: 33.0.1
- **版本**: 3.3.3 (代碼 54)
- **Gradle**: 7.2.2
- **Kotlin**: 1.7.21

### 建置變體和功能
在 `gradle.properties` 中設定：
- `isNeedPackage=true` - 啟用正式打包並使用正式簽名
- `excludeFrpclib=true` - 正式版建置時排除 Frpc 動態函式庫
- `isNeedLeakcanary=false` - 正式版中停用記憶體洩漏檢測
- `isUseBooster=false` - 啟用/停用 Booster APK 最佳化

### 開發注意事項
- 專案支援 Android 4.4+ (API 19) 到 Android 13 (API 33)
- 使用 XLibrary 生態系統以提供一致的 UI/UX 模式
- 實作完整的簡訊、來電和通知權限處理
- 包含背景服務最佳化和保持活躍機制
- 支援多語言（繁體中文/簡體中文）
- 支援各種通知轉發平台和協定