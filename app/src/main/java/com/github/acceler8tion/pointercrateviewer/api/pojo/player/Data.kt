package com.github.acceler8tion.pointercrateviewer.api.pojo.player

data class Data (
    val banned : Boolean,
    val created : List<Created>,
    val id : Int,
    val name : String,
    val nationality : Nationality,
    val published : List<Published>,
    val records : List<Records>,
    val verified : List<Verified>
)