package com.example.tareas.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Tarea::class],
    version = 1
)
abstract class TareaDB: RoomDatabase() {

    abstract fun tareaDao(): TareaDAO
}