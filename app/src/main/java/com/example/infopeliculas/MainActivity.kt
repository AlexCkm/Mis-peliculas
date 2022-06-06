package com.example.infopeliculas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.infopeliculas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val spinner1 = arrayOf("")
    private val datos = mutableMapOf<String, String>()
    var rdTipo = "Serie"
    var year = arrayOf("")
    var cat = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        getSpinner(this, binding.spnYear, year, R.array.Años)

        binding.rdSerie.setOnClickListener { rdTipo = "Serie" }
        binding.rdPelicula.setOnClickListener { rdTipo = "Pelicula" }
        binding.btnEnviar.setOnClickListener { getAndSend()}
    }


    fun getAndSend(){
        val intentResult = Intent(this, ResultActivity::class.java)
        intentResult.putExtra("Titulo", binding.etPelicula.text.toString())
        intentResult.putExtra("YEAR", year[0])
        intentResult.putExtra("TIPO", rdTipo)
        intentResult.putExtra("CATEGORIA", cat.toString())
            startActivity(intentResult)
        }
    fun onCheckBoxClicked(view: View){
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.cbSciFi -> { if (checked) {
                    checkCategory(binding.cbSciFi.text.toString())
                } else {
                    unCheckCategory(binding.cbSciFi.text.toString())
                }
                }
                R.id.ckSciFi -> { if (checked) {
                    checkCategory(binding.ckSciFi.text.toString())
                } else {
                    unCheckCategory(binding.ckSciFi.text.toString())
                }
                }
                R.id.ckTerror -> { if (checked) {
                    checkCategory(binding.ckTerror.text.toString())
                } else {
                    unCheckCategory(binding.ckTerror.text.toString())
                }
                }
                R.id.ckThriller -> { if (checked) {
                    checkCategory(binding.ckThriller.text.toString())
                } else {
                    unCheckCategory(binding.ckThriller.text.toString())
                }
                }
                R.id.ckFantasy -> { if (checked) {
                    checkCategory(binding.ckFantasy.text.toString())
                } else {
                    unCheckCategory(binding.ckFantasy.text.toString())
                }
                }
                R.id.ckHumour -> { if (checked) {
                    checkCategory(binding.ckHumour.text.toString())
                } else {
                    unCheckCategory(binding.ckHumour.text.toString())
                }
                }
                R.id.ckAnimation -> { if (checked) {
                    checkCategory(binding.ckAnimation.text.toString())
                } else {
                    unCheckCategory(binding.ckAnimation.text.toString())
                }
                }
                R.id.ckDrama -> { if (checked) {
                    checkCategory(binding.ckDrama.text.toString())
                } else {
                    unCheckCategory(binding.ckDrama.text.toString())
                }
                }
                R.id.ckSpanish -> { if (checked) {
                    checkCategory(binding.ckSpanish.text.toString())
                } else {
                    unCheckCategory(binding.ckSpanish.text.toString())
                }
                }

            }
        }
    }

