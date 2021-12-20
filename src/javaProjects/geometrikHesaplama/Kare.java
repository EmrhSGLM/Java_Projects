package javaProjects.geometrikHesaplama;

import java.util.Scanner;

public class Kare extends Diktortgen{
	
	protected double kareKenar;
	
	public void alan() {
		Scanner scan = new Scanner ( System.in);
		System.out.println("Kenar uzunlugunu  giriniz : ");
		kareKenar = scan.nextDouble();
		
		System.out.println("Alan = "+(kareKenar * kareKenar));
		
	}
	
	public void cevresi() {
		Scanner scan = new Scanner ( System.in);
		System.out.println("Kenar uzunlugunu  giriniz : ");
		kareKenar = scan.nextDouble();
		
		System.out.println("Cevresi = "+2 * (kareKenar+kareKenar));
	}

}
