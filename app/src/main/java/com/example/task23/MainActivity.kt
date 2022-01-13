package com.example.task23

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val thread = MyThread(this)
        thread.start()
    }
}

// Делаю вид что, что-то грузится
class MyThread(val context: MainActivity): Thread(){

    override fun run() {
        sleep(3000)
        context.startActivity(Intent(context, LoginActivity::class.java))
        context.finish()
    }
}