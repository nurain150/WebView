package com.azhamudev.kotlinproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule
import com.google.android.gms.ads.MobileAds;


class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
    MobileAds.initialize(this) {}
    
    

        Timer().schedule(3000) {
            val intent = Intent(applicationContext, WebViewActivity::class.java)
            startActivity(intent)
            finish()
        }
    }


}