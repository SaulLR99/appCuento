package com.misantla.appcuento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.menu.*

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)

        val btnCort = findViewById<Button>(R.id.btnCort)

        btnCort.setOnClickListener {
            val intent = Intent(this, SE::class.java)
            startActivity(intent)
        }

        val bundle : Bundle? = intent.extras
        bundle?.let {
            val nombre = it.getString("dato1")
            val apellidos = it.getString("dato2")


            textView1.text = "$nombre"
            textView2.text = "$apellidos"
        }

        btnCort.setOnClickListener {
            val intent = Intent(this, SE::class.java)
            startActivity(intent)
        }


    }
}
