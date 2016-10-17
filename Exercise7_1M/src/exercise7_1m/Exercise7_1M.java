
package exercise7_1m;
import java.util.Scanner;
public class Exercise7_1M {
    public static void main(String[] args){
        // used so the user can input values into the variables
        Scanner in = new Scanner(System.in);
        
        // The two variables used to read into
        double widthF;
        double heightF;
        
        // reads in the users input for width and height
        widthF = in.nextDouble();
        heightF = in.nextDouble();
        
        System.out.println("The area of a rectangle with width " + getWidth(widthF)
                           + " and height " + getHeight(heightF) + " is " 
                           + getArea()); 
        System.out.println("The perimeter is " + getPerimeter() + " with interior"
                           + " color "
                           + getColor());
        
    }
    //gets width of the rectangle
    public static double getWidth(double widthF){
        
        return width = widthF;
    }
    
    // gets height of the rectangle
    public static double getHeight(double heightF){
        
        return height = heightF;
    }
    
    //gets area of the rectangle
    public static double getArea(){
        
        area = height * width;
        return area;
    }
    
    // gets the perimeter of the rectangle
    public static double getPerimeter(){
        
        perimeter = (2 * height) + (2 * width);
        return perimeter;
    }
    
    // gets the color of the rectangle
    public static String getColor(){
        
        return color = "white";
    }
    
    // private data members of the class 
    private static double width;
    private static double height;
    private static double area;
    private static double perimeter;
    private static String color;
}
