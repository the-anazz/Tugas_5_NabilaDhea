package com.example.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.login.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
    private var binding: ActivityRecyclerViewBinding? = null
    private var produkAdapter: MyAdapter? = null
    private var listProduk: ArrayList<ItemData>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        listProduk = ArrayList()

        listProduk!!.add(
            ItemData(
                R.drawable.arumanis,
                "Mangga Arumanis",
                "Rasa manis legit, daging tebal tanpa serat."
            )
        )
        listProduk!!.add(
            ItemData(
                R.drawable.mentah,
                "Mangga Gedong",
                "Aroma harum khas, kulit kuning kemerahan."
            )
        )
        listProduk!!.add(
            ItemData(
                R.drawable.masak,
                "Mangga Manalagi",
                "Segar, sedikit asam dan manis berpadu."
            )
        )
        listProduk!!.add(
            ItemData(
                R.drawable.madu,
                "Mangga Indramayu",
                "Besar, manis, dan daging buah yang padat."
            )
        )
        listProduk!!.add(
            ItemData(
                R.drawable.merah,
                "Mangga Golek",
                "Panjang ramping, tekstur lembut dan manis."
            )
        )
        listProduk!!.add(
            ItemData(
                R.drawable.kwemi,
                "Mangga Kweni",
                "Aroma kuat, cocok untuk rujak atau jus."
            )
        )

        binding!!.RVBuah.layoutManager = LinearLayoutManager(this)
        binding!!.RVBuah.setHasFixedSize(true)

        produkAdapter = MyAdapter(listProduk!!)
        binding!!.RVBuah.adapter = produkAdapter

        binding!!.btnback.setOnClickListener {
            val intent = Intent(this@RecyclerViewActivity, dashboard::class.java)
            startActivity(intent)
            finish()
        }
    }
}