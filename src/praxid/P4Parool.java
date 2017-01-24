package praxid;

import lib.TextIO;

public class P4Parool {

	public static void main(String[] args) {
		
		System.out.println("Sisesta parool");
		String parool = sisestatudParool();

	}

	private static String sisestatudParool() {
		String parool = "pass";
		String sisestatudParool = TextIO.getlnString();
		if (parool.equals(sisestatudParool)) {
			System.out.println("Õige parool");
		} else {
			System.out.println("Vale parool");
		}
		return null;
	}

}
