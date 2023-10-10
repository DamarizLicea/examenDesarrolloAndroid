package com.example.examendesarrollo.domain.usecase

import com.example.examendesarrollo.data.MoviesRepository
import com.example.examendesarrollo.data.network.model.movie.movie

class MovieListRequirement {
    private val repository = MoviesRepository()
    suspend operator fun invoke(limit:Int): movie? = repository.getMovieList(limit)

}