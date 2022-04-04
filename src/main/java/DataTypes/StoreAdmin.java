package DataTypes;

import javax.swing.JOptionPane;
public class StoreAdmin{

   public static void main (String [] args){
   
      double cokePrice = 13.90;
      double baronePrice = 12.00;
      double waterPrice = 9.50;
      
      String inputC = JOptionPane.showInputDialog("How many cokes do you want?");
      String inputB = JOptionPane.showInputDialog("How many BarOne's do you want");
      String inputW = JOptionPane.showInputDialog("How many water bottles do you want?");
      
      double cokeNum = Double.parseDouble(inputC);
      double baroneNum = Double.parseDouble(inputB);
      double waterNum = Double.parseDouble(inputW);
      
      cokeNum = cokePrice * cokeNum;
      baroneNum = baronePrice * baroneNum;
      waterNum = waterPrice * waterNum;
      
      
      double totalNum = cokeNum + baroneNum + waterNum;
      
      System.out.println("Your total amount is " + totalNum);
      
      
      
   }
   
}
      