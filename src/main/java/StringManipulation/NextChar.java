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
public class NextChar {

    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("enter a word - lowercase only plsss");
        int length = word.length();

        String newWord = "";
        for (int i = 0; i < length; i++) {
            char letter = word.charAt(i);
            int numLetter = (int) letter;
            char newLetter = (char) ((char) numLetter + 1);
            newWord += newLetter;
        }

        System.out.println(newWord);

    }

}
