/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.FileNotFoundException;

/**
 *
 * @author Aaminah1
 */
public class StudentUI {

    public static void main(String[] args) throws FileNotFoundException {
        Student s = new Student();
        s.yearReport();
        s.markSort();
        s.yearReport();
        System.out.println("The subject with a mark of 77 is: " + s.getSubjects(s.markSearch(77)));
    }

}
