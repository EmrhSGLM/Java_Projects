package kitapYonetimi;

import java.util.List;
import java.util.Scanner;

public class KitapMethod {
	
	static Scanner scan = new Scanner (System.in);
	static int kitapNo=1000;
	
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

	private static void listele(List<Kitap> liste) {
		
		for (Kitap k : liste) {
			System.out.println(k.toString());			
		}
		menu(liste);
	}

	public static void noIleSil(List<Kitap> liste) {
		
		System.out.println("Silinecek kitap no giriniz");
		int silNo=scan.nextInt();
		
		for (Kitap k : liste) {
			if (k.getNo() == silNo) {
				liste.remove(k);
				menu(liste);
			} 
		}
		System.out.println(silNo+" ait kitap bulunamdi !!!");
		menu(liste);
	}

	public static void kitaplarEkle(List<Kitap> liste) {
		Kitap kitap1 = new Kitap(++kitapNo,"Sefiller","Victor Hugo",1890,100);
		Kitap kitap2 = new Kitap(++kitapNo,"Serenad","Livaneli",19090,150);
		Kitap kitap3 = new Kitap(++kitapNo,"Insan ne ile yasar","tolstoy",1895,200);
		Kitap kitap4 = new Kitap(++kitapNo,"Korler","kitabim",1895,100);
		Kitap kitap5 = new Kitap(++kitapNo,"Haydi","kudret narı",1890,100);
		
		liste.add(kitap1);
		liste.add(kitap2);
		liste.add(kitap3);
		liste.add(kitap4);
		liste.add(kitap5);		
		
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

}
