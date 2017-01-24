package praxid;

import lib.TextIO;

public class P4CumLaude {

	public static void main(String[] args) {
		
		System.out.println("Sisesta lõputöö hinne");
		int l6putoo = TextIO.getlnInt(); 
        if (l6putoo < 0 || l6putoo > 5) {
        	System.out.println("Ei ole korrektne number");
        	return;
		}
        
		System.out.println("Sisesta keskmine hinne");
		double keskmine = TextIO.getDouble();
		if (keskmine < 0 || keskmine > 5) {
	        System.out.println("Ei ole korrektne number");
	        return;
		}
		
		if (keskmine > 4.5 && l6putoo == 5) {
			System.out.println("Saad Cum Laude");
			
		} else {
			System.out.println("Ei saa Cum Laudet");
		}
		
	}

}
