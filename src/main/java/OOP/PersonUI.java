/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author aaminahv
 */
public class PersonUI {

    public static void main(String[] args) {

        PersonManager p = new PersonManager();
        //System.out.println(p);
        System.out.println(p.getName(4));
        System.out.println(p.getEmail(4));
        System.out.println(p.getAvgHeight());
        System.out.println(p.getAvgWeight());
        System.out.println(p.getBMI(4));

    }
}
