package javaProjects.geometrikHesaplama;

import java.util.Scanner;

public class Cember extends Sekil {
	
	protected double cemberYaricapi;
	
	
		
	public void alan() {
		Scanner scan = new Scanner ( System.in);
		System.out.println("Yaricapi giriniz : ");
		cemberYaricapi = scan.nextDouble();
		System.out.println("Alan = "+3.14*(cemberYaricapi * cemberYaricapi));
	}
	
	public void cevresi() {
		System.out.println("Cevresi = "+2 * 3.14*(cemberYaricapi));
	}

}
