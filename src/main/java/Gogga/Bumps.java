package Gogga;
import it.*;
public class Bumps{

   public static void main(String [] args){
   
      Gogga bug = new Gogga();
      
      bug.setPosition(1,5);
      bug.move();
      bug.move();
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      bug.move();
      bug.setDirection(Gogga.DOWN);
      bug.move();
      bug.move();
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      bug.move();
      bug.setDirection(Gogga.UP);
      bug.move();
      bug.move();
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      bug.move();
      bug.setDirection(Gogga.DOWN);
      bug.move();
      bug.move();
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      bug.move();
      bug.setDirection(Gogga.UP);
      
     
      
      System.out.println("Your bug has moved to " + bug.getXPos() + "," + bug.getYPos());
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
   }
} 
      