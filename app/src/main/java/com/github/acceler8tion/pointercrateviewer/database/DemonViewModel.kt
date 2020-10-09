package com.github.acceler8tion.pointercrateviewer.database

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class DemonViewModel(application: Application): AndroidViewModel(application) {

    private val repository = DemonRepository(application)
    private val demons = repository.getAll()

    fun getAll(): LiveData<List<Demon>> {
        return this.demons
    }

    fun getById(id: Int): LiveData<Demon> {
        return repository.getById(id)
    }

    fun insert(demon: Demon) {
        repository.insert(demon)
    }

    fun update(demon: Demon) {
        repository.update(demon)
    }

    fun delete(demon: Demon) {
        repository.delete(demon)
    }
}