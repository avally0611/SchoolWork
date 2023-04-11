/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examPractice;

/**
 *
 * @author aaminahv
 */
public class EggsSim {

    static int totalEggs;
    static int totalPower;

    public static void main(String[] args) {
        totalEggs = 25;
        int highestPower = 0;

        //day loop
        for (int i = 1; i <= 7 && totalEggs > 0; i++) {
            System.out.println("\nDay: " + i);
            oneDay();
            if (highestPower < totalPower) {
                highestPower = totalPower;
            }

            if (totalEggs == 0) {
                System.out.println("Eggs ran out");
            }

        }
        System.out.println("\nHighest Power was " + highestPower);

    }

    public static int oneDay() {

        int power = 0;
        String eggType = "";
        int numEggs = (int) (Math.random() * 7 + 2);
        if (numEggs > totalEggs) {
            numEggs = totalEggs;
        }

        totalEggs = totalEggs - numEggs;

        System.out.println("Total Eggs: " + totalEggs);
        System.out.println("Eggs for the day: " + numEggs);

        totalPower = 0;
        //each egg loop
        for (int i = 1; i <= numEggs; i++) {
            int numGen = (int) (Math.random() * 3 + 1);

            //what does switch do? Need to know for test? How does it work? When you diff options?
            switch (numGen) {
                case 1: {
                    eggType = "ELf";
                    power = 430;
                    break;
                }
                case 2: {
                    eggType = "Vampire";
                    power = 320;
                    break;
                }
                case 3: {
                    eggType = "Zombie";
                    power = 175;
                }
            }

            System.out.println("EGG: " + i + "\tTYPE: " + eggType + "\tPower: " + power);
            totalPower = totalPower + power;
        }

        System.out.println("TOTAL POWER FOR THE DAY:" + totalPower);
        return totalPower;

    }

}
