package com.example.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*
    * Essa função altera para outra ativide caso o a validação do login seja efetuado
    * */
    public fun trocaTela() {
        val proximo = Intent(this, Main2Activity::class.java)
        startActivity(proximo)
    }

    /*
    * Essa função faz a validação do login do usuário e altera para outra tela caso sejá valido!
    * */
    public fun buttonOnClickValidacao(view: View) {
        val login = "${ editText.text.toString() }@${ editText2.text.toString() }"
        var view: TextView = findViewById(R.id.textView2)

        when (login) {
            "admin@admin" -> {
                view.setText("Login efetuado")
                trocaTela()
            }
            "@admin" -> view.setText("Favor inserir o usuário")
            "admin@" -> view.setText("Favor inserir a senha")
            "@" -> view.setText("Campos em brancos, favor informar dados de acesso")
            else -> view.setText("Usuário ou Senha incorretos!")
        }
    }

    /*
    * Essa função faz sair do aplioativo
    * */
    public fun buttonSair(view: View) {
        finish()
    }
}









