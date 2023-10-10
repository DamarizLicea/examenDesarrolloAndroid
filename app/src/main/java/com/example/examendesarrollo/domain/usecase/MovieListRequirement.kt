package com.example.examendesarrollo.domain.usecase

import com.example.examendesarrollo.data.MoviesRepository
import com.example.examendesarrollo.data.network.model.movie.Result

class MovieListRequirement {
    private val repository = MoviesRepository()
    suspend operator fun invoke(): List<Result> {
        return repository.getPopularList()
    }

}