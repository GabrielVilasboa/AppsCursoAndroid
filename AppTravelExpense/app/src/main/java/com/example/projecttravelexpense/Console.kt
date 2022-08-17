package com.example.projecttravelexpense

import android.text.Editable
import android.view.View
import android.widget.EditText
import android.widget.Toast

class Console() {

    fun checkFloat(editText: EditText): Float? {
        if (!editText.text.toString().isNullOrEmpty()) {
            return (editText.text).toString().toFloat()
        }
        return null

    }

}