import it.*;
import java.awt.*;
public class GoggaPracPractice{

   public static void main (String [] args){
   
      Gogga.setGridSize (19,9);
      Gogga bug = new Gogga();
      bug.setColor(Color.YELLOW);
      bug.move();
      bug.setPosition(2,6);
      bug.move();
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      bug.move();
      bug.setTrailWidth(20);
      bug.setColor(Color.BLUE);
      bug.move();
      bug.move();
      bug.setDirection(Gogga.UP);
      bug.setLabel("Hello, i am a rat :)");
      bug.trailOff();
      bug.move();
      bug.move();
      bug.move();
      bug.trailOn();
      bug.move();
      
     System.out.println("Your rat is lost, find him at  " + bug.getXPos() + "," + bug.getYPos());
   }
}   