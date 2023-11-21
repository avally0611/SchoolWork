/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Aaminah1
 */
public class Log 
{
    private LocalDateTime timestamp;
    private String message;

    public Log(LocalDateTime inTS, String inM) {
        this.timestamp = inTS;
        this.message = inM;
    }

    private LocalTime getTime() {
        //return timestamp.getHours + getMinutes + getSeconds
        return timestamp.toLocalTime();
    }
    
    public boolean isDuringPeak()
    {
        return getTime().isBefore(LocalTime.of(15, 0, 0, 0)) && getTime().isAfter(LocalTime.of(12, 0, 0, 0));
    }
    
    public String toString()
    {
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        String output = timestamp.format(outputFormatter) + " : : " + message;
        
        return output;
    }
    
    
    
    
    
}
