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
public class ReverseWord {

    public static String reverse(String input) {
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {

            char let = input.charAt(i);
            reversed += let;

        }

        return reversed;
    }

}
