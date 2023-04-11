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
public class NumVowels {

    ////how many vowels in inputted word
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a word");

        int vowels = 0;

        for (int i = 0; i < input.length() - 1; i++) {
            char let = input.charAt(i);
            if ((let == 'a') || (let == 'e') || (let == 'i') || (let == 'o') || (let == 'u')) {
                vowels++;
            }

        }

        System.out.println("Th number of vowels in " + input + " are: " + vowels);
    }

}
