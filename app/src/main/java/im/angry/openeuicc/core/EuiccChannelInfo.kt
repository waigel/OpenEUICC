package im.angry.openeuicc.core

// A custom type to avoid compatibility issues with UiccCardInfo / UiccPortInfo
data class EuiccChannelInfo(
    val slotId: Int,
    val cardId: Int,
    val name: String,
    val imei: String,
    val removable: Boolean
)