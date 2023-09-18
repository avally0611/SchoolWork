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

//        lion.makeNoise();
//        chihuahua.makeNoise();
//
//        lion.runABit();
//        chihuahua.runABit();
//
//        //eat a bone is specific only to dog
//        //lion.eatABone();
//        chihuahua.eatABone();
//
//        tom.addEnemy("Bad Tom");
//        tom.addEnemy("Worse Tom");
//
//        tom.Jump();
//
//        chihuahua.makeNoise(5);
        Animal[] myPets = new Animal[4];

        //can store sub types in super types (child in parent) - polymorphism
        //polymorphism - a super class variable can store references to sub class types (can be either any generation - any child of ancestor)
        myPets[0] = new Dog(4, 72, 0, 0, "Dog", 0);
        myPets[1] = new Cat(2, 24, 0, 0, "Cat", 0);
        myPets[2] = new Cat(3, 56, 0, 0, "Old Dog", 0);
        myPets[3] = new Dog(4, 12, 0, 0, "New cat", 0);

        for (int i = 0; i < myPets.length; i++) {
            myPets[i].makeNoise();

            //you cant only do this as you cant cast a CAT to DOG
//            ((Dog) myPets[i]).eatABone();
            if (myPets[i] instanceof Dog) {
                ((Dog) myPets[i]).eatABone();
            }
        }

    }
}
