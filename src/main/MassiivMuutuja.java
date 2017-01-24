package main;

public class MassiivMuutuja {

	public static void main(String[] args) {
		int [] ostukorv = {15, 28, 17, 5, 10};
		// järjekord 0-15, 1-28, 2-17 jne
		ostukorv [2] = 15;
		// prindin välja massiivi esimese väärtuse (0 on esimene)
		System.out.println(ostukorv[0]);

	}

}
