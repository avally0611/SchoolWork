import it.*;
import javax.swing.JOptionPane;
public class MakeSquare{

   public static void main(String [] args){
   
      //declaring
      String twQuestion;
   
      //Assigning
      twQuestion = JOptionPane.showInputDialog("How thick do you want the Gogga's trail width?");
   
      //Converting to integer
      int twQuestionint = Integer.parseInt(twQuestion);
      
      //Draw square with user input
      Gogga bug = new Gogga();
      bug.setTrailWidth(twQuestionint);
      bug.setDirection(Gogga.RIGHT);
      bug.move();
      bug.move();
      bug.move();
      bug.move();
      bug.setDirection(Gogga.UP);
      bug.move();
      bug.move();
      bug.move();
      bug.move();
      bug.setDirection(Gogga.LEFT);
      bug.move();
      bug.move();
      bug.move();
      bug.move();
      bug.setDirection(Gogga.DOWN);
      bug.move();
      bug.move();
      bug.move();
      bug.move();

      
      
      
   
   
   }


}

   