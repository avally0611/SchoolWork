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
public class fileScannerLine {

    public static void main(String[] args) {

        //get stuff
        File f = new File("data\\namesAgesTables.txt");

        try {
            Scanner fileSc = new Scanner(f);

            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");

                String name = lineSc.next();
                int age = lineSc.nextInt();
                System.out.println(name + " is " + age);

                //processing
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(fileScanner.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
