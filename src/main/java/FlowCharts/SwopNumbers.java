/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlowCharts;

/**
 *
 * @author aaminahv
 */
import javax.swing.*;

public class SwopNumbers {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a numkber"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter a numkber"));

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1 + "\t" + num2);

    }

}
