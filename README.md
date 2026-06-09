# Sistem Manajemen Restoran (Java OOP)

## Deskripsi

Program ini dibuat untuk memenuhi Tugas Praktik 3 mata kuliah Pemrograman Berbasis Objek. Program digunakan untuk membantu pengelolaan menu restoran dan pencatatan pesanan pelanggan.

Melalui program ini, pengguna dapat menambahkan menu makanan, minuman, maupun diskon, mencatat pesanan pelanggan, menghitung total pembayaran, serta menyimpan data menu dan struk pesanan ke dalam file teks.

## Fitur Program

- Menambahkan menu makanan
- Menambahkan menu minuman
- Menambahkan diskon
- Menampilkan daftar menu restoran
- Mencatat pesanan pelanggan
- Menghitung total pembayaran beserta diskon
- Menyimpan data menu ke file teks
- Menyimpan struk pesanan ke file teks
- Menangani kesalahan input atau akses data yang tidak tersedia menggunakan exception

## Konsep Pemrograman Berbasis Objek yang Digunakan

### Abstraksi

Program menggunakan abstract class `MenuItem` sebagai kelas dasar untuk seluruh item menu.

### Inheritance

Class `Makanan`, `Minuman`, dan `Diskon` merupakan turunan dari class `MenuItem`.

### Encapsulation

Atribut pada setiap class dibuat private dan diakses melalui method getter.

### Polymorphism

Method `tampilMenu()` dioverride pada masing-masing class turunan sehingga dapat menampilkan informasi yang berbeda sesuai jenis objeknya.

## Struktur Program

- `MenuItem.java` → Abstract class untuk item menu.
- `Makanan.java` → Representasi menu makanan.
- `Minuman.java` → Representasi menu minuman.
- `Diskon.java` → Representasi diskon.
- `Menu.java` → Mengelola daftar menu restoran.
- `Pesanan.java` → Mengelola data pesanan pelanggan.
- `FileManager.java` → Menangani penyimpanan data ke file.
- `Main.java` → Program utama.

## Cara Menjalankan Program

Compile seluruh file Java:

```bash
javac *.java
```

Jalankan program:

```bash
java Main
```

## Contoh Penggunaan

1. Tambahkan beberapa menu makanan atau minuman.
2. Tambahkan diskon jika diperlukan.
3. Tampilkan daftar menu.
4. Pilih menu yang ingin dipesan.
5. Hitung total pembayaran.
6. Simpan data menu dan struk pesanan.

## File Output

Program akan menghasilkan file:

- `menu.txt` → Menyimpan daftar menu restoran.
- `struk.txt` → Menyimpan data pesanan dan total pembayaran.

## Penutup

Program ini dibuat sebagai implementasi berbagai konsep yang telah dipelajari pada mata kuliah Pemrograman Berbasis Objek, seperti abstraksi, inheritance, encapsulation, polymorphism, exception handling, penggunaan ArrayList, serta operasi file dan I/O.
