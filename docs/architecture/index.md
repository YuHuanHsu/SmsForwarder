# SmsForwarder 架構概覽

## 系統架構

SmsForwarder 採用基於 Android MVVM 架構模式的設計，提供高度模組化和可擴展的 SMS 轉發功能。

## 核心架構元件

### 📱 展示層 (Presentation Layer)
- **Activities**: 主要應用程式入口
- **Fragments**: 模組化 UI 元件
- **ViewBinding**: 型別安全的 UI 存取
- **XUI Framework**: 統一的 UI 設計系統

### 🧠 業務邏輯層 (Business Logic Layer)  
- **ViewModels**: MVVM 架構的核心，管理 UI 相關資料
- **Repository Pattern**: 抽象化資料存取邏輯
- **UseCase/Utils**: 特定業務邏輯封裝

### 🗄️ 資料層 (Data Layer)
- **Room Database**: 本機資料持久化
- **Sender Utils**: 各平台發送邏輯實作
- **Network Layer**: HTTP 客戶端和 API 整合

### 🔧 基礎設施層 (Infrastructure Layer)
- **Background Services**: 背景監控和處理
- **Broadcast Receivers**: 系統事件監聽
- **WorkManager**: 可靠的背景任務執行

## 主要功能模組

### 📨 訊息轉發核心
- **監控模組**: SMS、來電、APP 通知監控
- **規則引擎**: 自定義轉發規則處理
- **發送器管理**: 多平台發送器配置和執行

### 🔗 平台整合
- **Telegram Bot**: 機器人 API 整合
- **企業通訊**: 釘釘、企業微信、飛書等
- **通用協定**: Webhook、Email、HTTP 等

### ⚡ 系統服務
- **遠程控制**: HTTP 伺服器和 API 端點
- **任務排程**: 自動化任務和快捷指令
- **日誌系統**: 完整的操作記錄和除錯資訊

## 資料流架構

```
用戶界面 (Fragment/Activity)
    ↕️ (ViewBinding)
ViewModel (狀態管理)
    ↕️ (LiveData/StateFlow)
Repository (資料存取抽象)
    ↕️ (資料源協調)
┌─────────────────┬─────────────────┐
│   Local Data    │   Remote APIs   │
│  (Room DB)      │  (HTTP/Sender)  │
└─────────────────┴─────────────────┘
```

## 關鍵設計原則

### 🏗️ 模組化設計
- 各功能模組獨立開發和測試
- 清晰的介面定義和相依性管理
- 支援功能的動態啟用/停用

### 🔄 響應式架構
- LiveData/StateFlow 的響應式資料流
- RxJava2 支援複雜非同步操作
- 事件驅動的系統通信

### 🛡️ 錯誤處理和恢復
- 分層的異常處理策略
- 自動重試和降級機制
- 完整的錯誤日誌和用戶反饋

### ⚡ 效能最佳化
- 背景服務的生命週期管理
- 記憶體和電池使用最佳化
- 網路請求的快取和批次處理

## 技術架構決策

### 🎯 平台選擇
- **Android Native**: 深度系統整合和效能
- **Kotlin First**: 現代語言特性和安全性
- **向後相容**: 支援 Android 4.4+ (API 19-33)

### 📚 框架選擇  
- **XUI**: 統一 UI 元件和設計規範
- **Room**: 強型別資料庫 ORM
- **OkHttp**: 可靠的網路通訊基礎

### 🔧 工具鏈
- **Gradle**: 建置自動化和依賴管理
- **ProGuard**: 代碼混淆和最佳化
- **JUnit/Espresso**: 完整測試覆蓋

## 擴展性考量

### 🚀 新功能添加
- 插件化的發送器架構
- 標準化的設定模型介面
- 統一的 UI 配置模式

### 🌐 多平台支援
- 抽象化的發送介面
- 可配置的 API 端點
- 標準化的錯誤處理

### 📈 效能擴展
- 背景任務的優先級管理
- 資料庫分片和索引策略
- 網路請求的負載均衡

---

## 快速導航

- [技術堆疊詳情](./tech-stack.md)
- [原始碼結構說明](./source-tree.md) 
- [程式碼開發標準](./coding-standards.md)
- [Telegram 增強架構](../telegram-enhancement-architecture.md)

---

*最後更新: 2025-09-04*