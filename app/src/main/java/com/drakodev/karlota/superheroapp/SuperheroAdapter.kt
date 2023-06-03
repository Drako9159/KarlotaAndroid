package com.drakodev.karlota.superheroapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.drakodev.karlota.R

class SuperheroAdapter(var superheroList: List<SuperheroItemResponse> = emptyList()) : RecyclerView.Adapter<SuperheroViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperheroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun getItemCount(): Int {
        return superheroList.size
    }

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        val item = superheroList[position]
        holder.bind(item)
    }
}