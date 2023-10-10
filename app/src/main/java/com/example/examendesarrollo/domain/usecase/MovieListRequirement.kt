package com.example.examendesarrollo.domain.usecase

import com.example.examendesarrollo.data.MoviesRepository
import com.example.examendesarrollo.data.network.model.movie.Result

/**
 * Use case that gets a list of popular movies
 */

class MovieListRequirement {
    private val repository = MoviesRepository()
    suspend operator fun invoke(): List<Result> {
        return repository.getPopularList()
    }

}