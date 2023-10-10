package com.example.examendesarrollo.data.network

import com.example.examendesarrollo.data.network.model.movie.movie
import retrofit2.Response
import retrofit2.http.GET

interface MovieAPIService {
@GET("movie/popular")
suspend fun getMovieList(): Response<movie>

}