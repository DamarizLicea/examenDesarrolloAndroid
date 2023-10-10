package com.example.examendesarrollo.data.network

import com.example.examendesarrollo.data.network.model.movie.Result

class MovieAPIClient {
    private lateinit var apiMovie: MovieAPIService
   suspend fun getMovieList(limit:Int): com.example.examendesarrollo.data.network.model.movie.movie? {
       apiMovie = NetworkModule()
       return try {
           apiMovie.getMovieList(limit)
       } catch (e: java.lang.Exception) {
           e.printStackTrace()
           null
       }
   }

       suspend fun getMovieInfo(numberMovie: Int): Result? {
           apiMovie = NetworkModule()
           return try {
               apiMovie.getMovieInfo(numberMovie)
           } catch (e: java.lang.Exception) {
               e.printStackTrace()
               null
           }


       }


}