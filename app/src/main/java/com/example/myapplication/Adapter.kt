package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemLayoutBinding



class Adapter : RecyclerView.Adapter <Adapter.ViewHolder>(){
    var pokemones= mutableListOf<Pokemon>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return pokemones.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = pokemones[position]
        holder.bind(item)
    }

    fun setData(pokedex: List<Pokemon>) {
        this.pokemones = pokedex.toMutableList()

    }

    class ViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(pokemon: Pokemon) {
            binding.nombrePokemonTxt.text= pokemon.nombre
            binding.tipoPokemonTxt.text= pokemon.tipo

        }

    }
}