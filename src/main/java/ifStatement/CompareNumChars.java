/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifStatement;

/**
 *
 * @author aaminahv
 */
import javax.swing.*;

public class CompareNumChars {

    public static void main(String[] args) {
        String wrd1 = JOptionPane.showInputDialog("Enter a word");
        String wrd2 = JOptionPane.showInputDialog("Enter a word");

        int wrd1Length = wrd1.length();
        int wrd2Length = wrd2.length();

        if (wrd1Length > wrd2Length) {
            System.out.println(wrd1 + " is longer than " + wrd2);
        } else if (wrd1Length < wrd2Length) {
            System.out.println(wrd2 + " is longer than " + wrd1);
        } else if (wrd2Length == wrd1Length) {
            System.out.println("The words are the same length");
        }
    }

}
