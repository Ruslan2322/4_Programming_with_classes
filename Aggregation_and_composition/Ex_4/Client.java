package Lesson_04_Aggregation_composition.Ex_4;

import java.awt.image.PixelGrabber;
import java.util.ArrayList;
import java.util.Comparator;

public class Client {
    private String firstname;
    private String lastname;
    private String passportID;
    private ArrayList<Account>accounts;

    public Client(String firstname, String lastname, String passportID) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.passportID = passportID;
        this.accounts = new ArrayList<>();
    }


    public void openAccount(Account account){
        accounts.add(account);
    }

    public String getPassportID() {
        return passportID;
    }

    public Account getAccount(long id) {
        for (Account client: accounts){
            if (client.getId()==id){
                return client;
            }
        }
        return null;
    }

    public void blockAccaunt(long id) {
        for (Account account : accounts){
            if (account.getId()==id)
                account.block();
        }
    }

    public String getInformation() {
        String information = "";
        for (Account account: accounts){
            information += String.format("#%d, balance: %.2f dollars, status: %s\n", account.getId(), account.getBalance(), account.getStatus());
        }
        return String.format("Client %s has accounts: \n%s", toString(), information);
    }

    public void sortByBalance() {
        accounts.sort(Comparator.comparing(Account::getBalance));
    }

    public String getBalance() {
        double balance = 0;
        for (Account account: accounts){
            balance += account.getBalance();
        }
        return String.format("%.2f dollars", balance);
    }

    public String getBalancePositiveAccounts() {
        double balance = 0;
        for (Account account: accounts){
            if (account.getBalance()>0){
                balance += account.getBalance();
            }
        }
        return String.format("%.2f dollars", balance);
    }

    public String getBalanceNegativeAccounts() {
        double balance = 0;
        for (Account account: accounts){
            if (account.getBalance()<0){
                balance+=account.getBalance();
            }
        }
        return String.format("%.2f dollars", balance);
    }
}
