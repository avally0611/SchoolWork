/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examPractice;

/**
 *
 * @author aaminahv
 */
public class GameSim {

    //have to put static so it can be used from other methods, I think
    static int attackDamage;

    public static void main(String[] args) {

        int highestAttack = 0;
        int highestLevel = 0;
        int levelWon = 0;
        int levelLoss = 0;

        //levels loop
        for (int level = 1; level <= 10; level++) {
            System.out.println("");
            System.out.println("");
            System.out.println("Level: " + level);

            //Save boss's health from the method
            int bossHealth = bossHealth(level);
            System.out.println("BOSS TOTAL HEALTH: " + bossHealth);

            //need boss health in parameter for attack calc, get retun value from attack method and save in var.
            int totalAttack = attack(bossHealth);
            System.out.println("TOTAL ATTACK DAMAGE: " + totalAttack);

            if (totalAttack > bossHealth) {
                bossHealth = 0;
            } else {
                bossHealth = bossHealth - totalAttack;
            }
            System.out.println("BOSS HEALTH REAMINING: " + bossHealth);

            if (bossHealth == 0) {
                System.out.println("BOSS DEFEATED");
                levelWon = levelWon + 1;
            } else {
                System.out.println("LEVEL LOST");
                levelLoss = levelLoss + 1;

            }

            //get highest attack
            if (highestAttack < totalAttack) {
                highestAttack = totalAttack;
                highestLevel = level;
            }

        }
        System.out.println("\nHIGHEST ATTACK DAMAGE WAS " + highestAttack);

        if (levelWon > levelLoss) {
            System.out.println("You won " + levelWon + "/10 levels");
        } else {
            System.out.println("You lost " + levelLoss + "/10 levels");
        }

    }

    public static int levelMultiplier() {
        //formula: a = smaller, b = bigger - (b-a)+a BUT inclusive - (b-a+1)+a
        int num = (int) (Math.random() * 3 + 1);
        return num;
    }

    public static int bossHealth(int level) {
        //get level multi by calling method
        int num = levelMultiplier();
        int bossHealth = 50 + level * 10 * num;
        return bossHealth;
    }

    public static int attack(int x) {
        int totalAttack = 0;

        //attack loop
        for (int i = 1; i <= 4; i++) {
            int numGenerated = (int) (Math.random() * 5 + 1);
            System.out.print("ATTACK: " + i);

            if (numGenerated == 1) {
                attackDamage = 0;
                System.out.println("\tATTACK TYPE: MISS\tATTACK DAMAGE: 0");
            } else if ((numGenerated == 2) || (numGenerated == 3) || (numGenerated == 4)) {
                attackDamage = numGenerated * 15;
                System.out.println("\tATTACK TYPE: NORMAL\tATTACK DAMAGE: " + numGenerated * 15);
            } else if (numGenerated == 5) {
                attackDamage = x / 2;
                System.out.println("\tATTACK TYPE: CRITICAL\tATTACK DAMAGE: " + x / 2);
            }
            totalAttack = totalAttack + attackDamage;

        }
        return totalAttack;

    }

}
