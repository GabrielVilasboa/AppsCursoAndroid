package com.example.appmotivation.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.appmotivation.R
import com.example.appmotivation.databinding.ActivityUserBinding
import com.example.appmotivation.infra.MotivationConstants
import com.example.appmotivation.infra.SecurityPreferences

class UserActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.buttonSave.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_save) {
            handleSave()
        }
    }

    private fun handleSave() {
        val name = binding.editName.text.toString()
        if (name != "") {
            SecurityPreferences(this).storeNameUser(MotivationConstants.KEY.USER_NAME, name)
            finish()
        } else {
            Toast.makeText(this, "Coloque um nome", Toast.LENGTH_SHORT).show()
        }
    }
}