/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author aaminahv
 */
public class SortedArrays {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("data\\marks.txt");
        Scanner sc = new Scanner(f).useLocale(Locale.UK);

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

//        double[] insertionArray = insertionSort(originalArray, size);
//        System.out.println("\nThis is the insertion sorted array: ");
//        for (int i = 0; i < size; i++) {
//            System.out.println(insertionArray[i]);
//        }
        double[] bubbleArray = bubbleSort(originalArray, size);
        System.out.println("\nThis is the bubble sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.println(bubbleArray[i]);
        }

    }

    public static double[] insertionSort(double[] originalArray, int arraySize) {

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                if (originalArray[j] < originalArray[i]) {
                    double current = originalArray[i];
                    originalArray[i] = originalArray[j];
                    originalArray[j] = current;
                }
            }
        }

        return originalArray;
    }

    //bubble sort
    public static double[] bubbleSort(double[] originalArray, int arraySize) {
        for (int i = arraySize - 1; i <= 0; i++) {
            for (int j = 0; j < arraySize; j++) {
                if (originalArray[j + 1] < originalArray[j]) {
                    double current = originalArray[j];
                    originalArray[j] = originalArray[j + 1];
                    originalArray[j + 1] = current;
                }
            }
        }

        return originalArray;

    }

}
