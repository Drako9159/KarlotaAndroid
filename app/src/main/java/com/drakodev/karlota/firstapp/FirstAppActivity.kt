package com.drakodev.karlota.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.drakodev.karlota.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName = findViewById<AppCompatEditText>(R.id.etName)

        btnStart.setOnClickListener {
            Log.i("Drakodev", "Button clicked")
            if(etName.text.toString().isNotEmpty()) {
                Log.i("Edit Text", etName.text.toString())
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", etName.text.toString())
                startActivity(intent)
            }

        }


    }
}