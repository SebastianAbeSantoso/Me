# Laporan Pemrograman Mobile
Nama : Sebastian Abe Santoso

NIM : 2410817210002
## Implementing

### 11 Maret 2026

### Deskripsi

Saya menonton dan mencatat seluruh module 4, Implementing. Mengerjakan exercise 5 dan 6, dan juga menyelesaikan laporan ini dalam hari ini. Untuk link exercise 5 dan 6 sebagai berikut:
- Exercise 5: https://github.com/SebastianAbeSantoso/Me/blob/main/LAPORAN_PEMROGRAMAN_MOBILE/week%204/exercise_5.png, untuk exercise 5 bagian hierarchy, dapat dicek di link exercise 6.
- Exercise 6: https://github.com/SebastianAbeSantoso/Me/tree/main/LAPORAN_PEMROGRAMAN_MOBILE/week%204/fullsnack_exercise_5_6

### Insight

Dalam bagian ini, saya mempelajari mengenai mentranslasikan high-level decisions menjadi kode, seperti pemecahan menjadi modul dan komponen di module-module sebelumnya, dalam kursus ini menggunakan turborepo, yaitu tool untuk manajemen proyek skala besar dan jangka panjang untuk monorepo. Aplikasi dipecah menjadi beberapa bagian terpisah: core API yang hanya mockup, docs, web yang berbasis Next.js, serta packages dan ui.

Pemahaman yang menarik di sini adalah mengenai struktur direktorinya, mengikuti konvensi bawaan framework dapat menjebak ke dalam nested routing, yaitu modul yang bersarang terlalu dalam, jadi lebih baik menggunakan struktur flat. Di sini mentor bilang bahwa dia juga tidak terlalu suka mengikuti konvensi, misalnya, modul menu item tetap diletakkan di level atas, daripada dikubur di dalam route restaurant walau ada menu di route restaurant. Hal ini membuat navigasi codebase jauh lebih mudah. Dalam praktiknya, folder app hanya sebagai router saja untuk menangani URL dan rendering, sedangkan seluruh implementasi logika yang berat diisolasi dengan aman di dalam hierarki modulnya masing-masing.

Di frontend, banyak framework yang berbasis komponen, yang dimulai oleh react dengan mottonya "Thinking in React", di sini saya memahamai bahwa UI selalu dipecah menjadi komponen komponen yang menyusun suatu frontend. Pendekatan dalam kursus ini menggunakannya dengan membagi elemen ke dalam empat hierarki representasi:
- Screens: Titik masuk utama dari sebuah modul, biasanya hanya memiliki satu seperti modul delivery, atau beberapa jika ada pergantian layar seperti modul Search.
- Features: Di definisi mentor sebagai komponen skala besar yang memiliki fungsionalitas kompleks sehingga membutuhkan struktur internal folder sendiri seperti fitur filtering restoran.
- Components: Elemen UI berskala kecil seperti dropdown .
- Shared: Wadah untuk elemen yang tidak terikat pada satu fitur spesifik, seperti layout, design system, atau utility.

Dalam evaluasi exercise 5, saya menyadari bahwa implementasi pemisahan ini bisa bersifat subjektif antar developer, misalnya mentor penempatan bagian footnotes. Selain itu, struktur hierarki folder juga terdapat perbedaan, disini saya merasa constraint dan guideline pada chapter terakhir sangatlah penting.

Pemahaman penting lainnya adalah bagaimana merepresentasikan entitas domain di dalam kode, seperti melakukan pemanggilan fetch API secara langsung di dalam komponen frontend adalah praktik yang bermasalah. Data mentah dari backend sering membawa struktur konvensi yang tidak relevan untuk UI, seperti nested object berupa attributes dan relationships, data berlebih yang tidak diperlukan, atau data yang kurang sehingga memaksa melakukan pemanggilan endpoint berkali-kali. Karena itu, harus ada implementasi layer model yang berguna sebagai abstraksi di antara API dan frontend. Model ini bertugas mengambil data, membentuknya sesuai kebutuhan, menggabungkan beberapa endpoint jika perlu, dan mengembalikannya dalam bentuk objek dan benar-benar siap dirender oleh UI.

Dalam implementasi exercise 6, saya mendapat pemahaman terkait Next.js, framework ini memiliki mekanisme caching bawaan, sehingga jika memanggil endpoint berkali-kali, hanya satu saja requestnya sehingga tidak membebankan. Mentor juga memberi rule of thumb, sebaiknya proses fetching dilakukan dari level feature, bukan component untuk menjaga decoupling.

Terakhir, saya menyadari bahwa sebaik apa pun arsitektur awal dibangun, semakin membesarnya codebase, kompleksitas dan masalah pasti akan muncul. Oleh karena itu, guardrails dan constraints wajib didefinisikan sejak awal. Mentor memberi sugesti beberapa tools untuk menjaga batasan ini:
- Dependency Cruiser & Commonality: Untuk memastikan dan memvalidasi aturan dependensi, misalnya menjaga agar modul satu tidak sembarangan bergantung pada modul lain.
- Bundlesize & Performance Budgets: Untuk membatasi ukuran beban aplikasi dan memastikan metrik Core Web Vitals tetap terjaga demi performa.
- SonarLint: Ekstensi vscode untuk menganalisis kualitas desain kode dan memantau cognitive complexity, memastikan kode tetap mudah dibaca dan tidak terlalu rumit bagi developer lain.

### Impact

Dalam modul ini, saya mempelajari mengenai translasi high-level decisions menjadi kode nyata, walau saya tidak mengerti Next.js, tetapi tetap dapat dicerna sebagai contoh translasi keputusan high-level seperti diagram menjadi low-level seperti kode, sehingga saya dapat bayangan jika ingin membuat diagram dan merubahnya menjadi kode di masa depan.

Yang paling menarik bagi saya adalah directory hierarchy, ternyata sangat penting dan juga dapat digunakan sebagai komponen diagram dalam bentuk hierarki, saya dulu hanya membuat folder dan file tanpa memikir, atau hierarki yang tergantung framework atau bahasa pemrograman yang digunakan, jadi penerapan hierarki dan komponen menjadi empat bagian seperti screen, feature, component, dan shared menurut saya itu cukup penting sekarang. Hierarki ini juga cukup terasa pada exercise 5 dan 6, di mana mereka disusun secara sengaja. Exercise 5 cukup mengajari mengenai memecah sebuah page menjadi komponen komponen frontend yang kemudian dirubah menjadi kode pada exercise 6.

Dulu saya tidak terlalu memikir, tetapi melakukan fetch dalam frontend memang sangatlah bermasalah. Data mentah tidak berproses sering memiliki kekurangan yang tidak dibutuhkan oleh komponen frontend, sehingga mentor mengusulkan untuk memberi layer abstraksi berupa model, yang bertugas untuk mengambil data, membentuknya sesuai kebutuhan, dan mengembalikannya dalam bentuk objek yang siap dirender oleh UI.

Berbagai developer memiliki cara berpikir yang berbeda, sehingga pembentukan guardrails dan constraint cukup penting, dan sebaiknya didefinisikan sejak awal proyek. Tanpa adanya batasan yang tegas, arsitektur awal yang bersih dapat dengan cepat menjadi berantakan seiring bertambah besarnya codebase dan kompleksitas fitur. Saya belum pernah merasakan ini karena belum sempat berkolaborasi dengan orang lain mengenai kode, tetapi ini akan saya pikirkan lebih lanjut saat diperlukan.

Walau saya tidak pasti akan menggunakan semua tools pada modul ini, seperti Turborepo, Dependency Cruiser, atau metrik performa secara langsung saat ini, tetapi saya baru mengenal bahwa terdapat alat alat seperti ini, sehingga impact terbesarnya adalah pengetahuan berupa berbagai macam alat yang memengaruhi cara saya mendekati sebuah masalah arsitektur di masa depan.

Secara menyeluruh, saya merasa kursus ini cukup membantu saya mengenal dasar-dasar arsitektur frontend, mulai dari pemahaman fondasi arsitektur di awal, hingga sekarang yang berakhir pada tahap implementasi nyata di dalam kode.

---

- Laporan ini berada di: https://github.com/SebastianAbeSantoso/Me/edit/main/LAPORAN_PEMROGRAMAN_MOBILE/week%204/LAPORAN_MODUL4_PEMROGRAMAN_MOBILE.md
- Catatan berada di: https://github.com/SebastianAbeSantoso/Me/blob/main/LAPORAN_PEMROGRAMAN_MOBILE/week%204/CATATAN_MODUL4_EN.md
