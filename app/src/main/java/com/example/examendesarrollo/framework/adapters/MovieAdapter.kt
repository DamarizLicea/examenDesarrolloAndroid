package com.example.examendesarrollo.framework.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.examendesarrollo.data.network.model.movie.Result
import com.example.examendesarrollo.databinding.ItemMovieBinding
import com.example.examendesarrollo.framework.adapters.viewholders.MovieViewHolder

class MovieAdapter : RecyclerView.Adapter<MovieViewHolder>() {
    var data: List<Result> = ArrayList()
    lateinit var context: Context

    fun initCustomAdapter(data: List<Result>, context: Context) {
        this.data = data
        this.context = context
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): MovieViewHolder {
        val v = ItemMovieBinding.inflate(
            LayoutInflater.from(viewGroup.context),
            viewGroup,
            false
        )
        return MovieViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: MovieViewHolder, position: Int) {
        val item = data[position]
        viewHolder.bind(item, context)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}