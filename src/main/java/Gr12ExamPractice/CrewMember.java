/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr12ExamPractice;

/**
 *
 * @author aaminahv
 */
public class CrewMember {

    private String fullname;
    private int crewID;
    private String department;
    public static int numPromotedCrew = 0;

    public CrewMember(String inFN, int inCID, String inDT) {
        this.fullname = inFN;
        this.crewID = inCID;
        this.department = inDT;

    }

    public String getFullname() {
        return fullname;
    }

    public int getCrewID() {
        return crewID;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return fullname + "\t" + "Crew ID: " + crewID + "\t" + "[" + department + "]";
    }

}
