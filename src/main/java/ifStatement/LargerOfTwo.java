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

public class LargerOfTwo {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));

        if (num1 > num2) {
            System.out.println(num1 + " is bigger than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is bigger than " + num1);
        } else {
            System.out.println(num1 + " is equal to " + num2);

        }

    }

}
