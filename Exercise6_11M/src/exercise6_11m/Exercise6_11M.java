
package exercise6_11m;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise6_11M {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num;
        double sum = 0;
        double mean = 0;
        double std;
        double riemann = 0;
        double []inputNums = new double[10];
        int count = 0;
        while(input.hasNextDouble()){
           num = input.nextDouble();
           inputNums[count] = num;
           sum += num;
           count ++;
        }
        mean = sum / count;
        for(int i = 0; i < count; i++){
            riemann += Math.pow((inputNums[i] - mean), 2);
        }
        riemann /= count - 1;
        riemann = Math.sqrt(riemann);
        System.out.println( "The mean is " + mean);
        System.out.println( "The standard deviation is " + riemann);
    } 
}
