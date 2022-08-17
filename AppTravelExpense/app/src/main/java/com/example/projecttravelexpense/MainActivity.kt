package com.example.projecttravelexpense

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.projecttravelexpense.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    val console = Console()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        calculator()
    }

    fun calculator() {
        val totalValue = binding.totalValue
        val totalKm = console.checkFloat(binding.distance) ?: -1f
        val pricePerLiter = console.checkFloat(binding.price) ?: -1f
        val autonomy = console.checkFloat(binding.autonomy) ?: -1f

        if (totalKm != -1f && pricePerLiter != -1f && autonomy != -1f) {

            val total = (totalKm / autonomy * pricePerLiter)
            val totalStr = "R$ ${("%.2f").format(total)}"

            totalValue.text = totalStr
        }else{
            Toast.makeText(this, "Coloca informação ai irmão", Toast.LENGTH_SHORT).show()
        }
    }
}