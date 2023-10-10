package com.example.examendesarrollo.data.network

import com.example.examendesarrollo.utils.Constants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Modelo de red genérico para interactuar con servicios API.
 *
 * Este objeto proporciona una manera de crear instancias de servicios API configuradas para comunicarse con diversas APIs.
 */
object NetworkModule {
    private val gsonFactory: GsonConverterFactory = GsonConverterFactory.create()
    private val okHttpClient: OkHttpClient = OkHttpClient()

        operator fun invoke(java: Class<MovieAPIService>): MovieAPIService {
            return Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(gsonFactory)
                .build()
                .create(MovieAPIService::class.java)
    }
}