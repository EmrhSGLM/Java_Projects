package javaProjects.hastaneOtomasyon;

import java.util.Scanner;

public class HastaneRunner {

	private static Hastane hastane1 = new Hastane();	

	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sikayetinizi giriniz : ");
		String aktuelDurum = scan.nextLine();
		
		hastane1.setDoktor(doktorBul(aktuelDurum));
		hastane1.setHasta(hastaBul(aktuelDurum));
		hastaDurumuBul(aktuelDurum); 		
		
		System.out.println("Doktor ismi : " + hastane1.doktor.getIsim());
		System.out.println("Doktor Soyismi : " + hastane1.doktor.getSoyisim());
		System.out.println("Doktor Unvani : " + hastane1.doktor.getUnvan());
		System.out.println("Hasta Ismi : " + hastane1.hasta.getIsim());
		System.out.println("Hasta Soyismi : " + hastane1.hasta.getSoyIsim());
		System.out.println("Hasta ID : " + hastane1.hasta.getHastaID());
		scan.close();

	}

	public static String doktorUnvan(String aktuelDurum) {

		if (aktuelDurum.equalsIgnoreCase("Allerji")) {
			return hastane1.unvanlar.get(0);
		} else if (aktuelDurum.equalsIgnoreCase("Bas agrisi")) {
			return hastane1.unvanlar.get(1);
		} else if (aktuelDurum.equalsIgnoreCase("Diabet")) {
			return hastane1.unvanlar.get(2);
		} else if (aktuelDurum.equalsIgnoreCase("Soguk Alginligi")) {
			return hastane1.unvanlar.get(3);
		} else if (aktuelDurum.equalsIgnoreCase("Migren")) {
			return hastane1.unvanlar.get(4);
		} else if (aktuelDurum.equalsIgnoreCase("Kalp hastaliklari")) {
			return hastane1.unvanlar.get(5);
		} else {
			return "Yanlis unvan";
		}

	}

	public static Doktor doktorBul(String aktuelDurum) {

		for (int i = 0; i < hastane1.doktorIsimleri.size(); i++) {
			if (aktuelDurum.equalsIgnoreCase(hastane1.durumlar.get(i))) {
				hastane1.doktor.setIsim(hastane1.doktorIsimleri.get(i));
				hastane1.doktor.setSoyisim(hastane1.doktorSoyisimleri.get(i));
				hastane1.doktor.setUnvan(hastane1.unvanlar.get(i));
			}
		}

		return hastane1.doktor;
	}

	public static Durum hastaDurumuBul(String aktuelDurum) {
		
		aktuelDurum = aktuelDurum.substring(0, 1).toUpperCase() + aktuelDurum.substring(1).toLowerCase();

		switch (aktuelDurum) {
		case "Allerji":
			hastane1.hasta.durum.setAciliyet(false);
			break;
		case "Bas agrisi":
			hastane1.hasta.durum.setAciliyet(false);
			break;
		case "Diabet":
			hastane1.hasta.durum.setAciliyet(false);
			break;
		case "Soguk alginligi":
			hastane1.hasta.durum.setAciliyet(false);
			break;
		case "Migren":
			hastane1.hasta.durum.setAciliyet(true);			
			break;
		case "Kalp hastaliklari":
			hastane1.hasta.durum.setAciliyet(true);
			break;

		default:
			System.out.println("Gecerli bir durum degil");
			break;
		}

		return hastane1.hasta.durum;
	}

	public static Hasta hastaBul(String aktuelDurum) {

		for (int i = 0; i < hastane1.hastaIsimleri.size(); i++) {
			aktuelDurum = aktuelDurum.substring(0, 1).toUpperCase() + aktuelDurum.substring(1).toLowerCase();
			if (aktuelDurum.equalsIgnoreCase(hastane1.durumlar.get(i))) {
				hastane1.hasta.setHastaID(hastane1.hastaIDleri.get(i));
				hastane1.hasta.setIsim(hastane1.hastaIsimleri.get(i));
				hastane1.hasta.setSoyIsim(hastane1.hastaSoyisimleri.get(i));
				
				//hastane1.hasta.setHastaDurumu(null);

			}
		}

		return hastane1.hasta;

	}

}
