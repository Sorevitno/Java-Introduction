package vowel;
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        int i = Integer.parseInt("12");
        //creating a new instance of Scanner class called input
        Scanner input = new Scanner(System.in);
        //printing to console
        System.out.print("Enter a letter: ");
        //While there is still input in the file (submit uses a file for input)
        while(input.hasNext()){
            //Reading the next string and assigning it to token
            String token = input.next();
            //printing to console
            System.out.print(token + " is ");
            //making the string uppercase
            token = token.toUpperCase();
            //using regex to specify all vowels
            if(token.matches("[AEIOU]")){
                //Print to console
                System.out.println("a vowel");
            }
            //using regex to specify all letters except vowels
            else if(token.matches("[A-Z^AEIOU]")){
                //Print to Console
                System.out.println("a consonant");
            }
            //all numbers and special characters
            else{
                //Print to console
                System.out.println("an invalid input");
            }
            //Print to console
            System.out.print("Enter a letter: ");
        }
    }
}
