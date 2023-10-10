package com.example.examendesarrollo.framework.views.activities

import android.os.Bundle
import android.util.Log

import androidx.appcompat.app.AppCompatActivity

import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.examendesarrollo.databinding.ActivityMainBinding
import com.example.examendesarrollo.framework.adapters.MovieAdapter
import com.example.kotlin.pokedexapp.framework.viewmodel.MainViewModel


/**
 * Esta clase representa la actividad principal de la aplicación
 */

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit private var viewModel: MainViewModel
    lateinit var recicleView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel =
            ViewModelProvider(this)[MainViewModel::class.java]
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.fetchAllPopularMovies()

        // Bindings
        recicleView = binding.RVPopularList


        // Observers
        viewModel.movieListLiveData.observe(this) { list ->
            if (!list.isNullOrEmpty()) {
                val adapter = MovieAdapter()
                adapter.initCustomAdapter(list, this)
                recicleView.adapter = adapter
            } else {
                Log.i("Salida", "No hay datos")

            }
        }
    }


}