package com.example.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main3.*
import androidx.annotation.IntegerRes as IntegerRes1

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }

    /*
    * Essa função faz o cálculo do IMC e retorna a mensagem para o usuário
    * */
    public fun calculo(view: View) {
        var altura: String = editText.text.toString()
        var alturafinal: Double = altura.toDouble()
        var peso: String = editText2.text.toString()
        var pesofinal: Double = peso.toDouble()
        var imagem: TextView = findViewById(R.id.textView2)


        var resultado: Double = pesofinal.div(alturafinal * alturafinal )

        if (resultado < 18.5) {
            imagem.setText("Abaixo do peso, cuide da sua alimentação!")
        }
        else if ((resultado == 18.5) || (resultado <=24.9)) {
            imagem.setText("Peso normal, muito bem, continue assim!")
        }
        else if ((resultado == 25.0) || (resultado <= 29.9)) {
            imagem.setText("Sobrepeso, ainda podemos reverter isso, cuide da sua alimentação!")
        }
        else if ((resultado == 30.0) || (resultado <= 34.9)) {
            imagem.setText("Obesidade grau 1, você  está correndo risco de saúde!")
        }
        else if ((resultado == 35.0) || (resultado <= 39.9)) {
            imagem.setText("Obesidade grau 2, você está numa fase avançada, comece o quanto antes!")
        }
        else {
            imagem.setText("Obesidade grau 3, esta critico sua situação, esta correndo risco de vida!")
        }
    }

    /*
    * Essa opção faz o logout para o usuário, voltando na tela inicial
    * */
    public fun finalizar(view: View) {
        finish()
    }
}
