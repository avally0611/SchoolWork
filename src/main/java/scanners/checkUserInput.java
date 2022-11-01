/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aaminahv
 */
public class checkUserInput {

    public static void main(String[] args) {

        //get stuff
        String userInput = JOptionPane.showInputDialog("Enter username");
        String pass = JOptionPane.showInputDialog("Enter your password");
        boolean access = false;

        try {
            File f = new File("data\\loginPass.txt");
            Scanner fileSc = new Scanner(f);

            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");

                String user = lineSc.next();
                String password = lineSc.next();

                if ((userInput.equals(user)) && (pass.equals(password))) {
                    access = true;
                    break;
                }
            }

            if (access) {
                JOptionPane.showMessageDialog(null, "Your details are correct.", "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Your details are incorrect.", "Warning", JOptionPane.WARNING_MESSAGE);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(fileScanner.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
