package ylesanded;

//Kirjuta funktsioon numberOfItems, mis tagastab esimese argumendina ette antud int tüüpi massiivi pikkuse.
//public static int numberOfItems(int [] m)
//----------------------------------------------------------------------------------------------------------
public class MassiiviPikkus {
	public static int numberOfItems(int [] m) {
		int kuiMitu = m.length;		// Your code here!
		return kuiMitu;			// return -1;
	}

	public static void main(String [] args) {
	int [] test = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int [] test2 = { 100, 3, 5, 6, 222222, 14};
	
	System.out.println( numberOfItems(test) );
	System.out.println( numberOfItems(test2) );
	}
}