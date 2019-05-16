package com.quoders.app.lastfmclient.data.remote

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import com.quoders.app.lastfmclient.data.remote.response.ArtistInfoResponse
import com.quoders.app.lastfmclient.data.remote.response.ArtistSearchResponse
import io.reactivex.Single
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ArtistRemoteService {

    private val artistRemoteApi: ArtistRemoteApi

    init {

        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        val client = OkHttpClient.Builder().addInterceptor(interceptor).build()

        val retrofit = Retrofit.Builder()
            .client(client)
            .baseUrl("https://ws.audioscrobbler.com/2.0/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

        artistRemoteApi = retrofit.create(ArtistRemoteApi::class.java)
    }

    fun searchArtist(artist: String): Single<ArtistSearchResponse> {
        return artistRemoteApi.searchArtist(artist, "e17880273cd7212d788b10a11a5b0a90", "json")
    }

    fun getArtistInfo(artist: String): Single<ArtistInfoResponse> {
        return artistRemoteApi.getArtistInfo(artist, "e17880273cd7212d788b10a11a5b0a90", "json")
    }
}