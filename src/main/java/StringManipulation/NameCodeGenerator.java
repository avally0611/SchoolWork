/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringManipulation;

import javax.swing.JOptionPane;

/**
 *
 * @author Aaminah1
 */
public class NameCodeGenerator {
    //generate code from name: first two letters of name,
    //Aaminah Vally - AA35LY
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your first name and last name");
        
        
        String[] nameSplit = name.split(" ");
        
        int length = nameSplit.length;
        String first_name = nameSplit[0].substring(0,2).toUpperCase();
        String last_name = nameSplit[length - 1];
        last_name = last_name.substring(last_name.length() - 2, last_name.length()).toUpperCase();
        
        int randomNum = (int) (Math.random()*90 + 10);
        
        System.out.println("Your code is: " + first_name + randomNum + last_name);
    }
}
