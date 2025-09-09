package com.idormy.sms.forwarder.entity

import java.io.Serializable

/**
 * 備份信息實體類
 */
data class BackupInfo(
    var versionCode: Int = 0,
    var versionName: String = "",
    var backupTime: Long = 0,
    var deviceInfo: String = "",
    var backupType: String = "", // all, app, senders, rules, tasks
    var fileSize: Long = 0
) : Serializable