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
public class challengeOne {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter a name");

        int nameLen = 0;
        int average = 0;
        int count = 0;
        String compare2 = "";

        while (!(name.equals("XXX"))) {
            nameLen = name.length();
            average += nameLen;
            count++;
            int ans = compare2.compareTo(name);

            if (ans < 0) {
                compare2 = name;
            }

            name = JOptionPane.showInputDialog("Enter a name");

        }
        average = average / count;
        System.out.println("The average length is: " + average);
        System.out.println(compare2);
    }

}
