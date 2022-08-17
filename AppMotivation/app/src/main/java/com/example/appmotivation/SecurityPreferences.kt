package com.example.appmotivation

import android.content.Context
import android.content.SharedPreferences

class SecurityPreferences(context: Context) {

    private val security: SharedPreferences = context.getSharedPreferences("motivation", Context.MODE_PRIVATE)

    fun storeNameUser(key: String, string: String) {
        security.edit().putString(key, string).apply()
    }
    fun getNameUser(key: String): String {
        return security.getString(key, "") ?: ""
    }
}