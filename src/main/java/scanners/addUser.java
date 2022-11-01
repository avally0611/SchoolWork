/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aaminahv
 */
public class addUser {

    public static void main(String[] args) {
        try {
            String user = JOptionPane.showInputDialog("Enter username");
            String pass = JOptionPane.showInputDialog("Enter password");
            addUser(user, pass);
        } catch (IOException ex) {
            Logger.getLogger(addUser.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void addUser(String user, String pass) throws IOException {
        FileWriter f = new FileWriter("data\\loginPass.txt", true);

        PrintWriter pw = new PrintWriter(f);
        pw.println(user + "#" + pass);
        pw.close();
    }

}
