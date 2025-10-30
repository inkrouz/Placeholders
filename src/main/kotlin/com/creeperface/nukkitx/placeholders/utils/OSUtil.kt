package com.creeperface.nukkitx.placeholders.utils

import com.creeperface.nukkitx.placeholders.Placeholders

object OSUtil {

    private val OS_NAMES = arrayOf(
        "unknown",
        "android",
        "ios",
        "osx",
        "amazon",
        "gear_vr",
        "hololens",
        "windows_10",
        "win32",
        "dedicated",
        "tvos",
        "playstation",
        "nintendo",
        "xbox",
        "windows_phone",
    )

    fun getOsName(os: Int): String {
        val osName = OS_NAMES.getOrElse(os) { OS_NAMES[0] }
        val config = Placeholders.getInstance().config
        val unknown = config.getString("os-names.unknown")!!
        return config.getString("os-names.$osName", unknown)
    }
}
