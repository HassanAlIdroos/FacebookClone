package com.example.facebookclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpActivity : AppCompatActivity() {
    lateinit var btnRegister: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        btnRegister = findViewById(R.id.btnRegister)
        btnRegister.setOnClickListener {
            finish()
        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}