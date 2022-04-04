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

public class TempConversion {

    public static void main(String[] args) {
        int temp = Integer.parseInt(JOptionPane.showInputDialog("Enter a temperatueoe"));
        int fTemp = (9 * temp) / 5 + 32;
        System.out.println(fTemp);
    }

}
