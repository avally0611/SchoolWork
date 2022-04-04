import it.*;
public class GeneratorThing{

   public static void main (String [] args){
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
      
      System.out.println("Your bug thing is lost at " + bug.getXPos() + "," + bug.getYPos());

   
   
   
   
   
   
   
   }
}
      
      
   
   
   
   
 