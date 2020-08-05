package com.umestudio.moestrip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvMuseums: RecyclerView
    private var list: ArrayList<Museum> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMuseums = findViewById(R.id.rv_museum)
        rvMuseums.setHasFixedSize(true)

        list.addAll(MuseumsData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvMuseums.layoutManager = LinearLayoutManager(this)
        val listMuseumAdapter = ListMuseumAdapter(list)
        rvMuseums.adapter = listMuseumAdapter
    }
}
