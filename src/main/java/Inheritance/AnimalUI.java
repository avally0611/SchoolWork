/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author aaminahv
 */
public class AnimalUI {

    public static void main(String[] args) {
        Animal lion = new Animal(4, 100, 156, 100000);
        Dog chihuahua = new Dog(4, 20, 30, 1000, "Bob", 5);
        Cat tom = new Cat(4, 50, 40, 5000000, "Tom", 7);

        lion.makeNoise();
        chihuahua.makeNoise();

        lion.runABit();
        chihuahua.runABit();

        //eat a bone is specific only to dog
        //lion.eatABone();
        chihuahua.eatABone();

        tom.addEnemy("Bad Tom");
        tom.addEnemy("Worse Tom");

        tom.Jump();

    }
}
