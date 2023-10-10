package com.example.examendesarrollo.data.network

import com.example.examendesarrollo.data.network.model.movie.movie


/**
 * Class that defines the API calls for the IMDB API
 */

class MovieAPIClient {
    private lateinit var apiMovie: MovieAPIService
    suspend fun getPMovieList(): movie? {
        apiMovie = NetworkModule(MovieAPIService::class.java)
        return try {
            val response = apiMovie.getMovieList()
            when (response.isSuccessful) {
                true -> response.body()
                false -> null
            }
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
            null
        }
    }
   }


