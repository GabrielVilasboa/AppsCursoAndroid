package com.example.appmotivation.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.appmotivation.R
import com.example.appmotivation.data.Mock
import com.example.appmotivation.databinding.ActivityMainBinding
import com.example.appmotivation.infra.MotivationConstants
import com.example.appmotivation.infra.SecurityPreferences

class MainActivity : AppCompatActivity(), View.OnClickListener {


    private lateinit var binding: ActivityMainBinding
    private var categoryId = MotivationConstants.FILTER.ALL

    //Variaveis para diminuir o nome das constantes.
    private val all = MotivationConstants.FILTER.ALL
    private val happy = MotivationConstants.FILTER.HAPPY
    private val sunny = MotivationConstants.FILTER.SUNNY

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Esconde barra
        supportActionBar?.hide()

        //Seleciona o botão image_all
        handleFilter(R.id.image_all)
        tradeText()

        //Eventos de Clique
        binding.buttonTradeText.setOnClickListener(this)
        binding.imageAll.setOnClickListener(this)
        binding.imageHappy.setOnClickListener(this)
        binding.imageSunny.setOnClickListener(this)
        binding.helloUser.setOnClickListener(this)

    }

    //Atualiza o nome do usuario na tela após coletar o nome do SharedPreferences
    override fun onResume() {
        super.onResume()
        handleName()
    }
    //Implementação dos cliques
    override fun onClick(view: View) {
        if (view.id == R.id.button_trade_text) {
            tradeText()
        } else if (view.id in listOf(R.id.image_all, R.id.image_happy, R.id.image_sunny)) {
            handleFilter(view.id)
        } else if (view.id == R.id.hello_user){
            startActivity(Intent(this, UserActivity::class.java))
        }
    }

    //Busca e exibe o nome do usúario
    private fun handleName() {
        val name = SecurityPreferences(this).getNameUser(MotivationConstants.KEY.USER_NAME)
        binding.helloUser.text = "Olá, $name!"
    }

    //muda a cor dos botões de acordo com o que está selecionado.
    private fun handleFilter(id: Int) {
        binding.imageAll.setColorFilter(ContextCompat.getColor(this, R.color.black))
        binding.imageHappy.setColorFilter(ContextCompat.getColor(this, R.color.black))
        binding.imageSunny.setColorFilter(ContextCompat.getColor(this, R.color.black))
        when (id) {
            R.id.image_all -> {
                binding.imageAll.setColorFilter(ContextCompat.getColor(this, R.color.white))
                categoryId = all
            }
            R.id.image_happy -> {
                binding.imageHappy.setColorFilter(ContextCompat.getColor(this, R.color.white))
                categoryId = happy
            }
            R.id.image_sunny -> {
                binding.imageSunny.setColorFilter(ContextCompat.getColor(this, R.color.white))
                categoryId = sunny
            }
        }
    }

    //troca o texto da tela.
    private fun tradeText() = Mock().getPhrase(categoryId).also { binding.textMotivation.text = it }
}


