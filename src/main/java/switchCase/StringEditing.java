/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package switchCase;

import javax.swing.JOptionPane;

/**
 *
 * @author aaminahv
 */
public class StringEditing {

    public static void main(String[] args) {
        String word1 = JOptionPane.showInputDialog("Enter word 1");
        String word2 = JOptionPane.showInputDialog("Enter word 2");

        int choice = Integer.parseInt(JOptionPane.showInputDialog("Choose between option 1, 2 or 3"));

        switch (choice) {
            case 1:
                int length = word2.length();
                System.out.println(" " + word1.charAt(0) + word2.charAt(length - 1));
                break;

            case 2:
                System.out.println("" + word1.toUpperCase() + word2.toLowerCase());
                break;

            case 3:
                if (word1.equals(word2)) {
                    System.out.println("the words are the same");
                } else {
                    System.out.println("the words are not the same");
                }
                break;

            default:
                System.out.println("You have not entered a proper choice");
                break;

        }

    }

}
