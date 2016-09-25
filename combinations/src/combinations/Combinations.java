package combinations;
import java.util.Scanner;
/**
 *
 * @author Edgar
 */
public class Combinations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        do{
             num1 = input.nextInt();
             num2 = input.nextInt();
             if(num1 > num2){
                 System.out.print("First number must be less than second try again! ");
             }
        }while(num1 > num2);
        int count = 0;
        for(int i=num1; i<num2; i++){
            for(int j=num1+1; j<=num2; j++){
                if(i != j && i < j){
                System.out.println(i + " " + j);
                count++;
                }
            }
        }
        System.out.println("The total number of combinations is " + count);          
    }
}
