import it.*;
import java.awt.Color;
public class Test{

   public static void main (String [] args){
      Gogga bug = new Gogga();
      
      //Letter A
      bug.setPosition(0,7);
      bug.move();
      bug.move();
      bug.move();
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      bug.move();
      bug.setDirection(Gogga.DOWN);
      bug.move();
      bug.move();
      bug.move();
      bug.setPosition(0,6);
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      bug.move();
      
      //Letter V
      bug.setColor(Color.ORANGE);
      bug.setPosition(3,4);
      bug.setDirection(Gogga.DOWN);
      bug.move();
      bug.move();
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      bug.setDirection(Gogga.DOWN);
      bug.move();
      bug.setDirection(Gogga.UP);
      bug.move();
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      bug.setDirection(Gogga.UP);
      bug.move();
      bug.move();
      
      //Letter A
      bug.setColor(Color.YELLOW);
      bug.setPosition(6,7);
      bug.move();
      bug.move();
      bug.move();
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      bug.move();
      bug.setDirection(Gogga.DOWN);
      bug.move();
      bug.move();
      bug.move();
      bug.setPosition(6,6);
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      bug.move();
      
      //L
      bug.setColor(Color.GREEN);
      bug.setPosition(9,4);
      bug.setDirection(Gogga.DOWN);
      bug.move();
      bug.move();
      bug.move();
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      
      //L
      bug.setColor(Color.BLUE);
      bug.setPosition(11,4);
      bug.setDirection(Gogga.DOWN);
      bug.move();
      bug.move();
      bug.move();
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      
      //Y
      bug.setColor(Color.PINK);
      bug.setPosition(12,4);
      bug.setDirection(Gogga.DOWN);
      bug.move();
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      bug.move();
      bug.setDirection(Gogga.UP);
      bug.move();
      bug.setPosition(13,5);
      bug.setDirection(Gogga.DOWN);
      bug.move();
      bug.move();
      
      //smiley face
      bug.setColor(Color.BLACK);
      bug.setPosition(3,0);
      bug.setDirection(Gogga.DOWN);
      bug.move();
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      bug.setDirection(Gogga.UP);
      bug.move();
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      bug.setPosition(5,0);
      bug.setDirection(Gogga.DOWN);
      bug.move();
      bug.setPosition(3,2);
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      bug.move();
      bug.setDirection(Gogga.DOWN);
      bug.move();
      bug.setDirection(Gogga.LEFT);
      bug.move();
      bug.move();
      bug.setDirection(Gogga.UP);
      bug.move();
      
      
      
      
      
    
      

      
      


      
   }
} 