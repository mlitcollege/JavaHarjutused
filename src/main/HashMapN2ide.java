package main;

import java.util.HashMap;

public class HashMapN2ide {

	public static void main(String[] args) {
		// 1.näide
		HashMap<String, Integer> a = new HashMap<>();
		
		a.put ("Peeter", 35);
		a.put ("Mari", 27);
		a.put("key", 10);
		
		System.out.println("a = " + a);
		System.out.println(a.get("key"));
		
		// 2.näide
		HashMap<String, HashMap> b = new HashMap<>();
		HashMap MinuAndmed = new HashMap<>();
		HashMap S6braAndmed = new HashMap<>();
		
		MinuAndmed.put("vanus", 23);
		MinuAndmed.put("elukoht", "Kohila");
		S6braAndmed.put("sünniaasta", 1995);
		
		b.put("Martin", MinuAndmed);
		b.put("S6ber", S6braAndmed);
		
		System.out.println(b);
		System.out.println("neljas n2ide: " + (b.get("Martin")));
	
	}

}
