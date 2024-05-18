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
