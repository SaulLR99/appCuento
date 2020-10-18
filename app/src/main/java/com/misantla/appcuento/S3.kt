package com.misantla.appcuento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class S3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.s3)
        val btnSiguiente3 = findViewById<Button>(R.id.btnSiguiente3)

        btnSiguiente3.setOnClickListener {
            val intent = Intent(this, S4::class.java)
            startActivity(intent)

        }
    }
}
