package com.example.aprendendokotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aprendendokotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saveNameButton.setOnClickListener {
            var nome = binding.nameTextFormField.text.toString()
            binding.nameTextView.text = "Olá $nome"
        }
    }
}