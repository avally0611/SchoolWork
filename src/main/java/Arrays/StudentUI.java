/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Aaminah1
 */
public class StudentUI {
    public static void main(String[] args) {
        Student s = new Student();
        s.markSort();
        System.out.println("The subject with a mark of 77 is: " + s.getSubjects(s.markSearch(77)));
    }
    
}
