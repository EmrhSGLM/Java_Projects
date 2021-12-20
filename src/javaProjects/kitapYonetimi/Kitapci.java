package javaProjects.kitapYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
	1.	Kullanıcının Kitap ekleme, silme ve listeleme gibi
		işlemleri yapmasına imkan tanıyan bir uygulama yazınız.

	2.	Program, kitaplara 1001’den başlayarak sıralı ve otomatik numara vermeli.
		Bunun yanında, her bir kitap için Kitap Adı, Yazar Adı, Yayın Yılı ve Fiyat gibi bilgiler girilebilmelidir.

	3.	Programın başlangıcında Kullanıcıya aşağıdaki gibi bir menü sunulmalıdır.
		Kullanıcı programı bitirene kadar işlemlere devam edebilmelidir.

		========= KİTAP PROGRAMI =============
			1: Kitap ekle
			2: Numara ile kitap sil
			3: Tüm kitapları listele
			4: Bitir

 */
public class Kitapci extends Depo {


    public static void main(String[] args) {
    	Scanner scan = new Scanner (System.in);
    	System.out.println("========= KULTUR KITAPCILIK ==========\n");
    	
    	char crc='D';
    	
    	
    	while(!(crc == 'C')) {
    		
    		System.out.println("Yapmak istediginiz islemi seciniz : \n1: Kitap Ekle \n2: Numara ile kitap sil \n3: Tum kitaplari listele \n4: Bitir\n");
        	int secim=scan.nextInt();
    		switch (secim) {
    		case 1 :
    			Depo ekle=new Depo();
    			ekle.kitapEkle();
    			break;
    			
    		case 2 :
    			Depo sil=new Depo();
    			sil.kitapSil();
    			
    			break;
    		case 3:
    			Depo liste=new Depo();
    			liste.listele();
    			
    			break;
    		case 4 :
    			System.out.println("Gule Gule ");
    			crc='C';
      			break;
    			
    		default:
    			System.out.println("Hatali giris yaptiniz");
    			
    		}
    		
    	}
    	
    	


    }

}

