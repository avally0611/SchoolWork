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
 * @author Aaminah1
 */
public class RatingsArray {

    private int[] ratings;
    private int size;

    public RatingsArray() throws FileNotFoundException {
        ratings = new int[150];
        size = 0;
        Scanner sc = new Scanner(new File("data\\ClientRatings.txt"));

        while (sc.hasNext()) {
            ratings[size] = sc.nextInt();
            size++;
        }

    }

    public int getSize() {
        return size;
    }

    public int getElement(int index) {

        return ratings[index];
//        int start = 0;
//        int end = ratings.length - 1 ;
//
//        while (start <= end)
//        {
//            int mid = (start + end)/2;
//            if (ratings[mid] == ratings[index])
//            {
//                return ratings[mid];
//            }
//            else if (ratings[mid] > ratings[index])
//            {
//                end = mid - 1;
//            }
//            else if (ratings[mid] < ratings[index])
//            {
//                start = mid + 1;
//            }
//        }
//
//        return -1;
    }

    public int getFirst() {
        return ratings[0];
    }

    public int getLast() {
        return ratings[size - 1];
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < size; i++) {
            output += ratings[i] + " ";
        }
        return output;
    }

    public double getAverage() {
        double total = 0;
        for (int i = 0; i < size - 1; i++) {
            total += ratings[i];
        }

        double ave = total / ratings.length;
        ave *= 1000;
        ave = Math.round(ave);
        ave /= 1000;

        return ave;

    }

    public void sort() {
        for (int i = size - 1; i >= 0; i--) {
            boolean isSorted = true;
            for (int j = 0; j < i; j++) {
                if (ratings[j + 1] > ratings[j]) {
                    int temp = ratings[j];
                    ratings[j] = ratings[j + 1];
                    ratings[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }

    }

}
