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

public class DiscountEx2 {

    public static void main(String[] args) {
        double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter your price"));
        if (amount > 100) {
            double discountPrice = (amount * 90) / 100;
            System.out.println("You get a discount of 10%, your total amount is now R" + discountPrice);
        } else {
            System.out.println("Your total is " + amount);

        }
    }

}
