/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package switchCase;

/**
 *
 * @author aaminahv
 */
public class practiceOne {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 3 + 1);
        int type = 0;

        switch (num) {
            case 1: {
                type = 5;
                break;
            }

            case 2: {
                type = 9;
                break;
            }

            case 3: {
                type = 13;
                break;
            }

        }

        System.out.println(type);

    }

}
