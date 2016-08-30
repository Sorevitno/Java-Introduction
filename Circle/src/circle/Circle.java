
package circle;
import java.util.Scanner;           //input
import java.text.DecimalFormat;     //format double with commas

public class Circle {
    
    public static void main(String[] args) {
        System.out.printf("Enter radius: ");
        //declaring a new instance of scanner called read
        Scanner read = new Scanner(System.in);
        //Accessing public method nextDouble which will read the next double
        //input by user
        double radius = read.nextDouble();
        //performing area calculations
        double area = Math.PI * radius * radius;
        //Creating a new instance of DecimalFormat called decimalFormat
        //Additionally specifying commas after every third number
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        //Accessing public method format to turn the double into a string
        String numAsString = decimalFormat.format(area);
        System.out.printf("The circle with radius of %.2f has area of %s\n"
                , radius, numAsString);
    }
}
