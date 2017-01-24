package main;

public class SwitchN2ide {

	public static void main(String[] args) {
		// 1.näide
		String aastaaeg = "sygis";
		switch (aastaaeg) {
			case "talv":
				System.out.println("sajab lund");
				break;
			case "sygis":
				System.out.println("sajab vihma");
				break;
			case "kevad":
				System.out.println("paistab päike, linnud laulavad");
				break;
			case "suvi":
				System.out.println("päike paistab");
				break;
			default:
				System.out.println("Temperatuur on -32 ja 27 kraadi vahel");
		
		}

	}

}
