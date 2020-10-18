package com.misantla.appcuento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SE : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.se)

        val btnCu = findViewById<Button>(R.id.btnCu)

        btnCu.setOnClickListener {
            val intent = Intent(this, S1::class.java)
            startActivity(intent)

        }
        val btn1= findViewById<Button>(R.id.btn1)

        btn1.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}
