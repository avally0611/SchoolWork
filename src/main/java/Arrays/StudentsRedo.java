/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author avall
 */
public class StudentsRedo {
    private String name;
    private String[] subjects;
    private int[] yearMarks;
    private int size; 

    public StudentsRedo() {
        try {
            size = 15;
            subjects = new String[15];
            yearMarks = new int[15];
            
            Scanner sc = new Scanner(new File("data\\Students.txt"));
            
            name = sc.nextLine();
            String subjectLine = sc.nextLine();
            Scanner subjectSc = new Scanner(subjectLine).useDelimiter("#");
            for (int i = 0; i < size; i++) 
            {
                subjects[i] = subjectSc.next();
                
            }
           
            
            String markLine = sc.nextLine();
            Scanner markSc = new Scanner(markLine).useDelimiter("#");
            
            for (int i = 0; i < size; i++) 
            {
                yearMarks[i] = markSc.nextInt();
            }

            
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }
    public String yearReport()
    {
        String output = "";
        
        output += "YEAR REPORT\nSTUDENT: " + name;
        
        for (int i = 0; i < size; i++) 
        {
            output += "\n" + subjects[i] + " : " + yearMarks[i];
        }
        
        return output;
    }
    
    public String getSubject(int index)
    {
        return subjects[index];
    }
    
    public void markSort()
    {
        int highestIndex = 0;
        for (int i = 0; i < size - 1; i++) 
        {
            highestIndex = i;
            for (int j = i + 1; j < size; j++) 
            {
                if(yearMarks[j] > yearMarks[highestIndex])
                {
                    highestIndex = j;
                }
            }
            int temp = yearMarks[i]; 
            yearMarks[i] = yearMarks[highestIndex];
            yearMarks[highestIndex] = temp;
            
            String current = subjects[i]; 
            subjects[i] = subjects[highestIndex];
            subjects[highestIndex] = current;
        }
    }
    
    public int markSearch(int num)
    {
        int start = 0;
        int end = size - 1;
        
        while(start <= end)
        {
            int mid = (start + end)/2;
            
            if(yearMarks[mid] == num)
            {
                return mid;
            }
            else if (yearMarks[mid] < num )
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
            
        }
        
        return -1;
    }
    
    
    
}
