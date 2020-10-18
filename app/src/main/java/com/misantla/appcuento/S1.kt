package com.misantla.appcuento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class S1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.s1)
        val btnSiguiente1 = findViewById<Button>(R.id.btnSiguiente1)

        btnSiguiente1.setOnClickListener {
            val intent = Intent(this, S2::class.java)
            startActivity(intent)

        }
    }
}
