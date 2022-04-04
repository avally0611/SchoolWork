package DataTypes;

import javax.swing.JOptionPane;
public class GetMiddle{

   public static void main (String [] args){
   
      String word = JOptionPane.showInputDialog("Enter a word now or else...");
      int wordLen = word.length();
      
      if (wordLen % 2 == 0) //even number?
      {
            int wordMid = wordLen/2;  //middle of word is equal to word divided by 
            wordMid = wordMid - 1; //since it's even, you gotta minus to get left one
            char midChar = word.charAt(wordMid); //char.At(wordMid), take middle letter of word and converts it to char 
            System.out.println(midChar);

      }
      else
      {
            int wordMid = wordLen/2;
            char midChar = word.charAt(wordMid);
            System.out.println(midChar);

      
      }
      

   }
}
   
      