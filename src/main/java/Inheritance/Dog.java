package Inheritance;

//because it is animal, needs all fields like animal
//animal is super(parent) class, dog is sub(child) class
//if we made specific dog class - super class would be ancestor class
public class Dog extends Animal {

    private String name;
    private int bonesEaten;

    public Dog(int numLegs, double weight, double height, double distanceTravelled, String name, int bonesEaten) {
        //super calls constructor of animal class - must be first line in constructor (dont rewrite constructor code) & dont add extra parameters
        super(numLegs, weight, height, distanceTravelled);

        //dont add to super - specific to child class (super just for parent class)
        this.name = name;
        this.bonesEaten = bonesEaten;
    }

    public void eatABone() {
        bonesEaten++;
    }

    //allows you to edit what a parent class method does
    //method overriding
    //choose lowest on inheritance tree
    //dynamic binding - at run time & make a choice (commiting to) (when subclass overrides method in superclass) - runtime polymorphism
    @Override
    //must have same method signature (name, parameters)
    public void makeNoise() {
        System.out.println("Bark");
    }

    //method overloading - changing method signature (parameters)
    public void makeNoise(int numBarks) {
        for (int i = 0; i < numBarks; i++) {
            System.out.println("Bark");
        }

    }

//     public void makeNoise(int numBarks, double time) {
//        for (int i = 0; i < numBarks; i++) {
//            System.out.println("Bark");
//        }
//
//    }
    //what is diff between overloading and overriding
    //overloading - same name & diff signature
    //overriding - same signature
    //method signature - name, parameter type list (cares about type list: int, double, int...)
    //super sub
    //inheritabnce
}
