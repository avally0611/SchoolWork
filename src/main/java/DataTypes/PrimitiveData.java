package DataTypes;

import javax.swing.JOptionPane;
public class PrimitiveData{

   public static void main (String [] args){
   
      String nameQuestion, surnameQuestion, phoneQuestion, yearQuestion, heightQuestion;
      
      nameQuestion = JOptionPane.showInputDialog ("What is your first name");
      surnameQuestion = JOptionPane.showInputDialog("What is your last name");
      phoneQuestion = JOptionPane.showInputDialog ("What is your phone number");
      yearQuestion = JOptionPane.showInputDialog ("Which year were you born");
      heightQuestion = JOptionPane.showInputDialog ("What is your height?");
      
      int yearQuestionint = Integer.parseInt(yearQuestion);
      double heightQuestionint = Double.parseDouble(heightQuestion);
      
      System.out.println();
      System.out.println("Personal Details");
      System.out.println();
      System.out.println("Your name is " +  nameQuestion);
      System.out.println("Your last name is " +  surnameQuestion);
      System.out.println("Your number is " +  phoneQuestion);
      System.out.println("The year you were born in is " +  yearQuestion);
      System.out.println("Your height is " +  heightQuestion);
      
      System.out.println("I will be selling your details to immigrants, Thank you for your contribution!");
   }
   
  
}