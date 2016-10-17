package pentagonarea;
import java.util.Scanner;
import java.lang.Math;
public class PentagonArea {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        double length;
        double area;
         System.out.print("Enter the length from the center to a vertex of "
                    + "pentagons (-1 to quit): ");
        
        while(input.hasNextDouble()){
            radius = input.nextDouble();
            if(radius == -1.00)
                break;
            length = getLength(radius);
            area = getArea(length);
            System.out.printf("The area of the pentagon with vertex length "
                    + "%,.2f is %,.2f\n", radius, area);
        }
    }
    
    public static double getLength(double r){
        return 2*r*(Math.sin(Math.PI/5));
    }
    public static double getArea(double len){
        return (5*Math.pow(len, 2))/(4*Math.tan(Math.PI/5));
    }
    
}
