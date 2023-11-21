/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aaminah1
 */
public class LogManager {
    
    private Log[] logs;
    private int size;

    public LogManager() 
    {
        logs = new Log[1000];
        size = 0;
        
        try {
            Scanner sc = new Scanner(new File("data/2023-July.txt"));
            
            while (sc.hasNextLine())
            {
                Scanner lineSc = new Scanner(sc.nextLine()).useDelimiter("#");
                
                String date = lineSc.next();
                String message = lineSc.next();
                
                DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
                
                
                logs[size] = new Log(LocalDateTime.parse(date, inputFormatter), message);
                size ++;
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LogManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String toString()
    {
        String output = "";
        
        for (int i = 0; i < size; i++) 
        {
            output += logs[i].toString() + "\n";
            
        }
        
        return output;
    }
    
    public double getLoadPercentage()
    {
        double peakCount = 0;
        
        for (int i = 0; i < size; i++) 
        {
            if (logs[i].isDuringPeak())
            {
                peakCount++;
            }
        }
        
        peakCount = (peakCount/(double) size)*100;
        peakCount *= 100;
        peakCount = Math.round(peakCount);
        peakCount /= 100;
        
        return peakCount;
    }
    
    
    
}
