package com.ms.fityourself.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ms.fityourself.databinding.ActivitySplashBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
//        val splashScreen = installSplashScreen()

        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
       /* splashScreen.setKeepOnScreenCondition {

            true
        }*/
        setContentView(binding.root)
        val intent = Intent(this, HomeActivity::class.java)
        CoroutineScope(Dispatchers.IO).launch {
            delay(5000)
            startActivity(intent)
            finish()
        }

    }


}