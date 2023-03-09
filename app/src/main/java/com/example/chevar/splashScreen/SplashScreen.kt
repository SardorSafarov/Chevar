package com.example.chevar.splashScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.chevar.MainActivity
import com.example.chevar.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {
    lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        object :CountDownTimer(5500,5000){
            override fun onTick(p0: Long) {}
            override fun onFinish() {
            startActivity(Intent(this@SplashScreen,MainActivity::class.java))
                finish()
            }

        }.start()
    }
}