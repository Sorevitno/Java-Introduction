package exercise3_2;
import java.util.Scanner;
/*
This project will take in an integer as input and check whether it is
even or odd.
*/

public class Exercise3_2 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        Boolean valid;
        valid = (x % 2 == 0);
        System.out.printf("Is %d an even number? %b\n", x,valid);
    }
    
}
