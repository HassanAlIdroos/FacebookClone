package com.example.facebookclone

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var etUsername: EditText
    lateinit var etPassword: EditText
    lateinit var btnLogin: Button
    lateinit var txtForgotPassword: TextView
    lateinit var txtSignUp: TextView
    val correctPassword = "tony"
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sharedPreferences = getSharedPreferences("isLoggedIn", Context.MODE_PRIVATE)
        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false)
        if(isLoggedIn){
            val intent = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        txtSignUp = findViewById(R.id.txtSignUp)

        btnLogin.setOnClickListener {
            val password = etPassword.text.toString()
            val intent = Intent(this@MainActivity, HomeActivity::class.java)

            if (password == correctPassword) {
                sharedPreferences.edit().putBoolean("isLoggedIn", true).apply()
                startActivity(intent)
            } else {
                Toast.makeText(
                        this@MainActivity,
                        "Invalid Username or Password",
                        Toast.LENGTH_SHORT
                ).show()
            }
        }
        txtForgotPassword.setOnClickListener {
            val intent = Intent(this@MainActivity,ForgotPasswordActivity::class.java)
            startActivity(intent)
        }
        txtSignUp.setOnClickListener {
            val intent = Intent(this@MainActivity,SignUpActivity::class.java)
            startActivity(intent)
        }
    }


    override fun onPause() {
        super.onPause()
        finish()
    }
}