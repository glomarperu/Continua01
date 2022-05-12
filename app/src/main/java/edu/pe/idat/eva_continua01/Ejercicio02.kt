package edu.pe.idat.eva_continua01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import edu.pe.idat.eva_continua01.databinding.ActivityEjercicio02Binding

class Ejercicio02 : AppCompatActivity(), View.OnClickListener{

    private lateinit var binding: ActivityEjercicio02Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio02Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalcularT.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        var a = binding.tvLadoA.text.toString().toDouble()
        var b = binding.tvLadoB.text.toString().toDouble()
        var c = binding.tvLadoC.text.toString().toDouble()

        var resultado = if (a == b && b == c) {
            "Equilátero"
        }else if (a == b || a == c || b == c) {
            "Isóceles"
        }else
            "Escaleno"

        binding.txtResultadoT.text = "El triangulo es $resultado"
    }
}