package com.umestudio.moestrip.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.PopupMenu
import androidx.appcompat.app.AlertDialog
import com.umestudio.moestrip.R
import kotlinx.android.synthetic.main.activity_about.*
import kotlinx.android.synthetic.main.activity_about.iv_back
import kotlinx.android.synthetic.main.activity_about.iv_menu
import kotlinx.android.synthetic.main.logout_dialog.view.*

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        //load animation
        val profpict_anim = AnimationUtils.loadAnimation(this,
            R.anim.top_to_bottom
        )
        val name_anim = AnimationUtils.loadAnimation(this,
            R.anim.top_to_bottom
        )
        val email_anim = AnimationUtils.loadAnimation(this,
            R.anim.top_to_bottom
        )

        val source_box_anim = AnimationUtils.loadAnimation(this,
            R.anim.bottom_to_top
        )
        val source_anim = AnimationUtils.loadAnimation(this,
            R.anim.bottom_to_top
        )


        //run animation
        iv_profpict.startAnimation(profpict_anim)
        tv_name.startAnimation(name_anim)
        tv_email.startAnimation(email_anim)

        iv_source.startAnimation(source_box_anim)
        tv_source.startAnimation(source_anim)

        iv_menu.setOnClickListener {
            showPopUp(iv_menu)
        }

        iv_back.setOnClickListener {
            finish()
        }
    }

    private fun showPopUp(view: View){

        val popup = PopupMenu(this, view)
        popup.inflate(R.menu.menu_main)

        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item: MenuItem? ->

            when (item!!.itemId){
                R.id.action_favorite -> {
                }
                R.id.action_about -> {
                    val intent = Intent(this@AboutActivity, AboutActivity::class.java)
                    startActivity(intent)
                }
                R.id.action_exit -> {
                    val view = LayoutInflater.from(this).inflate(R.layout.logout_dialog, null)
                    val alert = AlertDialog.Builder(this,
                        R.style.CustomAlertDialog
                    )
                        .setView(view)
                        .setCancelable(false)

                    val mAlertDialog = alert.show()
                    mAlertDialog?.window?.setLayout(700, 500)

                    view.btn_iya.setOnClickListener {
                        finishAffinity()
                    }
                    view.btn_tidak.setOnClickListener {
                        mAlertDialog.dismiss()
                    }
                }
            }
            true
        })
        popup.show()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
