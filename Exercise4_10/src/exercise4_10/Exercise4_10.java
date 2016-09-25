
package exercise4_10;

/**
 *
 * @author Edgar
 */
public class Exercise4_10 {
    
    public static void main(String[] args) {
        int count = 1;
        for(int i=100; i <= 1000; i++){
            if(i%5==0 && i%6 == 0){
               if(count == 10){
                    System.out.println(i);
                    count = 0;
               }
               else{
                    System.out.print(i + " ");
               }
               count ++;
            }
        }
        System.out.print("\n");
    }   
}
