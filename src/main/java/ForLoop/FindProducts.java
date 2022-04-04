/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForLoop;

/**
 *
 * @author Aaminah
 */
import javax.swing.*;
public class FindProducts {
    public static void main(String[] args) {
        int numNumbers = Integer.parseInt(JOptionPane.showInputDialog("How many numbers you want to enter"));
        
        int product = 1;
        
        for (int i = 0; i < numNumbers; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Enter your number"));
            product = product*num;
            
            
        }
        System.out.println(product);
    }
    
}
