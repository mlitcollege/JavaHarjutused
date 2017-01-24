package main;

public class MathJavaApi {

	public static void main(String[] args) {
		// Math.pow() - astendamine
		int algne = 6;
		int aste = 3;
		double tulemus = Math.pow(algne, aste);
		System.out.println("1.n2ide: " + tulemus);
		// Math.max() - valib kahest arvust suurima
		System.out.println("2.n2ide: " + Math.max(algne, aste));
		// Math.random() - genereerib suvalise numbri 0-0.99999999
		System.out.println("3.n2ide: " + (int) (Math.random() * 2));
		// Math.round() - ümardaja
		double a = 45.7663;
		System.out.println("4.n2ide: " + Math.round(a));
		// Integer max ja min
		System.out.println("5.n2ide: " + " max: " + Integer.MAX_VALUE + " min: " + Integer.MIN_VALUE);
		// Integer.parseint(String) - sõna kujul arv intiks
		int o = Integer.parseInt("25");
		System.out.println("6.n2ide: " + o);
	}

}
