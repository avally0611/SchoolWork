/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NovemberPractical;

import javax.swing.JOptionPane;

/**
 *
 * @author aaminahv
 *
 *
 */
//Aaminah Vally
//Section B
public class LeagueTwenty {

    //Question 2 - Class
    static String currentPlayerName = "";
    static double currentPlayerAverage = 0;
    static int currentPlayerFifties = 0;

    public static void main(String[] args) {
        //Question 3 - Team Loop
        currentPlayerName = JOptionPane.showInputDialog("Enter the player's name");
        System.out.println("========================" + "\nPLAYER STATS" + "\n========================");

        int numPlayers = 0;
        while (!(currentPlayerName.equals("XXX"))) {
            System.out.println("NAME: " + currentPlayerName);
            currentPlayerName = JOptionPane.showInputDialog("Enter the next player's name");
            numPlayers++;
        }
    }

    //Question 4 - Player Stats
    private static void generatePlayer() {
        String experienceLabel = "";
        int playerExperience = (int) (Math.random() * 4 + 1);

        switch (playerExperience) {
            case 1:
                experienceLabel = "Junior";
                break;

            case 2:
                experienceLabel = "Senior";
                break;

            case 3:
                experienceLabel = "expert";
                break;

            default:
                break;
        }

        System.out.println("EXP:" + experienceLabel);
    }

    private static String playerCode() {
        String playerCode = "";
        for (int i = 0; i < 3; i++) {
            char let = (currentPlayerName.charAt(i)).toUpperCase();
            int length = currentPlayerName.length();
            playerCode =

        }
        return playerCode;
    }
}
