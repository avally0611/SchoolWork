/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanners;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aaminahv
 */
public class ScanSent {

    public static void main(String[] args) {
        String sentence = JOptionPane.showInputDialog("Enter a sentence");

        Scanner sc = new Scanner(sentence);

        int totalWords = 0;

        while (sc.hasNext()) {
            String word = sc.next();
            totalWords++;
        }
        System.out.println("" + totalWords);

    }

}
