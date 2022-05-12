package edu.pe.idat.eva_continua01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import edu.pe.idat.eva_continua01.databinding.ActivityEjercicio04Binding

class Ejercicio04 : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityEjercicio04Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio04Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnejecutar.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        var cantidad=binding.txtnumero.text.toString().toInt()
        var letras= arrayOf("A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ",
            "O","P","Q","R","S","T","U","V","W","X","Y","Z")
        var resultado=""
        for (contador in letras.indices ){

            if(contador <= cantidad-1){
                resultado += letras[contador] + " - "

            }
        }
        binding.tvresultado.text = resultado
    }
}
