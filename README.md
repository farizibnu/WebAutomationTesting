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
│  │           └─ pages
│  │              ├─ DashboardPage.java
│  │              └─ LoginPage.java
│  └─ test
│     ├─ java
│     │  └─ io
│     │     └─ cucumber
│     │        ├─ StepDefinitions
│     │        │  └─ StepDefinitions.java
│     │        └─ TestRunner
│     │           └─ TestRunner.java
│     └─ resources
│        ├─ cucumber.properties
│        └─ io.cucumber
│           ├─ login_test.feature
│           └─ logout_test.feature
└─ test-report.html
```

### Project Stucture Explanation
- pom.xml: File Maven Project Object Model (POM) yang digunakan untuk mengelola proyek, mengonfigurasi plugin, dan mendefinisikan dependensi yang diperlukan.
- README.md: File ini berisi dokumentasi proyek, memberikan informasi tentang tujuan, cara menggunakan proyek, dan detail lainnya.
- `src`: Direktori utama untuk sumber kode dan file pengujian.
  - `main/java/io/cucumber/pages`: Direktori ini berisi kelas-kelas Page Object Model (POM) yang merepresentasikan halaman web yang akan diuji.
    Contohnya:
    - DashboardPage.java: Kelas ini berisi metode untuk berinteraksi dengan elemen-elemen pada halaman dashboard.
    - LoginPage.java: Kelas ini berisi metode untuk berinteraksi dengan elemen-elemen pada halaman login.
  - `test/java/io/cucumber/StepDefinitions`: Direktori ini berisi definisi langkah (step definitions) yang menghubungkan langkah-langkah dalam file fitur (feature files) dengan kode Java yang mengimplementasikan langkah-langkah tersebut.
    - StepDefinitions.java: Kelas ini berisi semua definisi langkah untuk skenario pengujian.
  - `test/java/io/cucumber/TestRunner`: Direktori ini berisi kelas untuk menjalankan pengujian.
    - TestRunner.java: Kelas ini mengonfigurasi dan menjalankan tes Cucumber.
  - `test/resources`: Direktori ini berisi file konfigurasi dan file fitur Cucumber.
     - cucumber.properties: File konfigurasi untuk Cucumber.
     - io.cucumber: Direktori ini berisi file fitur (feature files) yang mendefinisikan skenario pengujian dalam bahasa Gherkin.
        - login_test.feature: File fitur untuk skenario pengujian login.
        - logout_test.feature: File fitur untuk skenario pengujian logout.
- `test-report.html`: File ini berisi laporan hasil pengujian dalam format HTML.

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
..\test-report.html
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
