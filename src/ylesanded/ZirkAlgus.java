package ylesanded;

package eksam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class Answer {

   public static void main (String[] args) {
      //System.out.println (posSumma (new int[]{0}));
      //System.out.println (posSumma (new int[]{1, 2, 0, -9}));
      //System.out.println (allaKeskmise (new double[]{0.}));
	   
      //String s = "Tere, TUDENG, tore ARVUTI sul!";
      //String t = asenda (s); // "T---, TUDENG, ---- ARVUTI ---!"
      //System.out.println (s + " > " + t);

      //System.out.println (greatestPrimeFactor (1234)); // 617
	   

	  //int[] res = reaMaxid (new int[][] { {1,2,3}, {4,5,6} }); // {3, 6}
	  //for (int i: res) {
	  //    System.out.println(i);
	  //}

	   
	   /**
	    * new int[][]{{4, 0, 0}, {1, 2, 0}, {4, 0, 0}}
	    * 
	    * 0: 0, 
index=0 avgGrade=0
0: 1, 2, 3, 
1: 3, 4, 5, 
2: 5, 5, 5, 
index=2 avgGrade=5
index=1 avgGrade=4
index=0 avgGrade=2
0: 1, 2, 3, 
1: 3, 4, 5, 
index=1 avgGrade=4
index=0 avgGrade=2
0: 5, 
1: 3, 
index=0 avgGrade=5
index=1 avgGrade=3
0: 4, 0, 0,   Input: Input: new int[][]{{4, 0, 0}, {1, 2, 0}, {4, 0, 0}}: arrays first differed at element [1]; expected:<2> but was:<1>  
1: 1, 2, 0, 
2: 4, 0, 0, 
index=0 avgGrade=1
index=1 avgGrade=1
index=2 avgGrade=1
0: 1, 5,   Input: Input: new int[][]{{1, 5}, {2, 5}, {5, 1}}: arrays first differed at element [0]; expected:<1> but was:<0>
1: 2, 5, 
2: 5, 1, 
index=0 avgGrade=3
index=1 avgGrade=3
index=2 avgGrade=3
0: 1, 
1: 4, 5, 5, 
index=1 avgGrade=4
index=0 avgGrade=1
0: 1, 2, 3, 
1: 4, 5, 
2: 2, 
index=1 avgGrade=4
index=0 avgGrade=2
index=2 avgGrade=2
          
	    */
      //int[][] grades = new int[][]{{5,3,1},{4,3,5}};
      //int[][] grades = new int[][]{{4, 0, 0}, {1, 2, 0}, {4, 0, 0}}; // {0,2,1}
      int[][] grades = new int[][]{{1, 5}, {2, 5}, {5, 1}}; // {1, }
      int[] res = sortByAvg (grades); // {1,0}
      for (int i=0; i < res.length; i++) {
          System.out.print (res[i] + " ");
      }
      
   }
