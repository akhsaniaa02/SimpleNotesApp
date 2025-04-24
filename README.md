# 📝 Simple Notes App

Aplikasi Android sederhana berbasis Java untuk mencatat, yang dilengkapi dengan unit test dan instrumental test menggunakan JUnit.

## 📱 Fitur Aplikasi

- Menambahkan catatan (judul dan isi)
- Melihat semua catatan yang telah dibuat

## ⚙️ Teknologi

- Java
- Android SDK
- JUnit4
- Android Instrumented Test (Espresso / AndroidJUnitRunner)


## 🧪 Testing

### ✅ Local Unit Test (`test/`)

1. **`testAddNote()`**
   - Menambahkan catatan dan memverifikasi jumlah catatan bertambah.

2. **`testGetAllNotes()`**
   - Memastikan data catatan bisa diambil dan sesuai dengan urutan penambahan.

### 📱 Instrumented Test (`androidTest/`)

1. **`useAppContext()`**
   - Memastikan package aplikasi sesuai dengan konfigurasi.

2. **`checkAppPackage()`**
   - Mengecek bahwa nama package mengandung string `simplenotes`.

> 📌 **Catatan**: Semua test case dijelaskan dalam bentuk komentar (`/* */`) seperti yang diminta dalam instruksi tugas.

## ▶️ Cara Menjalankan

1. Buka project ini di **Android Studio**.
2. Jalankan **emulator** atau hubungkan perangkat Android fisik.
3. Klik kanan pada folder `test` atau `androidTest` → pilih `Run Tests`.


---



