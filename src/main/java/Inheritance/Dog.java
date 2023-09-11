package Inheritance;

//because it is animal, needs all fields like animal
//animal is super(parent) class, dog is sub(child) class
//if we made specific dog class - super class would be ancestor class
public class Dog extends Animal {

    private String name;
    private int bonesEaten;

    public Dog(int numLegs, double weight, double height, double distanceTravelled, String name, int bonesEaten) {
        //super calls constructor of animal class - must be first line in constructor
        super(numLegs, weight, height, distanceTravelled);

        //dont add to super - specific to child class (super just for parent class)
        this.name = name;
        this.bonesEaten = bonesEaten;
    }

    public void eatABone() {
        bonesEaten++;
    }

    //allows you to edit what a parent class method does
    //method overriding?
    @Override
    //must have same method signature (name, parameters)
    public void makeNoise() {
        System.out.println("Bark");
    }

}
