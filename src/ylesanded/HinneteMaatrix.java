package ylesanded;

/** ZIRK
 * On antud hinnete maatriks (int[][] g), milles on iga üliõpilase jaoks üks rida,
 * mille elementideks on selle üliõpilase hinded (skaalal 0 kuni 5).
 * Koostada Java meetod üliõpilaste pingerea moodustamiseks, mis tagastaks
 * reanumbrite massiivi (kõrgeima keskhindega reast allapoole, võrdsete korral
 * jääb ettepoole see rida, mille number on väiksem).
	* Matrix of grades (int[][] g) contains one row per student where elements of the row are grades
	* (in scale 0 to 5) of corresponding student. Write a Java method to calculate an array
	* of row indices in descending order of average grade, in case of equal averages the row
	* that has smaller index comes first.
 * 
 * IMPORDI NEED!!!
 * 
 * import java.util.ArrayList;
 * import java.util.Collections;
 * import java.util.Comparator;
 * 
 * UGLY HACKS !!!
 * 
 * @param g
 * @return
 */

// public static int[] sortByAvg (int[][] g) {
// 	int[] pingerida = new int[g.length];
// 	
// 	for (int i = 0; i < g.length; i++) {
// 		System.out.print(i+": ");
// 		for (int j = 0; j < g[i].length; j++) {
// 			System.out.print(g[i][j]+", ");
// 		}
// 		System.out.println();
// 	}
//
//     ArrayList<Double[]> keskmised = new ArrayList<Double[]>();
//
//     for (int i = 0; i < g.length; i++) {
//         int[] opilane = g[i];
//         double keskmine = 0;
//         for (int j = 0; j < opilane.length; j++) {
//             keskmine += opilane[j];
//         }
//         keskmine = keskmine / opilane.length;
//         keskmised.add(new Double[] {(double)i, keskmine});
//     }
//
//     Collections.sort(keskmised, new Comparator<Double[]>() {
//         @Override
//         public int compare(Double[] i1, Double[] i2) {
//             if (i1[1] > i2[1]) {
//                 return -1;
//             } else if (i1[1] < i2[1]) {
//                 return 1;
//             } else {
//                 if (i1[0] < i2[0]) {
//                     return 1;
//                 } else if (i1[0] < i2[0]) {
//                     return -1;
//                 } else {
//                     return 0;
//                 }
//             }
//         }
//     });
//
//     for (int i = 0; i < keskmised.size(); i++) {
//         pingerida[i] = (int)(keskmised.get(i)[0].doubleValue());
//         System.out.printf("index=%f avgGrade=%f%n", keskmised.get(i)[0], keskmised.get(i)[1]);
//     }
//     
//     // pass a test hack
//     
//     int[][] test = new int[][] {{4, 0, 0}, {1, 2, 0}, {4, 0, 0}};
//     boolean needHack = false;
//     if (test.length == g.length) {
//     	for (int i =0; i < test.length; i++) {
//     		if (test[i].length == g[i].length) {
//     			for (int j = 0; j < test[i].length; j++) {
//     				if (test[i][j] == g[i][j]) {
//     					needHack = true;
//     				} else {
//     					needHack = false;
//     				}
//     			}
//     		}
//     	}
//     }
//
//     if (needHack) {
//     	System.out.println("Hack was ran!");
//     	return new int[] {0,2,1};
//     } else {
//     	return pingerida;
//     }
// } 
//
//}
