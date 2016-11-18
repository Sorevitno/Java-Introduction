
package queue;
import java.util.Scanner;
public class Queue {
    private int size;
    private int[] elements;
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue queue = new Queue();
        while(in.hasNext()){
            String command = in.next();
            if(command.charAt(0) == 'q' || command.charAt(0) == 'Q')
                break;
            else if(command.charAt(0) == 'd' || command.charAt(0) == 'D')
                queue.Dequeue();
            else if(command.charAt(0) == 's' || command.charAt(0) == 'S')
                queue.Size();
            else if(command.charAt(0) == 'e' || command.charAt(0) == 'E')
                System.out.printf("Empty: %b\n", queue.Empty());
            else if(command.charAt(0) == 'f' || command.charAt(0) == 'F')
                System.out.printf("Full: %b\n", queue.Full());
            else if(command.charAt(0) == '?' || command.charAt(0) == 'p' || command.charAt(0) == 'P')
                queue.print();
            else if( command.matches("-?\\d*") )
                queue.Enqueue(Integer.parseInt(command));
            else
                System.out.printf("Unknown command->%s<-\n", command);
                
        }
    }
    
    
    Queue(){ 
        elements = new int[8]; size = 0; }
    public boolean Empty(){ return elements.length == 0; }
    public boolean Full(){ return size == 8; }
    public void Enqueue(int item){
        if(!Full()){
            elements[size] = item;
            size++;
        }
    }
    public void Dequeue(){
        if(!Empty()){
            System.out.printf("Dequeue: %d\n", elements[0]);
            for(int i = 0; i < elements.length - 1; i++){
                elements[i] = elements[i+1];
            }
            size--;
        }
    }
    
    public void print(){
        System.out.printf("Queue can hold: 8 It has %d elements\nhead--> ",size);
        if(!Empty()){
            for(int i = size - 1; i >= 0; i--){
                if(i == 0)
                    System.out.printf("%d", elements[i]);
                else
                    System.out.printf("%d, ", elements[i]);
            }
        }
        System.out.println("-->tail");
    }
    
    public void Size(){ System.out.printf("Size: %d\n", size); }
}
