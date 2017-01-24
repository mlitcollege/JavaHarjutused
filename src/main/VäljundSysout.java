package main;

public class VäljundSysout {

	public static void main(String[] args) {
		
		// %s (string)
		String nimi = "Martin";
		// %d - int (täisarv)
		int vanus = 23;
		// %f - float või double (reaalarv), %.2f - kaks komakohta
		double palk = 1500; 
		System.out.printf("Su nimi on %s, vanusega %d ja palganumbriga %f", nimi, vanus, palk);
		// %n - uus rida
		System.out.println();
		System.out.printf("Tere%nMartin");

	}

}
