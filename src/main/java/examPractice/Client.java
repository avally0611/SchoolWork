/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examPractice;

/**
 *
 * @author aaminahv
 */
public class Client {

    private String fullname;
    private String email;
    private String password;
    private int clientTier;
    private int currentUsage;

    public static final int BRONZE_TIER = 0;
    public static final int SILVER_TIER = 1;
    public static final int GOLD_TIER = 2;

    public Client(String fn, String e, String p, int cT, int cU) {
        this.fullname = fn;
        this.email = e;
        this.password = p;
        this.clientTier = cT;
        this.currentUsage = cU;
    }

    public String getSurname() {
        String[] nameArr = fullname.split(" ");

        return nameArr[nameArr.length - 1];

    }

    public double calculateCurrentBill() {
        double cost = 0;
        double adjustedUsage = 0;

        switch (clientTier) {
            case Client.BRONZE_TIER:
                cost = 100;
                cost += currentUsage * 0.80;
                break;

            case Client.SILVER_TIER:
                cost = 180;
                if (currentUsage > 300) {
                    adjustedUsage = currentUsage - 300;
                }
                cost += adjustedUsage * 0.75;
                break;

            case Client.GOLD_TIER:
                cost = 350;
                if (currentUsage > 1000) {
                    adjustedUsage = currentUsage - 1000;
                }
                cost += adjustedUsage * 0.68;
                break;
        }

        return cost;
    }

    public boolean isSecure() {
        boolean isUpper = false;
        boolean isLower = false;
        boolean isDigit = false;
        if (password.length() >= 8) {

            for (int i = 0; i < password.length(); i++) {
                char let = password.charAt(i);

                if (Character.isUpperCase(let)) {
                    isUpper = true;
                }
                if (Character.isLowerCase(let)) {
                    isLower = true;
                }
                if (Character.isDigit(let)) {
                    isDigit = true;
                }
            }
        }

        return isUpper && isLower && isDigit;
    }

    public String toString() {
        String output = "";

        String account = "";

        switch (this.clientTier) {
            case Client.BRONZE_TIER:
                account = "Bronze";
                break;

            case Client.SILVER_TIER:
                account = "Silver";
                break;

            case Client.GOLD_TIER:
                account = "Gold";
                break;
        }

        output += "USER: " + fullname + "\nACCOUNT TIER: " + account + "\nCURRENT ACCOUNT: " + currentUsage + "MB@R" + calculateCurrentBill() + "\nSECURE: " + isSecure() + "\n";

        return output;
    }

}
