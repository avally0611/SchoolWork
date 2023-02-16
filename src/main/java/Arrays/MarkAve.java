/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author aaminahv
 */
public class MarkAve {

    //70.9
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("data\\marks.txt");
        Scanner sc = new Scanner(f);

        int size = 0;
        double[] totalMarks = new double[50];
        int numMarks = 0;

        while (sc.hasNext()) {
            totalMarks[size] = sc.nextDouble();
            numMarks++;
            size++;

        }

        double addedMarks = 0.0;
        for (int i = 0; i < numMarks; i++) {
            addedMarks += totalMarks[i];
        }

        double ave = addedMarks / numMarks;
        System.out.println("The average of the ten marks is: " + ave);

    }

}
