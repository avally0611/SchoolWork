/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author aaminahv
 */
public class PersonTest {

    private String name;
    private String surname;

    public String generateEmail() {

        return this.name + this.surname + "@gmail.com";
    }

    public String getName() {
        return this.name;
    }

}
