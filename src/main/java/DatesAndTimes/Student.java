/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatesAndTimes;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Aaminah1
 */
public class Student 
{
    private String name;
    private int age;
    private int grade;
    private LocalDate dob;

    public Student(String nm, int age, int grade, LocalDate dob) {
        this.name = nm;
        this.age = age;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nGrade: " + grade + "\nDate of Birth: ";
    }
    
    
    
    
    
    
}
