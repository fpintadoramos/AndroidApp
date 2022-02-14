package com.example.tareas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tareas.databinding.FragmentPartnersBinding
import com.example.tareas.retrofit.MarsApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PartnersFragment : Fragment() {

    var texto:String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentPartnersBinding.inflate(inflater)



        return binding.root
    }


}