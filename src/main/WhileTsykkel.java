package main;

public class WhileTsykkel {

	public static void main(String[] args) {

		// int l = 0;
		// while (l < 10) {
		// System.out.println("Tere");
		// l = l + 1;
		// }

		// While tsykli kasutamine massiiviga
		int[] kiirused = { 87, 91, 95, 86, 89 };
		int l = 0;
		while (l < 5) {
			if (kiirused[l] > 90) {
				System.out.println("Trahv");
			}
			l = l + 1;
		}
		System.out.println("Tsükkel l2bi");
		
		// 2.näide (massiiviga)
		System.out.println("TEINE N2IDE");
		
		String[] a = {
				"mina",
				"tema",
				"sina"
		};
		
		int arv = 0;
		while (arv < a.length) {
			System.out.println(a[arv]);
			arv = arv + 1;
		}
	}
}
