package Lesson_04_Aggregation_composition.Ex_3;

import java.util.ArrayList;

public class Region {
   private String oblast_name;
    private City city;
    private double area;
   private ArrayList<District> districts;



    public Region(String oblast_name, City city, double area) {
        this.oblast_name = oblast_name;
        this.city = city;
        this.area = area;
        this.districts = new ArrayList<>();
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    int getPopulation() {
        int population = 0;
        for (District district: this.districts){
            population += district.getDistictCenter().getPopulation();
        }
        return population;
    }
    void addDistrict (District district){
        districts.add(district);
    }

    void removeDistrict (String dictrictName){
        for (District district : districts) {
            if (dictrictName.equals(district.getDistrictName())){
                districts.remove(district);
            }
        }
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }

    public void setDistricts(ArrayList<District> districts) {
        this.districts = districts;
    }

    public String getOblast_name() {
        return oblast_name;
    }
}
