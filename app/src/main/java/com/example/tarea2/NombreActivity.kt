package com.example.tarea2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NombreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nombre)
        var textName:TextView = findViewById(R.id.textViewName)
        var mainName = intent.getStringExtra("nombreMainActivity");
        textName.text = mainName
    }
}