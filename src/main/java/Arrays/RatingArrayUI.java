/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.FileNotFoundException;

/**
 *
 * @author avall
 */
public class RatingArrayUI {
    public static void main(String[] args) throws FileNotFoundException {
        RatingsArray r = new RatingsArray();
        r.sort();
        System.out.println(r.toString());
        System.out.println("NUMBER SUMMARY:" + "\n-------------" + "\nLowest = " + r.getElement(r.getSize() - 1) + "\nHighest = " + r.getElement(0) + "\nAverage = " + r.getAverage());
    }
    
}