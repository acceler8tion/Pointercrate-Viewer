package com.acceler8tion.pointercrateviewer.data.api

import com.acceler8tion.pointercrateviewer.data.model.player.ListedPlayerData
import com.acceler8tion.pointercrateviewer.data.model.player.PlayerData
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PlayerAPI {

    @GET("api/v1/players/ranking")
    suspend fun getList(
        @Query("after") after: Int,
        @Query("limit") limit: Int
    ): List<ListedPlayerData>

    @GET("api/v1/players/ranking")
    suspend fun getList(
        @Query("before") before: Int,
        @Query("after") after: Int,
        @Query("limit") limit: Int
    ): List<ListedPlayerData>

    @GET("api/v1/players/{id}")
    suspend fun getPlayer(
        @Path("id") id: Int
    ): PlayerData

    companion object {
        fun create(): PlayerAPI {
            return PointercrateAPIBuilder.build()
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(PlayerAPI::class.java)
        }
    }
}