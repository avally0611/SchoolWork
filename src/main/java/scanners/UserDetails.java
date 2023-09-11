/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanners;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Aaminah1
 */
public class UserDetails {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter your name, surname and age");

        //to acces text file
        File f = new File("data/Recipes.txt");
        Scanner sc = new Scanner(input).useDelimiter("#");

        while (sc.hasNext()) {
            String name = sc.next();
            String surname = sc.next();
            int age = sc.nextInt();
        }

        System.out.println("Name: " + name + "\nSurname: " + surname + "\nAge: " + age);
    }

}
