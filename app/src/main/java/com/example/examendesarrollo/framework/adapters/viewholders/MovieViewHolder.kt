package com.example.examendesarrollo.framework.adapters.viewholders

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.examendesarrollo.data.network.model.movie.Result
import com.example.examendesarrollo.databinding.ItemMovieBinding
import com.example.examendesarrollo.utils.Constants

/**
 * Esta clase se utiliza para almacenar los datos de
 * resumen de la empresa y crear la vista de la
 * tarjeta del catálogo de la empresa
 */

class MovieViewHolder(private val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(movieDetails: Result, context: Context) {
        binding.TextViewTitle.text = movieDetails.title
        binding.TextViewDescription.text = movieDetails.overview

        val requestOptions =
            RequestOptions().centerCrop().diskCacheStrategy(DiskCacheStrategy.ALL)
                .fitCenter().priority(Priority.HIGH)

        Glide.with(context).load(Constants.IMAGE_SERVER_URL + movieDetails.poster_path)
            .apply(requestOptions).into(binding.IVMovie)

    }
}