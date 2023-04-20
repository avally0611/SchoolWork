/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatesAndTimes;

import java.time.LocalDateTime;

/**
 *
 * @author aaminahv
 */
public class Starting {

    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date: " + dateTime.getDayOfMonth() + " " + dateTime.getMonth() + " " + dateTime.getYear());
    }

}
