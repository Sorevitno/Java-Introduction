package lab4searchingexperiment;
import java.util.Arrays;
import java.util.Random;

public class Lab4SearchingExperiment {
    
    public static int BinarySearch(int key, int data[]){
        int low = 0;
        int size = data.length;
        int high = size - 1;
        int middle = 0;
        while(high >= low) {
            middle = (low + high) / 2;
            if(data[middle] == key) {
                return middle;
            }
            if(data[middle] < key) {
                low = middle + 1;
            }
            if(data[middle] > key) {
                high = middle - 1;
            }
        }
        return (-1)*middle;
    }
    public static int LinearSearch(int key, int data[]){
        boolean found = false;
        int count = 0;
        while(!found && count < data.length ){
            if(data[count] == key){
                found = true;
            }
            else{
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
       final int MAX = 1000;
       final int RANGE = 10000;
       final int MIN = 0;
       Random rand = new Random(1000L);
       final int SIZE = 10;
       int array[] = new int[SIZE];
       int randNums[] = new int[SIZE];
       for(int i = 0; i < SIZE ; i++){
           array[i] = rand.nextInt(RANGE);
           randNums[i] = rand.nextInt(RANGE);
       }
       Arrays.sort(array);
       System.out.println("Found Custom Binary Search");
       for(int i = 0; i < 5;i++){
            long start = System.nanoTime();
            BinarySearch(randNums[i], array);
            long time = System.nanoTime() - start;
            System.out.println(time);
       }
       
    }
    
}
