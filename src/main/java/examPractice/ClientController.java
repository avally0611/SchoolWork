/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aaminahv
 */
public class ClientController {

    //private int[] nums = new Client[100];
    private Client[] clients = new Client[100];
    private int size;
    private static final File filePath = new File("data//Clients.txt");

    public ClientController() {
        try {
            Scanner sc = new Scanner(filePath).useDelimiter("#");

            while (sc.hasNext()) {
                String fullname = sc.next();
                String email = sc.next();
                String password = sc.next();
                int clientTier = sc.nextInt();
                int currentUsage = sc.nextInt();

                Client a = new Client(fullname, email, password, clientTier, currentUsage);
                clients[size] = a;
                size++;

            }

        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }

    }

    public String toString() {

    }

}
