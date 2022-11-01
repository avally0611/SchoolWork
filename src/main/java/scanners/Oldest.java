/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanners;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aaminahv
 */
public class Oldest {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter boy's name and age");

        Scanner sc = new Scanner(input);

        String hiName = sc.next();
        int hiAge = sc.nextInt();

        while (sc.hasNext()) {
            String name = sc.next();
            int age = sc.nextInt();
            if (age > hiAge) {
                hiAge = age;
                hiName = name;
            }

        }
        System.out.println("" + hiName + " is the oldest");

    }

}
