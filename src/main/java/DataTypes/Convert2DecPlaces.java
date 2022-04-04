package DataTypes;

import javax.swing.JOptionPane;
public class Convert2DecPlaces{

   public static void main (String [] args){
      String input = JOptionPane.showInputDialog("Type a real number with more than 2 decimals.");
     
      double num1 = Double.parseDouble(input);    
      
      //Math.round is a function so it has to store answer 
      num1 = num1*100;
      num1 = Math.round(num1);
      num1 = num1/100;
      
      System.out.println(num1);
      
      
   
   
   
   
   
   
   
   
   
   
   }
}