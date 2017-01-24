package ylesanded;

// Koostage Java meetod etteantud täisarvumaatriksi m reamiinimumide massiivi leidmiseks 
// (massiivi i-s element on maatriksi i-nda rea vähima elemendi väärtus). Read võivad olla erineva pikkusega.
// Write a method in Java to find the array of minimums of rows of a given matrix of 
// integers m (i-th element of the answer is the minimum of elements of the i-th row in the matrix). Rows might be of different length.
//	public static int[] reaMinid (int[][] m)
 
import java.util.Arrays;
 
public class T2isarvumaatrixMReamin {
   public static void main(String[] args) {
      int[] res = reaMinid(new int[][] { { 1, 2, 3 }, { 4, 5, 6 } });
      // 1, 4
      System.out.println(Arrays.toString(res));
   }
 
   public static int[] reaMinid(int[][] m) {
      int[] min = new int[m.length];
      int vähim = 0;
     
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[i].length; j++) {
            if (j == 0) {
               vähim = m[i][j];
            }
            else if (vähim > m[i][j]){
               vähim = m[i][j];
            }
         }
         min[i] = vähim;
      }
      return min;
   }
 
}

//public class Answer {
//
//   public static void main (String[] args) {
//      int[] res = reaMinid (new int[][] { {1,2,3}, {4,5,6} }); // {1, 4}
//      // YOUR TESTS HERE
//   }
//
//   public static int[] reaMinid (int[][] m) {
//      int[] min = new int[m.length];
//      for (int l = 0; l < m.length; l++) {
//         min[l] = m[l][0];
//         for (int i = 0; i < m[l].length; i++) {
//            if (min[l] > m[l][i]) {
//               min[l] = m[l][i];
//            }
//         }
//      }
//      return min;
//   }
//
//}
