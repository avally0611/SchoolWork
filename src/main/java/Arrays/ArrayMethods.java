/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import static Arrays.ArrayAddRemove.add;

/**
 *
 * @author avall
 */
public class ArrayMethods {
     private static int[] arr;
    private static int size;

    public static void main(String[] args) {
        arr = new int[15];

        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 8;
        arr[3] = 11;
        arr[4] = 15;
        arr[5] = 15;
        arr[6] = 15;
        arr[7] = 15;
        arr[8] = 19;
        arr[9] = 19;
        arr[10] = 25;
        size = 11;

        add(18);
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        
        System.out.println("\n");
        remove(8);
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        
        System.out.println("\n");
        removeDuplicate();
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

    }
    
    public static void add(int num)
    {
        int pos = 0;
        
        
        while (num > arr[pos])
        {
            pos++;
        }
        shiftRight(pos);
        arr[pos] = num;
        size++;
        
    }    
    
    private static void shiftRight(int pos)
    {
        for (int i = size -1; i >= pos; i--) 
        {
            arr[i + 1] = arr[i];
        }
    }
    
    public static void remove(int num)
    {
        shiftLeft(search(num));
        size--;
    }
    
    private static void shiftLeft(int index)
    {
        for (int i = index; i < size; i++) 
        {
            arr[i] = arr [i + 1];
        }
    }
    
    private static int search(int num)
    {
        int start = 0;
        int end = size - 1;
        
        while (start <= end)
        {
            int mid = (start + end)/2;
            
            
            if (arr[mid] == num)
            {
                return mid;
            }
            else if (arr[mid] > num)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        
        return -1;
    }
    
    public static void removeDuplicate()
    {
        for (int i = 0; i < size - 1; i++) 
        {
            while (arr[i] == arr[i + 1])
            {
                shiftLeft(i + 1);
                size--;
            }
        }
    }
}

