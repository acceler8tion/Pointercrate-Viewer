package com.github.acceler8tion.pointercrateviewer.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Demon::class], version = 1, exportSchema = false)
abstract class DemonDataBase: RoomDatabase() {

    abstract fun demonDao(): DemonDAO

    companion object {

        private var INSTANCE: DemonDataBase? = null

        fun getInstance(context: Context): DemonDataBase? {
            if(INSTANCE == null){
                synchronized(DemonDataBase::class) {
                INSTANCE = Room.databaseBuilder(context.applicationContext, DemonDataBase::class.java, "demon-db")
                    .fallbackToDestructiveMigration()
                    .build()
                }
            }
            return INSTANCE
        }
    }
}