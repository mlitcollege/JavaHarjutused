package main;

public class StringMuutuja {

	public static void main(String[] args) {
		// mõeldud pigem lausete jaoks
		// 1.näide
		int minuRaha = 150;
		int ostukorv = 100;
		
		minuRaha = minuRaha - ostukorv;
		
		String minuRahaDollarites = minuRaha + "$";
		
		System.out.println(minuRahaDollarites);
	
		//2.näide
		String minuNimi = "Martin";
		System.out.println(minuNimi.substring(2));
		System.out.println(minuNimi.replace('a', 'ä'));
		
	}

}
