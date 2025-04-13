package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Mengambil data yang dikirimkan melalui Intent
        val image = intent.getIntExtra("img", 0)
        val nama = intent.getStringExtra("nama")
        val deskripsi = intent.getStringExtra("ket")

        // Menghubungkan dengan komponen di layout
        val detailImage: ImageView = findViewById(R.id.detailImage)
        val detailNama: TextView = findViewById(R.id.detailNama)
        val detailKet: TextView = findViewById(R.id.detailKet)

        // Menampilkan data
        detailImage.setImageResource(image)
        detailNama.text = nama
        detailKet.text = deskripsi

        // Button Back untuk kembali ke RecyclerViewActivity
        val btnBack: Button = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            // Kembali ke halaman RecyclerViewActivity
            val intent = Intent(this@DetailActivity, RecyclerViewActivity::class.java)
            startActivity(intent)
            finish()  // Menutup DetailActivity agar tidak kembali lagi ke sana jika menekan tombol back
        }
    }
}
