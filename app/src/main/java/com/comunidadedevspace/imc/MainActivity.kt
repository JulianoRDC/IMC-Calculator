package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val peso = findViewById<TextInputEditText>(R.id.edittext_peso)
        val altura = findViewById<TextInputEditText>(R.id.edittext_altura)

        val btncalcular = findViewById<Button>(R.id.btn_calcular)

        btncalcular.setOnClickListener {


            val pesoStr: String = peso.text.toString()
            val alturaStr: String = altura.text.toString()

            if (pesoStr == "" || alturaStr == "" ) {

                Snackbar
                    .make(
                    peso,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_SHORT
                    )
                    .show()

            } else {
                val peso = peso.text.toString().toFloat()
                val altura = altura.text.toString().toFloat()


                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2

                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra(KEY_RESULT_IMC, resultado)
                startActivity(intent)



            }
        }
    }
}