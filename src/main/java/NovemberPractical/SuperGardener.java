/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NovemberPractical;

import javax.swing.JOptionPane;

/**
 *
 * @author Aaminah1
 */
public class SuperGardener {
    static int gardenerPos = 0;
    static int plantPos = 0;
    static boolean hasWater;
    static int roundNum = 0;
    
    //static int numRounds
    
   
    public static void main(String[] args) {
        
        gardenerPos = 3;
        plantPos = 5;
        roundNum = 1;
        hasWater = false;
        for (int i = 0; i < 5; i++) {
            oneRound();
            roundNum++;
            hasWater = false;
            
            if (i >= 2)
            {
                
                //memo doesn't have +1
                gardenerPos = (int) (Math.random()*5+1);
                plantPos = (int) (Math.random()*5+6);
            }

        }
        
    }
    
    private static void oneRound()
    {
        //they have a boolean roundOver??
        int numMoves = 0;
        drawGarden();
        char move = (JOptionPane.showInputDialog("What do you want to do?\nL:Move Left\nR:Move Right\nF:Fill Up\nW:Water Plant\nQ:Quit")).toUpperCase().charAt(0);
        while (move != 'Q')
        {
            if ((move == 'L')&&(gardenerPos != 1))
            {
                gardenerPos -= 1;
                numMoves++;
                drawGarden();
                move = (JOptionPane.showInputDialog("What do you want to do?\nL:Move Left\nR:Move Right\nF:Fill Up\nW:Water Plant\nQ:Quit")).toUpperCase().charAt(0);
            }  
            else if ((move == 'R')&&(gardenerPos != 10))  
            { 
                gardenerPos += 1;
                numMoves++;
                drawGarden();
                move = (JOptionPane.showInputDialog("What do you want to do?\nL:Move Left\nR:Move Right\nF:Fill Up\nW:Water Plant\nQ:Quit")).toUpperCase().charAt(0);   
            }
            else if ((move == 'F')&&(gardenerPos == 1))
            {
                hasWater = true;
                    numMoves++;
                    drawGarden();
                    move = (JOptionPane.showInputDialog("What do you want to do?\nL:Move Left\nR:Move Right\nF:Fill Up\nW:Water Plant\nQ:Quit")).toUpperCase().charAt(0);
            }
            else if ((move == 'W')&&(gardenerPos == plantPos)&&(hasWater))
            {
                System.out.println("\nROUND OVER");
                move = 'Q';
                numMoves++;
            }

        }
        
        System.out.println("Number of Moves: " + numMoves + "\n");
    }
    
    private static void drawGarden()
    {
        System.out.println("Round " + roundNum + ": \t Watering can full: " + hasWater);
        System.out.print("W");
        for (int i = 1; i <= 10; i++) 
        {
            
            if (i == gardenerPos)
            {
                System.out.print(" G");
            } 
            else if (i == plantPos)
            {
                System.out.print(" P");
            }
            else
            {
                System.out.print(" _");
            }
 
        }
        
        System.out.print("\n");
    }
}
