package com.example.mynote

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

        Handler(Looper.getMainLooper()).postDelayed(Runnable {

            startActivity(Intent(this, MainActivity::class.java))
            //Toast.makeText(this,"going to the main activity", Toast.LENGTH_SHORT).show()

        }, 1000)


    }

    override fun onResume() {
        super.onResume()


        Handler(Looper.getMainLooper()).postDelayed(Runnable {

            startActivity(Intent(this, MainActivity::class.java))

        }, 2000)


    }


}