package com.quoders.app.lastfmclient.data.remote.response

import com.google.gson.annotations.SerializedName

data class ArtistSearchResponse(
        @SerializedName("results") val results: Results
)

data class Results(
        @SerializedName("opensearch:Query") val opensearchQuery: OpensearchQuery,
        @SerializedName("opensearch:totalResults") val opensearchtotalResults: String,
        @SerializedName("opensearch:startIndex") val opensearchstartIndex: String,
        @SerializedName("opensearch:itemsPerPage") val opensearchitemsPerPage: String,
        @SerializedName("artistmatches") val artistmatches: Artistmatches,
        @SerializedName("@attr") val attr: Attr
)

data class Attr(
        @SerializedName("for") val forX: String
)

data class OpensearchQuery(
        @SerializedName("#text") val text: String,
        @SerializedName("role") val role: String,
        @SerializedName("searchTerms") val searchTerms: String,
        @SerializedName("startPage") val startPage: String
)

data class Artistmatches(
        @SerializedName("artist") val artist: List<Artist>
)

data class Artist(
        @SerializedName("name") val name: String,
        @SerializedName("listeners") val listeners: String,
        @SerializedName("mbid") val mbid: String,
        @SerializedName("url") val url: String,
        @SerializedName("streamable") val streamable: String,
        @SerializedName("image") val image: List<Image>,
        @SerializedName("ontour") val ontour: String,
        @SerializedName("stats") val stats: Stats,
        @SerializedName("similar") val similar: Similar,
        @SerializedName("tags") val tags: Tags,
        @SerializedName("bio") val bio: Bio
)

data class Image(
        @SerializedName("#text") val text: String,
        @SerializedName("size") val size: String
)
