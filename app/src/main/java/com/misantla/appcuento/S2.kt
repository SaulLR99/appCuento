package com.misantla.appcuento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class S2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.s2)
        val btnSiguiente2 = findViewById<Button>(R.id.btnSiguiente2)

        btnSiguiente2.setOnClickListener {
            val intent = Intent(this, S3::class.java)
            startActivity(intent)

        }
    }
}
