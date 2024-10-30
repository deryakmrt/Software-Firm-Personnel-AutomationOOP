package MyPackage;

import java.util.Scanner;

public class Anasayfa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        
        System.out.print("Yazılımcı sayisini gir>> ");
        int yazilimciSayisi = input.nextInt();

        // Yazılımcı dizisi
        Yazilimci[] yazilimcilar = new Yazilimci[yazilimciSayisi];

        // bilgi al
        for (int i = 0; i < yazilimciSayisi; i++) {
            System.out.print("Ad: ");
            String ad = input.next();

            System.out.print("Yas: ");
            int yas = input.nextInt();

            System.out.print("Maas: ");
            double maas = input.nextDouble();

            yazilimcilar[i] = new Yazilimci(ad, yas, maas);
        }

        //yazdırma
        System.out.println("\n--- Yazılımcı Bilgileri ---");
        for (int i = 0; i < yazilimciSayisi; i++) {
            yazilimcilar[i].BilgileriYazdir();
        }

        // Maaş güncelle
        System.out.println("\n--- Guncellenmis Maas Bilgileri ---");
        for (int i = 0; i < yazilimciSayisi; i++) {
            yazilimcilar[i].MaasGuncelle();
            yazilimcilar[i].BilgileriYazdir();
        }

        //-------------------------------------------------------
        System.out.print("\ndegistirilecek 1. indis>> ");
        int ilkIndis = input.nextInt();

        System.out.print("degistirilecek 2. indis>> ");
        int ikinciIndis = input.nextInt();

        YazilimciYerDegistir(yazilimcilar, ilkIndis, ikinciIndis);

        //son hali
        System.out.println("\n--- Son Hali ---");
        for (int i = 0; i < yazilimciSayisi; i++) {
            yazilimcilar[i].BilgileriYazdir();
        }
        
        input.close();
    }

    // YazilimciYerDegistir metodu
    public static Yazilimci[] YazilimciYerDegistir(Yazilimci[] yazilimcilar, int ilkIndis, int ikinciIndis) {   	
    	Yazilimci gecici = yazilimcilar[ilkIndis];
        yazilimcilar[ilkIndis] = yazilimcilar[ikinciIndis];
        yazilimcilar[ikinciIndis] = gecici;
        return yazilimcilar;
    }

}
