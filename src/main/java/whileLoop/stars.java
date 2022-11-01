/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whileLoop;

import javax.swing.JOptionPane;

/**
 *
 * @author aaminahv
 */
public class stars {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("How many stars"));

        for (int g = 1; g <= num; g++) {
            System.out.println(oneLine(g));
        }

        for (int h = num; h >= 1; h--) {
            System.out.println(oneLine(h));
        }

    }

    public static String oneLine(int n) {
        String out = "";

        for (int i = 0; i < n; i++) {
            out += "*";
        }

        return out;
    }

}
