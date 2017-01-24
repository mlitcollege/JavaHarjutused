package main;

import java.util.ArrayList;

public class ArrayN2ide {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		ArrayList b = new ArrayList();
		ArrayList c = new ArrayList();

		a.add("Sõne");
		a.add(54);
		a.add(87.90);
		b.add("hei");
		b.add(0);
		b.add(199999);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a ja b = " + a + b);
		System.out.println(c.isEmpty());
	}

}
