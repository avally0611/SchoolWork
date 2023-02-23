/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author aaminahv
 */
public class SwappingArrays {

    public static void main(String[] args) {
        int[] array = new int[50];
        array[0] = 0;
        array[1] = 0;
        array[2] = 5;
        array[3] = 0;
        array[4] = 0;
        array[5] = 0;
        array[6] = 9;
        array[7] = 0;

        int num = array[2];
        array[2] = array[6];
        array[6] = num;

        for (int i = 0; i < 8; i++) {
            System.out.println(array[i]);
        }
    }

}
