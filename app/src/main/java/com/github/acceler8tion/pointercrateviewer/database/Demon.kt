package com.github.acceler8tion.pointercrateviewer.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "demons")
data class Demon (
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    var id: Int,

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "position")
    var position: Int,

    @ColumnInfo(name = "zippedgraph")
    var zippedGraph: String
)