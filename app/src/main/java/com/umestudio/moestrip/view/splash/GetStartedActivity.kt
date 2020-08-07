package com.umestudio.moestrip.view.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.umestudio.moestrip.R
import com.umestudio.moestrip.view.MainActivity
import kotlinx.android.synthetic.main.activity_get_started.*

class GetStartedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)

        //load animation
        val image_logo = AnimationUtils.loadAnimation(this,
            R.anim.top_to_bottom
        )
        val quote_logo = AnimationUtils.loadAnimation(this,
            R.anim.bottom_to_top
        )
        val btn_trans = AnimationUtils.loadAnimation(this,
            R.anim.left_to_right
        )

        //run animation
        iv_logo_jelajah.startAnimation(image_logo)
        iv_quote.startAnimation(quote_logo)
        btn_next.startAnimation(btn_trans)

        btn_next.setOnClickListener {
            val intent = Intent(
                this@GetStartedActivity,
                MainActivity::class.java
            )
            startActivity(intent)
            finishAffinity()
        }
    }
}
