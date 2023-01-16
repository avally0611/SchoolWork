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
public class RemoveVowel {

    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("enter a word - lowercase only please");
        int length = word.length();

        boolean letterIsVowel = false;

        for (int i = 0; i < length; i++) {
            char letter = word.charAt(i);
            if ((letter == 'a') || (letter == 'e') || (letter == 'i') || (letter == 'o') || (letter == 'u')) {
                String letterRemove = letter.toString;
                word.replaceAll(letterRemove, "a");
            }

        }

        System.out.println(word);

    }

}
