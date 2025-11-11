/*
 * Ad Soyad: Muhammed Emir Tanık
 * Ogrenci No: 250541089
 * Tarih: 11.11.2025
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

public class SepetHesap {
	//KDV ORANI %18
	 final static double KDV = 0.18;
	 //KARGO ÜCRETİ
	 final static double KARGO= 29.99;
	 
	public static double toplam_hesap(double fiyat, int adet) {
		return fiyat * adet ;
	}
	public static double aratoplam( double urun1 , double urun2 , double urun3 ) {
		return urun1 +urun2 +urun3;
	}
	public static double indirim_tutarı(double aratoplam, double indirim_yüzdesi) {	
		return aratoplam *(indirim_yüzdesi/100);
	}
	public static double indirimli_fiyat(double aratoplam , double indirim_tutarı) {
	return aratoplam-indirim_tutarı;
    }
	public static double vergi(double indirimli_fiyat, double KDV ) {
		return indirimli_fiyat * KDV;
	}
	public static double genel_toplam(double indirimli_fiyat,double vergi, double kargo) {
		return indirimli_fiyat + vergi+kargo;
	}
	
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("=== E-TICARET SEPET HESAPLAYICI ===");
        System.out.println("\nLutfen 3 urunun bilgilerini girin:");

        
        
		//ÜRÜN1 BİLGİ
        System.out.println("\nURUN 1:");
        System.out.print("  Birim Fiyat (TL): ");
        double fiyat1 = input.nextDouble();
        System.out.print("  Adet: ");
        int adet1 = input.nextInt();
        
        
        //ÜRÜN 2
        System.out.println("\nURUN 2:");
        System.out.print("  Birim Fiyat (TL): ");
        double fiyat2 = input.nextDouble();
        System.out.print("  Adet: ");
        int adet2 = input.nextInt();
        
        // ÜRÜN 3
        System.out.println("\nURUN 3:");
        System.out.print("  Birim Fiyat (TL): ");
        double fiyat3 = input.nextDouble();
        System.out.print("  Adet: ");
        int adet3= input.nextInt();
        
        //indirimler
        System.out.println("\nIndirim Kuponu Yuzdesi (%): ");
        double indirim_yüzdesi = input.nextDouble();
        
        
        //1. fonksiyon 
        double toplam1=toplam_hesap(fiyat1,adet1);
        double toplam2=toplam_hesap(fiyat2,adet2);
        double toplam3=toplam_hesap(fiyat3, adet3);
        
        //2. fonksiyon ARA TOPLAMI HESAPLAR
        double ara_toplam=aratoplam(toplam1, toplam2, toplam3);
        
       
        //fonksiyon 3 İNDİRİM MİKTARINI ALIR
        double İndirimTutarı=indirim_tutarı(ara_toplam, indirim_yüzdesi);
        
        //fonksiyon 4 İNDİRİMLİ TUTARINI ALIR
        double İndirimliTutar=indirimli_fiyat(ara_toplam, İndirimTutarı);
        
       
        //fonksiyon 5 KDV TUTARINI ALIR
        double KDV_TUTARI=vergi(İndirimliTutar, KDV);
        
       //fonksiyon 6 GENEL TOPLAMI ALIR
        double genel_top=genel_toplam(İndirimliTutar, KARGO, KDV_TUTARI);
        
        
        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("           SIPARIS OZETI");
        System.out.println("========================================");

        System.out.printf("Urun 1 Toplam (%.2f TL x %d): %.2f TL\n", fiyat1, adet1, toplam1);
        System.out.printf("Urun 2 Toplam (%.2f TL x %d): %.2f TL\n", fiyat2, adet2, toplam2);
        System.out.printf("Urun 3 Toplam (%.2f TL x %d): %.2f TL\n", fiyat3, adet3, toplam3);
        System.out.println("----------------------------------------");
        System.out.printf("Ara Toplam                   : %.2f TL\n", ara_toplam);

        System.out.printf("\nIndirim Tutari (%%%.0f)         : -%.2f TL\n", indirim_yüzdesi, İndirimTutarı);
        System.out.printf("Indirimli Toplam             : %.2f TL\n", İndirimliTutar);

        System.out.printf("\nKDV Tutari (%%%.0f)             : +%.2f TL\n", (KDV * 100), KDV_TUTARI);
        System.out.printf("Kargo Ucreti                 : +%.2f TL\n", KARGO);
        System.out.println("----------------------------------------");
        System.out.printf("GENEL TOPLAM                 : %.2f TL\n", genel_top);
        System.out.println("========================================");

        input.close();

		
		
	}

}
