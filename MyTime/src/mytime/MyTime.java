package mytime;
import java.util.Scanner;
import java.util.Calendar;

public class MyTime {

    
    public static void main(String[] args) {
        //long time = System.currentTimeMillis();
        // System.out.printf("The current time is %d\n", time);
        Scanner read = new Scanner(System.in);
        long time = read.nextLong();
        Calendar date = Calendar.getInstance();
        int dow = date.get(Calendar.DAY_OF_WEEK);
        System.out.printf("Day of the week%i",dow);
    }
    
}
