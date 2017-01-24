package ylesanded;

//On antud positiivne täisarv n. Kirjutada Java meetod, mis leiab täisarvu, 
//mis saadakse n kümnendesituses numbrite järjekorra ümberpööramise teel.

//public static void main(String[] args) {
//                System.out.println(inverse(1234)); // 4321
//        }
// 
//        public static int inverse(int n) {
//               
//        int tagurpidi = 0;
//        int j22k = 0;
//        do{
//            j22k = n%10;
//            tagurpidi = tagurpidi*10 + j22k;
//            n = n/10;
//         
//        }while(n > 0);
//     
//        return tagurpidi;
//        }

/*
 * On antud positiivne täisarv n. Kirjutada Java meetod, mis leiab täisarvu,
 * mis saadakse n kümnendesituses numbrite järjekorra ümberpööramise teel.
Integer n is positive. Write a Java method to find an integer that consists of decimal digits of n in inverse order.
   public static int inverse  (int n)
 */

public class J2rjekorraYmberpooramine {

   public static void main (String[] args) {
      System.out.println (inverse (12345)); // 4321
   }

   public static int inverse (int n) {
      int backwards = 0;
      int rest = 0;
      
      do {
         rest = n%10;
         backwards = backwards*10 + rest;
         n = n/10;
      } while (n > 0);
      
      return backwards;
   }

}


//public class T2isarv5mberp88rata {
//	public static void main (String[] args) {
//	      System.out.println (inverse (1234)); // 4321
//	   }
//
//	   public static int inverse (int n) {
//	      String arv = Integer.toString(n);
//	      String valepidi = "";
//	      
//	      int indeks = 0;
//	      for (int i=0; i<arv.length(); i++) {
//		  indeks = (arv.length()-i)-1;
//		  valepidi = valepidi + arv.charAt(indeks); 
//	      }
//	      return Integer.parseInt(valepidi); // TODO!!! Your code here!
//	   }
//
//}
//On antud positiivne t2isarv n. Kirjutada Java meetod, mis leiab 
//t2isarvu, mis saadakse n k5mnendesituses numbrite 
//j2rjekorra 5mberp88ramise teel.