/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import javax.swing.JOptionPane;

/**
 *
 * @author aaminahv
 */
public class ClientUI {

    public static void main(String[] args) {
        String fullname = JOptionPane.showInputDialog("Enter your full name");
        String accNum = JOptionPane.showInputDialog("Enter your account number");
        double balance = Double.parseDouble(JOptionPane.showInputDialog("enter your balance in your account"));

        if ((accNum.length() == 6) && (accNum.charAt(0) != '0')) {
            if ((accNum.charAt(1) + accNum.charAt(2)) / 2 == accNum.charAt(4)) {
                Client c = new Client(fullname, accNum, balance);
                System.out.println(c.toString());
            }
        }

    }

}
