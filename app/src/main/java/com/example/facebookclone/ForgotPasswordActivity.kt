package com.example.facebookclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ForgotPasswordActivity : AppCompatActivity() {
    lateinit var btnSubmit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        title = "Forgot Password?"
        btnSubmit = findViewById(R.id.btnSubmit)
        btnSubmit.setOnClickListener {
            finish()
        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}