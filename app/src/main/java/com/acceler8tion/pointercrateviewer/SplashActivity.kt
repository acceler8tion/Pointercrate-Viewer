package com.acceler8tion.pointercrateviewer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val intent = Intent(this, MainActivity::class.java)
        CoroutineScope(Dispatchers.Unconfined).launch {
            delay(200L)
            startActivity(intent)
            finish()
        }
    }
}