package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemLayoutBinding

/*
[ ] implementar clase Adapter
[ ]  heredar RecyclerView.Adapter
[ ] creaciones de los métodos: onCreateViewHolder, getItemCount y onBindViewHolder
[ ] crear clase anidada ViewHolder, que hereda de la clase ViewHolder
[ ] Agregar constructor
[ ] crear objeto, data class
[ ] Crear lista
[ ] asignar tamaño de la lista en getItemCount
[ ] definir Binding Class del Item
[ ] cambiar view por el binding
* */

class Adapter : RecyclerView.Adapter <Adapter.ViewHolder>(){
    val pokemones= mutableListOf<Pokemon>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return pokemones.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
    class ViewHolder(binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}