/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NovemberPractical;

import javax.swing.JOptionPane;

//NOV PRAC 2021
public class Wages {
    
    public static String name = "";
    public static int sumHours = 0;
    
    public static void main(String[] args) {
        name = JOptionPane.showInputDialog("enter worker's name...");
        
        
        int hiHours = 0;
        String hiName = "";
        while (!(name.equalsIgnoreCase("XXX")))
        {
            onePerson();
            if (sumHours > hiHours)
            {
                hiHours = sumHours;
                hiName = name;
            }
            name = JOptionPane.showInputDialog("enter worker's name...");
            
            
        }
        System.out.println(hiName + " has the most hours with " + hiHours);
    }
    
    public static void onePerson()
    {
        System.out.println("\n" + name);
        
        for (int i = 1; i <= 5; i++) {
            //why do they have 6+2
            int hours = (int) (Math.random()*5+2);
            String day = "";
            
            
            //we could have used switch (i)
            if (i == 1)
            {
                day = "Monday";
            }
            else if (i == 2)
            {
                day = "Tuesday";
            }
            else if (i == 3)
            {
                day = "Wednesday";
            }
            else if (i == 4)
            {
                day = "Thursday";
            }
            else if (i == 5)
            {
                day = "Friday";
            }
            
            System.out.println("\tHours worked on day " + day + ": " + hours);
            sumHours += hours;

        }
        calculateWages();
        
    }
    
    public static void calculateWages()
    {
        System.out.println("Total Weekly Hours: " + sumHours);
        
        if (sumHours > 30)
        {
            sumHours += 5;
            System.out.println("5 bonus hours added: " + sumHours);
        }
        
        double weeklyPay = sumHours*77.50;
        double rate = 0.0;
        
        if (weeklyPay > 1800.00)
        {
            rate = 0.08;
        }
        else
        {
            rate = 0.075;
        }
        
        //why do they * by 0,075
        double beforeTax = weeklyPay*rate;
        beforeTax = (beforeTax*100);
        double tax = (Math.round(beforeTax))/100;
        
        double finalPay = weeklyPay - tax;
        
        System.out.println("Weekly Pay: " + weeklyPay + "\nTax Rate: " + rate + "\nTax: " + tax + "\nFinal pay: " + finalPay);
        
    }
}
