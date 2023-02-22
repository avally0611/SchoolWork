/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringManipulation;

import javax.swing.JOptionPane;

/**
 *
 * @author Aaminah1
 */
public class FlipCase {
    //Create a program called FlipCase. Ask the user to input a string of any length. 
    //Output a string which flips the case of each character.
    
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter anything");
        String flippedCase = "";
        
        for (int i = 0; i <= input.length() - 1; i++) 
        {
            char let = input.charAt(i);
            
            if (Character.isLowerCase(let))
            {
                flippedCase += Character.toUpperCase(let);
            }
            else
            {
                flippedCase += Character.toLowerCase(let);
            }
            
        }
        
        System.out.println(flippedCase);
    }
    
}
