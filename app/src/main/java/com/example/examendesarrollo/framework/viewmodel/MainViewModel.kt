package com.example.kotlin.pokedexapp.framework.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.examendesarrollo.data.network.model.movie.Result
import com.example.examendesarrollo.domain.usecase.MovieListRequirement
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Esta clase usa corutinas para obtener la lista de películas populares
 */


class MainViewModel() : ViewModel() {
    val movieListLiveData = MutableLiveData<List<Result>?>()
    private val popularListRequirement = MovieListRequirement()

    fun fetchAllPopularMovies() {
        viewModelScope.launch(Dispatchers.IO) {

            val data = popularListRequirement.invoke()
            CoroutineScope(Dispatchers.Main).launch {
                movieListLiveData.postValue(data)
            }
        }
    }


}

