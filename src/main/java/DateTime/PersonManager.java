/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aaminahv
 */
public class PersonManager {

    private int size = 0;
    private String[] people = new String[50];
    private LocalDate[] dates = new LocalDate[50];

    public PersonManager() {
        try {
            Scanner lineSc = new Scanner(new File("data//Dates.txt"));

            while (lineSc.hasNext()) {

                String line = lineSc.nextLine();
                Scanner sc = new Scanner(line).useDelimiter("#");
                String person = sc.next();
                String date = sc.next();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDate day = LocalDate.parse(date, formatter);

                Person p = new Person(person, day);

                people[size] = p.getName();
                dates[size] = p.getDate();
                size++;

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(PersonManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String toString() {
        String output = "";

        for (int i = 0; i < size; i++) {
            output += people[i] + ": " + dates[i] + "\n";
        }

        return output;
    }

    public void sort() {
        for (int i = size - 1; i >= 0; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (dates[j + 1].isBefore(dates[j])) {
                    LocalDate temp = dates[j];
                    dates[j] = dates[j + 1];
                    dates[j + 1] = temp;

                    String name = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = name;
                    sorted = false;

                }
            }

            if (sorted) {
                break;
            }
        }
    }

    public void addYears(int num) {
        for (int i = 0; i < size; i++) {
            dates[i] = dates[i].plusYears(num);
        }
    }

}
