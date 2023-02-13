/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import scanners.fileScanner;

/**
 *
 * @author aaminahv
 */
public class PersonManager {

    //use this to go through array
    private int size = 0;
    public Person[] peeps = new Person[50];

    public PersonManager() {
        File fileSc = new File("data\\person.txt");
        try {
            Scanner sc = new Scanner(fileSc);

            while (sc.hasNext()) {
                String line = sc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                int ID = lineSc.nextInt();
                String firstName = lineSc.next();
                String lastName = lineSc.next();
                double weight = lineSc.nextDouble();
                double height = lineSc.nextDouble();

                //using constructor to create person
                Person p = new Person(ID, firstName, lastName, weight, height);

                //at 0: store person 1, then at 1: store person1, and so on
                peeps[size] = p;
                size++;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(PersonManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
