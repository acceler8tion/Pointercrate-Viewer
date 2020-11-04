package com.acceler8tion.pointercrateviewer.data.api

import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path

interface ThumbnailAPI {

    @GET("vi/{videoId}/{type}.jpg")
    suspend fun getThumbnail(
        @Path("videoId") videoId: String,
        @Path("type") type: String
    ): String

    companion object {
        private const val BASE_URL = "https://img.yoytube.com/"
        fun create(): ThumbnailAPI {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .build()
                .create(ThumbnailAPI::class.java)
        }
    }
}