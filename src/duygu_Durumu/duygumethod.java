package duygu_Durumu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class duygumethod extends Duygularim {

	static List<Duygularim> duygu = new ArrayList<>();
	
	static Duygularim obj=new Duygularim();
	
	static List<String> duygulistesi = new ArrayList<>(Arrays.asList( "Mutluluk",  "korku",  "Kiskanclik",  "Huzun",  "Utanc",  "Ofke", 
													"Gurur",  "Heyecan", "Tiksinti",  "Darlanma",  "Yetersiz"));
	
	
	
	static boolean a = true;

	public static void main(String[] args) {
		
		secim();
		toInteger();
		gunce();
		

		
	}

	
	


	private static void gunce() {
		System.out.println();
		for (int i = 0; i < obj.list.size(); i++) {
			System.out.println(obj.list.get(i));
		}
		
	}





	private static void secim() {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("\n\tDUYGULAR MENUSU \n 1 duygu ekleme \n 2 duygu listeleme \n 3 cikis\n");
			System.out.print("Seciminiz ==> ");
			int secim = scan.nextInt();

			switch (secim) {
			case 1:
				duyguekleme();				
				break;
			case 2:
				duygulisteleme();
				secim();
				break;
			case 3:
				cikis();
				break;
			
			default:
				System.out.println("Gecerli tercih griniz");
				secim();
				break;
			}
		
	}
	
	private static void cikis() {
		
		System.out.println("guzel gunlere ");
	}





	private static void duygulisteleme() {
		System.out.println("\tDUYGULAR LISTESI\n");
		for (int i = 0; i < duygulistesi.size(); i++) {
			System.out.println("1 ==> "+duygulistesi.get(i));
		}

	}

	private static void duyguekleme() {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("bugun  hissettigin mutluluk duygumun seviyesi");
		int mutderece=scan.nextInt();
		obj.duyguPuan.add(mutderece);
		System.out.println("bugun  hissettigin korku duygumun seviyesi");
		int korkderece=scan.nextInt();
		obj.duyguPuan.add(korkderece);
		System.out.println("bugun  hissettigin kiskanclik duygumun seviyesi");
		int kisderece=scan.nextInt();
		obj.duyguPuan.add(kisderece);
		System.out.println("bugun  hissettigin huzun duygumun seviyesi");
		int huzunderece=scan.nextInt();
		obj.duyguPuan.add(huzunderece);
		System.out.println("bugun  hissettigin utanc duygumun seviyesi");
		int utanderece=scan.nextInt();
		obj.duyguPuan.add(huzunderece);
		System.out.println("bugun  hissettigin ofke duygumun seviyesi");
		int ofkederece=scan.nextInt();
		obj.duyguPuan.add(ofkederece);
		System.out.println("bugun  hissettigin gurur duygumun seviyesi");
		int gurderece=scan.nextInt();
		obj.duyguPuan.add(gurderece);
		System.out.println("bugun  hissettigin heyecen duygumun seviyesi");
		int heyderece=scan.nextInt();
		obj.duyguPuan.add(heyderece);
		System.out.println("bugun  hissettigin tiksinti duygumun seviyesi");
		int tikderece=scan.nextInt();
		obj.duyguPuan.add(tikderece);
		System.out.println("bugun  hissettigin darlanma duygumun seviyesi");
		int darderece=scan.nextInt();
		obj.duyguPuan.add(darderece);
		System.out.println("bugun  hissettigin yetersiz duygumun seviyesi");
		int yetderece=scan.nextInt();
		obj.duyguPuan.add(yetderece);
		Duygularim ben=new Duygularim(mutderece,korkderece,kisderece,huzunderece,utanderece,ofkederece,gurderece,heyderece,tikderece,darderece,yetderece);
		duygu.add(ben);
		
		System.out.println(duygu);	 
}
	private static void toInteger() {
		Scanner scan=new Scanner (System.in);
		for (int i = 0; i < obj.duyguPuan.size(); i++) {
			
			if(obj.duyguPuan.get(i) > 6) {
				String dyg=duygulistesi.get(i);
				System.out.print(dyg +" duygusu hakkinda bugun "
						+ "yasadiklarinizi bir cumle ile anlatin ==> ");
				String his=scan.nextLine();
				obj.list.add(dyg+" => "+his);
				
			}
		}
	}

}

