package com.example.empregaeu4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.empregaeu4.databinding.ActivityTela2Binding
import com.example.empregaeu4.databinding.ActivityTela3Binding

class Tela3Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTela3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTela3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setContentView(R.layout.activity_tela3)
    }
}