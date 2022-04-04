/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifStatement;

/**
 *
 * @author aaminahv
 */
import javax.swing.JOptionPane;

public class TestAnotherNumber {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));

        if (num >= 0) {
            System.out.println("Your number is positive");
        } else {
            System.out.println("Your number is negative");
        }

        if (num % 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }

        if (num % 7 == 0) {
            System.out.println("Your number is divisible by 7");
        } else {
            System.out.println("Your number is not divisible by 7");
        }

    }

}
