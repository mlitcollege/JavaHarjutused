package ylesanded;

//Koostada Java meetod, mis asendab suvalises parameetrina etteantud sõnes s kõik mittetähed märgiga '*'.
//Write a Java method to replace all non-letters in a given string s by symbol '*'.
//	public static String asenda (String s)
 
public class AsendaSonades {
 
    public static void main(String[] args) {
        String s = "Tere, TUDENG, 1234!";
        String t = asenda(s); // "Tere**TUDENG*******"
        System.out.println(s + " > " + t);
    }
 
    public static String asenda(String s) {
        String vastus = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isLetter(ch))
                vastus += "*";
            else
                vastus += ch;
        }
        return vastus; // TODO!!! Your code here
    }
}

//public class Mittet2hedT2rniga {
//
//	   public static void main (String[] args) {
//	      String s = "Tere, TUDENG, 1234!";
//	      String t = asenda (s); // "Tere**TUDENG*******"
//	      System.out.println (s + " > " + t);
//	   }
//
//	   public static String asenda (String s) {
//		   
//		   String vastus = "";
//	   
//		   for(int i = 0; i < s.length(); i++)
//		   {
//			   char arv = s.charAt(i);
//			   
//			   if ( (64 <= arv  & arv <= 90) || (97 <= arv  & arv <= 122))
//			   {
//				   vastus = vastus + s.charAt(i);
//			   }
//			   else
//			   {
//				   vastus = vastus+"*";
//			   }
//			   
//		   }
//	      return vastus; // TODO!!! Your code here
//	   }
//	}
//	//Asenda s6nes s k6ik mitte-t2hed t2rniga(*)
