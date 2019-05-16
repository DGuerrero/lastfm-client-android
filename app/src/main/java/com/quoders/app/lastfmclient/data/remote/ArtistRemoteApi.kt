package com.quoders.app.lastfmclient.data.remote

import com.quoders.app.lastfmclient.data.remote.response.ArtistInfoResponse
import com.quoders.app.lastfmclient.data.remote.response.ArtistSearchResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ArtistRemoteApi {

    /**
     *  Search for an artist by name
     */
    @GET("?method=artist.search")
    fun searchArtist(
        @Query("artist") artist: String,
        @Query("api_key") api_key: String,
        @Query("format") format: String
    ): Single<ArtistSearchResponse>

    /**
     * Get the detailed info of an artist
     */
    @GET("?method=artist.getinfo")
    fun getArtistInfo(
        @Query("artist") artist: String,
        @Query("api_key") api_key: String,
        @Query("format") format: String
    ): Single<ArtistInfoResponse>
}