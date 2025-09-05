package com.idormy.sms.forwarder.entity.result

data class TelegramResult(
    var ok: Boolean?,
    var message: String,
    var timestamp: Long?,
    var description: String? = null,
)