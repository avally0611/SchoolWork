/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Aaminah Vally
package NovemberPractical;

import javax.swing.JOptionPane;


public class SwimTeam {
    public static String name = "";
    public static String teamListA = "";
    public static String teamListB = "";
    public static String teamListReserve = "";
    public static int countA = 0;
    public static int countB = 0;
    public static int countReserve = 0;
    public static double aveTime = 0;
    public static double lowTime = 0;
    public static String lowName = "";
    
    public static void main(String[] args) {
        teamListA += "Team A\n";
        teamListB += "Team B\n";
        teamListReserve += "Team Reserve\n";
        name = JOptionPane.showInputDialog("Enter swimmer Name");
        
        while(!(name.equalsIgnoreCase("XXX")))
        {
           oneSwim(); 
           
           if (aveTime < lowTime)
           {
               lowTime = aveTime;
               lowName = name;
           }
           
           name = JOptionPane.showInputDialog("Enter swimmer Name");
        }
        System.out.println("The fastest Swimmer was " + lowName + " with a time of " + lowTime);
        displayTeamList();
        
    }
    
    public static void oneSwim()
    {
        System.out.println("Swimmer Name: " + name);
        
        int sumTimes = 0;
        for (int i = 1; i <= 4; i++) {
            int swimMin = (int) (Math.random()*3+2);
            int swimSec = (int) (Math.random()*60);
            int swimTime = (swimMin*60) + swimSec; 
            System.out.print("Swimmer Time " + i + ": " + swimMin + " min " + swimSec + " seconds");
            System.out.println("\t\tTotal Time in Seconds is: " + swimTime + " secs");
            sumTimes += swimTime;
        }
        
        aveTime = sumTimes/4.0;
        System.out.println("Average Time in seconds: " + aveTime);
        
        if (aveTime < 160)
        {
            teamListA += name + "  ";
            countA++;
            System.out.println("Team: A\n");
        }
        else if (aveTime < 210)
        {
            teamListB += name + "  ";
            countB++;
            System.out.println("Team: B\n");
        }
        else if (aveTime >= 211)
        {
            teamListReserve += name + "  ";
            countReserve++;
            System.out.println("Team: Reserve\n");
        }
   
    }
    
    public static void displayTeamList()
    {
        System.out.println("The teams are\n");
        System.out.println(teamListA + "\nwith " + countA + " team member (s)\n");
        System.out.println(teamListB + "\nwith " + countB + " team member (s)\n");
        System.out.println(teamListReserve + "\nwith " + countReserve + " team member (s)");
    }
    

    
    
}
