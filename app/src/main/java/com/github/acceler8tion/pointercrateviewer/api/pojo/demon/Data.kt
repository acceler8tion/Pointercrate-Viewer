package com.github.acceler8tion.pointercrateviewer.api.pojo.demon

data class Data (
	val creators : List<Creators>,
	val id : Int,
	val name : String,
	val position : Int,
	val publisher : Publisher,
	val records : List<Records>,
	val requirement : Int,
	val verifier : Verifier,
	val video : String
)