package com.example.examendesarrollo.data

import com.example.examendesarrollo.data.network.MovieAPIClient
import com.example.examendesarrollo.data.network.model.movie.Result

/**
 * Class that gets the data from the API
 */

class MoviesRepository {

    private val apiMovie = MovieAPIClient()

    suspend fun getPopularList(): List<Result> {
        return when (val response = apiMovie.getPMovieList()) {
            null -> arrayListOf()
            else -> response.results
        }
    }

}