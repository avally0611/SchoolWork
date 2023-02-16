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
public class Sorting {
    public static void main(String[] args) {
        
        double[] test = new double[50];
        
        test[0] = 54.34;
        test[1] = 32.40;
        test[2] = 98.34;
        test[3] = 54.84;
        test[4] = 70.85;
        test[5] = 14.34;
        test[6] = 83.62;
        
        for (int i = 0; i < 7; i++) {
            System.out.println(test[i]);
        }
        
        System.out.println("\n");
        Arrays.sort(test, 0, 7);
        
        for (int i = 0; i < 7; i++) {
            
            System.out.println(test[i]);
        }
        
    }
    
}
