package javaProjects.geometrikHesaplama;

import java.util.Arrays;

public class deneme {

	public static void main(String[] args) {
		int sayilar1[]= {1,2,3,4};
	    int sayilar2[]= {10,20,30,40};
	    sayilar1=sayilar2;
	    System.out.println(Arrays.toString(sayilar1));
	    System.out.println(Arrays.toString(sayilar2));
	    sayilar1[0]=100;
	    System.out.println(sayilar2[0]);

	}

}
