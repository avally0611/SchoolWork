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

/**
 *
 * @author aaminahv
 */
public class fileScanner {

    public static void main(String[] args) {
        File f = new File("data\\nameAges.txt");

        try {
            Scanner fileSc = new Scanner(f);
            String oldestName = "";
            int oldestAge = 0;

            while (fileSc.hasNext()) {
                String name = fileSc.next();
                int age = fileSc.nextInt();

                if (age > oldestAge) {
                    oldestAge = age;
                    oldestName = name;

                }

            }
            System.out.println(oldestName + " is the oldest at " + oldestAge);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(fileScanner.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
