/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifStatement;

/**
 *
 * @author aaminahv
 */
import javax.swing.*;

public class Driving {

    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age. DONT LIE. I GOT YOUR BLACKMAIL!"));

        if (age < 18) {
            System.out.println(age + ": TOO YOUNG TO DRIVE, GET OUTTA HERE");
        } else if (age > 75) {
            System.out.println(age + ": TOO OLD TO DRIVE, GET OUTTA HERE, WALK FASTER, USE THE WALKING STICK");
        } else {
            System.out.println(age + ": OK BUT DO YOU HAVE A DRIVING LICENSE, DONT LIE, IM WATCHING YOU AND I WILL CALL YOUR MUM!");
        }
    }

}
