package Lesson_04_Aggregation_composition.Ex_5;

public class TClient {
    private String firstname;
    private String lastName;
    private double prePay;
    private TourPack tourPack;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getPrePay() {
        return prePay;
    }

    public void setPrePay(double prePay) {
        this.prePay = prePay;
    }

    public TourPack getTourPack() {
        return tourPack;
    }

    public TClient(String firstname, String lastName, double prePay) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.prePay = prePay;

    }
    public void setTourPack(TourPack tourPack) {
        this.tourPack = tourPack;
    }

}




