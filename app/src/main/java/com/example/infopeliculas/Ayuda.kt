package com.example.infopeliculas

import android.content.Context
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

fun getSpinner(context:Context, spinner: Spinner, select:Array<String>, idValores:Int){
    val adaptador: ArrayAdapter<*> = ArrayAdapter.createFromResource(context, idValores,
        android.R.layout.simple_spinner_dropdown_item)
    spinner.adapter = adaptador
    spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
        override fun onItemSelected(
            parent: AdapterView<*>?,
            view: View?,
            position: Int,
            id: Long
        ) {
            select[0] = parent?.getItemAtPosition(position).toString()
        }
        override fun onNothingSelected(parent: AdapterView<*>?) {
            select[0] = "Sin selección"
        }
    }
}
fun msj (context: Context, str:String, lengthLong:Boolean = true){
    Toast.makeText(context, str,
        if (lengthLong) Toast.LENGTH_LONG
        else Toast.LENGTH_SHORT
    ).show()
}