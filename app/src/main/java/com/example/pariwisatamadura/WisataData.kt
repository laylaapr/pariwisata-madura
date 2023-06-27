package com.example.pariwisatamadura

object WisataData {
    private val wisataNames = arrayOf(
        "Bukit Pelalangan (Kapur) Arosbaya",
        "Bukit Jaddhih",
        "Mangrove Labuhan",
        "Pantai Hutan Kera Nepa",
        "Air Terjun Toroan",
        "Pantai Jumiang",
        "Kampoeng Toron Samalem",
        "Api Tak Kunjung Padam",
        "Gili Iyang",
        "Gili Labak",
        "Telaga Kermata",
        "Pantai Lombang",
        "Boekit Tinggi Daramista"
    )

    private val wisataLokasi = arrayOf(
        "Kabupaten Bangkalan, Buduran, Arosbaya, Plalangan Madura",
        "Kabupaten Bangkalan, Socah, Parseh, Jakan",
        "Kabupaten Bangkalan, Labuhan, Sepulu",
        "Kabupaten Sampang, Banyuates, Batioh, Duwa Asem",
        "Kabupaten Sampang, Ketapang, Talabang",
        "Kabupaten Pamekasan, Pademawu, Tanjung, Jumiang",
        "Kabupaten Pamekasan, Larangan, Blumbungan, Tambak",
        "Kabupaten Pamekasan, Tlanakan, Larangan Tokol",
        "Kabupaten Sumenep, Dungkek, Banraas, Pulau Gili Iyang",
        "Kabupaten Sumenep, Kombang, Talango, Pulau Gili Labak",
        "Kabupaten Sumenep, Saronggi, Bon Malang",
        "Kabupaten Sumenep, Batang-batang, Lombang",
        "Kabupaten Sumenep, Lenteng, Daramesta, Billa Tompok"
    )

    private val wisataDetails = arrayOf(
        "Bukit Kapur Arosbaya adalah sebuah kawasan wisata yang terbentuk dari bekas sisa galian dan kerukan penambang batu kapur dan tanah liat yang dilakukan oleh warga setempat",
        "Bukit Jaddih, Area pertambangan bebatuan kapur putih yang tersohor karena keindahannya & latar populer untuk berfoto dengan tebing kapur & naik perahu di kolam.",
        "Taman Pendidikan Mangrove Labuhan ini terletak di desa Labuhan Kecamatan Sepulu atau sekitar 40 Km dari arah utara Kota Bangkalan sebelum Pantai Siring Kemuning. Kawasan hutan Mangrove Labuhan ini sebenarnya adalah bekas kawasan tambak yang diubah menjadi area konservasi Mangrove. Kemudian dikembangkan menjadi Taman Pendidikan Mangrove oleh Kelompok Tani Mangrove “Cemara Sejahtera” yang merupakan kelompok binaan PT. Pertamina Hulu Energi West Madura Offshore.",
        "Obyek wisata di Madura kali ini yang akan kita bahas adalah Pantai Nepa, yaitu pantai yang terletak di Desa Batioh, Kecamatan Banyuates, Kabupaten Sampang, Madura. Pantai ini juga menjadi satu dengan destinasi wisata menarik lainnya yaitu Hutan Kera Nepa. Meskipun letaknya yang sedikit terpencil dan agak jauh dari pusat kota, banyak wisatawan yang mulai tertarik untuk mengunjungi tempat ini dikarenakan pantai ini masih terbilang jarang tersentuh tangan-tangan jahil manusia.",
        "Air Terjun Toroan berada di tepi Pantai Nepa, inilah mengapa alirannya langsung menuju laut. Dan di Madura, hanya air terjun inilah yang berlokasi di tepi pantai. Air terjun yang memiliki ketinggian 20 meter ini sangatlah mempesona.",
        "Pantai Jumiang adalah salah satu obyek wisata bahari di Pamekasan yang menawarkan berbagai pemandangan dan keindahan alami. Selain itu, sekelompok tebing karang yang terdapat di sekitar pantai menyajikan panorama tersendiri yang sangat menarik dan eksotik. Uniknya lagi, mungkin yang jarang kalian temukan di pantai lain, di sini ada beberapa tanaman kaktus yang tumbuh di dekat area pantai. Ada juga sebuah tambak garam yang di sana anda bisa melihat bagaimana garam-garam dari laut diolah.",
        "Kampoeng Wisata Toron Samalem, itulah nama tempat wisata yang sedang hits di daerah Pamekasan. Objek wisata ini dulunya adalah bekas tempat penambangan batu yang sudah tidak digunakan lagi. Berkat kekreatifan penduduk sekitar tempat yang awalnya nampak biasa saja kini disulap menjadi sebuah destinasi wisata yang instagenic.",
        "Wisata api alam yang dikenal memiliki api abadi di Kabupaten Pamekasan Madura merupakan satu dari sekian banyak api alam yang ada di dunia. Keunikan dari wisata api tak kunjung padam ini adalah semburan api yang berasal dari bawah permukaan tanah atau perut bumi. Hebatnya, meski diguyur air api di sini akan tetap menyala.",
        "Sebuah pulau kecil di antara gugusan pulau-pulau di sebelah timur Pulau Madura, salah satu alasan kenapa traveller harus datang ke Gili Iyang karena pulau ini memiliki kandungan oksigen yang amazing luar biasa, bagi yang penget awet muda silahkan di mari. pas banget yang suka Gua, terdapat lebih dari 10 Gua di Gili Iyang.",
        "Gili Labak adalah sebuah pulau kecil menawan yang terletak di Selat Madura, tepatnya disebelah Tenggara Pulau Madura yang masuk dalam wilayah administrasi Kecamatan Talango Kabupaten Sumenep Madura Jawa Timur. Pulau Gili Labak memiliki luas hanya sekitar 5 hektar yang dihuni kurang lebih 35 kepala keluarga saja",
        "Sesuai dengan namanya, wisata ini memiliki keindahan telaga yang indah. Anda dapat melihat dasar telaga dan ikan-ikan yang berkeliaran karena telaganya bening dan jernih. Destinasi permainan air yang ada di telaga kermata antara lain, sepeda air, speat boat, perahu wisata, dan perahu karet. Tidak hanya itu, anda juga dapat memberi makanan pada ikan-ikan sambil menaiki salah satu destinasi tersebut.",
        "Hamparan pasir putih yang lembut langsung menyambut anda sesaat anda tiba di Pantai Lombang. Semilir angin yang begitu terasa menyejukan membawa bau air laut yang pastinya bisa langsung merefresh pikiran anda. Dari kejauhan anda bisa melihat pemandangan air laut yang gemerlapan dengan cahaya matahari, semakin menambah keelokan pemandangan yang ada. anda bisa menikmati pantai di bawah rindangnya pohon cemara udang yang ada di sana.",
        "Boekit Tinggi Daramista adalah salah satu wisata alam yang berada di sebuah bukit di daerah Sumenep. Menyuguhkan panorama yang sangat enak di pandang, serta memberikan spot foto yang kekinian banget. Boekit Tinggi Daramista seakan membuka mata para pengunjung untuk menyaksikan keindahan bumi Sumenep yang terpampang jelas didepan mata."
    )

    private val wisataTiket = arrayOf(
        "Rp 5.000",
        "Rp 20.000",
        "Rp 25.000",
        "Rp 5.000",
        "Gratis",
        "Rp 3.000",
        "Rp 10.000",
        "Gratis",
        "Gratis",
        "Gratis",
        "Rp 15.000",
        "Rp 5.000",
        "Rp 5.000"
    )

    private val wisataJam = arrayOf(
        "09.00-17.00 WIB",
        "07.00-16.00 WIB",
        "07.00-17.00 WIB",
        "06.00-19.00 WIB",
        "24 jam",
        "06.00-17.00 WIB",
        "07.00-17.00 WIB",
        "24 jam",
        "24 jam",
        "24 jam",
        "07.00-20.00 WIB",
        "24 jam",
        "06.00-22.00 WIB"
    )

    private val wisataImages = intArrayOf(
        R.drawable.bukit_kapur,
        R.drawable.bukit_jaddih,
        R.drawable.mangrove_labuhan,
        R.drawable.pantai_nepa,
        R.drawable.air_terjun,
        R.drawable.jumiang,
        R.drawable.toron_semalem,
        R.drawable.api_tak_kunjung_padam,
        R.drawable.gili_iyang,
        R.drawable.gili_labak,
        R.drawable.kermata,
        R.drawable.pantai_lombang,
        R.drawable.dramamista
    )

    val listData: ArrayList<Wisata>
        get() {
            val list = arrayListOf<Wisata>()
            for (position in wisataNames.indices) {
                val wisata = Wisata()
                wisata.name = wisataNames[position]
                wisata.lok = wisataLokasi[position]
                wisata.detail = wisataDetails[position]
                wisata.jam = wisataJam[position]
                wisata.tiket = wisataTiket[position]
                wisata.photo = wisataImages[position]
                list.add(wisata)
            }
            return list
        }
}
