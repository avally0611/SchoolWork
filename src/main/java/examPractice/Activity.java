/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examPractice;

import java.util.Date;

/**
 *
 * @author aaminahv
 */
public class Activity {

    private String description;
    private double cost;
    private Date actDate;

    public static final double INSURANCE_COST = 105.25;

    public Activity(String description, double cost, Date actDate) {
        this.description = description;
        this.cost = cost;
        this.actDate = actDate;
    }

}
