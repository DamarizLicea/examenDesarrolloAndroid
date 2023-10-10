package com.example.examendesarrollo.data

import com.example.examendesarrollo.data.network.MovieAPIClient
import com.example.examendesarrollo.data.network.model.movie.Result
import com.example.examendesarrollo.data.network.model.movie.movie

class MoviesRepository {

    private val apiMovie = MovieAPIClient()

    suspend fun getMovieList(limit:Int): movie? = apiMovie.getMovieList(limit)
    suspend fun getMovieInfo(numberMovie:Int): Result?  = apiMovie.getMovieInfo(numberMovie)


}