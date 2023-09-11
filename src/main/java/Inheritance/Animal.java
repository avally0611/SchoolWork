/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author aaminahv
 */
public class Animal {

    //common attributes
    //all children class can directly access field - not always good (rather access through getter and setter)
    //symbol for protected = # (directly accessible in this class and sub classes)
    protected int numLegs;
    private double weight;
    private double height;

    //want this to be hidden to sub class
    private double distanceTravelled;

    //common actions
    public Animal(int numLegs, double weight, double height, double distanceTravelled) {
        this.numLegs = numLegs;
        this.weight = weight;
        this.height = height;
        this.distanceTravelled = distanceTravelled;
    }

    public void runABit() {
        distanceTravelled++;
    }

    public void makeNoise() {
        System.out.println("Generic grunts");
    }

}
