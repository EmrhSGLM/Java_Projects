package javaProjects.kitapYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitap_main {
	
	static List<Kitap> liste = new ArrayList<>(); 
	//static Scanner scan = new Scanner (System.in);
	//static int kitapNo=1000;

	public static void main(String[] args) {
		KitapMethod.kitaplarEkle(liste);
		KitapMethod.menu(liste);

	}
	/*
	public static void menu(List<Kitap> liste) {
		System.out.println("========== KITAP PROGRAMI ==========\n1: Kitap ekle\n2: Numara ile kitap sil\n3: Tum kitaplari listele\n4: Bitir");
		System.out.println("Isleminizi seciniz");
		int tercih=scan.nextInt();
		
		switch (tercih) {
		case 1 :
			kitapEkle(liste);
			break;
			
		case 2 :
			noIleSil(liste);			
			break;
		case 3:
			listele(liste);			
			break;
		case 4 :
			bitir();
  			break;
			
		default:
			System.out.println("Yanlis giris yapildi tekrar deneyiniz");
			break;
		}
		
	}

	private static void listele(List<Kitap> liste2) {
		
		for (Kitap k : liste) {
			System.out.println(k.toString());			
		}
		menu(liste);
	}

	private static void noIleSil(List<Kitap> liste2) {
		
		System.out.println("Silinecek kitap no giriniz");
		int silNo=scan.nextInt();
		
		for (Kitap k : liste) {
			if (k.getNo() == silNo) {
				liste2.remove(k);
				menu(liste);
			} 
		}
		System.out.println(silNo+" ait kitap bulunamdi !!!");
		menu(liste);
	}

	private static void kitapEkle(List<Kitap> liste) {
		System.out.print("Kitap ismi giriniz : ");
		scan.nextLine(); // dummy --> kukla Bos scan obj
		String kitapAdi=scan.nextLine();
		//scan.nextLine(); // dummy --> kukla Bos scan obj
		System.out.print("Kitap yazar ismi giriniz : ");
		String yazarAdi=scan.nextLine();
		System.out.print("Kitap yayin yilini giriniz : ");
		int yayinYili=scan.nextInt();
		System.out.print("Kitap fiyatini giriniz : ");
		double fiyat=scan.nextDouble();
		Kitap kitap = new Kitap(++kitapNo,kitapAdi,yazarAdi,yayinYili,fiyat); // Kitap objesi creat edildi
		liste.add(kitap);
		System.out.println(kitap.toString()+ " eklendi :) ");
		menu(liste);
	}

	private static void bitir() {
		System.out.println("Yine bekleriz");
		
	}
*/
}
