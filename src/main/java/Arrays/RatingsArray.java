/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Aaminah1
 */
public class RatingsArray {
    int[] ratings;
    int size;

    public RatingsArray() throws FileNotFoundException {
        ratings = new int[150];
        
        Scanner sc = new Scanner(new File ("data\\ClientRatings.txt"));
        
        for (int i = 0; i < ratings.length; i++) 
        {
            while(sc.hasNext())
            {
                ratings[i] = sc.nextInt();
                size++;
            }
            
        }
    }

    public int getSize() {
        return size;
    }
    
    public int getElement(int index)
    {
        
    }
    
    public int getFirst()
    {
        return ratings[0];
    }
    
    public int getLast()
    {
        return ratings[ratings.length - 1];
    }
    
    
    
    
    
    
    
}
