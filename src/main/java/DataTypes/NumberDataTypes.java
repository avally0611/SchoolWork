package DataTypes;

import javax.swing.JOptionPane;
public class NumberDataTypes{



   public static void main(String[] args){
      System.out.println("Hello person");
      
     
            
      String input1 = JOptionPane.showInputDialog ("What is your favourite number?");
      int num1 = Integer.parseInt(input1);
      System.out.println(num1);
      
      String input2 = JOptionPane.showInputDialog ("What number do you hate?");
      double num2 = Double.parseDouble(input2);
      System.out.println(num2);
      
      
      
   }
}