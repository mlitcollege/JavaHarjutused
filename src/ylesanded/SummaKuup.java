package ylesanded;

//Koostage Java-meetod, mis leiab kahe etteantud reaalarvu summa kuubi. 
//Write a method in Java to find the cube of the sum of two given real numbers.
//   public static double summaKuup (double a, double b)
//----------------------------------------------------------------------------------------------------------
public class SummaKuup {

 public static void main (String[] args) {
    System.out.println (summaKuup (5., -5.));
    // YOUR TESTS HERE
 }

 public static double summaKuup (double a, double b) {
	 double summa = a + b;
	 double summakuubis = Math.pow(summa, 3);
	 return summakuubis;  // TODO!!! YOUR PROGRAM HERE
 }

}
