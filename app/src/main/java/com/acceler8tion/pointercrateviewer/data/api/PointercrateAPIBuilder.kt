package com.acceler8tion.pointercrateviewer.data.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit

object PointercrateAPIBuilder {

    private const val BASE_URL = "https://www.pointercrate.com/"
    private val client = OkHttpClient.Builder()
        .addInterceptor {
            val request = it.request().newBuilder().addHeader("Content-Type", "application/json").build()
            return@addInterceptor it.proceed(request)
        }.build()

    fun build(): Retrofit.Builder = Retrofit.Builder().baseUrl(BASE_URL).client(client)
}