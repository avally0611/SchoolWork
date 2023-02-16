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
public class CompareNames {
    //Create a program called CompareNames. Ask the user to input 5 names and display the name which comes first alphabetically.
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter a name");
        String highAlpha = name;
        
        for (int i = 0; i < 4; i++) 
        {
            System.out.println(name);
            if (name.compareTo(highAlpha) < 0)
            {
                highAlpha = name;
            }
            
            name = JOptionPane.showInputDialog("Enter a name");
        }
        
        System.out.println("The name that comes first alphabteically is: " + highAlpha);
    }
}
