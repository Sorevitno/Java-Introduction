package exercise8_1;
import java.util.Scanner;

public class Exercise8_1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            String ss = in.nextLine();
            if(ss.matches("^\\d{3}-\\d{2}-\\d{4}$")){
                System.out.println("valid SSN");
            }
            else{
                System.out.println("invalid SSN");
        }
    }
}
