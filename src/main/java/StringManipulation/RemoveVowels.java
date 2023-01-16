/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringManipulation;

import javax.swing.JOptionPane;

/**
 *
 * @author aaminahv
 */
public class RemoveVowels {

    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("enter a word - lowercase only please");

        while ((word.contains("a")) || (word.contains("e")) || (word.contains("i")) || (word.contains("o")) || (word.contains("u"))) {
            if (word.contains("a")) {
                word.replaceAll("a", " ");
            } else if (word.contains("e")) {
                word.replaceAll("e", " ");
            } else if (word.contains("i")) {
                word.replaceAll("i", " ");
            } else if (word.contains("o")) {
                word.replaceAll("o", " ");
            } else if (word.contains("u")) {
                word.replaceAll("u", " ");
            }

        }

        System.out.println(word);

    }

}
