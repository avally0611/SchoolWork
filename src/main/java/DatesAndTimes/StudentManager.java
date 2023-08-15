/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatesAndTimes;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aaminah1
 */
public class StudentManager 
{
    private Student[] peeps = new Student[50];
    private int size;
    
    
    public StudentManager() 
    {
        try 
        {
            Scanner lineSc = new Scanner(new File("data/StudentDates.txt"));
            
            while (lineSc.hasNext())
            {
                String line = lineSc.nextLine();
                
                Scanner sc = new Scanner(line).useDelimiter("#");
                
                String name = sc.next();
                int grade = sc.nextInt();
                String dob = sc.next();
                
                DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yy");
                LocalDate dateOfBirth = LocalDate.parse(dob, inputFormatter);
                
                int age = ageCalc(dateOfBirth);
                
                Student s = new Student(name, age, grade, dateOfBirth);
                peeps[size] = s;
                size++;
            }
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private int ageCalc(LocalDate dob)
    {
        
        
        Period diff = Period.between(dob, LocalDate.now());
        
        int age = diff.getYears();
        
        return age;
    }

    
    public String toString() {
        
        String output = "";
        for (int i = 0; i < size; i++) 
        {   
            output += peeps[i].toString();
        }
        
        return output;
    }
    
    
    
}
