package sorttest;

import java.util.Random;
import java.util.Arrays;

/**
 * HYPOTHESIS 
 * ---------- 
 * I plan to test the Selection ( O(n^2) ), Insertion ( O(n^2) ), 
 * and Bubble ( O(n^2) ) sorting algorithms against the JAVA api
 * built-in Quicksort algorithm ( n log(n) ); I believe the Selection, Insertion,
 * and Bubble sorting algorithms will be more efficient (faster) than the JAVA
 * api built-in Quicksort algorithm on data sets less than 100 elements, and the
 * Quicksort will pick up in efficiency around 1000+ data elements (and
 * consistently/significantly outperform the ( O(n^2) ) algorithms); 
 * each data set size will be tested 3 times.
 *
 *
 */
public class SortTest {
    final static int SIZE = 100000;

    public static void main(String[] args) {
        // Random number generator with unspecified/random seed
        Random rand = new Random();

        // int array to store SIZE amount of random ints
        int[] myArray = new int[SIZE];

        // PROCESSING - starts timer for generating random array
        long startTime = System.nanoTime();

        // PROCESSING - generates random ints and stores in entire array
        for (int i = 0; i < SIZE; i++) {
            myArray[i] = rand.nextInt(SIZE);
        }

        // PROCESSING - ends timer for generating random array
        long endTime = System.nanoTime();

        // PROCESSING - determines totalTime for generating random array
        double totalTime = endTime - startTime;

        // OUTPUT - outputs totalTime of searching results
        System.out.printf("It took %.15f seconds to generate random array of "
                + "%d elements\n", (double) totalTime * 10e-10, SIZE);

        // PROCESSING - calls JAVA's garbage collector to avoid it influencing
        //              time results later
        System.gc();

        // PROCESSING - starts timer for sorting array
        startTime = System.nanoTime();

        // PROCESSING - sorts using SelectionSort
        // selectionSort(myArray);
        
        // PROCESSING - sorts using InsertionSort
        // insertionSort(myArray);
        
        // PROCESSING - sorts using HeapSort
        // HeapSort(myArray);
        
        // PROCESSING - sorts using MergeSort
        // mergeSort(myArray);
        
        // PROCESSING - sorts using BubbleSort
        // bubbleSort(myArray);
        
        // PROCESSING - sorts using JAVA api built-in Quicksort algorithm
         Arrays.sort(myArray);

        // PROCESSING - ends timer for sorting array
        endTime = System.nanoTime();

        // PROCESSING - determines totalTime for sorting array
        totalTime = endTime - startTime;

        // OUTPUT - outputs totalTime for sorting array
        System.out.printf("It took %.15f nanoseconds to sort the random array of "
                + "%d elements\n", (double) totalTime, SIZE);

    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--)
                list[k + 1] = list[k];
            
            list[k + 1] = currentElement;
        }
    }
    
    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
    
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < list.length; j++)
                if (list[j] < list[index])
                    index = j;
      
            int smallerNumber = list[index]; 
            list[index] = list[i];
            list[i] = smallerNumber;
        }
    }
   static int N; 
    /* Sort Function */
    public static void HeapSort(int arr[])
    {     
        
        heapify(arr);        
        for (int i = N; i > 0; i--)
        {
            swap(arr,0, i);
            N = N-1;
            maxheap(arr, 0);
        }
    }     
    /* Function to build a heap */   
    public static void heapify(int arr[])
    {
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);        
    }
    /* Function to swap largest element in heap */        
    public static void maxheap(int arr[], int i)
    { 
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i])
            max = left;
        if (right <= N && arr[right] > arr[max])        
            max = right;
 
        if (max != i)
        {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }    
    /* Function to swap two numbers in an array */
    public static void swap(int arr[], int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp; 
    }  
    
    public static void mergeSort(int[] list) {
        if (list.length > 1) {           
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2,
            secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);
            merge(firstHalf, secondHalf, list);
        }
    }

    public static void merge(int[] list1, int[] list2, int[] temp) {
        int current1 = 0; // Current index in list1
        int current2 = 0; // Current index in list2
        int current3 = 0; // Current index in temp

        while (current1 < list1.length && current2 < list2.length) { 
            if (list1[current1] < list2[current2])
                temp[current3++] = list1[current1++];
            else
                temp[current3++] = list2[current2++];
        }

        while (current1 < list1.length)
            temp[current3++] = list1[current1++];

        while (current2 < list2.length)
            temp[current3++] = list2[current2++];
    }
    
}
