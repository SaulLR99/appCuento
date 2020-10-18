package com.misantla.appcuento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEntrar = findViewById<Button>(R.id.btnEntrar)
        btnEntrar.setOnClickListener {

            val txtNombre = txtNombre.getText().toString()
            val txtApellidos = txtApellidos.getText().toString()
            val txtEdad = txtEdad.getText().toString()

            if (txtNombre.isEmpty()) {
                Toast.makeText(this, "INDICA TU NOMBRE", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if (txtApellidos.isEmpty()) {
                Toast.makeText(this, "INDICA TUS APELLIDOS", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if (txtEdad.isEmpty()) {
                Toast.makeText(this, "INDICA TU EDAD", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            val bundle = Bundle()
            bundle.apply {
                putString("dato1", txtNombre)
                putString("dato2", txtApellidos)
            }

            val intent = Intent(this,Menu::class.java).apply {
                putExtras(bundle)
            }
            startActivity(intent)
        }

    }
}

