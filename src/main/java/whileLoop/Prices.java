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
public class Prices {

    public static void main(String[] args) {
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of your product")); //1 SI - Select Initialize
        System.out.println(price);

        //before - initialization
        double total = 0;

        while (price > 0) { //2 Testing (conditional statement)

            // repeated things - calculations
            total = total + price;
            price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of your product")); //3 change - chnag ewhat is tetsing or infinite loop (increment)
            System.out.println(price);
        }
        //post processing

        total *= 100;
        total = Math.round(total);
        total /= 100;
        System.out.println("The total is: " + total);

    }

}
