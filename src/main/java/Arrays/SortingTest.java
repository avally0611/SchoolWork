/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import static Arrays.ArrayAddRemove.add;

/**
 *
 * @author Aaminah1
 */
public class SortingTest {

    private static int[] arr;
    private static int size;

    public static void main(String[] args) {
        arr = new int[15];

        arr[0] = 1;
        arr[1] = 99;
        arr[2] = 31;
        arr[3] = 15;
        arr[4] = 29;
        arr[5] = 83;
        arr[6] = 6;
        arr[7] = 23;
        arr[8] = 40;
        arr[9] = 5;
        arr[10] = 64;
        size = 11;
        
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        
        System.out.println("\n");

   
        bubbleSort();
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

    }
    
//    public static void linearSort()
//    {
//        for (int i = 0; i < size - 1; i++) 
//        {
//            for (int j = i + 1; j < size; j++) 
//            {
//                if(arr[j] > arr[i])
//                {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//    }
    
//    public static void linearSort()
//    {
//        for (int i = 0; i < size - 1; i++) 
//        {
//            int highestIndex = i;
//            for (int j = i + 1; j < size; j++) 
//            {
//                if(arr[j] > arr[highestIndex])
//                {
//                    highestIndex = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[highestIndex];
//            arr[highestIndex] = temp;
//        }
//    }
    public static void bubbleSort()
    {
        for (int i = size - 1; i >= 0; i--) 
        {
            for (int j = 0; j < i; j++) 
            {
                if (arr[j] < arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            
        }
    }
    
    
    
    
}
