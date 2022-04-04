/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForLoop;

/**
 *
 * @author aaminahv
 */
import javax.swing.*;

public class NameInput {

    public static void main(String[] args) {
        
        //get name and then find length of name
        String name = JOptionPane.showInputDialog("enter your name now");
        int length = name.length();
     
        //prints out each letter of name 
        for (int i = 0; i <= length; i++) {
            System.out.println(name.charAt(i));

        }

    }

}
