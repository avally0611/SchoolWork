/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra;

import javax.swing.JOptionPane;

/**
 *
 * @author aaminahv
 */
public class challengeTwo {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter yout name");
        int option = Integer.parseInt(JOptionPane.showInputDialog("Choose between option 1, 2 and 3"));
        String letters = "";
        switch (option) {
            case 1: {

                char let;
                for (int i = 0; i < 3; i++) {
                    let = name.charAt(i);
                    letters = letters + let;

                }
                letters = letters.toUpperCase();
                int num = (int) (Math.random() * 999 + 100);

                System.out.println("Your ID is:" + letters + num);
            }

            case 2:
                int nameLen = name.length();
                for (int i = 0; i < nameLen; i++) {
                    nameLen -= 1;
                    char let = name.charAt(nameLen);
                    System.out.println(let);

                }
        }
    }

}
