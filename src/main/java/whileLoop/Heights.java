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
public class Heights {

//sadds
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter name");
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height in m")); //S I
        double shortest = height;

        while (height > 0) { //T

            if (height < shortest) {
                shortest = height;
            }
            height = Double.parseDouble(JOptionPane.showInputDialog("Enter height in m")); //C

        }

        shortest = shortest * 10;
        shortest = Math.round(shortest);
        shortest = shortest / 10;

        System.out.println(shortest);
    }

}
