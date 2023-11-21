/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Arrays;

/**
 *
 * @author Aaminah1
 */
public class Test 
{
    static int[] nums = new int[30];
    static int size = 0;
    
    public static void main(String[] args) {
        
    
        for (int i = 0; i < 17; i++) 
        {
            nums[size] = (int) (Math.random()*101);
            size ++;
            
        }
        
        for (int i = 0; i < size; i++) 
        {
            System.out.println(nums[i] + "\n");
            
        }
        
        System.out.println("-----------");
        linearSort();
        Add(38);
        Add(38);
        
        for (int i = 0; i < size; i++) 
        {
            System.out.println(nums[i] + "\n");
            
        }
        
        RemoveDuplicate();
        
        System.out.println("-----------");
        
        for (int i = 0; i < size; i++) 
        {
            System.out.println(nums[i] + "\n");
            
        }
        
        
    }
    
     public static void linearSort()
    {
        for (int i = 0; i < size - 1; i++) 
        {
            
            for (int j = i + 1; j < size; j++) 
            {
                if (nums[j] < nums [i])
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                
            }
            
            
        }
           
    }
    
//    public static void improvedLinearSort()
//    {
//        for (int i = 0; i < size - 1; i++) 
//        {
//            int lowestIndex = i;
//            for (int j = i + 1; j < size; j++) 
//            {
//                if (nums[j] < nums [lowestIndex])
//                {
//                    lowestIndex = j;
//                }
//                
//            }
//            
//            int temp = nums[i];
//            nums[i] = nums[lowestIndex];
//            nums[lowestIndex] = temp;
//        }
//           
//    }
     
     public static void Add(int num)
     {
       
        int pos = 0;

        while(num > nums[pos])
        {
            pos++;
        }



        ShiftRight(pos);
        size++;
        nums[pos] = num;

     }
     
     private static void ShiftRight(int pos)
     {
         for (int i = size; i >= pos; i--) 
         {
             nums[i + 1] = nums[i];
             
         }
     }
     
     public static void Remove(int num)
     {
        int pos = binarySearch(num);
        
        
         for (int i = pos; i < size - 1; i++) 
         {
             nums[i] = nums[i + 1];
             
         }
         size--;
        
        
     }
     
     
     
     public static int binarySearch(int num)
     {
         int start = 0;
         int end = size - 1;
         
         while (start <= end)
         {
             int mid = (start + end)/2;
             
             if (num == nums[mid])
             {
                return mid;
             }
             else if (num < nums[mid])
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
     
     //dont use remove as it looks for pos as if it is a number
     public static void RemoveDuplicate()
     {
         for (int i = 0; i < size - 1; i++) 
         {
            while (nums[i] == nums[i + 1])
            {
                Remove(i);
                
            }
             
         }
        
        
     }
     
    
}
