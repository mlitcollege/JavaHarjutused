package main;

import java.util.Scanner;

public class Boolean {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		Scanner klaviatuur = new Scanner(System.in);
		System.out.println("sisesta arv1");
		int arv1 = klaviatuur.nextInt();
		System.out.println("sisesta arv2");
		int arv2 = klaviatuur.nextInt();
		
		String tulemus = arv1 < arv2 ? "arv1 on väiksem kui arv2" : "arv2 ei ole väiksem kui arv1";
		System.out.println(tulemus);
		
		if (arv1 < arv2) {
			System.out.println("t6ene");
		} else {
			System.out.println("v22r");
		}
	}

}
