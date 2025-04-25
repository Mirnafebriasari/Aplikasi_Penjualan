# Aplikasi_Penjualan
# Aplikasi Penjualan

Aplikasi Penjualan ini dibuat menggunakan bahasa pemrograman Java. Aplikasi ini memungkinkan pengguna untuk menambahkan produk ke dalam transaksi, menghitung total harga, dan memberikan diskon berdasarkan jenis pelanggan (member atau umum).

## Fitur Utama

- Menambahkan produk ke dalam transaksi.
- Menghitung total harga produk.
- Menerapkan diskon berdasarkan jenis pelanggan:
  - Diskon 10% untuk member.
  - Diskon 5% untuk pelanggan umum.
  
## Struktur Proyek

- `DiskonMember.java` - Kelas yang mengimplementasikan diskon untuk member (10%).
- `DiskonUmum.java` - Kelas yang mengimplementasikan diskon untuk pelanggan umum (5%).
- `InterfaceDiskon.java` - Interface yang digunakan oleh kelas `DiskonMember` dan `DiskonUmum` untuk menghitung diskon.
- `PenjualanApp.java` - Kelas utama yang menjalankan aplikasi penjualan, menerima input produk, menghitung total harga, dan diskon.
- `Produk.java` - Kelas untuk mendefinisikan objek produk yang memiliki nama dan harga.
- `Transaksi.java` - Kelas untuk mengelola daftar produk dalam transaksi dan menghitung total harga.

## Cara Menjalankan Program

1. Clone repositori ini dengan perintah:
git clone https://github.com/Mirnafebriasari/Aplikasi_Penjualan.git

2. Navigasi ke direktori proyek:
cd Aplikasi_Penjualan

3. Kompilasi dan jalankan program menggunakan perintah:
javac src/*.java java src.PenjualanApp


4. Ikuti petunjuk yang muncul di terminal untuk memasukkan jumlah produk, nama produk, dan harga produk. Kemudian pilih jenis diskon untuk menghitung total harga setelah diskon.

## Pembagian Tugas

- **Anggota 1**: Pengembangan fitur diskon (member dan umum).
- **Anggota 2**: Pengembangan fitur produk dan transaksi.
- **Anggota 3**: Pengembangan antarmuka pengguna (input dan output di terminal).
- **Anggota 4**: Pengujian dan debugging.

## Lisensi

Proyek ini dilisensikan di bawah [MIT License](LICENSE).
