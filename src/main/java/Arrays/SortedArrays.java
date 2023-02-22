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
public class SortedArrays {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("data\\marks.txt");
        Scanner sc = new Scanner(f);

        int size = 0;
        double[] originalArray = new double[50];
        int numMarks = 0;

        while (sc.hasNext()) {
            originalArray[size] = sc.nextDouble();
            numMarks++;
            size++;

        }

        System.out.println("This is the original array: ");
        for (int i = 0; i < size; i++) {
            System.out.println(originalArray[i]);
        }

        double[] sortedArray = arraySorter(originalArray, size);
        System.out.println("\nThis is the sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.println(sortedArray[i]);
        }
    }

    public static double[] arraySorter(double[] originalArray, int arraySize) {

        double[] sortedArray = new double[50];
        double hiNum = 0.0;
        int hiIndex = 0;

        for (int j = 0; j < arraySize; j++) {
            for (int i = 0; i < arraySize - j; i++) {
                double currentNum = originalArray[i];

                if (currentNum > hiNum) {
                    hiNum = currentNum;
                    hiIndex = i;
                    originalArray[hiIndex] = originalArray[arraySize - 1];
                    originalArray[arraySize - 1] = hiNum;

                    sortedArray[i] = hiNum;

                }

            }

        }

        return sortedArray;
    }

}
