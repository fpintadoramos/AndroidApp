package com.example.tareas.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Tarea(
    var info:String,
    @PrimaryKey(autoGenerate = true)
    val id:Int

) {
}