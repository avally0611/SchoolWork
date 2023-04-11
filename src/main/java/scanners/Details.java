/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanners;

import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author aaminahv
 */
public class Details {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter your name, ID number, height (m), and if you smoke");

        Scanner sc = new Scanner(input);

        String name = sc.next();
        String ID = sc.next();
        double height = sc.nextDouble();
        boolean smokes = sc.nextBoolean();

        System.out.print("Your name is: " + name + "\nYour ID number is: " + ID + "\nYour height is: " + height);

        if (smokes) {
            System.out.print("\nYou do smoke");

        } else {
            System.out.println("\nYou don't smoke");

        }

    }

}
