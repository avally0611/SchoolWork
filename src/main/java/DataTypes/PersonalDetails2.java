package DataTypes;

import javax.swing.*;
public class PersonalDetails2 {

   public static void main (String [] args){
      String name ;
      String surname;
      String telnum;
      String yearOfBirth;
      String height;
      
      name = JOptionPane.showInputDialog("First Name");
      surname = JOptionPane.showInputDialog("Surname");
      telnum = JOptionPane.showInputDialog("Number");
      yearOfBirth = JOptionPane.showInputDialog("Year of Birth YYYY");
      
      height = JOptionPane.showInputDialog("Height in metres (With 1 dec pls.)");
      
      JOptionPane.showMessageDialog (null, "NAME:" + name + " " + surname + "\nYEAR OF BIRTH: " + yearOfBirth + "\nHEIGHT(m): " + height +"\nTELEPHONE NUMBER: " + telnum, "PERSONAL DETAILS" , JOptionPane.INFORMATION_MESSAGE);
      
      
   
   
   
   
   }
}