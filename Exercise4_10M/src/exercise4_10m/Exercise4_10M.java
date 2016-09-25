
package exercise4_10m;
import java.util.Scanner;

public class Exercise4_10M {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int count = 1;
        for(int i=num1; i <= num2; i++){
            if(i%5==0 && i%6 == 0){
               if(count == 10){
                    System.out.println(i);
                    count = 0;
               }
               else{
                    System.out.print(i + " ");
               }
               count ++;
            }
        }
        System.out.print("\n");
    }  
}
