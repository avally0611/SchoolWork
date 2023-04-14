/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author aaminahv
 */
public class ArrayAddRemove {

    private static int[] arr;
    private static int size;

    public static void main(String[] args) {
        arr = new int[15];

        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 8;
        arr[3] = 11;
        arr[4] = 15;
        arr[5] = 15;
        arr[6] = 15;
        arr[7] = 15;
        arr[8] = 19;
        arr[9] = 19;
        arr[10] = 25;
        size = 11;

//        remove(4);
//        System.out.println("Removing a number");
//        for (int i = 0; i < size; i++) {
//            System.out.println(arr[i]);
//        }
        System.out.println("\nRemoving duplicate");
        removeDuplicate();

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void add(int num) {
        int pos = 0;
        for (int i = 0; i < size - 1; i++) {
            if (num > arr[i]) {
                pos = i;
                break;
            }

        }
        shiftRight(pos);
        arr[pos] = num;
        size++;
    }

    private static void shiftRight(int pos) {
        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
    }

    private static void shiftLeft(int index) {
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
    }

    public static void remove(int index) {
        shiftLeft(index);
        size--;
        //do i really need a shiftLeft method then??
    }

    //imp bubble sort
    public static void removeDuplicate() {
        for (int i = 0; i < size - 1; i++) {
            while (arr[i] == arr[i + 1]) {
                remove(i + 1);
            }
        }
    }

}
