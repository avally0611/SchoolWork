package DataTypes;

import javax.swing.*;
public class StoreAdminRedo{

   public static void main (String [] args){
   
      double coke = 13.90;
      double barOne = 12.00;
      double water = 9.50;
      
      double inputCokes = Double.parseDouble(JOptionPane.showInputDialog("How many cokes do you want?"));
      double inputbarOne = Double.parseDouble(JOptionPane.showInputDialog("How many BarOne's do you want?"));
      double inputWater = Double.parseDouble(JOptionPane.showInputDialog("How many waters do you want?"));
      
      System.out.println("Number of cokes needed " + inputCokes);
      System.out.println("Number of BarOne's needed " + inputbarOne);
      System.out.println("Number of Water's needed " + inputWater);
      
      double totalAmount = coke*inputCokes + barOne*inputbarOne + water*inputWater;
      System.out.println(totalAmount);




      
      
      
   }
}   
      
      
   
         