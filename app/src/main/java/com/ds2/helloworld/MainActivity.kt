package com.ds2.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText


const val EXTRA_MESSAGE = "com.ds2.helloworld.MESSAGE" /* uma variavel no kotlin se defiine como 'val'*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage (view: View) /*no kotlin para criar uma função usa-se 'fun' + 'nome da função' + 'Parametro'*/
   /*  Essa função é chamada sempre que o usuário toca no botão enviar */
    {
     /*   usar a função 'findViewById' para buscar um 'EditText' e jogar dentro da variavel 'editText'*/
        val editText = findViewById<TextInputEditText>(R.id.textInputEditText)/* R = Raiz*/
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply
        {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}