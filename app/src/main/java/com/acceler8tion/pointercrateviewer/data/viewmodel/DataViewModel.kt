package com.acceler8tion.pointercrateviewer.data.viewmodel

import androidx.lifecycle.ViewModel
import com.acceler8tion.pointercrateviewer.data.api.DemonAPI
import com.acceler8tion.pointercrateviewer.data.api.ListInfoAPI
import com.acceler8tion.pointercrateviewer.data.api.PlayerAPI
import com.acceler8tion.pointercrateviewer.data.model.ListInformation
import com.acceler8tion.pointercrateviewer.data.model.demon.DemonData
import com.acceler8tion.pointercrateviewer.data.model.demon.ListedDemonData
import com.acceler8tion.pointercrateviewer.data.model.player.ListedPlayerData
import com.acceler8tion.pointercrateviewer.data.model.player.PlayerData
import com.acceler8tion.pointercrateviewer.util.visual.UseAPI
import com.acceler8tion.pointercrateviewer.util.visual.UseAPI.APIType
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class DataViewModel: ViewModel() {

    private val demonAPI = DemonAPI.create()
    private val playerAPI = PlayerAPI.create()
    private val listInfoAPI = ListInfoAPI.create()

    @UseAPI(APIType.DEMON)
    fun getDemonList(after: Int = 0, limit: Int) = flow<List<ListedDemonData>> {
        emit(demonAPI.getList(after, limit))
    }.flowOn(Dispatchers.IO)

    @UseAPI(APIType.DEMON)
    fun getDemonList(before: Int, after: Int, limit: Int) = flow<List<ListedDemonData>> {
        emit(demonAPI.getList(before, after, limit))
    }.flowOn(Dispatchers.IO)

    @UseAPI(APIType.DEMON)
    fun getDemonByPosition(position: Int) = flow<DemonData> {
        emit(demonAPI.getDemonByPosition(position))
    }.flowOn(Dispatchers.IO)

    @UseAPI(APIType.DEMON)
    fun getDemon(id: Int) = flow<DemonData> {
        emit(demonAPI.getDemon(id))
    }.flowOn(Dispatchers.IO)



    @UseAPI(APIType.PLAYER)
    fun getPlayerList(after: Int = 0, limit: Int) = flow<List<ListedPlayerData>> {
        emit(playerAPI.getList(after, limit))
    }.flowOn(Dispatchers.IO)

    @UseAPI(APIType.PLAYER)
    fun getPlayerList(before: Int, after: Int, limit: Int) = flow<List<ListedPlayerData>> {
        emit(playerAPI.getList(before, after, limit))
    }.flowOn(Dispatchers.IO)

    @UseAPI(APIType.PLAYER)
    fun getPlayer(id: Int) = flow<PlayerData> {
        emit(playerAPI.getPlayer(id))
    }.flowOn(Dispatchers.IO)



    @UseAPI(APIType.METADATA)
    fun getInfo() = flow<ListInformation> {
        emit(listInfoAPI.getInfo())
    }.flowOn(Dispatchers.IO)
}