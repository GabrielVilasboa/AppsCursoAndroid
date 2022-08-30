package com.example.appmotivation.infra

import android.content.Context
import android.content.SharedPreferences

class SecurityPreferences(context: Context) {

    private val security: SharedPreferences = context.getSharedPreferences("motivation", Context.MODE_PRIVATE)

    //método que guarda uma String e sua chave no SharedPreference.
    fun storeNameUser(key: String, string: String) {
        security.edit().putString(key, string).apply()
    }
    //método que procura e retorna uma string guardada no SharedPreferences utilizando a chave.
    fun getNameUser(key: String): String {
        return security.getString(key, "") ?: ""
    }
}