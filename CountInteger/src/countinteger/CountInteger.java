
package countinteger;
import java.util.Scanner;

public class CountInteger {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers, input ends with 0: ");
        int total = 0;
        int pos = 0;
        int neg = 0;
        int sum = 0;
        int x;
        do{
             x = input.nextInt();
            if(x > 0){
                pos++;
                total++;
            }
            else if (x < 0){
                neg++;
                total++;
            }
            sum += x;
            
        }while(x != 0);
        if(pos != 0){
            System.out.printf("The number of positives is %d\n", pos);
            System.out.printf("The number of negatives is %d\n", neg);
            System.out.printf("The total count is %d\n", total);
            double avg = (double)sum/total;
            System.out.printf("The average is %.2f\n", avg);
        }
        else{
            System.out.println("No numbers were entered except 0");
        }
        
    }
    
}
