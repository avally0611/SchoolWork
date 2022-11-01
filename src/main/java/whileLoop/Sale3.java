/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whileLoop;

/**
 *
 * @author aaminahv
 */
public class Sale3 {

    public static void main(String[] args) {
        int item = 200; //1 Select Initialize (select tets variables)

        //before - inisialization
        int count = 0;

        while (item > 100) { //2 Testing (conditional)
            count++; // repeated things - calcs
            item -= 8; //3 Change (increment)
        }
        System.out.println("New price " + item + "\nNumber of Days: " + count);
    }

}
