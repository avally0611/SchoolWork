/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatesAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Aaminah1
 */
public class TestPrac 
{
    public static void main(String[] args) {
        
        LocalDateTime obj = LocalDateTime.of(2006, Month.NOVEMBER, 10, 16, 30);
        
        String dob1 = "10-11-06";
        String dob2 = "04-08-02";
        String dob3 = "28-01-10";
        String dob4 = "15-05-03";
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        LocalDate dob11 = LocalDate.parse(dob1, formatter);
        LocalDate dob12 = LocalDate.parse(dob2, formatter);
        LocalDate dob13 = LocalDate.parse(dob3, formatter);
        LocalDate dob14 = LocalDate.parse(dob4, formatter);
        
        LocalDate day = LocalDate.of(06, Month.NOVEMBER, 10);
        
        LocalDateTime days = LocalDateTime.of(2006, Month.NOVEMBER, 10, 5, 10);
        
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println(days.format(outputFormatter));
        
        String dayString = days.format(outputFormatter);
        System.out.println(dayString);
        
        System.out.println(obj.format(outputFormatter));
        
        
    }
    
}
