/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringManipulation;

import javax.swing.JOptionPane;

/**
 *
 * @author aaminahv
 */
public class Palindrome {

    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("enter word to check if it is a palindrome");

        boolean isPalindrome = false;

        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);

        }

        if (word.equals(reversedWord)) {
            System.out.println("The word you entered is a Palindrome");
        } else {
            System.out.println("The word is not a palindrome");
        }
    }

}
