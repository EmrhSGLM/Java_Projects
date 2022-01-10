package geometrikHesaplama;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		geometrikHesaplama();	
 
	}

	private static void geometrikHesaplama() {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Geometrik Hesaplama\n\t1-Cember\n\t2-Diktortgen\n\t3-Kare"
				+ "\nHesaplamak istediginiz sekli giriniz");
		int secim=scan.nextInt();
		
		switch (secim) {
		case 1:
			Sekil cember = new Cember();		
			cember.alan();
			cember.cevresi();
			break;
		case 2:
			Sekil dk = new Diktortgen();
			dk.alan();
			dk.cevresi();
			break;
		case 3:
			Sekil kare = new Kare();
			kare.alan();
			kare.cevresi();
			break;

		default:
			System.out.println("Yanlis deger girdiniz");	
			geometrikHesaplama();
			break;
		}
		
	}

}
