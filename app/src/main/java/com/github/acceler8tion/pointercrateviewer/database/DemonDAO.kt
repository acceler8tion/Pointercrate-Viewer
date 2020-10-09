package com.github.acceler8tion.pointercrateviewer.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface DemonDAO {
    @Query("SELECT * FROM demons")
    fun getAll(): LiveData<List<Demon>>

    @Query("SELECT * FROM demons WHERE id = :id")
    fun get(id: Int): LiveData<Demon>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(demon: Demon)

    @Update
    fun update(demon: Demon)

    @Delete
    fun delete(demon: Demon)

    @Query("DELETE FROM demons")
    fun deleteAllDemons()
}