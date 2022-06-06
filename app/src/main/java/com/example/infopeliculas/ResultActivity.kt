package com.example.infopeliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.infopeliculas.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityResultBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val datos = intent.extras
        binding.tvDatos.text
        val str = """  Datos
            Titulo: ${datos?.get("Titulo")}
            Año: ${datos?.get("YEAR")}
            Tipo: ${datos?.get("TIPO")}
            Categorías: ${datos?.get("CATEGORIA")}
        """.trimIndent()
        binding.tvDatos.text = str
        binding.btnVolver.setOnClickListener { onBackPressed() }


    }
}