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

public class GetFiveNumbers {

    public static void main(String[] args) {

        int sum = 0;
        int HighNum;

        for (int i = 0; i < 5; i++) {
            int userNum = Integer.parseInt(JOptionPane.showInputDialog("Type a number"));
            sum = sum + userNum;

        }

        System.out.println(sum);
        System.out.println("Average:" + sum / 5);
        System.out.println();
    }

}
