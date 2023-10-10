package com.example.examendesarrollo.data.network

import com.example.examendesarrollo.data.network.model.movie.movie
import retrofit2.Response

import retrofit2.http.GET


interface MovieAPIService {
@GET("3/movie/popular?api_key=ab0aee693d092ef536740ba6771909ec")
suspend fun getMovieList(): Response<movie>

}