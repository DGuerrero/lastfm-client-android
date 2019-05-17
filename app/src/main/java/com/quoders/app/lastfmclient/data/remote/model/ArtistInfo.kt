package com.quoders.app.lastfmclient.data.remote.model

import com.google.gson.annotations.SerializedName


data class ArtistInfoResponse(
    @SerializedName("artist") val artist: Artist
)

data class Tags(
    @SerializedName("tag") val tag: List<Tag>
)

data class Tag(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
)

data class Stats(
    @SerializedName("listeners") val listeners: String,
    @SerializedName("playcount") val playcount: String
)

data class Bio(
    @SerializedName("links") val links: Links,
    @SerializedName("published") val published: String,
    @SerializedName("summary") val summary: String,
    @SerializedName("content") val content: String
)

data class Links(
    @SerializedName("link") val link: Link
)

data class Link(
    @SerializedName("#text") val text: String,
    @SerializedName("rel") val rel: String,
    @SerializedName("href") val href: String
)

data class Similar(
    @SerializedName("artist") val artist: List<Artist>
)
