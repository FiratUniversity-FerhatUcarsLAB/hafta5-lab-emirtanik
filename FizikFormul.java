/*
 * Ad Soyad:Muhammed Emir Tanık
 * Ogrenci No: 250541089
 * Tarih: 11.11.2025
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;

public class FizikFormul {
	//YER ÇEKİM İVMESİNİ TANIMLIYORUZ
	final double GRAVITY = 9.8; 
	//hızın hesaplanması 
	//metod 1
	public static double hiz_hesaplama(double yol, double zaman) {
		return yol / zaman ;
	}
	//ivmenin hesaplanması
	//metod 2
	public static double ivme_hesaplama(double hız_değisimi, double zaman) {
		return hız_değisimi/zaman;
	}
	//kuvvetin hesaplanması
	//metod 3
	public static double kuvvet_hesaplama(double kutle, double ivme) {
		return kutle *ivme;
	}
    //işin hesaplanması
	//metod 4
	public static double iş_hesaplama(double kuvvet, double yol) {
	return kuvvet*yol;
	}
	//gücün hesaplanması
	//metod 5
	public static double guc_hesapla(double iş_hesaplama, double zaman) {
	return iş_hesaplama / zaman;
	}
	//kinetik enerji hesaplama
	//metod 6
	public static double kinetik_enerji(double kutle,  double hiz_hesaplama) {
		return  kutle *Math.pow(hiz_hesaplama, 2)*(0.5); 
	}
	//potansiyel enerji hesaplanması
	//metod 7
	public static double potansiyel_enerji_hesapla(double kutle, double GRAVITY ,double yukseklik) {
		return kutle * GRAVITY *yukseklik;
	}
    //momentum hesaplanması 
	//metod 8
	public static double moment_hesapla(double kutle, double hız) {
		return kutle* hız;
		
	}
	public static void main(String[] args) {
		final double GRAVITY = 9.8; 
		//scanner açıyorum 
		Scanner scanner=new Scanner(System.in);	
		
		System.out.println("=== FİZİK FORMÜL ASİSTANI ===");
		System.out.println(" ");
		System.out.println("TEMEL ÖLÇÜMLER:");
		
		
		System.out.print("Kütle (kg):");
		double kutle=scanner.nextDouble();
		
		System.out.print("Mesafe (m):");
		double yol =scanner.nextDouble();
		
		System.out.print("Zaman(s):");
		double zaman=scanner.nextDouble();
		
		System.out.print("Hız Değişimi(m/s):");
		double hiz_degisimi=scanner.nextDouble();
		
		System.out.print("Yüksekliği Giriniz(m):");
		double yukseklik=scanner.nextDouble();
		
		
		double hiz=hiz_hesaplama(yol, zaman);
		double ivme=ivme_hesaplama(hiz, zaman);
		double kuvvet=kuvvet_hesaplama(kutle, ivme);
		double is= iş_hesaplama(kuvvet, yol);
		double guc=guc_hesapla(is, zaman);
		double kinetik= kinetik_enerji(kutle, hiz);
		double potansiyel=potansiyel_enerji_hesapla(kutle ,GRAVITY, yukseklik);
		double momentum= moment_hesapla(kutle, hiz);
		
		//sonuçların çıktıları 
		
	   // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.println("\nHIZ ve HAREKET:");
        System.out.printf("  Hiz (v = s/t)             : %.2f m/s\n", hiz);
        System.out.printf("  Ivme (a = Δv/t)           : %.2f m/s²\n", ivme);

        System.out.println("\nKUVVET ve IS:");
        System.out.printf("  Kuvvet (F = m*a)          : %.2f N\n", kuvvet);
        System.out.printf("  Is (W = F*d)              : %.2f J\n", is);
        System.out.printf("  Guc (P = W/t)             : %.2f W\n", guc);

        System.out.println("\nENERJI:");
        System.out.printf("  Kinetik Enerji (KE)       : %.2f J\n", kinetik);
        System.out.printf("  Potansiyel Enerji (PE)    : %.2f J\n", potansiyel);
        // Toplam enerji = KE + PE
        System.out.printf("  Toplam Enerji             : %.2f J\n", (kinetik + potansiyel)); 

        System.out.println("\nMOMENTUM:");
        System.out.printf("  Momentum (p = m*v)        : %.2f kg·m/s\n", momentum);

        System.out.println("\n========================================");

       scanner.close();
    }

		
	 }
