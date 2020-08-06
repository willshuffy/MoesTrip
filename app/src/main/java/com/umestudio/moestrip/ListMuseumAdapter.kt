package com.umestudio.moestrip

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListMuseumAdapter(private val listMuseum: ArrayList<Museum>) : RecyclerView.Adapter<ListMuseumAdapter.ListViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.row_item_museum, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMuseum.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
            val (name, address, detail,transjakarta,commuterline, trainstation, mrtstation, photo) = listMuseum[position]

        holder.tvName.text = name
        holder.tvAddress.text = address
        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(64,64))
            .into(holder.imgPhoto)

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val intentDetail = Intent(mContext, DetailActivity::class.java)
            intentDetail.putExtra(DetailActivity.EXTRA_NAME, name)
            intentDetail.putExtra(DetailActivity.EXTRA_ADDRESS, address)
            intentDetail.putExtra(DetailActivity.EXTRA_DESC, detail)

            intentDetail.putExtra(DetailActivity.EXTRA_TRANSJAKARTA, transjakarta)
            intentDetail.putExtra(DetailActivity.EXTRA_COMMUTER, commuterline)
            intentDetail.putExtra(DetailActivity.EXTRA_TRAIN, trainstation)
            intentDetail.putExtra(DetailActivity.EXTRA_MRT, mrtstation)
            intentDetail.putExtra(DetailActivity.EXTRA_PHOTO, photo)
            mContext.startActivity(intentDetail)
        }
    }

    inner class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tvName: TextView = itemView.findViewById(R.id.tv_name)
        var tvAddress: TextView = itemView.findViewById(R.id.tv_address)
        var imgPhoto: ImageView = itemView.findViewById(R.id.iv_poster_image)

    }
}