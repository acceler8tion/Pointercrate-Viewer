package com.acceler8tion.pointercrateviewer.data.api

import com.acceler8tion.pointercrateviewer.data.model.demon.DemonData
import com.acceler8tion.pointercrateviewer.data.model.demon.ListedDemonData
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface DemonAPI {

    @GET("api/v2/demons/listed")
    suspend fun getList(
        @Query("after") after: Int,
        @Query("limit") limit: Int
    ): List<ListedDemonData>

    @GET("api/v2/demons/listed/")
    suspend fun getList(
        @Query("before") before: Int,
        @Query("after") after: Int,
        @Query("limit") limit: Int
    ): List<ListedDemonData>

    @GET("api/v1/demons/{position}")
    suspend fun getDemonByPosition(
        @Path("position") position: Int
    ): DemonData

    @GET("api/v2/demons/{id}")
    suspend fun getDemon(
        @Path("id") id: Int
    ): DemonData

    companion object {
        fun create(): DemonAPI {
            return PointercrateAPIBuilder.build()
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(DemonAPI::class.java)
        }
    }
}