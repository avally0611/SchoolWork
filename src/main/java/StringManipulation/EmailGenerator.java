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
public class EmailGenerator {

    public static void main(String[] args) {
        String fullname = JOptionPane.showInputDialog("Enter your full name");
        String birthdate = JOptionPane.showInputDialog("Enter your year of birth");

        String email = "";

        String[] nameArray = fullname.split(" ");

        String first_name = nameArray[0].substring(0, 3);
        email += first_name;
        String last_name = nameArray[nameArray.length - 1].substring(0, 3);
        email += last_name;
        email += birthdate.substring(2, 4);
        email += "@gmail.com";

        System.out.println(email);

    }

}

//how many vowels in inputted word
//chnage date from dd/mm/yy to yy-mm-dd
//reverse word
//replace one character with another charactet
//remove all charcaters in input string from another string
//generate code from name: first two letters of name,
//Aaminah Vally - AA35LY
//check if word is palindrome
