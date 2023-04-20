/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import static Arrays.ArrayAddRemove.remove;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aaminahv
 */
public class FileArray {

    private String strArr[] = new String[100];
    private int size = 0;

    public FileArray() {
        try {
            Scanner sc = new Scanner(new File("data\\DuplicateNames.txt"));

            while (sc.hasNext()) {
                strArr[size] = sc.next();
                size++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileArray.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < size; i++) {
            output += strArr[i] + "\n";
        }
        return output;
    }

    public void removeDups() {

        sort();
        for (int i = 0; i < size - 1; i++) {
            while (strArr[i].equals(strArr[i + 1])) {
                remove(i + 1);
            }
        }
    }

    private void remove(int index) {
        for (int i = index + 1; i < size; i++) {
            strArr[i - 1] = strArr[i];
        }
        size--;
    }

    private void sort() {
        for (int i = size - 1; i >= 0; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (strArr[j].compareTo(strArr[j + 1]) > 0) {
                    String temp = strArr[j];
                    strArr[j] = strArr[j + 1];
                    strArr[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
    }

    public void writeTo() {
        try {
            PrintWriter pw = new PrintWriter(new File("data\\DuplicateNames.txt"));

            for (int i = 0; i < size; i++) {
                pw.println(strArr[i]);

            }
            pw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileArray.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String search(String name) {
        sort();
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (strArr[mid].equals(name)) {
                return strArr[mid];
            } else if (strArr[mid].compareTo(name) < 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return "NO NAME FOUND";
    }

}
