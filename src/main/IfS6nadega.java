package main;

public class IfS6nadega {

	public static void main(String[] args) {
		String sihtpunkt = "Valga";
		
		if (sihtpunkt.equals("Viljandi")) {
			System.out.println("Keera paremale");
		} else if (sihtpunkt.equals("Tartu")) {
			System.out.println("Keera vasakule");
		} else {
			System.out.println("Otse edasi");
		}
	}

}
