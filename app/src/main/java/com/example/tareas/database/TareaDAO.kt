package com.example.tareas.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TareaDAO {

    @Query("SELECT * FROM tarea")
    suspend fun getAll():List<Tarea>

    @Insert
    suspend fun insert(t:Tarea)

    @Delete
    suspend fun delete(t:Tarea)
}