package com.example.practicakotli

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.practicakotli.Analizadores.AnalisisLexico
import com.example.practicakotli.Analizadores.AnalizadorParser
import java.io.StringReader

class MainActivity : AppCompatActivity() {

    private var txt_entrada: EditText? = null
    private var entrada: String? = null
    private var txt_resultado: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        this.txt_entrada = findViewById(R.id.txtEntrada)
        this.txt_resultado = findViewById(R.id.txtResultado)
    }

    fun Ejecutar(view: View){

        this.entrada = this.txt_entrada!!.getText().toString()

        var reader = StringReader(entrada)

        try {
            val lexico: AnalisisLexico = AnalisisLexico(reader)
            val parser: AnalizadorParser = AnalizadorParser(lexico)
            parser.parse()

            val resutlados = parser.resultados
            txt_resultado?.text = resutlados.joinToString("\n")

            Toast.makeText(this, "Compilacion Realizada", Toast.LENGTH_LONG).show()
        } catch (e: Exception){
            println("Error No Recuperable:  ${e}")
            Toast.makeText(this, "Compilacion No Realizada", Toast.LENGTH_LONG).show()
        }
    }

    fun Limpiar(view: View){
        txt_entrada?.text!!.clear()
        txt_resultado?.text = ("")
    }
}

