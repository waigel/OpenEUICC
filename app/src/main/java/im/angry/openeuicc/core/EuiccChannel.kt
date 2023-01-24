package im.angry.openeuicc.core

import com.truphone.lpa.LocalProfileAssistant

abstract class EuiccChannel(
    info: EuiccChannelInfo
) {
    val slotId = info.slotId
    val cardId = info.cardId
    val name = info.name
    val imei = info.imei
    val removable = info.removable

    abstract val lpa: LocalProfileAssistant
    abstract val valid: Boolean

    abstract fun close()
}
