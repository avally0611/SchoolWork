/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aaminahv
 */
public class ArraySorting {

    private static double[] marks;

    public static void main(String[] args) {
        try {
            File f = new File("data\\marks.txt");
            Scanner sc = new Scanner(f).useLocale(Locale.UK);

            int size = 0;
            marks = new double[10];
            int numMarks = 0;

            while (sc.hasNext()) {
                marks[size] = sc.nextDouble();
                numMarks++;
                size++;

            }

            System.out.println("This is the original array: ");
            for (int i = 0; i < size; i++) {
                System.out.println(marks[i]);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArraySorting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //help me pls - improved
    public void selectionSort() {
        for (int i = 0; i < marks.length; i++) {
            int lowestIndex = i;
            for (int j = i + 1; j < marks.length; j++) {
                if (marks[j] > marks[lowestIndex]) {
                    lowestIndex = j;
                }
            }

            //swop
        }
    }

    //help me pls - improved
    public void selectionSort() {
        for (int i = size - 1; i >= 0; i--) {

            for (int j = 0; j < i; j++) {
                if (marks[j] > marks[lowestIndex]) {
                    lowestIndex = j;
                }
            }

            //swop
        }
    }

}
