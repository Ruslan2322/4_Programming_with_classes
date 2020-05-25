package Lesson_04_Aggregation_composition.Ex_2;

public class Engine {
    private int horsePower;
    private double volume;
    // Getters and setters
    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Engine(int horsePower, double volume) {
        this.horsePower = horsePower;
        this.volume = volume;

    }
}
