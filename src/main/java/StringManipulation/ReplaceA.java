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
public class ReplaceA {

    public static String replace(String word) {
        String newWord = "";

        for (int i = 0; i <= word.length() - 1; i++) {
            char let = word.charAt(i);
            if (let != 'a') {
                newWord += let;
            } else {
                newWord += '*';
            }

        }

        return newWord;
    }

}
