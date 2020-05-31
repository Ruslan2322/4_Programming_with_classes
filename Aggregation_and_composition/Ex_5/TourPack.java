package Lesson_04_Aggregation_composition.Ex_5;

import java.util.ArrayList;

public class TourPack {



    private ArrayList<TourPackType>tourPackTypes;
    private String country;
    private String city;
    private TourPackType type;
    private Transport transport;
    private Nutrition nutrition;
    private int time;
    private double price;
    private Nutrition food;


    public TourPack(String country, String city, TourPackType type, Transport transport, Nutrition nutrition, int time, double price) {
        this.country = country;
        this.city = city;
        this.type = type;
        this.transport = transport;
        this.nutrition = nutrition;
        this.time = time;
        this.price = price;
    }

    public TourPackType getType() {
        return type;
    }

    public String getCountry() {
        return country;
    }

    public ArrayList<TourPackType> getTourPackTypes() {
        return tourPackTypes;
    }

    public String getCity() {
        return city;
    }

    public Transport getTransport() {
        return transport;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public int getTime() {
        return time;
    }

    public double getPrice() {
        return price;
    }

    public void setTourPackTypes(ArrayList<TourPackType> tourPackTypes) {
        this.tourPackTypes = tourPackTypes;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setType(TourPackType type) {
        this.type = type;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFood(Nutrition food) {
        this.food = food;
    }
}
