1.Penerapan Konsep OOP 
  Enkapsulasi : Data sensitif (No rekening, nama pemilik, saldo) dilindungi secara aman menggunakan akses private
  State Management : Menggunakan static variable ( totalrekening) untuk melacak total akun yang dibuat secara terpusat

2.Validasi & Keamanan Transaksi :
  Pembuatan akun batas minimal saldo awal Rp 50.000
  Transfer : Berhasil memverifikasi ketersediaan saldo sebelum melakukan pemotongan, sehingga mencegah kondisi saldo minus

3.Hasil Pengujian :
  Program berjalan 
  akun ika dan syalsa berhasil dibuat
  Transfer pertama Rp 50.000 berhasil memperbarui saldo kedua pihak
  Transfer kedua Rp 200.000 ditolak karena saldo tidak mencukupi, dan saldo tetap aman.
