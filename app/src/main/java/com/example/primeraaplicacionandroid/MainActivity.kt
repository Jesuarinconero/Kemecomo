package com.example.primeraaplicacionandroid

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val alimentos = mutableListOf(
        "Chuleton",
        "Tortilla",
        "Croquetas",
        "Ensalada de Pimientos",
        "Entrecote"
    )

    private lateinit var texto: EditText
    private lateinit var textoalimento: TextView
    private lateinit var botonanadir: Button
    private lateinit var botonsuerte : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar componentes de la interfaz de usuario

        // Configurar OnClickListener para el botón "Añadir"
        botonanadir.setOnClickListener {
            añadir()
        }

        // Configurar OnClickListener para el botón "Suerte"
        botonsuerte.setOnClickListener{
            randomizar()
        }

    }
//funcion añadir
    private fun añadir() {
        val textoAlimentoAgregar = texto.text.toString().trim()
        if (textoAlimentoAgregar.isNotEmpty()) {
            alimentos.add(textoAlimentoAgregar)
        }
    }//funcion randomizar
    private fun randomizar(){
        alimentos.shuffle()
        val alimentoAleatorio = alimentos.first()
        textoalimento.text = alimentoAleatorio
    }

}
