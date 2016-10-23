/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processstring;
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class ProcessString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word;
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            System.out.print("Enter String: ");
            word = input.next();
            char firstLetter = word.charAt(0);
            int len = word.length();
            System.out.printf("String %s length %dfirst character %c\n",
                    word, len, firstLetter);
        }
    }
    
}
