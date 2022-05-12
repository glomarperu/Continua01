package edu.pe.idat.eva_continua01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import edu.pe.idat.eva_continua01.databinding.ActivityEjercicio03Binding

class Ejercicio03 : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityEjercicio03Binding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio03Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btncalcular.setOnClickListener (this)

    }

    override fun onClick(p0: View?) {
        //Toast.makeText(applicationContext,"Hola", Toast.LENGTH_SHORT).show()
        var cantidad=binding.txtcantidad.text.toString().toDouble()
        var total=cantidad*4000
        var totalapagar:Double
        var descuento:Double
        if(cantidad < 5 ){
            descuento=total*0.1
            totalapagar=total-descuento
        }else if(cantidad >= 5 && cantidad < 10){
            descuento=total*0.2
            totalapagar=total-descuento
        }else {
            descuento=total*0.4
            totalapagar = total - descuento
        }
        binding.txtdescuento.setText("- $descuento")
        binding.txttotal.setText(total.toString())
        binding.txtTotalCosto2.setText(totalapagar.toString())
    }
}