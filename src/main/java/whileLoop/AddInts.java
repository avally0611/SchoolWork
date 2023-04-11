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
public class AddInts {

    public static void main(String[] args) {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Enter a number."));//1 Select Initialise

        //before - initialisation
        int sum = 0;

        while (input != -99) {//2 Test (conditional)

            //things you want to repeat - calculations*
            sum = sum + input;
            input = Integer.parseInt(JOptionPane.showInputDialog("Enter a number."));//3 Change (increment)
        }

        //after - post processing
        System.out.println(sum);
    }

}
