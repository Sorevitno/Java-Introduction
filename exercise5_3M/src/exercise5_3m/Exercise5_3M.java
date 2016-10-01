
package exercise5_3m;
import java.util.Scanner;

public class Exercise5_3M {
    public static void reverse(long num){
      long temp = num;
      long reversedNum = 0;
      while( temp != 0 )
      {
          // sets the first number by % 10 and then divides by ten and loops 
          //    to get the next number
          reversedNum *= 10;
          reversedNum += (temp % 10);

          temp /= 10;
      }
        System.out.println(reversedNum);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        num = num * 2;
        
        reverse(num);
    }
}
