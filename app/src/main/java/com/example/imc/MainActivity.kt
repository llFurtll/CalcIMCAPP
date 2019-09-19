package com.example.imc

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val usuario: String = editText.text.toString()
            val senha: String = editText2.text.toString()
            val mostrar: TextView = findViewById(R.id.textView2)

            if (usuario == "admin" && senha == "admin") {
                mostrar.setText("Login efetuado")
            }
            else {
                mostrar.setText("Usuário ou Senha incorretos!")
            }
        }
    }
}








