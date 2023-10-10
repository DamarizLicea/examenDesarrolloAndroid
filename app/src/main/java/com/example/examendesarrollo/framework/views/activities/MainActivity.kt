package com.example.kotlin.pokedexapp.framework.views.activities

import android.app.ActionBar
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.examendesarrollo.databinding.FragmentErrorBinding
import com.example.examendesarrollo.framework.adapters.MovieAdapter
import com.example.kotlin.pokedexapp.R
import com.example.examendesarrollo.utils.Constants
import com.example.kotlin.pokedexapp.databinding.ActivityMainBinding
import com.example.kotlin.pokedexapp.framework.viewmodel.MainViewModel
import com.example.kotlin.pokedexapp.framework.views.fragments.PokedexFragment
import com.example.kotlin.pokedexapp.framework.views.fragments.SearchFragment

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
                binding.root.removeView(binding.skeleton.root)
                val adapter = MovieAdapter()
                adapter.initCustomAdapter(list, this)
                recicleView.adapter = adapter
            } else {
                Log.i("Salida", "No hay datos")
                binding.root.removeView(recicleView)
                binding.root.removeView(binding.skeleton.root)
                val errorView = FragmentErrorBinding.inflate(layoutInflater).root
                binding.LLContainer.addView(errorView)
                errorView.layoutParams.height = ActionBar.LayoutParams.MATCH_PARENT
                errorView.layoutParams.width = ActionBar.LayoutParams.MATCH_PARENT

            }
        }
    }
}