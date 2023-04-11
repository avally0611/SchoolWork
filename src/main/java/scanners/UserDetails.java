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
        
        Scanner sc = new Scanner(input);
        String name = "";
        String surname = "";
        int age = 0;
        
        while(sc.hasNext())
        {
            name = sc.next();
            surname = sc.next();
            age = sc.nextInt();
        }
        
        System.out.println("Name: " + name + "\nSurname: " + surname + "\nAge: " + age);
    }
    
}
