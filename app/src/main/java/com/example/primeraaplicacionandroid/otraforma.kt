package com.example.primeraaplicacionandroid

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class otraforma : AppCompatActivity() {

    private lateinit var texto: EditText
    private lateinit var textoalimento: TextView
    private lateinit var botonanadir: Button
    private lateinit var botonsuerte: Button

    private val alimentos = mutableListOf(
        "Chuleton",
        "Tortilla",
        "Croquetas",
        "Ensalada de Pimientos",
        "Entrecote"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Llamar a función para inicializar componentes de la interfaz de usuario
        inicializarUI()

        // Configurar OnClickListener para el botón "Suerte"
        botonsuerte.setOnClickListener {
            randomizar()
        }

        // Configurar OnClickListener para el botón "Añadir"
        botonanadir.setOnClickListener {
            añadir()
        }
    }

    private fun inicializarUI() {
        // Inicializar componentes de la interfaz de usuario
        texto = findViewById(R.id.editordetexto)
        textoalimento = findViewById(R.id.textoalimento)
        botonanadir = findViewById(R.id.botonanadir)
        botonsuerte = findViewById(R.id.botonsuerte)
    }

    private fun añadir() {
        val textoAlimentoAgregar = texto.text.toString().trim()
        if (textoAlimentoAgregar.isNotEmpty()) {
            alimentos.add(textoAlimentoAgregar)
        }
    }

    private fun randomizar() {
        alimentos.shuffle()
        val alimentoAleatorio = alimentos.firstOrNull()
        alimentoAleatorio?.let {
            textoalimento.text = it
        }
    }
}
