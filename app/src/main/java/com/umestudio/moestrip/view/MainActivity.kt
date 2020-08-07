package com.umestudio.moestrip.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.umestudio.moestrip.R
import com.umestudio.moestrip.recyclerview.ListMuseumAdapter
import com.umestudio.moestrip.recyclerview.models.Museum
import com.umestudio.moestrip.recyclerview.models.MuseumData
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.logout_dialog.view.*

class MainActivity : AppCompatActivity() {
    private lateinit var rvMuseums: RecyclerView
    private var list: ArrayList<Museum> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMuseums = findViewById(R.id.rv_museum)
        rvMuseums.setHasFixedSize(true)

        list.addAll(MuseumData.listData)
        showRecyclerList()

        iv_menus.setOnClickListener {
            showPopUp(iv_menus)
        }
    }

    private fun showRecyclerList() {
        rvMuseums.layoutManager = LinearLayoutManager(this)
        val listMuseumAdapter =
            ListMuseumAdapter(list)
        rvMuseums.adapter = listMuseumAdapter
    }

    private fun showPopUp(view: View) {

        val popup = PopupMenu(this, view)
        popup.inflate(R.menu.menu_main)

        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item: MenuItem? ->

            when (item!!.itemId) {
                R.id.action_favorite -> {
                }
                R.id.action_about -> {
                    val intent = Intent(this@MainActivity, AboutActivity::class.java)
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

    override fun onBackPressed() {

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
