package javaApi;

import lib.TextIO;
import sun.net.TelnetProtocolException;

public class Replace {

	public static void main(String[] args) {
		// Kirjutada programm, mis küsib kasutaja käest tekstisisestuse, 
		// asendab selles kõik 'a'-tähed altkriipsudega ('_') 
		// ning trükib tulemuse konsooli.
		
		System.out.println("Sisesta nimi");
		String nimi = TextIO.getlnString();
		String uusNimi = nimi.replaceAll("a", "_");
		System.out.println(uusNimi);
		int nimePikkus = nimi.length();
		System.out.println("Nime pikkus on: " + nimePikkus + " tähemärki");
	
	}

}
