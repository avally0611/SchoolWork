/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aaminahv
 */
public class Ratings {

    private String[] names;
    private int[] ratings;
    private int size;

    public Ratings() {

        names = new String[10];
        ratings = new int[10];
        try {
            Scanner lineSc = new Scanner(new File("data\\Ratings.txt"));
            String nameLine = lineSc.nextLine();
            Scanner nameSc = new Scanner(nameLine).useDelimiter("#");

            while (nameSc.hasNext()) {
                names[size] = nameSc.next();
                size++;
            }

            size = 0;
            String ratingsLine = lineSc.nextLine();
            Scanner ratingsSc = new Scanner(ratingsLine).useDelimiter("#");

            while (ratingsSc.hasNext()) {
                ratings[size] = ratingsSc.nextInt();
                size++;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ratings.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String toString() {
        String output = "RATINGS\n--------\n";
        for (int i = 0; i < size; i++) {
            output += (names[i] + ": " + ratings[i] + '\n');
        }
        return output;
    }

    public void sort() {
        for (int i = size - 1; i >= 0; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;

                    int numTemp = ratings[j];
                    ratings[j] = ratings[j + 1];
                    ratings[j + 1] = numTemp;

                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
    }

}
