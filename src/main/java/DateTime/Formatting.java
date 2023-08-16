/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author aaminahv
 */
public class Formatting {

    public static void main(String[] args) {

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
//        String date = "22-06-06";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        String date = "22-06-2006";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
//        String date = "22 June 2006";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
//        String date = "22/06/06";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String date = "22/06/2006";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM/dd");
//        String date = "06/06/22";
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yy/MM/dd");
        String date = "06/06/22";

        LocalDate day = LocalDate.parse(date, inputFormatter);

//        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        System.out.println(day.format(outputFormatter));
    }

}
