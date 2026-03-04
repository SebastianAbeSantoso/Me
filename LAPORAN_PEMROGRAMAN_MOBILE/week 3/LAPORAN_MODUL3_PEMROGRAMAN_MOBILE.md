# Laporan Pemrograman Mobile
Nama : Sebastian Abe Santoso

NIM : 2410817210002
## Designing

### 4 Maret 2026

### Deskripsi

Saya menonton dan mencatat seluruh module 3, Designing. Mengerjakan exercise 3 dan 4, dan juga menyelesaikan laporan ini dalam hari ini.

### Insight

Saya disini dapat pemahaman berupa entitas, yang merupakan balok bangunan utama dalam sebuah domain, merepresentasikan sebuah konsep dalam dunia asli, seperti Customer, Driver, dll. Entitas bersifat abstrak, berarti bisa digambar pada diagram, tetapi tidak dapat diimplementasikan dalam kode secara langsung, perlu representasi seperti penggunaan model, contohnya dengan class, interface, type, ataupun service. 

Sebuah module juga merupakan balok bangunan, tetapi pada aplikasi. Ketika aplikasi dipecah, level pertama adalah membaginya menjadi module, kadang-kadang entitas memiliki hubungan 1:1 kepada module, tetapi tidak wajib. Selanjutnya adalah komponen, karena ini tidak abstrak, biasanya langsung terlihat di implementasinya pada kode.

Untuk mencari entitas serta atribut dan operasinya dapat menggunakan Domain Modeling, yaitu proses membuat sebuah gambaran sederhana mengenai entitas, atribut, perilaku, yang berguna untuk menjembatani antara kebutuhan dunia asli, dan implementasi teknis. Biasanya penggunaan kata benda mengindikasikan entitas, dan penggunaan kata kerja mengindikasikan operasi / aksi yang bisa dilakukan. Mengapa menggunakan Domain Modeling?
- Memberi nama konsisten antar entitas
- Meluruskan model data dengan spesifikasi UI
- Membangun tanggungjawab entitas

Dalam exercise 3, saya dapat penerangan mengenai Domain Modeling, entitas adalah sebuah konsep abstrak, saya pikir sebagai "sesuatu yang memiliki identitas, tahan lama, dan dapat dibedakan dengan yang lain", misalnya dalam universitas itu Mahasiswa, atau Dosen. Atribut bisa dijelaskan sebagai "apa yang dipunyai entitas" yang menggambarkan keadaannya, seperti Mahasiswa memiliki NIM atau Nama. Terakhir, operations, yaitu perilaku domain, lebih lengkapnya adalah "Perilaku atau fungsi yang secara logis menempel pada entitas dalam domain dan merepresentasikan aksi yang bermakna sesuai aturan bisnis. Contoh operasi adalah, misalnya untuk Mahasiswa, daftarKelas(idKelas), dan untuk Dosen, mengampuKelas(idKelas).

Sequence Diagram dalam exercise 4 juga menarik bagi saya, karena hanya belajar sekilas pada mata kuliah APS, tetapi ternyata sangat dibutuhkan untuk menggambarkan proses pada tingkat menengah, awal sampai akhir. Tetapi ribet membuatnya secara manual, sehingga lebih mudah untuk membuat flowchart untuk prototyping cepat, atau cuman proyek personal.

Hal terakhir yang memberi saya insight adalah Software Design Document yang dijelaskan oleh mentornya pada chapter terakhir module 3, karena sangat mirip dengan Game Design Document pada game development, keduanya membahas "Apa yang akan dibuat, dan mengapa?" Menjelaskan aturan, logika, struktur, komponen, serta meluruskan seluruh tim sebagai acuan untuk menyamakan pemikiran tentang apa yang ingin dibuat

### Impact

Sebelum belajar mengenai hal-hal seperti entitas, atribut, operasi saya tidak enggan untuk membuat function/class yang tidak terlalu memikirkan "apa" "kenapa" dan hubungannya bagaimana, tetapi sekarang saya memikir dua kali, karena bagi saya sekarang lebih penting menentukan hubungan antar module atau function daripada langsung coding, yang awalnya berasa seperti prosedural, menjadi berpikir separti komponen-komponen yang dijelaskan mentornya. Domain Modeling juga mempengaruhi saya dengan memberikan opsi visual ringan untuk mencari entitas, atribut, dan operasinya lebih mudah, seperti flowchart. Saya belum pernah berpikir bahwa entitas dan spesifikasi UI tersambung, tetapi saat dijelaskan mentor saya dapat penerangan, ternyata backend dan frontend sangat terkait, yang awalnya saya kira sangat pisan dan terenkapsulasi. Walau saya tidak pasti akan menggunakan semua temuan saya pada modul ini, tetapi impact terbesarnya adalah perubahan pola pikir dan cara saya mendekati sebuah masalah di masa depan.

---

- Laporan ini berada di: https://github.com/SebastianAbeSantoso/Me/edit/main/LAPORAN_PEMROGRAMAN_MOBILE/week%202/LAPORAN_MODUL2_PEMROGRAMAN_MOBILE.md
- Catatan berada di: https://github.com/SebastianAbeSantoso/Me/blob/main/LAPORAN_PEMROGRAMAN_MOBILE/week%203/CATATAN_MODUL3_EN.md
- Exercise 3: https://github.com/SebastianAbeSantoso/Me/blob/main/LAPORAN_PEMROGRAMAN_MOBILE/week%203/Exercise_3.md
- Exercise 4: https://github.com/SebastianAbeSantoso/Me/blob/main/LAPORAN_PEMROGRAMAN_MOBILE/week%203/Exercise_4.jpeg
