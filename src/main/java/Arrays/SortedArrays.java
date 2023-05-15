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
        double[] originalArray = new double[10];
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
        improvedInsertionSort(originalArray, size);
        System.out.println("\nThis is the  sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.println(originalArray[i]);
        }

    }

    public static void insertionSort(double[] originalArray, int arraySize) {

        int numComparisons = 0;
        int numSwops = 0;
        boolean sorted = true;
        for (int i = 0; i < arraySize - 1; i++) {
            for (int j = i + 1; j < arraySize; j++) {
                numComparisons++;
                if (originalArray[j] < originalArray[i]) {
                    numSwops++;
                    double current = originalArray[i];
                    originalArray[i] = originalArray[j];
                    originalArray[j] = current;
                }
            }

        }

        System.out.println("\nNum Comp: " + numComparisons + "\nNum Swops: " + numSwops);

    }
    public static void improvedInsertionSort(double[] originalArray, int arraySize) {

        double hiNum = 0.0;
        int hiIndex = 0;
       
        int lowestIndex = 0;

        for (int i = 0; i < arraySize - 1; i++) {
            lowestIndex = i;
            for (int j = i + 1; j < arraySize; j++) {
             
                if (originalArray[j] < originalArray[lowestIndex]) {
                    lowestIndex = j;
                  

                }

            }

            double current = originalArray[i];
            originalArray[i] = originalArray[lowestIndex];
            originalArray[lowestIndex] = current;
        }

      

    }

    //bubble sort
//    public static double[] bubbleSort(double[] originalArray, int arraySize) {
//        int numComparisons = 0;
//        int numSwops = 0;
//        for (int i = arraySize; i >= 0; i--) {
//            for (int j = 0; j < arraySize - 1; j++) {
//                numComparisons++;
//                if (originalArray[j + 1] < originalArray[j]) {
//                    numSwops++;
//                    double current = originalArray[j];
//                    originalArray[j] = originalArray[j + 1];
//                    originalArray[j + 1] = current;
//                }
//            }
//        }
//
//        System.out.println("Bubble Sort\nNum Comp: " + numComparisons + "\nNum Swops: " + numSwops);
//
//        return originalArray;
//
//    }
    //bubble sort
//    public static void immprovedBubbleSort(double[] originalArray, int arraySize) {
//        int numComparisons = 0;
//        int numSwaps = 0;
//        
//        for (int i = originalArray.length - 1; i >= 0; i--) {
//            boolean sorted = true;
//            for (int j = 0; j < originalArray.length - 1; j++) {
//                numComparisons++;
//                if (originalArray[j] < originalArray[j + 1]) {
//                    numSwaps++;
//                    sorted = false;
//                    double current = originalArray[j];
//                    originalArray[j] = originalArray[j + 1];
//                    originalArray[j + 1] = current;
//                }
//            }
//            if (sorted) {
//                break;
//            }
//            sorted = true;
//        }
//
//        System.out.println("Bubble Sort\nNum Comp: " + numComparisons + "\nNum Swops: " + numSwaps);
//
//    }
}
