/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForLoop;

/**
 *
 * @author aaminahv
 */
import javax.swing.*;

public class NameInput {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("enter your name now");
        int nameLength = nameLength.length(name);

        for (int i = 0; i <= nameLength; i++) {
            System.out.println(name.charAt(i));

        }

    }

}
