package edu.pe.idat.eva_continua01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import edu.pe.idat.eva_continua01.databinding.ActivityEjercicio01Binding

class Ejercicio01 : AppCompatActivity(), View.OnClickListener{

    private lateinit var binding: ActivityEjercicio01Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalcular.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        var temperatura = binding.tvTemperatura.text.toString().toDouble()

        var estado =
            if(temperatura < 0){
                "Sólido"
            }else if (temperatura in 0.0..100.0){
                "Líquido"
            }else
                "Gaseoso"

        binding.txtEstadoAgua.text = "El estado del agua es $estado"
    }
}