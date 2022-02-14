package com.example.tareas.screens

import android.content.ActivityNotFoundException
import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.example.tareas.database.Tarea
import com.example.tareas.database.TareaApp
import com.example.tareas.databinding.TareasBinding
import kotlinx.coroutines.launch
import android.widget.Toast

import com.example.tareas.MainActivity




class Tareas : Fragment() {

    companion object {
        fun newInstance() = Tareas()
    }

    private lateinit var viewModel: TareasViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = TareasBinding.inflate(inflater)

        val application = requireNotNull(this.activity).application
        /*
        Si Room funcionase se inicializaria la base de datos asi

        val app = application.applicationContext as TareaApp

        Este valor se lo pasaria al viewModel para que modifique la base de datos

        binding.listar.setOnClickListener { binding.ver.text = viewModel.list(app) }
        binding.add.setOnClickListener { viewModel.addTarea(app, binding.t.text.toString()) }
        binding.eliminar.setOnClickListener { viewModel.addTarea(app, binding.t.text.toString()) }
         */

        binding.add.setOnClickListener { binding.ver.text = viewModel.addTarea(binding.t.text.toString()) }
        binding.eliminar.setOnClickListener { binding.ver.text = viewModel.delTarea(binding.tE.text.toString())}



        binding.enviar.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.type = "text/html"
            emailIntent.putExtra(android.content.Intent.EXTRA_TITLE, "Tareas")
            emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Lista de tareas")
            emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, viewModel.obtener())

            try {
                startActivity(Intent.createChooser(emailIntent, "Enviar por..."))
            } catch (ex: ActivityNotFoundException) {
                Toast.makeText(
                    this.context,
                    "No hay ningun cliente de correo instalado.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TareasViewModel::class.java)
    }

}