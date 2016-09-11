
package exercise2_6;
import java.util.Scanner;
/*
    This Assignment takes in a number bewteen 0 and 1000 (0-999) and will
    add each individual digit in that number.
*/
public class Exercise2_6 {
    public static void main(String[] args) {
        //new instance of scanner into input
        Scanner input = new Scanner(System.in);
        //print to console
        System.out.print("Enter an integer between 0 and 1000: ");
        //waiting for the next integer input from keyboard
        int x = input.nextInt();
        //finds the number of digits in the number
        int length = String.valueOf(x).length();
        //initializing and setting sum to 0
        int sum = 0;
        //switch statement based on length size
        switch(length){
            //if size is 1 digit then the sum is the number itself
            case 1: sum = x;
                break;
            //if the size is 2 digits long then take the division and mod
            case 2: sum = (x/10) + (x%10);
                break;
            //if the size is 3 digits long then take the division and mod
            // then take the remaining 2 numbers and repeat the process
            case 3: sum = (x/100) + ((x%100) / 10) + ((x%100) % 10);
                break;
            //Default value
            default: System.out.print("Something happenened\n");  
        }
        //Output to console
        System.out.printf("The sum of all digits in %d is %d\n", x, sum);
    }
    
}
