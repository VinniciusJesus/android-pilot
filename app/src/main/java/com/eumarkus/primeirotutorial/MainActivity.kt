package com.eumarkus.primeirotutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eumarkus.primeirotutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOla.setOnClickListener {
            val nome = binding .editName.text.toString()
            binding.txtResult.text = "Olá $nome!"
        }
    }
}