package DataTypes;

import javax.swing.JOptionPane;
public class NumberResults{

   public static void main (String [] args){
      
     String numQuestion1, numQuestion2;
     
     numQuestion1 = JOptionPane.showInputDialog("Enter a whole number");
     
     int numQ1int = Integer.parseInt(numQuestion1);
     
     System.out.println("This is the number you typed " + numQ1int);
     
     numQuestion2 = JOptionPane.showInputDialog("Enter another whole number");
     
     int numQ2int = Integer.parseInt(numQuestion2);
     
     System.out.println("This is the number you typed " + numQ2int);
     
     System.out.println(numQ2int*numQ1int);
     
     
     numQ1int = numQ1int*2;
     System.out.println("This is your number doubled, yay " + numQ1int);
     numQ2int = numQ2int*2;
     System.out.println("This is your number doubled, yay " + numQ2int);
    
     
     
   
   
   }
}  
     
     
     