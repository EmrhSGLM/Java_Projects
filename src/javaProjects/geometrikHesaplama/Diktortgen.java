package javaProjects.geometrikHesaplama;

import java.util.Scanner;

public class Diktortgen extends Sekil{
	
	protected double uzunKenar;
	protected double kisaKenar;
	
	
	
	public void alan() {
		Scanner scan = new Scanner ( System.in);
		System.out.println("Uzun kenari  giriniz : ");
		uzunKenar = scan.nextDouble();
		System.out.println("Kisa kenari giriniz : ");
		kisaKenar = scan.nextDouble();
		System.out.println("Alan = "+(kisaKenar * uzunKenar));
	}
	
	public void cevresi() {		
		System.out.println("Cevresi = "+2 * (kisaKenar+uzunKenar));
	}

}
