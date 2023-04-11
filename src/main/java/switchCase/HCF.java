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
public class HCF {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 1"));

        int commonFactor = 0;
        int HCF = commonFactor;

        for (int i = 1; i < num1; i++) {

            if ((num1 % i == 0) && (num2 % i == 0)) {
                HCF = i;
            }

        }

        System.out.println("The HCF between your two numbers are " + HCF);

    }

}
