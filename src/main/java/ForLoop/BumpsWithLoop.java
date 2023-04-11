/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForLoop;

import it.Gogga;

/**
 *
 * @author aaminahv
 */
public class BumpsWithLoop {

    public static void main(String[] args) {
        Gogga bug = new Gogga();

        bug.setPosition(1, 5);

        for (int i = 0; i < 2; i++) {
            bug.setDirection(Gogga.UP);
            bug.move();
            
            bug.setDirection(Gogga.RIGHT);
            bug.move();
            bug.setDirection(Gogga.DOWN);
            bug.move();
            bug.setDirection(Gogga.RIGHT);
            bug.move();

        }
      

    }

}
