package eu.kanade.tachiyomi.extension.es.sapphirescan

import eu.kanade.tachiyomi.multisrc.zeistmanga.ZeistManga
import eu.kanade.tachiyomi.network.interceptor.rateLimitHost
import okhttp3.HttpUrl.Companion.toHttpUrl

class SapphireScan :
    ZeistManga(
        "SapphireScan",
        "https://www.sapphirescan.com",
        "es",
    ) {
    override val client = super.client.newBuilder()
        .rateLimitHost(baseUrl.toHttpUrl(), 3)
        .build()

    override val pageListSelector = "div.check-box"
}
