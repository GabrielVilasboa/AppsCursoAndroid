package com.example.appmotivation

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBar
import com.example.appmotivation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    var contClicks: Long = 0
    var click = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        handleName()

        binding.buttonTradeText.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        contClicks+=click
        binding.textMotivation.text = contClicks.toString()
    }

    private fun handleName(){
        val name = SecurityPreferences(this).getNameUser("USER_NAME")
        binding.helloUser.text =  "Olá, $name!"
    }
}