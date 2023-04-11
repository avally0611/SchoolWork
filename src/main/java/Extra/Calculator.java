package Extra;

import javax.swing.*;
public class Calculator{

   public static void main (String [] args){
      String input = JOptionPane.showInputDialog("Do you want to add (a), subtract (s), multiply (m) or divide (d)");
      
         if (input.equals ("a")) //adding if statement 
         {
               double addNum1 = Double.parseDouble(JOptionPane.showInputDialog("Type your first number to add"));
               double addNum2 = Double.parseDouble(JOptionPane.showInputDialog("Type your second number to add"));
               double addAnswer = addNum1 + addNum2;
               System.out.println("Your answer is " + addAnswer);
         }
         else if (input.equals ("s"))    //subraction else statement
         {   
      
            double subNum1 = Double.parseDouble(JOptionPane.showInputDialog("Type your first number to minus"));
            double subNum2 = Double.parseDouble(JOptionPane.showInputDialog("Type your second number to minus"));
            double subAnswer = subNum1 - subNum2;
            System.out.println("Your answer is " + subAnswer);
         }
         else if (input.equals ("m")) //multiplying if statement
         {
               double multiplyNum1 = Double.parseDouble(JOptionPane.showInputDialog("Type your first number to multiply"));
               double multiplyNum2 = Double.parseDouble(JOptionPane.showInputDialog("Type your second number to multiply"));
               double multiplyAnswer = multiplyNum1*multiplyNum2;
               System.out.println("Your answer is " + multiplyAnswer);
        
         }
         else if (input.equals ("d")) //Divide if statement
         {
         
               double divideNum1 = Double.parseDouble(JOptionPane.showInputDialog("Type your first number to divide"));
               double divideNum2 = Double.parseDouble(JOptionPane.showInputDialog("Type your second number to divide"));
               double divideAnswer = divideNum1/divideNum2;
               System.out.println("Your answer is " + divideAnswer);
         }
         
      String redoQues = JOptionPane.showInputDialog("Do you want to calculate again or are you done, Type AGAIN (A) or DONE (X)");
      
         while (redoQues.equalsIgnoreCase ("A"))
         {
                String input1 = JOptionPane.showInputDialog("Do you want to add, subtract, multiply, divide or DONE");
      
                  if (input1.equals ("add")) //adding if statement 
                  {
                        double add2Num1 = Double.parseDouble(JOptionPane.showInputDialog("Type your first number to add"));
                        double add2Num2 = Double.parseDouble(JOptionPane.showInputDialog("Type your second number to add"));
                        double add2Answer = add2Num1 + add2Num2;
                        System.out.println("Your answer is " + add2Answer);
                  }
                  else if (input1.equals ("subtract"))    //subraction else statement
                  {   
               
                     double sub2Num1 = Double.parseDouble(JOptionPane.showInputDialog("Type your first number to minus"));
                     double sub2Num2 = Double.parseDouble(JOptionPane.showInputDialog("Type your second number to minus"));
                     double sub2Answer = sub2Num1 - sub2Num2;
                     System.out.println("Your answer is " + sub2Answer);
                  }
                  else if (input1.equals ("multiply")) //multiplying if statement
                  {
                        double multiply2Num1 = Double.parseDouble(JOptionPane.showInputDialog("Type your first number to multiply"));
                        double multiply2Num2 = Double.parseDouble(JOptionPane.showInputDialog("Type your second number to multiply"));
                        double multiply2Answer = multiply2Num1*multiply2Num2;
                        System.out.println("Your answer is " + multiply2Answer);
                  }
                  else if (input1.equals ("divide")) //Divide if statement
                  {
               
                     double divide2Num1 = Double.parseDouble(JOptionPane.showInputDialog("Type your first number to divide"));
                     double divide2Num2 = Double.parseDouble(JOptionPane.showInputDialog("Type your second number to divide"));
                     double divide2Answer = divide2Num1/divide2Num2;
                     System.out.println("Your answer is " + divide2Answer);
                    
                    
                  }
                  else if (input1.equals ("DONE"))
                  {
                        String leaveQuest = JOptionPane.showInputDialog("If you leave you will be charged a fee, type YES or NO to confirm you are leaving :/ ");
                        if (leaveQuest.equals ("YES"))
                        {
                           System.out.println("SAY GOODBYE TO YOUR LIFE!");
                           System.exit(0);
                        }
                        else
                        {
                          System.out.println("JUST KIDDING, BYE");
                          System.exit(0);    
                        }
                  
                  }      
         
          }
         

         //while not done 
            //add/divide/subtract/multiply
            //while not done
               //new number
            //answer
   
   }
}