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
public class RemoveChars {
    
// 2. Create a program called RemoveChars. Ask the user to enter in an ‘input’ string and an ‘unwanted characters’ string containing
//the characters to be removed. Display the input string with the unwanted characters removed.
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("type whatever you want");
        String newInput = "";
        String removeLetters = JOptionPane.showInputDialog("Enter the letters you want removed");
        for (int i = 0; i < input.length() - 1; i++) 
        {
            char let = input.charAt(i);
            if (!(removeLetters.contains("" + let)))
            {
                newInput += let;
            }
            
        }
        System.out.println(newInput);
    }
    
    
}
