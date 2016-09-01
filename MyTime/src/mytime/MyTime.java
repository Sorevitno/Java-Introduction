package mytime;
import java.util.Scanner;   //input
import java.util.Date;      //Date class

public class MyTime {

    
    public static void main(String[] args) {
        //creating new instance of scanner
        Scanner read = new Scanner(System.in);
        //read next long and store into time
        long time = read.nextLong();
        //creating new instance of date called d, invoking non defualt
        //constructor. Param - time in milliseconds of type long
        Date d = new Date(time);
        //outputting the date and a new line
        System.out.print(d + "\n");
        
    }
    
}
