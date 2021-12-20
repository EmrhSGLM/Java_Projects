package yiyecekOtomatiProjesi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class YiyecekOtomati {
	
	static List<String> ürünler = new ArrayList<>(
			Arrays.asList("Tutku", "Oreo", "Biskrem", "İkram", "Çokoprens", "Hanımeller", "Halley", "EtiCin",
					"Biscolata", "Saklıköy", "Burçak", "Form", "Lotus", "McVitie's", "Kurabi"));
	static List<Double> fiyatlar = new ArrayList<>(Arrays.asList(5.00, 10.00, 1.00, 5.00, 1.00, 5.00, 20.00, 5.00, 5.00,
			1.00, 5.00, 1.00, 20.00, 5.00, 10.00));
	static List<String> alınanÜrünler = new ArrayList<>();
	static List<Integer> alınanÜrünAdedi = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	static double toplamFiyat=0; 
	
	public static void main(String[] args) {
		
		String devam="e";
		
		
		while(devam.equalsIgnoreCase("e")) {
			
			ürünler();//önce ürünleri listelemesi lazım
			System.out.print("Almak istediğiniz ürünün no'sunu giriniz : ");
			int ürünNo=scan.nextInt();
			System.out.print("Kaç tane alıcaksınız : ");
			int adet=scan.nextInt();
			ekle(ürünNo,adet);					
			System.out.println("Eklemek istediğiniz başka bir ürün var mı?\nVarsa e'ye basınız.");
		    devam=scan.next();
		}
		odeme();
		cikis();
		
		
	}

	private static void cikis() {
		System.out.println("Gule Gule Birdaha Bekleriz");
		
	}

	private static void odeme() {
		System.out.println("Odenecek Miktar :" +toplamFiyat );
		System.out.println("Odeme icin para tutari giriniz : ");
		double tutar=scan.nextDouble();
		for (int i = 1; i >0; i++) {
			if (tutar ==1 || tutar==5 || tutar==10 || tutar==20) {
				double paraUstu=tutar-toplamFiyat;
				if(paraUstu<0) {
					paraUstu=paraUstu*-1;
					System.out.println(paraUstu+" tl kadar tutar odemeniz gerekiyor");
					odeme1(paraUstu);
				}else if (paraUstu>0) {
					System.out.println("Paranizin ustu : " +paraUstu+"\nOdemeniz yapildi"); break;
				} else System.out.println("Odemeniz yapildi"); break;
			} else System.out.println("Gecersin para girisi");odeme();
		}
		
		
	}

	private static void odeme1(double paraUstu) {
		System.out.println("Odenecek Miktar :" +paraUstu );
		System.out.println("Odeme icin para tutari giriniz : ");
		double tutar1=scan.nextDouble();
		for (int i = 1; i >0; i++) {
			if (tutar1 ==1 || tutar1==5 || tutar1==10 || tutar1==20) {
				paraUstu=tutar1-paraUstu;
				if(paraUstu<0) {
					paraUstu=paraUstu*-1;
					System.out.println(paraUstu+" tl kadar tutar odemeniz gerekiyor");
					odeme1(paraUstu);
				}else if (paraUstu>0) {
					System.out.println("Paranizin ustu : " +paraUstu+"\nOdemeniz yapildi"); break;
				} else System.out.println("Odemeniz yapildi"); break;
			} else System.out.println("Gecersin para girisi");odeme1(paraUstu);
		}
		
	}

	private static void ekle(int ürünNo, int adet) {
		alınanÜrünler.add(ürünler.get(ürünNo));
		alınanÜrünAdedi.add(adet);
		toplamFiyat += fiyatlar.get(ürünNo)*adet; 
		System.out.println(ürünler.get(ürünNo)+" ürününden "+adet+" aldiniz "+"\nToplam tutar : "+toplamFiyat);
		
		
	}

	private static void ürünler() {
		
		System.out.println("No\t"+"Ürünler\t"+"   Fiyat\t");
		System.out.println("==="+"     ======="+" "+"   =====");
		
		for (int i = 0; i <ürünler.size(); i++) {//numara sırasına göre yazdırıcağımız için döngü kullanıyoruz
			System.out.println(" "+i+"\t"+ürünler.get(i)+" ---->  "+fiyatlar.get(i));
		}
		
	}

}
