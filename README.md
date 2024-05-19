# Web Automation Testing: Selenium with Java + Cucumber (BDD) Framework

## Introduction
Program pengujian otomatis pada website Swag Labs (https://www.saucedemo.com/) pada fitur login dan logout. Pengujian ini menggunakan framework BDD (Behavior Driven Development) yang menggabungkan Selenium dengan Java dan Cucumber. Dengan framework ini, pengujian dilakukan berdasarkan skenario yang ditulis dalam bahasa alami yang mudah dipahami oleh semua pemangku kepentingan.

## Prerequisites
Sebelum memulai, pastikan Anda memiliki perangkat lunak berikut yang terpasang di komputer Anda:
- Java JDK (versi 8 atau lebih baru)
- Maven
- IDE (IntelliJ IDEA, Eclipse, atau lainnya)
- Google Chrome (versi terbaru)
- ChromeDriver yang kompatibel dengan versi Chrome yang terpasang

## Tools dan Libraries
- Selenium WebDriver: Untuk interaksi browser otomatis.
- Cucumber: Untuk mendefinisikan dan menjalankan skenario pengujian dalam format BDD.
- JUnit: Untuk menjalankan dan mengelola pengujian.
- WebDriverManager: Untuk mengelola driver browser secara otomatis.

## Project Structure
```
WebAutomationTesting
├─ .gitignore
├─ .idea
├─ .vscode
│  └─ settings.json
├─ pom.xml
├─ README.md
├─ src
│  ├─ main
│  │  └─ java
│  │     └─ io
│  │        └─ cucumber
│  │           └─ Main.java
│  └─ test
│     ├─ java
│     │  └─ io
│     │     └─ cucumber
│     │        ├─ locators
│     │        │  └─ PageLocators.java
│     │        ├─ pages
│     │        │  ├─ DashboardPage.java
│     │        │  └─ LoginPage.java
│     │        ├─ StepDefinitions
│     │        │  └─ StepDefinitions.java
│     │        └─ TestRunner
│     │           └─ TestRunner.java
│     └─ resources
│        ├─ cucumber.properties
│        └─ io.cucumber
│           ├─ login_test.feature
│           └─ logout_test.feature
└─ testreport
   └─ test-report.html
```

### Project Structure Explanation

- **pom.xml**: File Maven Project Object Model (POM) yang digunakan untuk mengelola proyek, mengonfigurasi plugin, dan mendefinisikan dependensi yang diperlukan.
- **README.md**: File ini berisi dokumentasi proyek, memberikan informasi tentang tujuan, cara menggunakan proyek, dan detail lainnya.
- **.gitignore**: File ini berisi daftar file dan direktori yang harus diabaikan oleh Git.
- **.idea**: Direktori ini berisi pengaturan proyek IntelliJ IDEA.
- **.vscode**: Direktori ini berisi pengaturan proyek Visual Studio Code.
  - `settings.json`: File ini berisi pengaturan spesifik untuk proyek di Visual Studio Code.
- **src**: Direktori utama untuk sumber kode dan file pengujian.
  - **main/java/io/cucumber**:
    - `Main.java`: Kelas utama untuk menjalankan aplikasi.
  - **test/java/io/cucumber**:
    - **locators**:
      - `PageLocators.java`: Kelas ini berisi definisi locator untuk elemen-elemen pada halaman web yang akan diuji.
    - **pages**:
      - `DashboardPage.java`: Kelas ini berisi metode untuk berinteraksi dengan elemen-elemen pada halaman dashboard.
      - `LoginPage.java`: Kelas ini berisi metode untuk berinteraksi dengan elemen-elemen pada halaman login.
    - **StepDefinitions**:
      - `StepDefinitions.java`: Kelas ini berisi semua definisi langkah (step definitions) untuk skenario pengujian. Langkah-langkah ini menghubungkan langkah-langkah dalam file fitur (feature files) dengan kode Java yang mengimplementasikan langkah-langkah tersebut.
    - **TestRunner**:
      - `TestRunner.java`: Kelas ini mengonfigurasi dan menjalankan tes Cucumber.
  - **test/resources**:
    - `cucumber.properties`: File konfigurasi untuk Cucumber.
    - **io.cucumber**:
      - `login_test.feature`: File fitur untuk skenario pengujian login.
      - `logout_test.feature`: File fitur untuk skenario pengujian logout.
- **testreport/test-report.html**: File ini berisi laporan hasil pengujian dalam format HTML.

## How to Run the Tests
1. Clone repository ini melalui git bash, dengan menjalankan perintah berikut
   ```
   git clone https://github.com/farizibnu/WebAutomationTesting.git
   ```
3. Buka project di IDE pilihan anda.
4. Jalankan perintah maven untuk memastikan semua dependensi terunduh
   ```
   mvn clean install
   ```
6. Jalankan perintah pengujian berikut
   ```
   mvn clean test
   ```

## Test Report
Test report adalah laporan yang dihasilkan setelah menjalankan serangkaian pengujian pada suatu perangkat lunak. Test report memberikan ringkasan tentang hasil pengujian yang dilakukan. Ini mencakup informasi tentang tes mana yang berhasil, tes mana yang gagal, serta hasilnya dalam berbagai format yang dapat membantu pengembang dalam menganalisis kinerja dan keandalan perangkat lunak mereka.

### How to check Test Report
Hasil report dari test automation yang telah dijalankan akan tersimpan pada file berikut
```
./testreport/test-report.html
```
Contoh hasil test report
![image](https://github.com/farizibnu/WebAutomationTesting/assets/95133669/d42aa428-cece-46fa-ab00-633e00bb457e)
Hasil test report akan menunjukan beberapa hal diantaranya adalah :
1. Persentase skenario test case yang berhasil
2. Last run
3. Durasi pengujian
4. Sistem Operasi
5. Java HotSpot(TM) 64-Bit Server VM 11.0.10+8-LTS-162
6. Informasi Teknis yang digunakan :
    - Cucumber-JVM Version: 7.17.0
    - Java Version: Java HotSpot(TM) 64-Bit Server VM 11.0.10+8-LTS-162
      
Selain itu, adapun detail list skenario yang dijalankan. Misalnya adalah skenario berikut
![image](https://github.com/farizibnu/WebAutomationTesting/assets/95133669/9b62f00a-d5a0-406e-b4c1-ab81da2cfa22)
#### Scenario Outline
Tujuan: Untuk memverifikasi bahwa pengguna dapat melakukan login dengan sukses menggunakan kredensial yang valid.
Skenario login diatas menunjukan terdapat 4 skenario :
1. Given: I am on the login page
   - Langkah ini memastikan bahwa pengguna berada di halaman login.
   - Implementasi teknis: Driver web mengarahkan ke URL halaman login aplikasi.
   - Status: Berhasil (✔️), menunjukkan bahwa navigasi ke halaman login berhasil dilakukan.
2. When: I enter "<username>" and "<password>"
   - Langkah ini memasukkan kredensial pengguna ke dalam formulir login.
   - Implementasi teknis: Metode pengujian memasukkan nilai "standard_user" di bidang username dan "secret_sauce" di bidang password.
   - Status: Berhasil (✔️), menunjukkan bahwa kredensial pengguna berhasil dimasukkan ke dalam bidang input yang sesuai.
3. And: I click the login button
   - Langkah ini mengirimkan formulir login dengan mengklik tombol login.
   - Implementasi teknis: Metode pengujian melakukan klik pada tombol login menggunakan driver web.
   - Status: Berhasil (✔️), menunjukkan bahwa tombol login berhasil diklik dan permintaan login dikirimkan.
4. Then: I should be redirected to the dashboard page
   - Langkah ini memverifikasi bahwa pengguna berhasil login dan diarahkan ke halaman dashboard.
   - Implementasi teknis: Metode pengujian memeriksa apakah URL atau elemen halaman saat ini menunjukkan bahwa pengguna berada di halaman dashboard.
   - Status: Berhasil (✔️), menunjukkan bahwa setelah login, pengguna berhasil diarahkan ke halaman dashboard.
     
Kesimpulan
- Scenario berhasil diuji: Semua langkah dalam skenario berhasil dijalankan tanpa masalah.
- Validasi Login: Kredensial standard_user dan secret_sauce valid untuk login dan mengarahkan pengguna ke halaman dashboard.
- Kebenaran Implementasi: Proses login telah diuji dengan benar sesuai dengan spesifikasi yang diberikan dalam skenario outline.

## Test Cases
### Login Test Cases
1. Positive Login - Valid username and password
2. Negative Login - Attempting to login with invalid credentials
3. Negative Login -  User does not input username and password
4. Negative Login - User enters registered username with incorrect password
5. Negative Login - Valid Username and Empty Password
6. Negative Login - Invalid Username and Valid Password
7. Negative Login - Empty Username and Valid Password
8. Negative Login - Invalid Username and Empty Password
9. Negative Login - Empty Username and Invalid Password

### Logout Test Case 
1. Positive Logout

## Author
1. 211524010 | Fariz Muhamad Ibnu Hisyam | [@farizibnu](https://github.com/farizibnu)
2. 211524025 | Salma Edyna Putri | [@salmaep](https://github.com/salmaep)
3. 211524028 | Tabitha Salsabila Permana | [@Tabitha2912](https://github.com/Tabitha2912)
