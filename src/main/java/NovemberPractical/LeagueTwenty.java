//Aaminah Vally
package NovemberPractical;

import static NovemberPractical.LeagueTwenty.generatePlayer;
import java.util.ArrayList;
import javax.swing.JOptionPane;

//Section B
public class LeagueTwenty {

    //Question 2 - Class
    static String currentPlayerName = "";
    static double currentPlayerAverage = 0;
    static int currentPlayerFifties = 0;
    static double averageScore = 0;
    static String mvps = "";

    //couldn't think of a simpler way to get list of mvp names :{
    static ArrayList<String> mvpList = new ArrayList<String>();

    public static void main(String[] args) {
        //Question 3 - Team Loop
        currentPlayerName = JOptionPane.showInputDialog("Enter the player's name");
        System.out.println("========================" + "\nPLAYER STATS" + "\n========================");

        int numPlayers = 0;
        double highestScore = 0;
        String highestPlayer = "";
        while (!(currentPlayerName.equals("XXX"))) {
            System.out.println("NAME: " + currentPlayerName);
            numPlayers++;
            generatePlayer();

            if (averageScore > highestScore) {
                highestScore = averageScore;
                highestPlayer = currentPlayerName;
            }
            System.out.println("\n");
            currentPlayerName = JOptionPane.showInputDialog("Enter the next player's name");

        }

        System.out.println("========================" + "\nTEAM STATS" + "\n========================");

        //have to convert arrayList to string and replace bracktes that prints out
        System.out.println("MVP COUNT:" + currentPlayerFifties + "\nMVP NAMES: " + mvps);
        System.out.println("MVP WINNER:" + highestPlayer + "\nMVP AVG: " + highestScore);

    }

    //Question 4 - Player Stats
    public static void generatePlayer() {

        String experienceLabel = "";
        int playerExperience = (int) (Math.random() * 3 + 1);

        switch (playerExperience) {
            case 1:
                experienceLabel = "Junior";
                break;

            case 2:
                experienceLabel = "Senior";
                break;

            case 3:
                experienceLabel = "expert";
                break;

            default:
                break;
        }

        System.out.println("EXP: " + experienceLabel);

        System.out.println("CODE: " + playerCode());

        int mvpCount = 0;
        int totalScore = 0;
        int score = 0;
        String MVP = "";
        for (int i = 0; i < 5; i++) {
            switch (playerExperience) {
                case 1:
                    score = (int) (Math.random() * 51);
                    break;

                case 2:
                    score = (int) (Math.random() * 101);
                    break;

                case 3:
                    score = (int) (Math.random() * 151);
                    break;

                default:
                    break;
            }

            if (score >= 50) {
                mvpCount++;
            }
            totalScore += score;

        }
        averageScore = totalScore / 5.0;

        System.out.println("AVG:" + averageScore);
        if (mvpCount >= 3) {
            mvps += currentPlayerName + " ";
            currentPlayerFifties++;
            System.out.println("NOM: true");
        } else {
            System.out.println("NOM: false");
        }

    }

    public static String playerCode() {
        String playerCode = "";
        String letterCode = "" + (currentPlayerName.substring(0, 3)).toUpperCase() + currentPlayerName.length();
        return letterCode;
    }
}
