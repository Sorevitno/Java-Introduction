package exercise3_1;
import java.util.Scanner;
/*
This project will take in three doubles, each representing a side of a triangle
the program will check if the three sides make a triangle and output the result.
for 3 sides to make a triangle any two edges summed together must be greater than
the third side.
*/
public class Exercise3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three edges: ");
       double side1 = input.nextDouble();
       double side2 = input.nextDouble();
       double side3 = input.nextDouble();
      Boolean valid = side1 + side2 > side3 && side1 + side3 > side2 && 
              side2 + side3 > side1;
     
       
       System.out.printf("Can edges %.1f, %.1f, and %.1f form a triangle? %b\n"
               ,side1,side2,side3,valid);
       
       
    }
    
}
