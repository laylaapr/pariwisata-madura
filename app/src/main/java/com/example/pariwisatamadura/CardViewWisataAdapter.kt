package com.example.pariwisatamadura

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewWisataAdapter (private val listWisata: ArrayList<Wisata>, val pilihItem: OnItemClickListener) : RecyclerView.Adapter<CardViewWisataAdapter.CardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_wisata, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listWisata.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val wisata = listWisata[position]
        Glide.with(holder.itemView.context)
            .load(wisata.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = wisata.name
        holder.tvLok.text = wisata.lok
        holder.btnFavorite.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Favorite " + listWisata[position].name, Toast.LENGTH_SHORT).show()
        }

        holder.btnShare.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Share " + listWisata[position].name, Toast.LENGTH_SHORT).show()
        }

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Kamu memilih " + listWisata[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
            pilihItem.onItemClick(position)
        }
    }

    inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvLok: TextView = itemView.findViewById(R.id.tv_item_lok)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_set_favorite)
        var btnShare: Button = itemView.findViewById(R.id.btn_set_share)
    }
}