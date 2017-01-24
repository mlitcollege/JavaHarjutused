package ylesanded;

// Koostage Java-meetod, mis leiab etteantud massiivi m elementide ruutude summa.
// Write a Java method to find the sum of squares of elements of a given array m.
//	public static int ruutudeSumma (int[] m)

public class MassiiviRuutudeSumma {

   public static void main(String[] args) {
      System.out.println(ruutudeSumma(new int[] { 0 }));
      // YOUR TESTS HERE
   }

   public static int ruutudeSumma(int[] m) {
      int summa = 0;
      int arvuRuut = 0;
      for (int i = 0; i < m.length; i++) {
         arvuRuut = m[i] * m[i];
         summa = summa + arvuRuut;
      }
      return summa;
   }

}
