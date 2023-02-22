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
public class ReplaceChar {
    //replace one character with another character
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a word");
        char letter = JOptionPane.showInputDialog("What letter do you want to replace?").charAt(0);
        char replacedLetter = JOptionPane.showInputDialog("With what letter would you like to replace " + letter + " with?").charAt(0);
        
        String newWord = input.replace(letter, replacedLetter);
        
        System.out.println(newWord);
        
        
        
    }
    
}
