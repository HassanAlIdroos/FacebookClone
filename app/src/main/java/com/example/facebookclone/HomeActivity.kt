package com.example.facebookclone

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    var titleName:String?="Facebook"
    lateinit var btnLogout: Button
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        sharedPreferences=getSharedPreferences("isLoggedIn", Context.MODE_PRIVATE)
        title = titleName
        btnLogout=findViewById(R.id.btnLogout)
        btnLogout.setOnClickListener {
            sharedPreferences.edit().clear().apply()
            finish()
        }
    }
}