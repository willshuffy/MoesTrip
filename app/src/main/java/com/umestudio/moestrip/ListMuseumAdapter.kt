package com.umestudio.moestrip

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
        val museum = listMuseum[position]

        Glide.with(holder.itemView.context)
            .load(museum.photo)
            .apply(RequestOptions().override(64,64))
            .into(holder.imgPhoto)


        holder.tvName.text = museum.name
        holder.tvAddress.text = museum.address
    }

    inner class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tvName: TextView = itemView.findViewById(R.id.tv_name)
        var tvAddress: TextView = itemView.findViewById(R.id.tv_address)
        var imgPhoto: ImageView = itemView.findViewById(R.id.iv_poster_image)

    }
}