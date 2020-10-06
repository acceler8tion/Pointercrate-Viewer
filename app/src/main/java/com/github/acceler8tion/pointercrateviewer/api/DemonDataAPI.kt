package com.github.acceler8tion.pointercrateviewer.api

import com.github.acceler8tion.pointercrateviewer.api.pojo.demon.DemonData
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface DemonDataAPI {

    @GET("api/v1/demons/{position}")
    @Headers("Content-Type: application/json")
    fun getDemon(
        @Path("position") position: Int
    ): Call<DemonData>

    companion object {
        private const val BASE_URL = "https://www.pointercrate.com/"

        fun create(): DemonDataAPI {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(DemonDataAPI::class.java)
        }
    }
}