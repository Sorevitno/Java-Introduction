package exercise2_6m;
import java.util.Scanner;


/*
This program will take in an integer and sum each digit of that
integer. The user will be able to enter negative numbers, the program
should ignore the negative sign.
*/
public class Exercise2_6M {
    public static void main(String[] args) {
          //new instance of scanner into input
        Scanner input = new Scanner(System.in);
        //print to console
        System.out.print("Enter an integer: ");
        //waiting for the next long input from keyboard
        long x = input.nextLong();
        //declaring an integer called temp and setting it to x
        long temp = x;
        temp = Math.abs(temp);
        //initializing sum to 0
        int sum = 0;
        //Adding the sum of the digits
        while(temp > 0){
            sum += temp%10;
            temp /= 10;
        }
        //Output to console
        System.out.printf("The sum of all digits in %d is %d\n", x, sum);
    }
}
