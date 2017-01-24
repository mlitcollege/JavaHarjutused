package ylesanded;

//Koostada Java meetod, mis asendab parameetrina etteantud sõnes s kõik numbrid märgiga \'#\'.

public class AsendaSonades2 {
        public static void main (String[] args) {
                String s = "Tere, 1234 ja 5678";
                String t = asenda (s); // \"Tere, #### ja ####\"
                System.out.println (s +   t);
                }
 
                public static String asenda (String s) {
                        String vastus = "";
                        for(int i = 0; i < s.length(); i++ ) {
                                char ch = s.charAt(i);
                                if(!Character.isLetter(ch))
                                        vastus = vastus+ "#";
                                else
                                        vastus = vastus+ ch;
                               
                        }
                        return vastus;
}
}
