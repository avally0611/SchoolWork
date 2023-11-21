/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package November2022Gr11PP;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



//3.1
public class PerformerManager 
{
    //3.21
    private Performer[] pArr = new Performer[50];
    private int size = 0;;

    //3.3
    public PerformerManager() 
    {
        
        try 
        { 
            Scanner lineSc = new Scanner(new File("data/performers.txt"));
            
            while (lineSc.hasNextLine())
            {
                String line = lineSc.nextLine();
                
                Scanner sc = new Scanner(line).useDelimiter(",");
                
                String name = sc.next();
                String bandName = sc.next();
                boolean isAllergic = sc.nextBoolean();
                String dob = sc.next();
                
                DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate dateOfBirth = LocalDate.parse(dob, inputFormatter);
                
                pArr[size] = new Performer(name, bandName, isAllergic, dateOfBirth);
                size++;
            }
        
        } 
       
        catch (FileNotFoundException ex) 
        {
            System.out.println("File not found");
        }
    }
    
    //3.4
    //juts check how name is inputted - must be in surname, initial format
    //only do binary search if it ordered
    public int searchPerformer(String name)
    {
        for (int i = 0; i < size; i++) 
        {
            if (name.equals(pArr[i].getName()))
            {
                return i;
                
            }
            
        }
        
        return -1;
    }
    
    //3.5
    public boolean changeBand(String name, String newBandName)
    {
        int posOfPerformer = searchPerformer(name);
        
        if  (posOfPerformer > -1)
        {
            pArr[posOfPerformer].setBandName(newBandName);
     
            return true;
        }
        return false;
    }
    
    public void sort()
    {
        for (int i = size - 1; i >= 0; i--) 
        {
            for (int j = 0; j < i; j++) 
            {
                if (pArr[j].getBandName().compareTo(pArr[j + 1].getBandName()) > 0)
                {
                    Performer temp = pArr[j];
                    pArr[j] = pArr[j + 1];
                    pArr[j + 1] = temp;
                }
                
            }
        }
    }
    
    
    public String allergyList()
    {
        String output = "Performers with Allergies\n";
        int count = 0;
        
        for (int i = 0; i < size; i++) 
        {
            if (pArr[i].getFoodAllergy())
            {
                output += pArr[i].getName() + "\n";
                count++;
            }
            
        }
        
        return output + "\n" + "Provided " + count + " EpiPen(s)";
    }
    
    public String chaperoneNeeded()
    {
        String chaperoneList = "Bands who need chaperones:\n";
        
        for (int i = 0; i < size; i++) 
        {
            //either use years and minus or use full on date time
            Period currentAge = Period.between(pArr[i].getDob(), LocalDate.now());
            
            if (currentAge.getYears() < 18)
            {
                if (!chaperoneList.contains(pArr[i].getBandName()))
                {
                    chaperoneList += pArr[i].getBandName() + "\n";
                }
            }
        }
        
        return chaperoneList;
    }
    
    public String toString()
    {
        String output = "List of Performers\n";
        
        for (int i = 0; i < size; i++) 
        {
            output += pArr[i].toString() + "\n";
            
        }
        
        return output;
    }
    
    
    
}
