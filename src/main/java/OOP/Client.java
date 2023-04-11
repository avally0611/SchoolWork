/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author aaminahv
 */
public class Client {

    private String clientName;
    private String accountNum;
    private double balance;

    public Client(String inClientName, String inAccountName, double inBalance) {
        this.clientName = inClientName;
        this.accountNum = inAccountName;
        this.balance = inBalance;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAccountName() {
        return accountNum;
    }

    public void setAccountName(String accountName) {
        this.accountNum = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Client: " + changeName() + "\nAccount Number: " + accountNum + "\nBalance: " + balance;
    }

    public String changeName() {
        String[] name = clientName.split(" ");

        int length = name.length;

        String surname = name[length];
        String firstname = name[0];

        return surname + firstname;
    }
}
