package com.vitorpamplona.amethyst.ui.note

import nostr.postr.toHex

fun ByteArray.toShortenHex(): String {
    return toHex().toShortenHex()
}

fun String.toShortenHex(): String {
    if (length <= 16) return this
    return replaceRange(8, length - 8, ":")
}
