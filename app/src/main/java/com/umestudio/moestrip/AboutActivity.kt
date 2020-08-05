package com.umestudio.moestrip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_about.*
import kotlinx.android.synthetic.main.activity_splash_screen.*

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        //load animation
        val profpict_anim = AnimationUtils.loadAnimation(this, R.anim.top_to_bottom)
        val name_anim = AnimationUtils.loadAnimation(this, R.anim.top_to_bottom)
        val email_anim = AnimationUtils.loadAnimation(this, R.anim.top_to_bottom)

        val source_box_anim = AnimationUtils.loadAnimation(this, R.anim.bottom_to_top)
        val source_anim = AnimationUtils.loadAnimation(this, R.anim.bottom_to_top)


        //run animation
        iv_profpict.startAnimation(profpict_anim)
        tv_name.startAnimation(name_anim)
        tv_email.startAnimation(email_anim)

        iv_source.startAnimation(source_box_anim)
        tv_source.startAnimation(source_anim)
    }
}
