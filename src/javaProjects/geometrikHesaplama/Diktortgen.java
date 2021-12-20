package javaProjects.geometrikHesaplama;

import java.util.Scanner;

public class Diktortgen extends Sekil{
	
	protected double uzunKenar;
	protected double kisaKenar;
	
	
	
	public void alan() {
		Scanner scan = new Scanner ( System.in);
		System.out.println("kis ve uzun kenari  giriniz : ");
		uzunKenar = scan.nextDouble();
		kisaKenar = scan.nextDouble();
		System.out.println("Alan = "+(kisaKenar * uzunKenar));
	}
	
	public void cevresi() {
		Scanner scan = new Scanner ( System.in);
		System.out.println("kis ve uzun kenari  giriniz : ");
		uzunKenar = scan.nextDouble();
		kisaKenar = scan.nextDouble();
		System.out.println("Cevresi = "+2 * (kisaKenar+uzunKenar));
	}

}
