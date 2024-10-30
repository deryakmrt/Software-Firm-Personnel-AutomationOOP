# Yazılım Firması Personel Otomasyonu

Bu proje, bir yazılım firmasında personellerin, özellikle yazılımcıların, yönetimini sağlayan basit bir konsol tabanlı uygulamadır. Nesne Yönelimli Programlama (NYP) dersi için geliştirilmiş olup, kalıtım, kapsülleme ve metot geçersiz kılma gibi nesne yönelimli programlama prensiplerine dayanmaktadır.

## Proje Yapısı

Bu otomasyon sistemi aşağıdaki sınıflardan oluşmaktadır:
- **Personel**: Genel personel bilgilerini içeren temel sınıf.
- **Yazilimci**: `Personel` sınıfından türeyen, yazılımcıları temsil eden alt sınıf.
- **Anasayfa**: Kullanıcı etkileşimi ve ana metodların çalıştırıldığı sınıf.

## Sınıf Açıklamaları

### 1. `Personel` Sınıfı
- **Özellikler**:
  - `Ad` (String): Personelin adı.
  - `Yas` (int): Personelin yaşı.
  - `Departman` (String): Personelin çalıştığı departman.

- **Yapıcı Metot**:
  - `public Personel(String ad, int yas)`: `Ad` ve `Yas` özelliklerini ayarlar. Departman özelliği alt sınıflar tarafından belirlenir.

- **Metotlar**:
  - `BilgileriYazdir()`: Personelin ad ve yaş bilgisini ekrana yazdırır.

### 2. `Yazilimci` Sınıfı (`Personel` Alt Sınıfı)
- **Özellikler**:
  - `ID` (int): Her yazılımcıya özel, 100’den başlayarak her yeni yazılımcı için 5’er 5’er artan özel ID numarası.
  - `maas` (double): Yazılımcının maaş bilgisini tutar (public erişim belirteciyle).

- **Yapıcı Metot**:
  - `public Yazilimci(String ad, int yas, double maas)`: `Ad`, `Yas` ve `maas` değerlerini ayarlar. `Departman` otomatik olarak "Yazilim" olarak atanır ve benzersiz bir `ID` atanır.

- **Metotlar**:
  - `BilgileriYazdir()`: `Personel` sınıfının `BilgileriYazdir()` metodunu geçersiz kılar ve yazılımcının departman, ID, ad, yaş ve maaş bilgisini ekrana sıralı olarak yazdırır.
  - `MaasGuncelle()`: Yazılımcının maaşını doğum yılına göre günceller. Maaş artışı yazılımcının doğum yılı (2024 - Yaş) kadar olur.

### 3. `Anasayfa` Sınıfı (Ana Sınıf)
- Kullanıcıdan bilgi alarak `Yazilimci` nesnelerini oluşturur, bilgileri ekrana yazdırır, maaş günceller ve iki yazılımcı arasında yer değiştirme işlemi sağlar.

- **Metotlar**:
  - **Main Metodu**:
    - Yazılımcı sayısını ve yazılımcı bilgilerini kullanıcıdan alır.
    - Her yazılımcının bilgilerini `BilgileriYazdir()` metodu ile gösterir.
    - Maaş bilgilerini `MaasGuncelle()` metodu ile günceller ve yeniden gösterir.
  - **YazilimciYerDegistir()**: Kullanıcı tarafından girilen iki indeksin yazılımcı bilgilerini yer değiştirir ve güncellenmiş listeyi geri döndürür.
------------------------------------------------------------------------------------
# Software Firm Personnel Automation

This project is a simple console-based application for managing personnel, specifically programmers, within a software company. Developed for an Object-Oriented Programming (OOP) lab quiz, the program follows OOP principles, focusing on inheritance, encapsulation, and method overriding.

## Project Structure

The automation system is designed around the following classes:
- **Personel**: Represents general personnel with basic attributes and methods.
- **Yazilimci**: Extends the `Personel` class, representing software developers with unique attributes and additional functionalities.
- **Anasayfa**: The main class where user interaction and method execution are handled.

## Class Descriptions

### 1. `Personel` Class
- **Attributes**:
  - `Ad` (String): Name of the personnel.
  - `Yas` (int): Age of the personnel.
  - `Departman` (String): Department where the personnel works.

- **Constructor**:
  - `public Personel(String ad, int yas)`: Sets `Ad` and `Yas` values. Department is not assigned here as it's determined by subclasses.

- **Method**:
  - `BilgileriYazdir()`: Displays the personnel’s name and age.

### 2. `Yazilimci` Class (Subclass of `Personel`)
- **Attributes**:
  - `ID` (int): Unique, private identifier starting at 100, increasing by 5 for each new `Yazilimci`.
  - `maas` (double): Public salary value.

- **Constructor**:
  - `public Yazilimci(String ad, int yas, double maas)`: Sets `Ad`, `Yas`, and `maas`. Automatically assigns `Departman` as "Yazilim" (Software) and generates a unique `ID`.

- **Methods**:
  - `BilgileriYazdir()`: Overrides `Personel`'s `BilgileriYazdir()` to display the developer's department, ID, name, age, and salary.
  - `MaasGuncelle()`: Updates the developer’s salary based on their birth year. The increase is equal to the developer's birth year (calculated as `2024 - Yas`).

### 3. `Anasayfa` Class (Main Class)
- The main class collects user input to create `Yazilimci` instances, displays information, updates salaries, and allows swapping of developer data in the list.

- **Methods**:
  - **Main Method**: 
    - Prompts the user to enter the number of developers.
    - Collects each developer's `Ad`, `Yas`, and `maas`.
    - Calls each developer’s `BilgileriYazdir()` method to display information.
    - Updates and re-displays each developer’s salary using `MaasGuncelle()`.
  - **YazilimciYerDegistir()**: Swaps two developers in the array based on the user-provided indices.

