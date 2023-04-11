/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifStatement;

import javax.swing.JOptionPane;

/**
 *
 * @author aaminahv
 */
public class Ticket {

    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        int price;
        if (age >= 12) {
            price = 150;
        } else {
            price = 100;
        }

        JOptionPane.showMessageDialog(null, "Your ticket costs R" + price);

    }

}
