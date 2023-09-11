/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author aaminahv
 */
public class Cat extends Animal {

    private String name;
    private String[] enemies;
    private int numOfJumps;
    private int enemySize;

    public Cat(int numLegs, double weight, double height, double distanceTravelled, String catName, int numJumps) {
        super(numLegs, weight, height, distanceTravelled);
        this.name = catName;
        this.numOfJumps = numJumps;

    }

    public void addEnemy(String enemyName) {

        enemies = new String[10000000];
        enemies[enemySize] = enemyName;
        enemySize++;
        System.out.println("Watch out: " + enemyName);
    }

    public void Jump() {
        numOfJumps++;
    }

    public void severeAccident() {
        numLegs--;
    }

}
