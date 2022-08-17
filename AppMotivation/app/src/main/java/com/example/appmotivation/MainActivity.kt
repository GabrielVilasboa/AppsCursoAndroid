package com.example.appmotivation

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.appmotivation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        handleName()

        binding.buttonTradeText.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        binding.textMotivation.text = "texto teste '-'"
    }

    private fun handleName(){
        val name = SecurityPreferences(this).getNameUser("USER_NAME")
        binding.helloUser.text =  "Olá, $name!"
    }
}