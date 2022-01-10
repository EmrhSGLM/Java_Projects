package OgrenciIsleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

	static List<Kisi> ogrenciList = new ArrayList<>();
	static List<Kisi> ogretmenList = new ArrayList<>();
	// Scanner scan = new Scanner(System.in);
	static String kisiTuru = "";

	public static void anaMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("=====================\nOGRENCI VE OGRETMEN YONETIMI PANELI\n====================="+
		
		"\n\t1- ÖĞRENCİ İŞLEMLERİ\n\t2- ÖĞRETMEN İŞLEMLERİ\n\tQ- ÇIKIŞ\\n");

		System.out.println("isleminizi seciniz");
		String secim = scan.next().toUpperCase();

		switch (secim) {
		case "1":
			kisiTuru = "OGRENCI";
			islemMenu();
			break;
		case "2":
			kisiTuru = "OGRETMEN";
			islemMenu();
			break;
		case "Q":
			cikis();
			break;
		default:
			System.out.println("Hatali giris yaptiniz");
			anaMenu();
			break;

		}

	}

	private static void cikis() {
		System.out.println("uygulamayi kullandiginiz icin tesekkur ederiz");

	}

	public static void islemMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("3. Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.\r\n"
				+ "============= İŞLEMLER =============\r\n" + "     1-EKLEME\r\n" + "     2-ARAMA\r\n"
				+ "     3-LİSTELEME\r\n" + "     4-SİLME\r\n" + "     Q-ÇIKIŞ");
		System.out.println("islem tercihinizi seciniz");
		int islemTercihi = scan.nextInt();

		switch (islemTercihi) {
		case 0:
			anaMenu();
			break;
		case 1:
			ekleme();
			islemMenu();
			break;
		case 2:
			arama();
			islemMenu();
			break;
		case 3:
			// listeleme();
			islemMenu();
			break;
		case 4:
			silme();
			islemMenu();
			break;
		default:
			System.out.println("hatali giris yaptiniz");
			islemMenu();
			break;

		}

	}

	private static void silme() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*****   "+kisiTuru+" silme sayfasi    *****");
		if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
			
			System.out.println("Silinecek ogrenci kimlik no giriniz : ");
			String silOgrenciKimlik=scan.next();
			boolean kontrol = true;
			for (Kisi k : ogrenciList) {
				if (k.getKimlikNo().contains(silOgrenciKimlik)) {
					System.out.println("Sildiginiz ogrenci : "+k.getAdSoyad());
					ogrenciList.remove(k.getKimlikNo());
					kontrol = false;				
			}
				if (kontrol) {
				System.out.println("Aradiginiz ogrenci mevcut degil");
				}			
		}}else if(kisiTuru.equalsIgnoreCase("OGRETMEN")) {
			System.out.println("Silinecek ogretmen kimlik no giriniz : ");
			String silOgretmenKimlik=scan.next();
			boolean kontrol = true;
			for (Kisi k : ogrenciList) {
				if (k.getKimlikNo().contains(silOgretmenKimlik)) {
					System.out.println("Aradiginiz ogretmen : "+k.getAdSoyad());
					ogretmenList.remove(k.getKimlikNo());
					kontrol = false;				
			}
				if (kontrol) {
				System.out.println("Aradiginiz ogretmen mevcut degil");
				}			
		}
		}
		}

	private static void arama() {
		Scanner scan = new Scanner(System.in);
		System.out.println("*****   "+kisiTuru+" arama sayfasi    *****");
		if (kisiTuru.equalsIgnoreCase("ogrenci")) {
			
			System.out.println("Aradiginiz ogrenci kimlik no giriniz : ");
			String araOgrenciKimlik=scan.next();
			boolean kontrol = true;
			for (Kisi k : ogrenciList) {
				if (k.getKimlikNo().contains(araOgrenciKimlik)) {
					System.out.println("Aradiginiz ogrenci : "+k.getAdSoyad());
					kontrol = false;				
			}
				if (kontrol) {
				System.out.println("Aradiginiz ogrenci mevcut degil");
				}			
		}
		}else if(kisiTuru.equalsIgnoreCase("ogretmen")) {
			System.out.println("Aradiginiz ogretmen kimlik no giriniz : ");
			String araOgretmenKimlik=scan.next();
			boolean kontrol = true;
			for (Kisi k : ogrenciList) {
				if (k.getKimlikNo().contains(araOgretmenKimlik)) {
					System.out.println("Aradiginiz ogretmen : "+k.getAdSoyad());
					kontrol = false;				
			}
				if (kontrol) {
				System.out.println("Aradiginiz ogretmen mevcut degil");
				}			
		}
		}
	}

	private static void ekleme() {
		Scanner scan = new Scanner(System.in);
		System.out.println("*****   " + kisiTuru + " ekleme sayfasi    *****");		
		System.out.println("Ad Soyad giriniz");
		String adSoyad = scan.nextLine();
		System.out.println("Kimlik No giriniz");
		String kimlikNo = scan.next();		
		System.out.println("Yas giriniz");
		int yas = scan.nextInt();

		if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
			System.out.println("Ogrenci no giriniz : ");
			String numara = scan.next();
			System.out.println("Sinif giriniz : ");
			String sinif = scan.next();
			Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, yas, numara, sinif);
			ogrenciList.add(ogrenci);
			System.out.println(ogrenci.toString());
		} 
		
		if (kisiTuru.equalsIgnoreCase("OGRETMEN")){
			System.out.println("Sicil no giriniz : ");
			String sicilNo = scan.next();
			System.out.println("Bolum giriniz : ");
			String bolum = scan.next();
			Ogretmen ogretmen = new Ogretmen(sicilNo, bolum, adSoyad, kimlikNo, yas);
			ogretmenList.add(ogretmen);
			System.out.println(ogretmen.toString());
		}

	}

}
