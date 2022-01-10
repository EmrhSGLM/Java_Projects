package OgrenciIsleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ogrenci123 {

	//private int numara;
	//private String adi;
	//private String soyadi;
	//private double ortalama;

	List<String> list = new ArrayList<>();

	protected List<String> ogrenciKaydi() {
		String devamMi = "";
		while (!devamMi.equalsIgnoreCase("C")) {

			Scanner scan = new Scanner(System.in);
			System.out.println("Ogrencinin ismini ve numarasini giriniz ");
			String ad = scan.next();
			String soyad = scan.next();
			list.add(ad + " " + soyad);
			System.out.println("Devam etmek icin 'D', cikis icin 'C' yi giriniz");
			devamMi = scan.next();
		}
		return list;

	}

	protected void ogrenciListeleme() {
		System.out.println("Adi      Soyadi");
		System.out.println("===      ======");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	protected List<String> ogrenciKaydiSil() {

		String devamMi = "";

		while (!devamMi.equalsIgnoreCase("C")) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Kaydi silinecek ogrencinin ismini ve soyadini giriniz");
			String ad = scan.next();
			String soyad = scan.next();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).contains(ad + " " + soyad)) {
					list.remove(i);
				}
			}
			System.out.println("Devam etmek icin 'D', cikis icin 'C' yi giriniz");
			devamMi = scan.next();
		}

		return list;

	}

}
