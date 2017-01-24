package praxid;

import lib.TextIO;

public class P5Tabel22ristega {

	public static void main(String[] args) {
		System.out.println("Sisesta tabeli suurus");
		int tabeliSuurus = TextIO.getInt();

		tryki22ris(tabeliSuurus);

		for (int i = 0; i < tabeliSuurus; i++) {
			System.out.print("| ");
			for (int j = 0; j < tabeliSuurus; j++) {
				if (j == i || i + j == tabeliSuurus - 1) {
					System.out.print("x ");
				} else {
					System.out.print("0 ");
				}

			}
			System.out.print("|");
			System.out.println();
		}

		tryki22ris(tabeliSuurus);
	}

	private static void tryki22ris(int tabeliSuurus) {
		for (int i = 0; i < tabeliSuurus * 2.5; i++) {
			System.out.print("-");
		}
		System.out.println();

	}

}
