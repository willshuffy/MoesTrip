package com.umestudio.moestrip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_ADDRESS = "extra_address"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_PHOTO = "extra_photo"

        const val EXTRA_TRANSJAKARTA = "extra_transjakarta"
        const val EXTRA_COMMUTER = "extra_commuter"
        const val EXTRA_TRAIN = "extra_train"
        const val EXTRA_MRT = "extra_mrt"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName: TextView = findViewById(R.id.tv_nama_museum)
        val tvAddress: TextView = findViewById(R.id.tv_address_museum)
        val tvDesc: TextView = findViewById(R.id.tv_desc)

        val tvTransjakarta: TextView = findViewById(R.id.tv_transjakarta)
        val tvCommuter: TextView = findViewById(R.id.tv_krl)
        val tvTrain: TextView = findViewById(R.id.tv_kereta)
        val tvMrt: TextView = findViewById(R.id.tv_mrt)
        val ivPhoto: ImageView = findViewById(R.id.iv_poster)

        val getName = intent.getStringExtra(EXTRA_NAME)
        val getAddress = intent.getStringExtra(EXTRA_ADDRESS)
        val getDesc = intent.getStringExtra(EXTRA_DESC)

        val getTransjakarta = intent.getStringExtra(EXTRA_TRANSJAKARTA)
        val getCommuter = intent.getStringExtra(EXTRA_COMMUTER)
        val getTrain = intent.getStringExtra(EXTRA_TRAIN)
        val getMrt = intent.getStringExtra(EXTRA_MRT)
        val getPhoto = intent.getStringExtra(EXTRA_PHOTO)


        tvName.text = getName
        tvAddress.text = getAddress
        tvDesc.text = getDesc
        Glide.with(this)
            .load(getPhoto)
            .apply(RequestOptions())
            .into(ivPhoto)

        tvTransjakarta.text = getTransjakarta
        tvCommuter.text = getCommuter
        tvTrain.text = getTrain
        tvMrt.text = getMrt
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
