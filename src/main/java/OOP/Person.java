/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author aaminahv
 */
public class Person {

    private int ID;
    private String firstName;
    private String lastName;
    private double weight;
    private double height;

    public Person(int inID, String inFirstName, String inLastName, double inWeight, double inHeight) {
        ID = inID;
        firstName = inFirstName;
        lastName = inLastName;
        weight = inWeight;
        height = inHeight;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getEmail() {
        return firstName + lastName + "@gmail.com";
    }

    public double getBMI() {
        double bmi = weight / height;
        return bmi;
    }

    public String toString() {
        return this.ID + "\t" + this.firstName + "\t" + this.lastName + "\t" + this.height + "\t" + this.weight;
    }

}
