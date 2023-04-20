/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author aaminahv
 */
public class Dog {

    private String name;
    private int age;

    private static int numDogs = 0;

    public Dog(String name, int age) {
        numDogs++;
        this.name = name;
        this.age = age;
    }

    public static int getNumDogs() {
        return numDogs;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
