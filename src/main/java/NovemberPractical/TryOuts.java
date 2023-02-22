/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NovemberPractical;

import javax.swing.JOptionPane;

/**
 *
 * @author Aaminah1
 */
public class TryOuts {
    static double scoreAvHi = 0;
    static String scoreAvHiName = "";
    static String gender = "";
    static int recruitCounter = 0;
    
    public static void main(String[] args) 
    {
        String recruit = JOptionPane.showInputDialog("Enter the recruit's name");
        while (!(recruit.equals("XXX")))
        {
            oneRecruit(recruit);
            recruit = JOptionPane.showInputDialog("Enter the recruit's name");
        }
        System.out.println("Top Recruit: " + scoreAvHiName + "\nGender: " + gender + "\nTop challenges score average: " + scoreAvHi + "WELCOME TO THE BAYWATCH FAMILY!!!");
        
    }
    
    public static void oneRecruit(String recruit)
    {
        
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter the recruit's height in m"));
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter the recruit's weight in kg"));
        int numGender = Integer.parseInt(JOptionPane.showInputDialog("Enter the recruit's gender: 1 for Male and 2 for Female"));
        
        switch (numGender)
        {
            case 1: 
                gender = "Male";
                break;
            
            case 2:
                gender = "female";
                break;                    
        }
        
        
        System.out.println("Name: " + recruit);
        double average = 0;
        int sum = 0;
        
        for (int i = 1; i <= 3; i++) 
        {
            int randScore = (int) (Math.random()*11);
            double score = (height*randScore)/ (double) (weight/10);
            sum += score;
            System.out.println("Score for Challenge " + "i" + ": " + score);
            
        }
        average = sum/3.0;
        average = (Math.round(average*10))/10;
        System.out.println("Challenges Score Average: " + average);
        
        if (average > scoreAvHi)
        {
            scoreAvHi = average;
            scoreAvHiName = recruit;
        }
        
        
    }
    
}
