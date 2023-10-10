package com.example.examendesarrollo.data.network

import com.example.examendesarrollo.data.network.model.movie.Result
import com.example.examendesarrollo.data.network.model.movie.movie
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieAPIService {
@GET("movie/popular")
suspend fun getMovieList(
@Query("limit") limit:Int
): movie

suspend fun getMovieInfo(
@Path("numberMovie") numberMovie:Int
): Result
}