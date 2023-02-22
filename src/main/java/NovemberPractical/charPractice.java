/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NovemberPractical;

/**
 *
 * @author Aaminah1
 */
public class charPractice {
    public static void main(String[] args) {
        String one = "Howsit";
        String two = "hello";
        
        String mostAlpha = "";
        
        if (one.compareToIgnoreCase(two) < 0)
        {
            mostAlpha = one;
        }
        else if (one.compareToIgnoreCase(two) > 0)
        {
            mostAlpha = two;
        }
        
        System.out.println(mostAlpha);
    }
    
}
