/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr12ExamPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aaminahv
 */
public class CrewMemberManager {

    private CrewMember[] cArr = new CrewMember[80];
    private int size;

    public CrewMemberManager() {
        size = 0;

        try {
            Scanner lineSc = new Scanner(new File("data/crewmembers.txt"));

            while (lineSc.hasNextLine()) {
                String line = lineSc.nextLine();

                Scanner sc = new Scanner(line).useDelimiter("#");

                String fullname = sc.next();
                int crewID = sc.nextInt();
                String department = sc.next();

                //if more than 3
                if (sc.hasNext()) {
                    int rank = sc.nextInt();
                    String datePromoted = sc.next();

                    DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                    LocalDate date = LocalDate.parse(datePromoted, inputFormatter);

                    cArr[size] = new Officer(fullname, crewID, department, rank, date);
                    size++;
                } 
                else 
                {
                    cArr[size] = new CrewMember(fullname, crewID, department);
                    size++;
                }

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CrewMemberManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < size; i++) 
        {
            
            output += cArr[i].toString() + "\n";
        }

        return output;
    }

}
