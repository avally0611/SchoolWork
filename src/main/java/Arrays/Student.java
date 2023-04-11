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
public class Student {

    private String name;
    private String[] subjects;
    private int[] yearMarks;

    public Student() throws FileNotFoundException {
        subjects = new String[15];
        yearMarks = new int[15];

        File f = new File("data\\Students.txt");
        Scanner fileSc = new Scanner(f);
        name = fileSc.nextLine();

        String line = fileSc.nextLine();
        Scanner subjectSc = new Scanner(line).useDelimiter("#");
        for (int i = 0; i < subjects.length; i++) {
            subjects[i] = subjectSc.next();
        }
        String nextLine = fileSc.nextLine();
        Scanner markSc = new Scanner(nextLine).useDelimiter("#");
        for (int i = 0; i < yearMarks.length; i++) {
            yearMarks[i] = markSc.nextInt();
        }

    }

    public String toString() {
        return "Student{" + "name=" + name + ", subjects=" + subjects + ", yearMarks=" + yearMarks + '}';
    }

    public void yearReport() {
        System.out.println("YEAR REPORT\nSTUDENT:" + name.toUpperCase() + "\n");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i].toUpperCase() + ":   " + yearMarks[i] + "\n");

        }
    }

    public String getSubjects(int index) {
        return subjects[index];
    }

    public void markSort() {
        bubbleSort();
    }

    public int markSearch(int mark) {
        return binarySearch(mark);
    }

    public void bubbleSort() {
        for (int i = 1; i < yearMarks.length; i++) {
            int next = yearMarks[i];
            String nextSub = subjects[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (next > yearMarks[j]) {
                    int holder = yearMarks[j];
                    yearMarks[j] = next;
                    yearMarks[i] = holder;

                    String holderSub = subjects[j];
                    subjects[j] = nextSub;
                    subjects[i] = holderSub;

                }
            }

        }
    }

    public int binarySearch(int mark) {
        int start = 0;
        int end = yearMarks.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (yearMarks[mid] == mark) {
                return mid;
            } else if (yearMarks[mid] > mark) {
                end = mid - 1;
            } else if (yearMarks[mid] < mark) {
                start = mid + 1;
            }
        }

        return -1;
    }

}
