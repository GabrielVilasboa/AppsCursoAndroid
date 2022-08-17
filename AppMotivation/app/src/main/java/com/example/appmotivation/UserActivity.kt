package com.example.appmotivation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.appmotivation.databinding.ActivityUserBinding

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
        if(view.id == R.id.button_save){
            handleSave()
        }

    }

    fun handleSave(){
        val name = binding.editName.text.toString()

        if (name != ""){
            SecurityPreferences(this).storeNameUser("USER_NAME", name)
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }else{
            Toast.makeText(this, getString(R.string.insert_name), Toast.LENGTH_SHORT).show()
        }


    }
}