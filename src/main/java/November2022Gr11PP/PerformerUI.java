/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package November2022Gr11PP;

/**
 *
 * @author Aaminah1
 */
public class PerformerUI {
    public static void main(String[] args) {
        PerformerManager pm = new PerformerManager();
        
        pm.sort();
        System.out.println(pm.toString());
        
        if (pm.changeBand("Bhatt, G", "Crossing the animals"))
        {
            System.out.println("true");
            System.out.println(pm.toString());
        }
        else
        {
            System.out.println("false");
        }
        
        System.out.println(pm.allergyList());
        
        System.out.println(pm.chaperoneNeeded());
    }
    
}
