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
public class PasswordVerifier {
    public static void main(String[] args) {
        String userPassword = JOptionPane.showInputDialog("Enter your password");
        
        boolean isLong = false;
        boolean isUpper = false;
        boolean isLower = false;
        boolean isNumber = false;
        boolean isSpecial = false;
        
        for (int i = 0; i < userPassword.length() - 1; i++) 
        {
            if (userPassword.length() >= 8)
            {
                char let = userPassword.charAt(i);
                if (Character.isUpperCase(let))
                {
                    isUpper = true;
                }
                else if (Character.isLowerCase(let))
                {
                    isLower = true;
                }
                else if (Character.isDigit(let))
                {
                    isNumber = true;
                }
                else 
                {
                    isSpecial = true;
                }
            }
            
        }
        
        if ((isUpper)&&(isLower)&&(isNumber)&&(isSpecial))
        {
            System.out.println("Your pasword is safe");
        }
        else
        {
            System.out.println("Your password is not safe enough, retry!");
        }
            
    }
    
    
}
