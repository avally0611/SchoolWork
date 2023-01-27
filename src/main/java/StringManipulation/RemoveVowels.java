/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringManipulation;

/**
 *
 * @author aaminahv
 */
public class RemoveVowels {

    public static String withoutVowels(String word) {
        String withoutVowels = "";
        word = word.toLowerCase();
        for (int i = 0; i <= word.length() - 1; i++) {
            char let = word.charAt(i);
            if (let != 'a' && let != 'e' && let != 'i' && let != 'o' && let != 'u') {
                withoutVowels += let;
            }
        }

        return withoutVowels;
    }

}
