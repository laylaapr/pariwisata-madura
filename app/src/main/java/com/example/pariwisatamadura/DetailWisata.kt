package com.example.pariwisatamadura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailWisata : AppCompatActivity() {
    private var list:ArrayList<Wisata> = arrayListOf()

    companion object {
        const val EXTRA_POSISI = "extra_pos"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_wisata)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
        getSupportActionBar()?.setDisplayShowHomeEnabled(true)

        list.addAll(WisataData.listData)
        val tvNama: TextView = findViewById(R.id.data_judul)
        val tvKonten: TextView = findViewById(R.id.data_desc)
        val tvAlamat: TextView = findViewById(R.id.data_lokasi)
        val tvJam: TextView = findViewById(R.id.data_jam)
        val tvTiket: TextView = findViewById(R.id.data_harga)
        val tvWisata: ImageView = findViewById(R.id.data_foto)

        val pos = intent.getIntExtra(EXTRA_POSISI, 0)
        val pilih:Wisata = list[pos]

        Glide.with(this)
            .load(pilih.photo)
            .apply(RequestOptions())
            .into(tvWisata)
        tvNama.text = pilih.name
        tvKonten.text = pilih.detail
        tvAlamat.text = ": " + pilih.lok
        tvJam.text = ": " + pilih.jam
        tvTiket.text = ": " + pilih.tiket

        supportActionBar?.title = pilih.name
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed();
        return true;
    }
}
