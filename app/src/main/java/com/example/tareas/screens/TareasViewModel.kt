package com.example.tareas.screens

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.tareas.database.Tarea
import com.example.tareas.database.TareaApp

class TareasViewModel : ViewModel() {
    var tareas = mutableListOf<String>()

    fun addTarea(t:String):String {
        tareas.add(t)
        var lista:String = ""

        for (i in tareas){
            lista += "\n" + i.toString()
        }

        return lista
    }

    fun delTarea(t:String):String{
        tareas.remove(t)
        var lista:String = ""

        for (i in tareas){
            lista += "\n" + i.toString()
        }

        return lista
    }

    fun obtener():String{
        var lista:String = ""

        for (i in tareas){
            lista += "\n" + i.toString()
        }

        return lista
    }



    /*
    Room no me funcionaba de todas las manera que he podido pero funcionando las funciones deben ser asi

    para añadir
    suspend fun addTarea(app: TareaApp, t:String){
        var tarea = Tarea(t, 0)
        app.room.tareaDao().insert(tarea)
    }

    para eliminar
    suspend fun delTarea(app: TareaApp, t:String){
        var tarea = Tarea(t, 0)
        app.room.tareaDao().delete(tarea)
    }

    para listar las tareas
    suspend fun listTarea(app: TareaApp): String{
        val lista = app.room.tareaDao().getAll()
        var texto = ""
        for (i in lista){
            texto += "\n" + i.toString()
        }

        return texto
    }
*/



}