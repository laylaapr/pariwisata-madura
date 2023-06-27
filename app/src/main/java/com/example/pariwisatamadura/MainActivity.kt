package com.example.pariwisatamadura

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(),  OnItemClickListener {
    private lateinit var rvWisata: RecyclerView
    private var list: ArrayList<Wisata> = arrayListOf()
    private var position = 0
    private var title: String = "Wisata Madura"

    override fun onItemClick(position: Int) {
        val intent = Intent(this, DetailWisata::class.java)
        this.position = position
        intent.putExtra(DetailWisata.EXTRA_POSISI, position)
        startActivityForResult(intent, position)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvWisata = findViewById(R.id.rv_wisata)
        rvWisata.setHasFixedSize(true)

        list.addAll(WisataData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvWisata.layoutManager = LinearLayoutManager(this)
        val cardViewWisataAdapter = CardViewWisataAdapter(list, this)
        rvWisata.adapter = cardViewWisataAdapter
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_profile -> {
                val moveIntent = Intent(this@MainActivity, AboutMe::class.java)
                startActivity(moveIntent)
            }
        }
    }
}