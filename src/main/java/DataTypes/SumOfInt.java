package DataTypes;

import javax.swing.*;
public class SumOfInt{

   public static void main (String [] args){
      int totalSum = 0;
      int average = 0;
      String numLoops = JOptionPane.showInputDialog("How many loops u want");
      int numRepeats = Integer.parseInt(numLoops);
      
      for (int num = 0; num<numRepeats; num++)
      {
        
            String userInput = JOptionPane.showInputDialog("Enter a number");
            int userNum = Integer.parseInt(userInput);
            totalSum += userNum;
            System.out.println(userNum);
            average = totalSum/10;
      }
      
      System.out.println(totalSum);
      System.out.println(average);

   
   
   }
}