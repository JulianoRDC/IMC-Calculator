package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar os componentes EditText
        // Criar uma variavel e associar (=)  o componente de UI <EditText>
        // Recuperar o botao da tela

        // Colocar acao no botao setOnClickListener
        // Recuperar o texo digitado no edt peso

        val peso = findViewById<TextInputEditText>(R.id.edittext_peso)
        val altura = findViewById<TextInputEditText>(R.id.edittext_altura)

        val btncalcular = findViewById<Button>(R.id.btn_calcular)


        btncalcular.setOnClickListener {
            val peso = peso.text
            val altura = altura.text

            println ("Acao do Botao" + altura)
        }

    }
}