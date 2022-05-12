package edu.pe.idat.eva_continua01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import edu.pe.idat.eva_continua01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEjercicio1.setOnClickListener(this)
        binding.btnEjercicio2.setOnClickListener(this)
        binding.btnEjercicio3.setOnClickListener(this)
        binding.btnEjercicio4.setOnClickListener(this)

    }

    override fun onClick(p0: View) {

        if (p0.id == R.id.btnEjercicio1) {
            val intent = Intent(applicationContext, Ejercicio01::class.java)
            startActivity(intent)
        } else if (p0.id == R.id.btnEjercicio2) {
            val intent = Intent(applicationContext, Ejercicio02::class.java)
            startActivity(intent)
        } else if (p0.id == R.id.btnEjercicio3) {
            val intent = Intent(applicationContext, Ejercicio03::class.java)
            startActivity(intent)
        } else if (p0.id == R.id.btnEjercicio4){
            val intent = Intent(applicationContext, Ejercicio04::class.java)
            startActivity(intent)
        }
    }

}