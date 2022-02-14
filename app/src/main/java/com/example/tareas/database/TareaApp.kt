package com.example.tareas.database

import android.app.Application
import androidx.room.Room

class TareaApp : Application() {

    val room = Room
        .databaseBuilder(this, TareaDB::class.java, "Tarea")
        .build()
}