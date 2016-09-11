package exercise2_1;
import java.util.Scanner;

public class Exercise2_1 {
/*
    Converting  Celcius into Fahrenheit and outputting result with two
    decimal places
    */
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius: ");
       double celcius = input.nextDouble();
       double fahrenheit = ( 9.0/5)*celcius + 32;
       System.out.printf("The temperature is %.2f in Fahrenheit.\n", fahrenheit);
    }
    
}
