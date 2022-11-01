/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whileLoop;

/**
 *
 * @author aaminahv
 */
public class Dice {

    public static void main(String[] args) {
        int diceNum = (int) (Math.random() * 100); //1. Select Initialize

        //before - initialization
        int count = 0;

        while (diceNum != 0) //2. Testing (conditional)
        {
            //repeated things - calcs, etc.
            System.out.print(diceNum + " ");
            count++;
            diceNum = (int) (Math.random() * 100); //3. change (increment)

        }

        System.out.println("HOW LONG IT TOOK: " + count);
    }

}
