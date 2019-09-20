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
    }

    public fun buttonOnClickValidacao(view: View) {
        val login = "${ editText.text.toString() }@${ editText2.text.toString() }"
        var view: TextView = findViewById(R.id.textView2)

        when (login) {
            "admin@admin" -> view.setText("Login efetuado")
            "@admin" -> view.setText("Favor inserir o usuário")
            "admin@" -> view.setText("Favor inserir a senha")
            "@" -> view.setText("Campos em brancos, favor informar dados de acesso")
            else -> view.setText("Usuário ou Senha incorretos!")
        }
    }
}








