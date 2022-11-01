/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whileLoop;

import javax.swing.JOptionPane;

/**
 *
 * @author aaminahv
 */
public class StarStop {

    public static void main(String[] args) {
        String character = JOptionPane.showInputDialog("Enter a character. Enter * to stop");
        char let = character.charAt(0);
        int count = 0;

        while (let != '*') {
            count++;
            System.out.print(" " + let);
            character = JOptionPane.showInputDialog("Enter a character. Enter * to stop");
            let = character.charAt(0);

        }
        System.out.println("\n " + count);

    }

}
