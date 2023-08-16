/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author aaminahv
 */
public class PersonUI {

    public static void main(String[] args) {
        PersonManager p = new PersonManager();

        System.out.println(p.toString());
        p.sort();
        System.out.println(p.toString());
        p.addYears(5);
        System.out.println(p.toString());

        LocalDate date = LocalDate.of(1998, Month.MARCH, 23);
        LocalDate newDate = LocalDate.of(2006, Month.NOVEMBER, 9);

        Period ageDiff = Period.between(date, newDate);
        System.out.println("The other person is: " + ageDiff.getYears() + " years older than me");

        LocalDate date3 = LocalDate.of(2002, Month.MAY, 5);

        if () {

        }
    }
}
