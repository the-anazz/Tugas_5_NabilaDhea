package com.example.login

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val dataList: ArrayList<ItemData>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img: ImageView = itemView.findViewById(R.id.imageView)
        val nama: TextView = itemView.findViewById(R.id.namaBuah)
        val ket: TextView = itemView.findViewById(R.id.ketBuah)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_data, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = dataList[position]
        holder.img.setImageResource(currentItem.image)
        holder.nama.text = currentItem.nama
        holder.ket.text = currentItem.deskripsi

        // Tambahkan fungsi klik item di sini
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("img", currentItem.image)
            intent.putExtra("nama", currentItem.nama)
            intent.putExtra("ket", currentItem.deskripsi)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = dataList.size
}
