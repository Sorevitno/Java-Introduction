
package exercise9_1;
import java.util.Scanner;

public class Exercise9_1 {
    private long hour;
    private long minute;
    private long second;
    
    public Exercise9_1(){
        second = 0;
        minute = 0;
        hour = 0;
    }
    
    long getHour(){return hour;}
    long getMinute(){return minute;}
    long getSecond(){return second;}
    
    public Exercise9_1(long milli){
        
        hour = (milli / (60*60*1000)% 24);
        minute = (milli / (60 * 1000) % 60);
        second = (milli / 1000) % 60;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter milliseconds: ");
        long milliseconds = in.nextLong();
        Exercise9_1 gucci = new Exercise9_1(milliseconds);
        System.out.printf("%d %d %d\n",gucci.getHour(), gucci.getMinute(),gucci.getSecond());
        
    }
}