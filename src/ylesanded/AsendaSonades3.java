package ylesanded;

//Koostada Java meetod, mis asendab parameetrina etteantud sõnes s kõik tühikud märgiga '-'.
//Write a Java method to replace all spaces in a given string s by symbol '-'.
//   public static String asenda (String s)
 
public class AsendaSonades3 {
 
   public static void main (String[] args) {
      String s = "Tere, TUDENG,   tore ARVUTI sul!";
      String t = asenda (s); // "Tere,-TUDENG,---tore-ARVUTI-sul!"
      System.out.println (s + " > " + t);
   }
 
   public static String asenda (String s) {
           String tulem = "";
           for(int i = 0;i <s.length();i++)
           {
                   if(s.charAt(i) == ' ')
                   {
                           tulem = tulem + '-';
                   }
                   else
                   {
                           tulem = tulem + s.charAt(i);
                   }
           }
           return tulem;
   }
}
