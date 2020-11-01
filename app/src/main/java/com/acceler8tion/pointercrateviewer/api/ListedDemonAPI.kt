package com.acceler8tion.pointercrateviewer.api

import com.acceler8tion.pointercrateviewer.pojo.demon.ListedDemonData
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ListedDemonAPI {

    @GET("api/v2/demons/")
    @Headers("Content-Type: application/json")
    fun getList(
        @Query("limit") limit: Int,
        @Query("after") after: Int = 0
    ): Call<List<ListedDemonData>>

    @GET("api/v2/demons/")
    @Headers("Content-Type: application/json")
    fun getList(
        @Query("limit") limit: Int,
        @Query("after") after: Int,
        @Query("before") before: Int
    ): Call<List<ListedDemonData>>

    @GET("api/v2/demons/listed")
    @Headers("Content-Type: application/json")
    fun getListAsSorted(
        @Query("limit") limit: Int,
        @Query("after") after: Int = 0
    ): Call<List<ListedDemonData>>

    @GET("api/v2/demons/listed/")
    @Headers("Content-Type: application/json")
    fun getListAsSorted(
        @Query("limit") limit: Int,
        @Query("after") after: Int,
        @Query("before") before: Int
    ): Call<List<ListedDemonData>>

    companion object {
        private const val BASE_URL = "https://www.pointercrate.com/"

        fun create(): ListedDemonAPI {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ListedDemonAPI::class.java)
        }
    }
}