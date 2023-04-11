/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author aaminahv
 */
public class ArraySearching {

    public static void main(String[] args) {
        int[] numList = new int[10];
        int theNum = 20;

        numList[0] = 20;
        numList[1] = 54;
        numList[2] = 11;
        numList[3] = 98;
        numList[4] = 72;
        numList[5] = 35;
        numList[6] = 86;
        numList[7] = 60;
        numList[8] = 21;

        BubbleSort(numList, numList.length);

//        for (int i = 0; i < numList.length; i++) {
//            System.out.println(numList[i]);
//        }
        System.out.println(BinarySearch(numList, theNum));

    }

//    public static int LinearSearch(int[] list, int target) {
//
//
//        for (int i = 0; i < list.length; i++) {
//            if (list[i] == theNum) {
//                return i;
//            }
//
//        }
//
//        return -1;
//    }
    //134689
    public static int BinarySearch(int[] list, int target) {

        int start = 0;
        int end = list.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (list[mid] == target) {
                return mid;
            } else if (list[mid] > target) {
                end = mid - 1;

            } else if (list[mid] < target) {
                start = mid + 1;

            }
        }

        return -1;

    }

    public static void BubbleSort(int[] originalArray, int arraySize) {

        boolean sorted = true;
        for (int i = arraySize; i >= 0; i--) {
            for (int j = 0; j < arraySize - 1; j++) {

                if (originalArray[j + 1] < originalArray[j]) {
                    sorted = false;
                    int current = originalArray[j];
                    originalArray[j] = originalArray[j + 1];
                    originalArray[j + 1] = current;
                }
            }
            if (sorted) {
                break;
            }
            sorted = true;
        }

    }

}
