/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringManipulation;

/**
 *
 * @author aaminahv
 */
public class Palindrome {

    public static boolean getPalindrome(String word) {

        boolean isPalindrome = false;

        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);

        }

        if (word.equals(reversedWord)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }

        return isPalindrome;
    }

}
