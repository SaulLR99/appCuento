package com.misantla.appcuento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class S4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.s4)
        val btnSiguiente4 = findViewById<Button>(R.id.btnSiguiente4)

        btnSiguiente4.setOnClickListener {
            val intent = Intent(this, S5::class.java)
            startActivity(intent)

        }
    }
}
