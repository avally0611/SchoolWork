/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NovemberPractical;

/**
 *
 * @author Aaminah1
 */
public class substringPractice {
    public static void main(String[] args) {
        String word = "SU{ERCALIFRAGILICIOUS";
        
        int length = word.length();
        String part = word.substring(4, length);
        System.out.println(part);
    }
    
}
