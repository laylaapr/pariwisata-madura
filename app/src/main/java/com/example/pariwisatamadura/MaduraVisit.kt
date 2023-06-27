package com.example.pariwisatamadura

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager

class MaduraVisit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_madura_visit)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@MaduraVisit, MainActivity::class.java))
            finish()
        }, 3000)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
    }
}