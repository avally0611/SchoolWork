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
public class AvgGirlsNames {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter a girl's first name. Type * to stop");
        int count = 0;
        int average = 0;
        int nameLen;
        String stop = "*";

        while (!(name.equals(stop))) {
            System.out.println(name);
            nameLen = name.length();
            average = average + nameLen;
            count++;
            name = JOptionPane.showInputDialog("Enter a girl's first name. Type * to stop");
        }
        System.out.println("The average length of girls' names inputted is: " + average / count);
    }

}
