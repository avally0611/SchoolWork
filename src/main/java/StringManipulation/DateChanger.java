/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringManipulation;

import javax.swing.JOptionPane;

/**
 *
 * @author aaminahv
 */
public class DateChanger {

    //chnage date from dd/mm/yy to yy-mm-dd
    public static String dateChanger(String date) {

        String[] dates = date.split("/");
        String newDate = "";

        String day = dates[0];
        String month = dates[1];
        String year = dates[2];

        newDate += year;
        newDate += "-";
        newDate += month;
        newDate += "-";
        newDate += day;

        return newDate;
    }

}
