package ylesanded;

//Koostage Java-meetod, mis leiab etteantud massiivi m rangelt negatiivsete elementide arvu.
//Write a method in Java to find the number of strictly negative elements of a given array m.
//	public static int negElArv (int[] m)
 
public class MassiiviRangeltNeg {
 
    public static void main(String[] args) {
        System.out.println(negElArv(new int[] { 0 }));
        // YOUR TESTS HERE
    }
 
    public static int negElArv(int[] m) {
        int vastus = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] < 0)
                vastus++;
        }
        return vastus; // YOUR PROGRAM HERE
    }
}
