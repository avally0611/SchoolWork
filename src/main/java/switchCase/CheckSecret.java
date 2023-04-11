/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package switchCase;

import javax.swing.JOptionPane;

/**
 *
 * @author aaminahv
 */
public class CheckSecret {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive number"));

        if ((num % 2 == 0) && (num % 7 == 0)) {
            System.out.println("You have got the secret number, ENTER");
        } else {
            System.out.println("You may not enter!");
        }
    }

}
