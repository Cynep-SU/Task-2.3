package com.example.task23

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun RegOnclick(v: View){
        startActivity(Intent(this, Reg::class.java))
    }

    fun Login(v: View){
        startActivity(Intent(this, Profile::class.java))
    }
}