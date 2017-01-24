package main;

import java.util.Scanner;

public class ScannerSisend {

	public static void main(String[] args) {
		Scanner klaviatuur = new Scanner(System.in);
		
		System.out.println("Sisesta nimi");
		// kui tahan täisnime kirjutada, siis peab olema klaviatuur.nextLine()
		String nimi = klaviatuur.nextLine();
		System.out.println("Sisesta vanus");
		int vanus = klaviatuur.nextInt();
		System.out.println("Sisesta palganumber");
		double palganumber = klaviatuur.nextDouble();
		
		System.out.println("Tere, " + nimi + ", Sinu vanus on " + vanus + " ja palganumber on Sul " + palganumber + "$");
	}

}
