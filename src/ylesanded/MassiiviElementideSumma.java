package ylesanded;

//Leida massiivi m negatiivsete elementide summa.

public class MassiiviElementideSumma {

	   public static void main (String[] args) {
	      System.out.println (negSumma (new int[]{0}));
	      // YOUR TESTS HERE
	   }

	   public static int negSumma (int[] m) {
		   int summa = 0;	   
		   
		   for(int d:m)
		   {
			   if(d<0)
			   {
				   summa+=d;
			   }
		   }
	      return summa;  // YOUR PROGRAM HERE
	   }

	}

/** ZIRK
 * Koostage Java-meetod, mis leiab etteantud massiivi m positiivsete elementide summa.
	* Write a method in Java to find the sum of positive elements of a given array m. 
 * @param m  array of integers
 * @return   return sum of positive input integers
 */

//public static int posSumma (int[] m) {
//   int sum = 0;
//   
//   for (int i = 0; i < m.length; i++) {
// 	  if (m[i] > 0) {
// 		  sum += m[i];
// 	  }
//   }
//   return sum;
//}
