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

        if (clientTier == 0) {
            cost = 100;
            if (currentUsage > 0) {
                cost += currentUsage * 0.80;

            }
        } else if (clientTier == 1) {
            cost = 180;
            if (currentUsage > 300) {
                cost += currentUsage * 0.75;
            }
        } else if (clientTier == 2) {
            cost = 350;
            if (currentUsage > 1000) {
                cost += currentUsage * 0.68;
            }
        }
        return cost;
    }

    public boolean isSecure() {
        boolean strongPass = false;
        if (password.length() - 1 >= 8) {

            for (int i = 0; i < password.length(); i++) {
                char let = password.charAt(i);
                if (Character.isUpperCase(let)) {
                    strongPass = true;
                } else if (Character.isLowerCase(let)) {
                    strongPass = true;
                } else if (Character.isDigit(let)) {
                    strongPass = true;
                }
            }
        }

        return strongPass;
    }

    public String toString() {
        String output = "";

        String account = "";

        if (clientTier == 0) {
            account = "Bronze";
        }
        if (clientTier == 1) {
            account = "Silver";
        }
        if (clientTier == 2) {
            account = "Gold";
        }

        output += "USER: " + fullname + "\nACCOUNT TIER: " + account + "\nCURRENT ACCOUNT: " + currentUsage + "MB@R" + calculateCurrentBill() + "\nSECURE: " + isSecure();

        return output;
    }

}
