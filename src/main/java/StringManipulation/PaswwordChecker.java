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
public class PaswwordChecker {

    public static void main(String[] args) {

        String password = JOptionPane.showInputDialog("Enter password");

        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isLetter = false;
        boolean isNum = false;
        for (int i = 0; i < password.length() - 1; i++) {
            char letter = password.charAt(i);

        }
    }

}
