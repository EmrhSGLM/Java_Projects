package javaProjects.kitapYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Depo {
	 
	static List<String> kitaplar=new ArrayList<>();
	static int numara=1000;
	
	
	protected  List<String> kitapEkle() {
		char devam='D';
		
		while(!(devam == 'C')) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Kitap adini giriniz");
		String kitapAdi=scan.nextLine();
		
		System.out.println("Yazar adini giriniz");
		String yazarAdi=scan.nextLine();
		
		System.out.println("Yayin yilini giriniz");
		int yYili=scan.nextInt();
		
		System.out.println("Kitap fiyatini giriniz");
		double fiyat=scan.nextDouble();	
	
		kitaplar.add(numara+"     "+kitapAdi+"     "+yazarAdi+"        "+yYili+"      "+fiyat);
		numara++;
		
		System.out.println("Devam etmek icin 'D', cikis icin 'C' giriniz");
		devam=scan.next().toUpperCase().charAt(0);
		}
		return kitaplar;
	}
	protected  List<String> kitapSil() {
		char devam='D';
		
		while(!(devam == 'C')) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Silmek istediginiz kitabin numarasini giriniz : ");
		String sil=scan.next();
		for (int i = 0; i < kitaplar.size(); i++) {
			
			if (kitaplar.get(i).contains(sil)) {
				kitaplar.remove(i);
				numara--;				
			}
			
		}
		System.out.println("Devam etmek icin 'D', cikis icin 'C' giriniz");
		devam=scan.next().toUpperCase().charAt(0);
		}
		return kitaplar;
	}
	
	protected void listele() {
		System.out.println("\n\nNumara     Kitap adi     Yazar adi        Yayin Yili      Fiyat");
		System.out.println("======     =========     =========        ===========     ======");
		for (int i = 0; i < kitaplar.size(); i++) {
			System.out.println(kitaplar.get(i));
		}
		System.out.println("\n\n");
	}

}
