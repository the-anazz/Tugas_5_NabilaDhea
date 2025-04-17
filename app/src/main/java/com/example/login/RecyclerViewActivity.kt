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
                "Spesimen manis dari dunia permanggaan." +
                        "Di Duniapermanggaan, Arumanis tampil sebagai bintang utama karena legitnya kebangetan dan dagingnya tuh tebal, gak nyusahin karena zero serat! Kalo mangga bisa jadi love language, Arumanis ini definitely “acts of sweetness.” \uD83D\uDE0B✨"
            )
        )
        listProduk!!.add(
            ItemData(
                R.drawable.mentah,
                "Mangga Gedong",
                "Si cantik beraroma khas.\n" +
                        "Kulitnya kuning kemerahan kayak blushing waktu dipuji, dan aromanya bisa nyeret kamu ke memory masa kecil. Ini mangga yang gak cuma enak dilihat, tapi juga ngasih vibes nostalgic tiap dicium. Bukan mantan, tapi susah dilupain. \uD83D\uDE0C\uD83C\uDF3C"
            )
        )
        listProduk!!.add(
            ItemData(
                R.drawable.masak,
                "Mangga Manalagi",
                "Rasa kompromi antara dua dunia.\n" +
                        "Asam? Iya. Manis? Jelas. Manalagi tuh kayak zodiak Libra-nya mangga—seimbang dan memuaskan. Cocok buat kamu yang suka rasa-rasa ‘campur tapi enak’. Rasanya tuh kayak plot twist, awalnya bikin merem, akhirnya ketagihan."
            )
        )
        listProduk!!.add(
            ItemData(
                R.drawable.madu,
                "Mangga Indramayu",
                "Besar, padat, dan no drama.\n" +
                        "Dia gak suka basa-basi. Dagingnya padat, manisnya to the point. Kalo mangga bisa jadi sahabat, ini yang paling loyal—selalu bikin kenyang batin dan perut. Legitnya bukan main, kayak temen yang ngerti kamu banget. \uD83C\uDF6F\uD83D\uDCAA."
            )
        )
        listProduk!!.add(
            ItemData(
                R.drawable.merah,
                "Mangga Golek",
                "Elegan, ramping, dan lembut.\n" +
                        "Golek itu mangga yang vibes-nya classy banget. Badannya ramping, rasanya soft dan manisnya tuh bikin melting. Cocok buat yang suka elegan tanpa banyak effort. Gak heran ini jadi salah satu mangga paling estetik di dunia permanggan. \uD83C\uDFA8\uD83D\uDC51"
            )
        )
        listProduk!!.add(
            ItemData(
                R.drawable.kwemi,
                "Mangga Kweni",
                "Spesialis rujak dan jus.\n" +
                        "Aromanya strong kayak kepribadian kamu pas lagi pede. Dia bukan mangga yang buat disimpan diem-diem, tapi buat diblender, ditumbuk, dan ditonjok sama sambel rujak! Kweni tuh soul-nya rujak party. \uD83C\uDF79\uD83D\uDD25"
            )
        )
        listProduk!!.add(
            ItemData(
                R.drawable.mengkal,
                "berbagai jenis Mangga mengkal",
                "Masih muda, tapi udah punya potensi.\n" +
                        "Mangga mengkal ini kayak anak muda berprestasi. Meskipun belum mateng sempurna, tapi rasanya udah berani nunjukin karakter. Asamnya menggoda, teksturnya mantap, dan cocok banget buat dijadiin rujak yang crunchy gitu. \uD83E\uDD72✨"
            )
        )
        listProduk!!.add(
            ItemData(
                R.drawable.kupas,
                "mangga sudah dikupas",
                "Siap nikmat, tanpa drama kulit.\n" +
                        "Dikupas rapi kayak lagi skincare-an. Mangga ini tuh udah siap santap, tinggal hajar aja. Cocok buat yang anti ribet tapi tetap pengen nyicip kualitas museum. Sumpah ini definisi “udah ready tapi masih classy.” \uD83E\uDDFC\uD83C\uDF7D\uFE0F"
            )
        )
        listProduk!!.add(
            ItemData(
                R.drawable.potong,
                "mangga sudah dipotong",
                "All set buat dinikmatin.\n" +
                        "Bentuknya udah cakep, teksturnya menggoda. Dipotong kayak gini tuh bikin pengalaman museum jadi lebih interaktif. Gak cuma dilihat, tapi juga bikin mupeng. Eitsss, beli donggg~ ✂\uFE0F\uD83D\uDE0B"
            )
        )
        listProduk!!.add(
            ItemData(
                R.drawable.rujak,
                "rujak mangga muda",
                "Fusion budaya dan rasa.\n" +
                        "Ini hasil seni dari tangan-tangan kreatif rakyat + mangga muda. Sambelnya nampol, mangganya ngilu. Kalo museum biasanya menenangkan, bagian ini bikin kaget. Tapi... in a good way. \uD83C\uDF36\uFE0F\uD83D\uDCA5"
            )
        )
        listProduk!!.add(
            ItemData(
                R.drawable.pohon,
                "aneka pohon mangga",
                "Jejak sejarah si buah legendaris.\n" +
                        "Sebelum jadi buah kece di etalase, mereka tumbuh dari pohon-pohon ini. Bagian ini ngajak kamu balik ke asal-usul mangga, sambil kontemplasi: “Gimana ya hidupku kalau jadi pohon?” \uD83C\uDF33\uD83D\uDCDC"
            )
        )
//        // Tambahkan daftar gambar dulu
//        val gambarList = listOf(
//            R.drawable.arumanis,
//            R.drawable.mentah,
//            R.drawable.masak,
//            R.drawable.madu,
//            R.drawable.merah,
//            R.drawable.kwemi,
//            R.drawable.mengkal,
//            R.drawable.kupas,
//            R.drawable.potong,
//            R.drawable.rujak,
//            R.drawable.pohon
//        )
//
//// Baru lakukan pengulangan
//        for (i in 1..20) {
//            val gambar = gambarList[(i - 1) % gambarList.size]
//            listProduk!!.add(
//                ItemData(
//                    gambar,
//                    "Mangga $i",
//                    "Deskripsi buah ke-$i"
//                )
//            )
//        }

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