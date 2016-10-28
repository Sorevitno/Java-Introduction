
package exercise8_12m;
import java.util.Scanner;

public class Exercise8_12M {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        String word1 = in.next();
        String word2 = in.next();
        boolean anagram = word1.toLowerCase().matches("[" + word2.toLowerCase() 
                + "]{" + word1.length() + "}");
        System.out.println("" + word1 + " and " + word2 + " are "
        + (anagram? "an anagram": "not an anagram"));
    }
}
