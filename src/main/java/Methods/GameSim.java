/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

/**
 *
 * @author aaminahv
 */
public class GameSim {

    public static void main(String[] args) {

        for (int level = 1; level <= 10; level++) {
            System.out.println(level);
            int totalAttack = 0;
            int bossH = bossHealth(level);
            System.out.println(bossH);

            for (int i = 1; i < 5; i++) {
                System.out.println(Attack);
                int currentAttack = attack(bossH);
                totalAttack += currentAttack;

            }

        }

    }

    public static int attack(int bossHealth) {
        int a = 5;
        int numAttack = (int) (Math.random() * 5 + 1);

        if (numAttack == 1) {
            System.out.println("Attack Type: MISS");
            System.out.println("\tAttack Damage: 0");
            return 0;
        } else if ((numAttack == 2) | (numAttack == 3) | (numAttack == 4)) {
            System.out.println("Attack Type: NORMAL");
            int num = (int) (Math.random() * 15 + 1);
            System.out.print("\tAttack Damage: " + num);
            return num;
        } else if (numAttack == 5) {
            System.out.println("Attack Type: CRITICAL");
            System.out.print("Attack Damage: " + bossHealth / 2);
            return bossHealth / 2;
        }
        return 0;

    }

    public static int levelMultiplier() {
        return (int) (Math.random() * 3 + 1);

    }

    public static int bossHealth(int level) {
        return 50 + level * 10 * levelMultiplier();
    }

}
