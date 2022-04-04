package DataTypes;

import javax.swing.JOptionPane;
public class Prices{

   public static void main (String [] args){
       
       String prod1, prod2, prod3, price1, price2, price3;
       
       prod1 = JOptionPane.showInputDialog("Give me a name for a product?");
       prod2 = JOptionPane.showInputDialog("Give me a name for another product?");
       prod3 = JOptionPane.showInputDialog("Give me a name for another product?");
       
       price1 = JOptionPane.showInputDialog("What is the price for the " + prod1);
       price2 = JOptionPane.showInputDialog("What is the price for the " + prod2);
       price3 = JOptionPane.showInputDialog("What is the price for the " + prod3);
       
       double price1int = Double.parseDouble(price1);
       double price2int = Double.parseDouble(price2);
       double price3int = Double.parseDouble(price3);
       
       System.out.println();
       System.out.println("SHOPPING LIST");
       System.out.println(prod1 +" " + price1int);
       System.out.println(prod2 +" " + price2int);
       System.out.println(prod3 +" " + price3int);
       
       double sum = price1int + price2int + price3int;
       System.out.println("Your total cost is " + sum);
       
   
   }
}    
   


   