package com.acceler8tion.pointercrateviewer.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.acceler8tion.pointercrateviewer.R
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

    override fun onBackPressed() {
        //You can't escape!
    }
}