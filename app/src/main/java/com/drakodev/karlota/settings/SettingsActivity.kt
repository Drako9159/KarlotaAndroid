 package com.drakodev.karlota.settings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.drakodev.karlota.R
import com.drakodev.karlota.databinding.ActivityDetailSuperheroBinding
import com.drakodev.karlota.databinding.ActivitySettignsBinding

 class SettingsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettignsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettignsBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}