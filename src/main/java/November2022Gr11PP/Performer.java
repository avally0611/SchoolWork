/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package November2022Gr11PP;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author Aaminah1
 */
public class Performer 
{
    private String name;
    private String bandName;
    private boolean foodAllergy;
    private LocalDate dob;

    public Performer(String inName, String inBandName, boolean inFoodAllergy, LocalDate inDob) {
        
        //might be name error - just check later 
        this.name = inName.substring(inName.indexOf(" ") + 1, inName.length()) + ", " + inName.charAt(0);
        this.bandName = inBandName;
        this.foodAllergy = inFoodAllergy;
        this.dob = inDob;
    }

    public String getName() {
        return name;
    }


    public String getBandName() {
        return bandName;
    }

    public void setBandName(String inBandName) {
        this.bandName = inBandName;
    }

    public boolean getFoodAllergy() {
        return foodAllergy;
    }


    public LocalDate getDob() {
        return dob;
    }

    
    public String toString() 
    {
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        if (foodAllergy)
        {
            return name + " of " + bandName + " is allergic " + dob.format(outputFormatter);
        }
        else
        {
            return name + " of " + bandName + " is not allergic " + dob.format(outputFormatter);
        }
    }
    
    

    
    
    
    
}
