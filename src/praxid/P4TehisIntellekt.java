package praxid;

import lib.TextIO;

public class P4TehisIntellekt {

	public static void main(String[] args) {
		System.out.println("Sisesta esimene vanus"); 
		int vanus1 = kysiVanus();
        System.out.println("Sisesta teine vanus");
        int vanus2 = kysiVanus();
        int vanusteVahe = Math.abs(vanus1 - vanus2);
        
		if (vanusteVahe > 5) {
	        System.out.println("Midagi krõbedat");
		} else if (vanusteVahe > 10) {
	        System.out.println("Midagi veel krõbedamat");
		} else {
	        System.out.println("Sobib!");
		} 
	}

	private static int kysiVanus() {
		int vanus;
		while (true) {
			vanus = TextIO.getInt();
			if (vanus < 0) {
				System.out.println("Vanus ei saa olla negatiivne");
			} else {
				break;
			}
		}
		return 0;
	}

}
