package com.umestudio.moestrip.view.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import com.umestudio.moestrip.R
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        //load animation
        val text_logo = AnimationUtils.loadAnimation(this,
            R.anim.bottom_to_top
        )
        val image_logo = AnimationUtils.loadAnimation(this,
            R.anim.top_to_bottom
        )
        val text_desk = AnimationUtils.loadAnimation(this,
            R.anim.icon_splash
        )


        //run animation
        iv_logo_text.startAnimation(text_logo)
        iv_logo.startAnimation(image_logo)
        tv_desk.startAnimation(text_desk)

        var handler = Handler()
        handler.postDelayed({
            val intent = Intent(this@SplashScreenActivity,
                GetStartedActivity::class.java)
            startActivity(intent)
            finish()
        }, 8000)
    }
}
