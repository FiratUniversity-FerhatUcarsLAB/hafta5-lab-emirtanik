/*
 * Ad Soyad: Muhammed Emir Tanık
 * Ogrenci No: 250541089
 * Tarih: 10.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class GeometrikHesap {
	// KARE
	// KARE İÇİN FONKSİYONLARI TANIMLADIM
    //METOD 1
	public static double Karenin_alanini_hesapla(double K_kenar) {
		return K_kenar * K_kenar;
	}
    //METOD 2
	public static double karenin_cevresini_hesapla(double K_kenar) {
		return 4 * K_kenar;
	}
	// DİKDÖRTGEN
	// DİKDÖRTGEN İÇİN FONKSİYONLARI TANIMLADIM
    //METOD 3
	public static double Dikdörtgen_alan_hesapla(double uzun_kenar, double kisa_kenar) {
		return uzun_kenar * kisa_kenar;
	}
    //METOD4
	public static double Dikdörtgen_cevre_hesapla(double uzun_kenar, double kisa_kenar) {
		return (uzun_kenar + kisa_kenar) * 2;
	}

	// DAİRE
	// FONKSİYONLARINI TANIMLADIM
    //METOD 5
	public static double Daire_cevre_hesapla(double yaricap) {
		return 2 * Math.PI * yaricap;
	}
    //METOD 6
	public static double Daire_alan_hesapla(double yaricap) {
		return Math.PI * Math.pow(yaricap, 2);
	}

	// ÜÇGEN
	// FONKSİYONLARI TANIMLADIM
    //METOD 7
	public static double ucgen_alan_hesapla(double taban, double yukseklik) {
		return taban * yukseklik / 2;
	}

	// ÇEVRE
    //METOD 8
	public static double ucgen_cevre_hesapla(double kenar1, double kenar2, double kenar3) {
		return kenar1 + kenar2 + kenar3;
	}

	public static void main(String[] args) {
		// KARE
		// SCANNER AÇTIM
		Scanner scanner = new Scanner(System.in);
		// KARE İÇİN GİRDİ ALDIM
		System.out.print("Karenin Bir Kenarını Giriniz (cm):");
		Double kare_kenar = scanner.nextDouble();
		// FONKSİYON KULLANARAK ALANI VE ÇEVREYİ HESAPLADIM
		double KareninAlani = Karenin_alanini_hesapla(kare_kenar);
		double KareninCevresi = karenin_cevresini_hesapla(kare_kenar);
		// DİKDÖRTGEN
		// KULLANICIDAN GİRDİLERİ ALDIM
		System.out.print("Dikdörtgenini Uzun Kenarını Giriniz (cm):");
		Double uzun_kenar = scanner.nextDouble();
		System.out.println("Dikdörtgenin Kısa Kenarını Giriniz (cm):");
		Double kisa_kenar = scanner.nextDouble();
		// FONKSİYONLARI KULLANARAK İSTENİLENİ YAPTIM

		double DikdörtgenAlan = Dikdörtgen_alan_hesapla(uzun_kenar, kisa_kenar);
		double DikdörtgenCevre = Dikdörtgen_cevre_hesapla(uzun_kenar, kisa_kenar);
		// DAİRE İÇİN SCANNER AÇTIM
		System.out.print("Dairenin Yarıçapını Giriniz (cm):");
		Double yaricap = scanner.nextDouble();
		double DaireAlan=Daire_alan_hesapla(yaricap);
		double DaireCevre=Daire_cevre_hesapla(yaricap);
		//ÜÇGENE GEÇİYORUM TABAN ALDIM BURDA
		System.out.print("Üçgenin Tabanını Giriniz (cm):");
		double taban= scanner.nextDouble();
		//YÜKSEKLİK ALDIM BURDA
		System.out.print("Üçgenin Yüksekliğini Giriniz (cm):");
		double yukseklik=scanner.nextDouble();
		double ucgen_alan= ucgen_alan_hesapla(taban,yukseklik);
        //KENARLARI ALIYORUM 
		System.out.print("Üçgenin 1. Kenarını Yazınız (cm):");
		double kenar1=scanner.nextDouble();
		
		System.out.print("Üçgenin 2. Kenarını Yazınız (cm):");
		double kenar2=scanner.nextDouble(); 
		
		System.out.print("Üçgenin 3. Kenarını Yazınız (cm):");
		double kenar3=scanner.nextDouble();
        //FONKSİYON KULLANARAK ÇEVREYİ HESAPLIYORUM 
		double ucgen_cevre= ucgen_cevre_hesapla( kenar1, kenar2,kenar3);





        
		
		 // === SONUÇLAR ===
        System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.printf("\nKARE (kenar: %.1f cm):\n", kare_kenar);
        System.out.printf("  Alan      : %.2f cm²\n", KareninAlani);
        System.out.printf("  Cevre     : %.2f cm\n", KareninCevresi);

        System.out.printf("\nDIKDORTGEN (%.1f x %.1f cm):\n", kisa_kenar, uzun_kenar);
        System.out.printf("  Alan      : %.2f cm²\n", DikdörtgenAlan);
        System.out.printf("  Cevre     : %.2f cm\n", DikdörtgenCevre);

        System.out.printf("\nDAIRE (yaricap: %.1f cm):\n", yaricap);
        System.out.printf("  Alan      : %.2f cm²\n", DaireAlan);
        System.out.printf("  Cevre     : %.2f cm\n", DaireCevre);

        System.out.printf("\nUCGEN (taban: %.1f, yukseklik: %.1f cm):\n", taban, yukseklik);
        System.out.printf("  Alan      : %.2f cm²\n",ucgen_alan);
        System.out.printf("  Cevre     : %.2f cm\n",ucgen_cevre );

        System.out.println("\n========================================");

        scanner.close();
    }

		
		
		

	}

