package com.github.acceler8tion.pointercrateviewer.api

import com.github.acceler8tion.pointercrateviewer.api.pojo.demon.ListInformation
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers

interface ListInfoAPI {

    @GET("api/v1/list_information")
    @Headers("Content-Type: application/json")
    fun getInfo(
        //No query
    ): Call<ListInformation>

    companion object {
        private const val BASE_URL = "https://www.pointercrate.com/"

        fun create() : ListInfoAPI {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ListInfoAPI::class.java)
        }
    }
}