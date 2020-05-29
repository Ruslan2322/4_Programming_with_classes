package Lesson_04_Aggregation_composition.Ex_4;

public class Account {
    private long id;
    private boolean isOpen = true;
    private double balance;

    public Account(double balance) {
        this.id = ++id;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public String getStatus() {
        String status = isOpen ? "Unlocked": "Blocked";
        return String.format("Account %d %s.", id, status);
    }

    public void block() {
        isOpen =false;
    }

    public double getBalance() {
        return balance;
    }

    public Account(boolean isOpen) {
        this.isOpen = isOpen;
    }
}
