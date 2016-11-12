
package exercise9_12;
import java.util.Scanner;
public class Exercise9_12 {
    
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rectangle rect1 = new Rectangle();
        Rectangle rect = new Rectangle();
        while(in.hasNextLine()){  
            System.out.println("Enter rectangle: ");
            String strNums = in.nextLine();
            if(strNums.equals("-1")) break;
            double []nums = parseLine(strNums);
            rect1.initialize(nums);
            System.out.printf("perimeter: %.3f\narea: %.3f\n", rect1.perimiter(),rect1.area());
            System.out.println("Enter rectangle: ");
            strNums = in.nextLine();
            if(strNums.equals("-1")) break;
            nums = parseLine(strNums);
            rect.initialize(nums);
            System.out.printf("contains: %b\noverlaps: %b\n", rect.contains(rect1), rect.overlap(rect1));
        }
            
    }
    public static double[] parseLine(String nums){
        String[] stringAr = nums.split(" ");
        double[] doubleAr = new double[stringAr.length];
        for(int i = 0; i < stringAr.length; i++)
           doubleAr[i] = Double.parseDouble(stringAr[i]);
        return doubleAr;
    }
}

class Rectangle{
    private double x;
    private double y;
    private double width;
    private double height;

    public Rectangle(){
        x = 0.0; y = 0.0;
        width = 0.0; height = 0.0;
    }
    public void initialize(double[] nums){
        x = nums[0]; y = nums[1];
        if(nums.length == 3){
            width = 2 * nums[2]; height = width;
        }
        else{
            width = nums[2]; height = nums[3];
        }
    }
    public double getX(){return x;}
    public double getY(){return y;}
    public double getWidth(){return width;}
    public double getHeight(){return height;}
    public double perimiter(){return 2 * (width + height);}
    public double area(){return (width * height);}
    public boolean contains(Rectangle rect){
        //check corners of each shape, if rect corner is bigger than square
        //false
        //top left, bottom right, 
        if((rect.getX() + rect.getWidth()) <= (x + width) && (rect.getX()) > (x) && (rect.getY()) > (y)
            && (rect.getY() + rect.getHeight()) < (y + height)){
            return true;
        }
        else{
            return false;
        }
        
        
    }
    public boolean overlap(Rectangle rect){
        double xRadius = rect.getWidth() / 2;
        double yRadius = rect.getHeight() / 2;


        if((rect.getY() + yRadius >= y - height / 2 && rect.getY() + 
                yRadius <= y + height / 2) && (rect.getX() - xRadius <= x 
                + width / 2 && rect.getX() - xRadius >= x - width / 2))
            return true;
        else if((rect.getY() + yRadius >= y - height / 2 && rect.getY() + 
                yRadius <= y + height / 2) && (rect.getX() + 
                xRadius >= x - width / 2 && rect.getX() + xRadius <= x +
                width / 2))
            return true;
        else if ((rect.getY() - yRadius <= y + height / 2 && rect.getY() - 
                yRadius >= y - height / 2) && (rect.getX() - xRadius <= x + 
                width / 2 && rect.getX() - xRadius >= x - width / 2))
            return true;
        else if ((rect.getY() - yRadius <= y + height / 2 && rect.getY() - 
                yRadius >= y - height / 2) && (rect.getX() + xRadius >= x - 
                width / 2 && rect.getX() + xRadius <= x + width / 2))
            return true;

        return false;
    }
}
