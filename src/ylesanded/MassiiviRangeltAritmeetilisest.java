package ylesanded;

//Koostage Java meetod, mis leiab etteantud reaalarvude massiivi d põhjal niisuguste elementide arvu, 
//mis on rangelt suuremad kõigi elementide aritmeetilisest keskmisest 
//(aritmeetiline keskmine = summa / elementide_arv).
//Write a method in Java to find the number of elements strictly greater than arithmetic mean of all elements of a given array of real numbers d (arithmetic mean = sum_of_elements / number_of_elements).
//	public static int keskmisestParemaid (double[] d)

public class MassiiviRangeltAritmeetilisest {

    public static void main(String[] args) {
     System.out.println(keskmisestParemad(new double[] { 0., 1., 2., 3. }));
  }

  public static int keskmisestParemad(double[] d) {
     double summa = 0;
     double keskmine;
     int arv = 0;

     for (int i = 0; i < d.length; i++) {
        summa += d[i];
     }

     keskmine = summa / d.length;

     for (int j = 0; j < d.length; j++) {
        if (d[j] > keskmine) {
           arv++;
        }
     }
     return arv;
  }
}

/*
 * Koostage Java meetod, mis leiab etteantud reaalarvude massiivi d põhjal niisuguste elementide arvu,
 * mis on rangelt väiksemad kõigi elementide aritmeetilisest keskmisest
 * (aritmeetiline keskmine = summa / elementide_arv).
 * Write a method in Java to find the number of elements
 * strictly less than arithmetic mean of all elements of a given array
 * of real numbers d (arithmetic mean = sum_of_elements / number_of_elements).
 * public static int allaKeskmise (double[] d)
 */

//public class Answer2 {
//
//   public static void main(String[] args) {
//      System.out.println(allaKeskmise(new double[] { 0. }));
//      System.out.println(allaKeskmise(new double[] { 0., 5., 3., 2. }));
//   }
//
//   public static int allaKeskmise(double[] d) {
//      int mituTykki = 0;
//      double summa = 0.;
//      double keskmine = 0.;
//      
//      for (int i = 0; i < d.length; i++) {
//         summa= summa + d[i];
//      }
//      keskmine = summa / (d.length);
//      
//      
//      for (int i = 0; i < d.length; i++) {
//         if (d[i] < keskmine) {
//            mituTykki = mituTykki + 1;
//         }
//            
//      }
//      
//      return mituTykki;
//   }
//
//}





//public class AllaKeskmise {
//
//	   public static void main (String[] args) {
//	      System.out.println (allaKeskmise (new double[]{0.}));
//	      // YOUR TESTS HERE
//	   }
//
//	   public static int allaKeskmise (double[] d) {
//		   
//		   		double keskmine = 0;
//		   		int kogus = 0;
//		   		double summa = 0;
//			  
//			  for(double hinne : d)
//			  {
//				  kogus++;
//				  summa+=hinne;
//			  }
//			  keskmine = summa/kogus;
//			  
//			  kogus=0;
//			  for(double hinne : d)
//			  {
//				  if(hinne<keskmine)
//				  kogus++;			  
//			  }
//				  return kogus;  // YOUR PROGRAM HERE
//	   }
//
//	}
//	//Aritm.keskmisest v2iksemad.




/** ZIRK
 * Koostage Java meetod, mis leiab etteantud reaalarvude massiivi d põhjal niisuguste elementide arvu,
 * mis on rangelt väiksemad kõigi elementide aritmeetilisest keskmisest
 * (aritmeetiline keskmine = summa / elementide_arv).
 * Write a method in Java to find the number of elements strictly less than arithmetic mean of all elements
 * of a given array of real numbers d (arithmetic mean = sum_of_elements / number_of_elements).
 * 
 * @param d
 * @return
 */
//public static int allaKeskmise (double[] d) {
//		double keskmine = 0;
//		int elementideHulk = 0;
//		
//		for (int i = 0; i < d.length; i++) {
//			keskmine += d[i];
//		}
//		keskmine = keskmine / d.length;
//		
//		for (int i = 0; i < d.length; i++) {
//			if (d[i] < keskmine) {
//				elementideHulk++;
//			}
//		}
//		return elementideHulk;
//}