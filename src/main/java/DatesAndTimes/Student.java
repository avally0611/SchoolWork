/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatesAndTimes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Aaminah1
 */
public class Student {

    private String name;
    private int age;
    private int grade;
    private LocalDate dob;

    public Student(String nm, int gr, LocalDate dateOfBirth) {
        this.name = nm;
        this.grade = gr;
        this.dob = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
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
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        return "Name: " + name + "\nGrade: " + grade + "\nDate of Birth: " + dob.format(outputFormatter);
    }

}
