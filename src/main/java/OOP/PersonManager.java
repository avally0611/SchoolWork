/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
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
    private Person[] peeps = new Person[50];

    private String[] emails = new String[200];

    public PersonManager() {
        File fileSc = new File("data\\person.txt");
        try {
            Scanner sc = new Scanner(fileSc);

            while (sc.hasNext()) {
                String line = sc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#").useLocale(Locale.UK);
                int ID = lineSc.nextInt();
                String firstName = lineSc.next();
                String lastName = lineSc.next();
                double weight = lineSc.nextDouble();
                double height = lineSc.nextDouble();

                //using constructor to create person
                Person p = new Person(ID, firstName, lastName, weight, height);

                //at 0: store person 1, then at 1: store person1, and so on
                peeps[size] = p;
                emails[size] = p.getEmail();
                size++;

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(PersonManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String toString() {
        String output = "";

        for (int i = 0; i < size; i++) {
            output += peeps[i].toString() + "\n";

        }
        return output;
    }

    public String getEmail(int id) {
        for (int i = 0; i < size; i++) {
            if (peeps[i].getID() == id) {
                return peeps[i].getEmail();

            }

        }
        return null;
    }

    public String getName(int id) {
        for (int i = 0; i < size; i++) {
            if (peeps[i].getID() == id) {
                return peeps[i].getFirstName() + " " + peeps[i].getLastName();

            }

        }
        return null;
    }

    public double getAvgHeight() {

        double height = 0.0;
        for (int i = 0; i < size; i++) {
            height += peeps[i].getHeight();
        }

        double ave = height / size;
        ave = Math.round(ave * 1000);
        ave /= 1000;

        return ave;
    }

    public double getAvgWeight() {

        double weight = 0.0;
        for (int i = 0; i < size; i++) {
            weight += peeps[i].getWeight();
        }

        double ave = weight / size;
        ave = Math.round(ave * 1000);
        ave /= 1000;

        return ave;
    }

    public Double getBMI(int id) {
        for (int i = 0; i < size; i++) {
            if (peeps[i].getID() == id) {
                double bmi = peeps[i].getBMI();
                bmi = Math.round(bmi * 1000);
                bmi /= 1000;
                return bmi;
            }
        }

        return null;
    }

}
