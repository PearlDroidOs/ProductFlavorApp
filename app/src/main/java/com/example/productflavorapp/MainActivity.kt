package com.example.productflavorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.productflavorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtFlavor.text = "${BuildConfig.FLAVOR} ${BuildConfig.BUILD_TYPE} \n ${BuildConfig.APPLICATION_ID}"
    }
}