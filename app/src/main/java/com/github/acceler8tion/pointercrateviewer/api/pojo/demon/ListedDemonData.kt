package com.github.acceler8tion.pointercrateviewer.api.pojo.demon

data class ListedDemonData (
    val id : Int,
    val position : Int,
    val name : String,
    val requirement : Int,
    val video : String,
    val publisher : Publisher,
    val verifier : Verifier
)