package com.umestudio.moestrip

object MuseumsData {

    private val museumNames = arrayOf(
        "Museum Nasional",
        "Museum Kebangkitan Nasional",
        "Museum Sumpah Pemuda",
        "Monumen Nasional",
        "Gedung Joang 45",
        "Museum Fatahillah",
        "Museum Satria Mandala",
        "Museum Bahari",
        "Museum Perumusan Naskah Proklamasi",
        "Museum Bank Indonesia",
        "Museum Wayang",
        "Museum Telekomunikasi")

    private val museumAddress = arrayOf(
        "Jl.Medan Merdeka Barat 12, Jakarta Pusat",
        "Jl.Dr.Abdul Rahman Saleh No.26, Jakarta Pusat",
        "Jl.Kramat Raya No. 106, Jakarta Pusat",
        "Jl.Medan Merdeka Utara No.2, Gambir",
        "Jl.Menteng Raya 31, Jakarta Pusat",
        "Jl.Taman Fatahillah No. 1, Jakarta Barat",
        "Jl.Gatot Subroto No.14, Jakarta Selatan",
        "Jl.Ps.Ikan No.1, Jakarta Utara",
        "Jl.Imam Bonjol No.1, Jakarta Pusat",
        "Jl.Lada No.3,Pinangsia, Jakarta Barat",
        "Jl.Pintu Besar Utara 27, Jakarta Barat",
        "Area Tmii, Cipayung, Jakarta Timur")

    private val museumDetail = arrayOf(
        "Museum Nasional Republik Indonesia atau Museum Gajah, adalah sebuah museum arkeologi, sejarah, etnografi, dan geografi. Museum ini merupakan museum pertama dan terbesar di Asia Tenggara. \n\nMuseum Gajah banyak mengoleksi benda-benda kuno dari seluruh Nusantara. Antara lain yang termasuk koleksi adalah arca-arca kuno, prasasti, benda-benda kuno lainnya dan barang-barang kerajinan. Koleksi-koleksi tersebut dikategorisasikan ke dalam etnografi, perunggu, prasejarah, keramik, tekstil, numismatik, relik sejarah, buku langka dan benda berharga.",
        "Museum Kebangkitan Nasional (bahasa Inggris: Museum of National Awakening) adalah sebuah gedung yang dibangun sebagai monumen tempat lahir dan berkembangnya kesadaran nasional dan juga ditemukannya organisasi pergerakan modern pertama kali dengan nama Boedi Oetomo. \n\nSebelum menjadi museum, bangunan ini dahulunya adalah sekolah kedokteran yang didirikan oleh Belanda dengan nama School tot Opleiding van Inlandsche Artsen disingkat STOVIA atau Sekolah Dokter Bumiputra.[2] Dalam perjalanannya, gedung tersebut selalu beralih fungsi.[2] Lokasi museum ini tidak jauh dari Pasar Senen, tepatnya di Jalan Abdurrahman Saleh No.26, sebelum RSPAD Gatot Subroto, Jakarta Pusat.",
        "Museum Sumpah Pemuda adalah sebuah museum sejarah perjuangan kemerdekaan Republik Indonesia yang dikelola oleh Kementerian Pendidikan dan Kebudayaan Republik Indonesia.",
        "Monumen Nasional atau yang populer disingkat dengan Monas atau Tugu Monas adalah monumen peringatan setinggi 132 meter (433 kaki) yang didirikan untuk mengenang perlawanan dan perjuangan rakyat Indonesia untuk merebut kemerdekaan dari pemerintahan kolonial Hindia Belanda. \n\nPembangunan monumen ini dimulai pada tanggal 17 Agustus 1961 di bawah perintah presiden Sukarno dan dibuka untuk umum pada tanggal 12 Juli 1975. Tugu ini dimahkotai lidah api yang dilapisi lembaran emas yang melambangkan semangat perjuangan yang menyala-nyala. Monumen Nasional terletak tepat di tengah Lapangan Medan Merdeka, Jakarta Pusat.",
        "Gedung Joang '45 atau Museum Joang 45 adalah salah satu museum yang berada di Jakarta. Saat ini pengelolaannya dilaksanakan oleh Dinas Pariwisata dan Kebudayaan Provinsi DKI Jakarta. Museum ini diresmikan pada tahun 1974 oleh Presiden Soeharto, setelah dilakukan renovasi.",
        "Museum Fatahillah memiliki nama resmi Museum Sejarah Jakarta adalah sebuah museum dengan luas lebih dari 1.300 meter persegi. \n\nObjek-objek yang dapat ditemui di museum ini antara lain perjalanan sejarah Jakarta, replika peninggalan masa Tarumanegara dan Pajajaran, hasil penggalian arkeologi di Jakarta, mebel antik mulai dari abad ke-17 sampai 19, yang merupakan perpaduan dari gaya Eropa, Republik Rakyat Tiongkok, dan Indonesia.",
        "Museum Satria Mandala adalah museum sejarah perjuangan Tentara Nasional. Museum yang diresmikan pada tahun 1972 oleh mantan Presiden Indonesia, Soeharto ini awalnya adalah rumah dari salah satu istri mantan Presiden Indonesia, Soekarno, yaitu istrinya yang bernama Ratna Sari Dewi Soekarno. \n\nDalam museum ini dapat ditemui berbagai koleksi peralatan perang di Indonesia, dari masa lampau hingga modern seperti koleksi ranjau, rudal, torpedo, tank, meriam bahkan helikopter dan pesawat terbang (satu di antaranya adalah pesawat Cureng yang pernah diterbangkan oleh Marsekal Udara Agustinus Adisucipto).",
        "Museum Bahari adalah museum yang menyimpan koleksi yang berhubungan dengan kebaharian dan kenelayanan bangsa Indonesia dari Sabang hingga Merauke yang berlokasi di seberang Pelabuhan Sunda Kelapa. \n\nMuseum ini adalah salah satu dari delapan museum yang berada di bawah pengawasan dari Dinas Kebudayaan Permuseuman Provinsi Daerah Khusus Ibu kota Jakarta.",
        "Museum Perumusan Naskah Proklamasi atau disingkat dengan Munasprok adalah gedung yang dibangun sebagai monument peristiwa proses perumusan naskah proklamasi kemerdekaan di Indonesia. \n\nGedung luas tanah 3.914 meter persegi dan luas bangunan 1.138 meter persegi itu pertama kali didirikan pada tahun 1920 dengan gaya arsitektur Eropa. Di dalam gedung tersebut terdapat ruangan, mebel kuno, dan aksesoris yang menggambarkan suasana serupa peristiwa perumusan naskah proklamasi.",
        "Museum ini menyajikan informasi peran Bank Indonesia dalam perjalanan sejarah bangsa yang dimulai sejak sebelum kedatangan bangsa barat di Nusantara hingga terbentuknya Bank Indonesia pada tahun 1953 dan kebijakan-kebijakan Bank Indonesia, meliputi pula latar belakang dan dampak kebijakan Bank Indonesia bagi masyarakat sampai dengan tahun 2005.",
        "Museum Wayang memamerkan berbagai jenis dan bentuk wayang dari seluruh Indonesia, baik yang terbuat dari kayu dan kulit maupun bahan-bahan lain. Wayang-wayang dari luar negeri ada juga di sini, misalnya dari Republik Rakyat Tiongkok dan Kamboja. Hingga kini Museum Wayang mengkoleksi lebih dari 4.000 buah wayang, terdiri atas wayang kulit, wayang golek, wayang kardus, wayang rumput, wayang janur, topeng, boneka, wayang beber dan gamelan. \n\nUmumnya boneka yang dikoleksi di museum ini adalah boneka-boneka yang berasal dari Eropa meskipun ada juga yang berasal dari beberapa negara non-Eropa seperti Thailand, Suriname, Tiongkok, Vietnam, India dan Kolombia.",
        "Museum Telekomunikasi memamerkan berbagai koleksi dan informasi mengenai perkembangan pertelekomunikasian di Indonesia pada masa sebelum-masa perang-awal kemerdekaan, Orde Baru, dan masa depan telekomunikasi dunia, termasuk alat komunikasi dari masa ke masa. \n\nAlat telekomunikasi pra elektrik antara lain meliputi alat komunikasi tiup, kentongan/gendering, bedug, gong, dan lonceng. Alat telekomunikasi masa elektrik antara lain telegraph morse, sentral telepon manual lokal baterai, dan diorama pemancar radio perjuangan YBJ-6.")

    private val museumTransjakarta = arrayOf(
        "Monas, Museum Nasional",
        "Atrium, Kwitang",
        "Pal Putih, Museum Sumpah Pemuda",
        "Monas",
        "Mercu Buana Cikini",
        "Museum Fatahillah, Kota, BNI46, Kalibesar Barat",
        "Gatsu Jamsostek, GBK, Museum Satria Mandala, Polda",
        "Museum Bahari2, Jl.Krapu, Ps Ikan, Pintu Air Sunda Kelapa",
        "Pasar Rumput, Dukuh Atas",
        "Kota, Museum Bank Indonesia",
        "Kalibesar Barat, KOta",
        "Kampung Rambutan, Pinang Ranti, TMII Pintu 3, Garuda Tmn Mini")
    private val museumCommuter = arrayOf(
        "St.Tanah Abang, St.Juanda",
        "St.Pasar Senen, St.Juanda",
        "St.Pasar Senen",
        "St.Juanda, St.Pasar Senen",
        "St.Pasar Senen, St.Cikini",
        "St.Jakarta Kota",
        "St.Palmerah",
        "St.Jakarta Kota",
        "St.Sudirman, St.Cikini, St.Karet",
        "St.Jakarta Kota",
        "St.Jakarta Kota",
        "St.Pasar Minggu, St.Tanjung Barat")
    private val museumTrain = arrayOf(
        "St.Gambir",
        "St.Pasar Senen, St.Gambir",
        "St.Gambir",
        "St.Gambir",
        "St.Gambir",
        "St.Jakarta Kota",
        "-",
        "St.Jakarta Kota",
        "St.Gambir",
        "St.Jakarta Kota",
        "St.Jakarta Kota",
        "-")
    private val museumMrt = arrayOf(
        "Bunderan HI",
        "Bunderan HI",
        "-",
        "Bunderan HI",
        "Bunderan HI",
        "-",
        "Bendungan Hilir, Senayan",
        "-",
        "Dukuh Atas",
        "-",
        "-",
        "-")

    private val museumsImage = intArrayOf(
        R.drawable.museum_nasional,
        R.drawable.museum_kebangkitan_nasional,
        R.drawable.museum_sumpah_pemuda,
        R.drawable.monas,
        R.drawable.gedung_joang,
        R.drawable.museum_fatahillah,
        R.drawable.museum_satria_mandala,
        R.drawable.museum_bahari,
        R.drawable.museum_perumusan_proklamasi,
        R.drawable.museum_bank_indonesia,
        R.drawable.museum_wayang,
        R.drawable.museum_telekomunikasi)

    val listData: ArrayList<Museum>
        get() {
            val list = arrayListOf<Museum>()
            for (position in museumNames.indices){
                val museum = Museum()
                museum.name = museumNames[position]
                museum.address = museumAddress[position]
                museum.detail = museumDetail[position]
                museum.transjakarta = museumTransjakarta[position]
                museum.commuterline = museumCommuter[position]
                museum.trainstation = museumTrain[position]
                museum.mrtstation = museumMrt[position]
                museum.photo = museumsImage[position]
                list.add(museum)
            }
            return list
        }
}