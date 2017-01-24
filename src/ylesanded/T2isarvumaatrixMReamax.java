package ylesanded;

//koostage Java meetod etteantud täisarvumaatriksi m reamaksimumide massiivi leidmiseks (massiivi i-s element on maatriksi i-nda rea suurima elemendi väärtus). Read võivad olla erineva pikkusega.

//public static void main(String[] args) {
//                int[] res = reaMaxid(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, {-3} }); // {3,
//                                                                                                                                                // 6}
//                // YOUR TESTS HERE
//        }
// 
//        public static int[] reaMaxid(int[][] m) {
// 
//                int[] vastus = new int[m.length];
// 
//                for (int l = 0; l < m.length; l++) {
// 
//                        vastus[l] = m[l][0];
//                        for (int i = 0; i < m[l].length; i++) {
//                                if (vastus[l] < m[l][i]) {
//                                        vastus[l] = m[l][i];
//                                }
//                        }
//                }
//                return vastus;
//        }

public class T2isarvumaatrixMReamax {
	   
	public static void main (String[] args) {
		int[] res = reaMaxid (new int[][] {{1,2,3}, {4,5,6}}); // {3, 6}
      
		for (int i=0;i<res.length;i++)
    	  System.out.println(res[i]);
      // YOUR TESTS HERE
   }
   
	public static int[] reaMaxid (int[][] m) {
	   
		int [] vastus = new int [m.length];
	   
		for (int i=0;i<m.length;i++){
		   vastus[i] = -999999;
		}
	   
		for (int i=0;i<m.length;i++)
		{
		   
			for(int j=0;j<m[i].length;j++)
			{
			   
				if (m[i][j]>vastus[i])
				{
					vastus[i] = m[i][j];
				}
			}
		}
      return vastus; // TODO!!! Your code here!
		}
}

//Koostage Java meetod etteantud t2isarvumaatriksi m 
//reamaksimumide massiivi leidmiseks (massiivi i-s element on 
//maatriksi i-nda rea suurima elemendi v22rtus). 
//Read v6ivad olla erineva pikkusega.




/** ZIRK
 * Koostage Java meetod etteantud täisarvumaatriksi m reamaksimumide massiivi leidmiseks
 * (massiivi i-s element on maatriksi i-nda rea suurima elemendi väärtus). Read võivad olla erineva pikkusega.
 * Write a method in Java to find the array of maximums of rows of a given matrix of integers m
 * (i-th element of the answer is the maximum of elements of the i-th row in the matrix).
 * Rows might be of different length. 
 * 
 * @param m
 * @return
 */
//public static int[] reaMaxid (int[][] m) {
//   int maxSuurus = 0;
//   
//   // leiame suurima rea
//   for (int i = 0; i < m.length; i++) {
// 	  if (m[i].length > maxSuurus) {
// 		  maxSuurus = m[i].length;
// 	  }
//   }
//   
//   int[] maxid = new int[m.length];
//   for (int i = 0; i < maxid.length; i++) {
// 	  maxid[i] = Integer.MIN_VALUE;
//   }
//   
//   for (int i = 0; i < m.length; i++) {
// 	  for (int j = 0; j < m[i].length; j++) {
// 		  if (m[i][j] > maxid[i]) {
// 			  maxid[i] = m[i][j]; 
// 		  }
// 	  }
//   }
//   
//   return maxid;
//}