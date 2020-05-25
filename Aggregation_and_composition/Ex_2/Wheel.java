package Lesson_04_Aggregation_composition.Ex_2;

public class Wheel {
    private int diameter;
    private boolean isGood;

    public Wheel(int diameter, boolean isGood) {
        this.diameter = diameter;
        this.isGood = true;
    }
    // Constructor for change wheel
    public Wheel(int wheelDia) {

    }
    // Getters and setters
    public int getDiametr() {
        return diameter;
    }

    public void setGoodWhell() {
        isGood = true;
    }
    public boolean isGood() {
        return isGood;
    }

    void breakWheel() {
        this.isGood = false;

    }
}
