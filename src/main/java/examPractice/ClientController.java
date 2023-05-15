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
    private int size = 0;
    private static final File filePath = new File("data//Clients.txt");

    public ClientController() {
        try {
            Scanner sc = new Scanner(filePath);

            while (sc.hasNext()) {

                String line = sc.nextLine();

                Scanner lineSc = new Scanner(line).useDelimiter("#");

                String fullname = lineSc.next();
                String email = lineSc.next();
                String password = lineSc.next();
                String clientNameTier = lineSc.next();
                int currentUsage = lineSc.nextInt();

                int tierInt = Client.BRONZE_TIER;
                if (clientNameTier.equalsIgnoreCase("silver")) {
                    tierInt = Client.SILVER_TIER;
                } else if (clientNameTier.equalsIgnoreCase("gold")) {
                    tierInt = Client.GOLD_TIER;
                }

                clients[size] = new Client(fullname, email, password, tierInt, currentUsage);
                size++;

            }

        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }

    }

    public String toString() {
        String output = "";
        for (int i = 0; i < size; i++) {
            output += clients[i].toString();
            output += "\n";

        }

        return output;
    }

    public void sort() {

        for (int i = size - 1; i >= 0; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (clients[j].getSurname().compareTo(clients[j + 1].getSurname()) > 0) {
                    Client temp = clients[j];
                    clients[j] = clients[j + 1];
                    clients[j + 1] = temp;
                    sorted = false;

                }
            }

            if (sorted) {
                break;
            }
        }
    }

    public Client search(String surname) {
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (clients[mid].getSurname().equalsIgnoreCase(surname)) {
                return clients[mid];
            } else if (clients[mid].getSurname().compareTo(surname) < 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return null;
    }

    public String filterInsecureClients() {
        String output = "";

        for (int i = 0; i < size; i++) {
            if (!(clients[i].isSecure())) {
                output += clients[i].toString() + "\n";
            }
        }

        return output;
    }

}
