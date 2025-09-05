# 技術堆疊 - SmsForwarder

## 核心技術

### Android 開發框架
- **Android SDK**: Target API 33, Min API 19 (Android 4.4+)
- **Build Tools**: 33.0.1
- **語言**: Kotlin 1.7.21 + Java 互操作
- **Gradle**: 7.2.2

### UI 框架
- **XUI**: 1.2.2_250201 - 主要 UI 框架
  - 提供統一的 UI 元件和設計規範
  - Material Design 支援
- **XPage**: 3.3.0 - 頁面導航框架
- **XRouter**: 1.1.0 - 路由和依賴注入

### 資料存取
- **Room Database**: Android 官方資料庫框架
- **MVVM Architecture**: ViewModel + Repository 模式
- **ViewModels**: 
  - `SenderViewModel`, `RuleViewModel`, `LogsViewModel`
  - `MsgViewModel`, `TaskViewModel`, `FrpcViewModel`
- **LiveData**: 響應式資料綁定

### 網路通訊
- **OkHttp**: 3.12.13 (為支援 API 19 限制版本)
- **XHttp2**: 2.0.10 - HTTP 請求封裝
- **Gson**: 2.10.1 - JSON 序列化/反序列化
- **AndServer**: 2.1.12 - HTTP 伺服器功能

### 依賴注入與工具
- **XAOP**: 1.1.0 - AOP 程式設計支援
- **XUtil**: 2.0.0 - 工具類別集合
- **XUpdate**: 2.1.5 - 應用內更新

### 圖片處理
- **Glide**: 4.13.1 - 圖片載入和快取
- **圖片壓縮**: com.chenenyu:img-optimizer:1.3.0

### 響應式程式設計
- **RxJava2**: 2.2.21
- **RxAndroid**: 2.1.1
- **RxBinding**: 2.2.0

### 測試框架
- **JUnit**: 4.13.2 - 單元測試
- **Espresso**: 3.5.1 - UI 測試
- **Test Runner**: 1.4.0

### 建置優化
- **Booster**: 3.1.0 (可選) - APK 優化框架
  - 資源壓縮和去冗餘
  - 效能最佳化
  - 多執行緒優化

### 偵錯與分析
- **LeakCanary**: 2.13 - 記憶體洩漏檢測
- **Cactus**: 保活機制
- **友盟統計**: 使用統計分析

## 外部 API 整合

### 通知平台
- **Telegram Bot API**: 主要整合目標
- **釘釘機器人**: 企業通訊整合
- **企業微信**: 企業內部通訊
- **飛書**: 團隊協作平台
- **Server醤**: 訊息推送服務
- **PushPlus**: 訊息推送平台
- **Bark**: iOS 訊息推送

### 網路穿透
- **Frpc Android**: 內網穿透功能

## 開發工具鏈

### IDE 支援
- **Android Studio**: 主要開發 IDE
- **JetBrains Toolbox**: 開發工具授權

### 程式碼品質
- **Kotlin Lint**: 代碼規範檢查
- **Android Lint**: Android 特定檢查

### 版本控制
- **Git**: 版本控制系統
- **GitHub**: 原始碼託管

## 部署與發佈

### 建置配置
- **多渠道打包**: 支援不同發布渠道
- **ProGuard**: 代碼混淆和優化
- **簽名配置**: 正式版和除錯版分離

### 發佈平台
- **GitHub Releases**: 主要發佈平台
- **Gitee**: 國內鏡像
- **LanzouCloud**: 網盤備份

## 版本相容性

### Android 版本支援
- **最低版本**: Android 4.4 (API 19)
- **目標版本**: Android 13 (API 33)
- **測試覆蓋**: API 19-33 全版本相容

### 相依性約束
- **OkHttp**: 3.12.13 (最後支援 API 19 的版本)
- **其他函式庫**: 均確保 API 19 相容性

---

*最後更新: 2025-09-04*