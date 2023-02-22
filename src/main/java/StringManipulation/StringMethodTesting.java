/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringManipulation;

/**
 *
 * @author Aaminah1
 */
public class StringMethodTesting {
    public static void main(String[] args) {
        String full_name = "Bob The Greatest Toolbox Builder";
        
        String lastName = full_name.substring(full_name.lastIndexOf(" ") + 1, full_name.length());
        
        System.out.println(lastName);
    }
    
}
