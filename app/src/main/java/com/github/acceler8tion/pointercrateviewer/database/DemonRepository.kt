package com.github.acceler8tion.pointercrateviewer.database

import android.app.Application
import androidx.lifecycle.LiveData

class DemonRepository(application: Application) {

    private val demonDataBase = DemonDataBase.getInstance(application)!!
    private val demonDao: DemonDAO = demonDataBase.demonDao()
    private val demons: LiveData<List<Demon>> = demonDao.getAll()

    fun getAll(): LiveData<List<Demon>> {
        return demons
    }

    fun getById(id: Int): LiveData<Demon> {
        return demonDao.get(id)
    }

    fun insert(demon: Demon) {
        demonDao.insert(demon)
    }

    fun update(demon: Demon) {
        demonDao.update(demon)
    }

    fun delete(demon: Demon) {
        demonDao.delete(demon)
    }

    fun deleteAll(){
        demonDao.deleteAllDemons()
    }
}