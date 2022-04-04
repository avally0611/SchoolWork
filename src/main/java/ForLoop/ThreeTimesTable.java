/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForLoop;

/**
 *
 * @author aaminahv
 */
public class ThreeTimesTable {

    public static void main(String[] args) {

        int num = 0;

        for (int i = 12; i >= 1; i--) {
            num = i * 3;
            System.out.println(num);

            System.out.println("");

            if (num % 5 == 0) {
                System.out.println(num);
            }

        }

    }

}
