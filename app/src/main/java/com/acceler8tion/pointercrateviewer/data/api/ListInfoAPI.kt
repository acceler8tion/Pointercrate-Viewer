package com.acceler8tion.pointercrateviewer.data.api

import com.acceler8tion.pointercrateviewer.data.model.ListInformation
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ListInfoAPI {

    @GET("api/v1/list_information")
    suspend fun getInfo(
        //No query
    ): ListInformation

    companion object {
        fun create() : ListInfoAPI {
            return PointercrateAPIBuilder.build()
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ListInfoAPI::class.java)
        }
    }
}