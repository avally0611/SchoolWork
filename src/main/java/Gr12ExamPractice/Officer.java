/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr12ExamPractice;

import java.time.LocalDate;

/**
 *
 * @author aaminahv
 */
public class Officer extends CrewMember {

    private int rank;
    private LocalDate datePromoted;
    public static int numPromotedOfficers = 0;

    public Officer(String inFN, int inCID, String inDT, int inRK, LocalDate inDP) {
        super(inFN, inCID, inDT);
        this.rank = inRK;
        this.datePromoted = inDP;

    }

    public int getRank() {
        return rank;
    }

    public String getTitle() {
        String officer = "";

        switch (rank) {
            case 1:
                officer = "Ensign";
                break;

            case 2:
                officer = "Lieutenant";
                break;

            case 3:
                officer = "Lt Commander";
                break;

            case 4:
                officer = "Commander";
                break;

            case 5:
                officer = "Captain";
                break;

            default:
                break;
        }

        return officer;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getTitle();
    }

    public void promote() {
        if (rank < 5) {
            rank++;
            datePromoted = LocalDate.now();
            numPromotedOfficers++;
        }
    }
}
