package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/* Pasos para crear un recycler view
* [x ] item layout
*   [x] agregar constraints
*   [x] cambiar altura de constraints layout de item layout a wrap content
*   [X] definir ID
* [x ] layout con recycler view
* [X ] asignar layout manager
* [ ] Adapter+ view holder
* [ ] obtener los datos
* */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}