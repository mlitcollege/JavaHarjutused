package ylesanded;

/*
 * Koostada Java meetod, mis asendab parameetrina etteantud sõnes s kõik väiketähed märgiga '-'.
 Lahendus peab kasutama tsüklit.
 Write a Java method to replace all lowercase letters in a given string s by symbol '-'.
 The solution must use a cycle.
 public static String asenda (String s)
 */

public class AsendaSonades4 {

   public static void main(String[] args) {
      String s = "Tere, TUDENG, tore ARVUTI sul!";
      String t = asenda(s); // "T---, TUDENG, ---- ARVUTI ---!"
      System.out.println(s + " > " + t);
   }

   public static String asenda(String s) {
      
      String result = "";

      for (int i = 0; i < s.length(); i++) {
         char ch = s.charAt(i);
         if (Character.isLowerCase(ch)) {
            result += "-";
         } else {
            result += ch;
         }
         

      }
      
      return result;
   }

}

/** ZIRK
 * Koostada Java meetod, mis asendab parameetrina etteantud sõnes s kõik väiketähed märgiga '-'.
 * Lahendus peab kasutama tsüklit.
	*
 * Write a Java method to replace all lowercase letters in a given string s by symbol '-'.
 * The solution must use a loop. 
 * 
 *  REMEMBER TO ADD import java.util.Locale; !!!!!  
 * 
 * @param s
 * @return
 */

//public static String asenda (String s) {
//	   char[] cString = s.toCharArray();
//	   String answer;
//	   
//	   for (int i = 0; i < cString.length; i++) {
//		   char tmp[] = {cString[i]};
//		   String c = new String(tmp);
//		   if (c.toLowerCase(Locale.ROOT).equals(c) && (int)cString[i] > 0x40) {
//			   cString[i] = '-';
//		   }
//	   }
//	   
//	   answer = new String(cString);
//	   return answer;
//	   
//}