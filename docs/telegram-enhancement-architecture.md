# SmsForwarder Telegram 群組主題與頻道支援 - Brownfield Enhancement Architecture

## Introduction

這份文件概述了為 SmsForwarder 增強 Telegram 群組主題 (Forum Groups) 和頻道 (Channel) 支援功能的架構方法。其主要目標是作為 AI 驅動開發新功能的指導架構藍圖，同時確保與現有系統的無縫整合。

**與現有架構的關係：**
這份文件補充了現有專案架構，定義了新元件如何與目前系統整合。當新舊模式間發生衝突時，此文件提供指導原則，在實作增強功能的同時維持一致性。

### 現有專案分析

#### 目前專案狀態
- **主要目的：** Android SMS 轉發器，支援多種通知平台整合
- **目前技術堆疊：** Android Kotlin/Java, Room Database, OkHttp, XUI Framework, Telegram Bot API
- **架構風格：** MVVM 模式與 Fragment-based UI，Repository 模式資料存取
- **部署方法：** Android APK，支援 API 19-33

#### 可用文檔
- Epic 開發計畫：`docs/epics/telegram-groups-channels-epic.md`
- 用戶故事：`docs/stories/1.1.expand-telegram-data-model.md`
- 專案配置：`CLAUDE.md`，包含建置命令和架構概覽

#### 識別的約束
- 必須維持向後相容性（Android API 19+）
- 現有 Telegram 設定格式需保持相容
- UI 設計需遵循 XUI 框架模式
- 網路請求需使用現有的 OkHttp 配置
- 資料庫變更需支援漸進式遷移

### Change Log
| Change | Date | Version | Description | Author |
|--------|------|---------|-------------|--------|
| Initial | 2025-09-04 | 1.0 | 初始架構文件創建 | BMad Master |

## Enhancement Scope and Integration Strategy

### Enhancement Overview
**Enhancement Type:** 功能擴展 - 新增 Telegram API 支援
**Scope:** 擴展現有 Telegram 整合以支援群組主題和頻道發送
**Integration Impact:** 低至中等 - 主要影響 Telegram 相關元件

### Integration Approach
**Code Integration Strategy:** 擴展現有 Telegram 元件而非重新設計
- 擴展 `TelegramSetting` 資料模型
- 增強 `TelegramUtils` 發送邏輯  
- 更新 `TelegramFragment` UI 介面
- 保持現有 API 和介面不變

## Technical Architecture

### System Integration Points

#### 資料層整合
- **現有元件：** `TelegramSetting` (entity/setting/)
- **整合點：** 擴展資料模型新增欄位
- **影響範圍：** JSON 序列化、Room 資料庫（如需要）
- **相容性策略：** 新欄位使用可選型別和預設值

#### 業務邏輯層整合
- **現有元件：** `TelegramUtils` (utils/sender/)
- **整合點：** `sendMsg()` 方法增強
- **影響範圍：** API 請求建構、錯誤處理
- **相容性策略：** 保持方法簽名不變，內部邏輯擴展

#### 展示層整合
- **現有元件：** `TelegramFragment` (fragment/senders/)
- **整合點：** UI 元件和驗證邏輯
- **影響範圍：** Layout XML、輸入驗證、測試功能
- **相容性策略：** 遵循現有 XUI 設計模式

### Data Architecture

#### Enhanced Telegram Setting Model
```kotlin
data class TelegramSetting(
    // 現有欄位（保持不變）
    val method: String = "POST",
    var apiToken: String = "",
    val chatId: String = "",
    val proxyType: Proxy.Type = Proxy.Type.DIRECT,
    val proxyHost: String = "",
    val proxyPort: String = "",
    val proxyAuthenticator: Boolean = false,
    val proxyUsername: String = "",
    val proxyPassword: String = "",
    val parseMode: String = "HTML",
    
    // 新增欄位
    val messageThreadId: String? = null,  // 群組主題 ID
    val chatType: String = "chat"         // 聊天類型識別
) : Serializable
```

#### Database Impact Assessment
- **Schema 變更：** 無需 Room 實體修改（JSON 儲存在 Sender.jsonSetting）
- **遷移需求：** 無需資料庫遷移，JSON 反序列化自動處理
- **向後相容：** 舊設定自動使用預設值載入

### API Architecture

#### Telegram Bot API Integration
```kotlin
// 群組主題發送
POST https://api.telegram.org/bot{token}/sendMessage
{
    "chat_id": "@group_username",
    "message_thread_id": "123",    // 新增參數
    "text": "message content",
    "parse_mode": "HTML"
}

// 頻道發送
POST https://api.telegram.org/bot{token}/sendMessage
{
    "chat_id": "@channel_username", // 或數字 ID
    "text": "message content",
    "parse_mode": "HTML"
}
```

#### Enhanced Send Logic Flow
1. **輸入驗證：** 檢查 chatId 格式和 messageThreadId 有效性
2. **類型檢測：** 自動判斷目標類型（聊天/群組/頻道/主題）
3. **請求建構：** 根據類型加入適當參數
4. **發送執行：** 使用現有 OkHttp 管道
5. **結果處理：** 現有錯誤處理邏輯擴展

### UI Architecture

#### Fragment Enhancement Strategy
- **Layout 擴展：** 在現有 `fragment_senders_telegram.xml` 中新增 UI 元件
- **輸入欄位：** 群組主題 ID 輸入框（可選）
- **選擇控制：** 聊天類型 RadioGroup
- **驗證邏輯：** 即時輸入驗證和格式提示
- **測試整合：** 擴展現有測試按鈕支援新參數

#### UI Component Specifications
```xml
<!-- 群組主題 ID 輸入 -->
<com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText
    android:id="@+id/et_message_thread_id"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="群組主題 ID (可選)"
    android:inputType="number" />

<!-- 聊天類型選擇 -->
<RadioGroup
    android:id="@+id/rg_chat_type"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">
    <!-- Radio buttons for chat types -->
</RadioGroup>
```

## Implementation Strategy

### Development Phases
1. **Phase 1：** 資料模型擴展（Story 1.1）
2. **Phase 2：** 業務邏輯增強（Story 1.2）  
3. **Phase 3：** UI 介面更新（Story 1.3）

### Testing Strategy
- **單元測試：** 資料模型序列化、業務邏輯分支
- **整合測試：** API 請求建構、錯誤處理流程
- **UI 測試：** 輸入驗證、使用者互動流程
- **回歸測試：** 現有 Telegram 功能完整性驗證

### Risk Mitigation
- **API 相容性：** 新參數為可選，不影響現有呼叫
- **資料相容性：** JSON 序列化向後相容處理
- **UI 相容性：** 新元件不干擾現有工作流程
- **效能影響：** 最小化邏輯分支開銷

### Deployment Considerations
- **版本管理：** 透過 `build_versions.version_name` 追蹤功能版本
- **功能開關：** 考慮在 `SettingUtils` 中加入功能開關
- **文檔更新：** 更新使用者說明和 API 文檔
- **測試覆蓋：** 確保新功能完整測試覆蓋

---

*此架構文件遵循 BMad brownfield enhancement 方法論，確保新功能與現有系統的和諧整合。*