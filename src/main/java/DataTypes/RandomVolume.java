package DataTypes;

public class RandomVolume{
   public static void main (String [] args){
      
      double height = 15.68;
      
      int random = (int)(Math.random()*31 + 15);
      System.out.println(random);
      
      double vol = (Math.PI * Math.pow(random,2)*height)*(1.0/3);
      
      double randomSq = Math.pow(random, 2);
      double numBrac = Math.PI * randomSq;
      numBrac = numBrac * height;
      numBrac = numBrac/3;
      System.out.println(numBrac);
   
   
   
   
   
   
   
   }
}