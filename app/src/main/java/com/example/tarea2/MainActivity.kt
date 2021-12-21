package com.example.tarea2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textName:EditText ?= findViewById(R.id.editNombre)
        var textBoton:Button = findViewById(R.id.button)
        textBoton.setOnClickListener{
            var nombreEditado = textName?.text.toString()
            if (nombreEditado==""){
                Toast.makeText(this,"Debe Ingresar Un Nombre", Toast.LENGTH_SHORT,).show()
            }
            else {
                val intent = Intent(this,NombreActivity::class.java)
                intent.putExtra("nombreMainActivity",nombreEditado)
                startActivity(intent)
            }
        }

    }
}