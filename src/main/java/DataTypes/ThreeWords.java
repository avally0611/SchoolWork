package DataTypes;

import javax.swing.JOptionPane;
public class ThreeWords {

   public static void main (String [] args){
   
      String word1, word2, word3;
      
      word1 = JOptionPane.showInputDialog("Enter a word");
      word2 = JOptionPane.showInputDialog("Enter a word");
      word3 = JOptionPane.showInputDialog("Enter a word");

      System.out.print(word1);
      System.out.println("\t" + word1.length() );
      
      System.out.print(word2);
      System.out.println("\t" + word2.length() );
      
      System.out.print(word3);
      System.out.println("\t" + word3.length() );
      
      int word1length, word2length, word3length;
      
      word1length = word1.length();
      word2length = word2.length();
      word3length = word3.length();
      

      System.out.println("The total number of characters are " + (word1length + word2length));

   
   }
   
}







